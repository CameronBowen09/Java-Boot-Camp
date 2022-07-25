/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer.play;

import soccer.event.Kickoff;
import soccer.event.GameEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import soccer.util.Settings;


/**
 *
 * @author Administrator
 */
public class Game implements IDisplayDataItem {
    
    private Team homeTeam;
    private Team awayTeam;
    private GameEvent[] events;
    private LocalDateTime theDateTime;
    
    private boolean detailAvailable = false;
    private int id = 0;
    private String detailType = "Game";
    
    public Game(Team homeTeam, Team awayTeam, LocalDateTime theDateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;
    }

    public void playGame() {
        ArrayList<GameEvent> eventList = new ArrayList();
        Team currTeam;
        Player currPlayer;
        GameEvent currEvent = new Kickoff();
        currEvent.setBallPos(50);
        //currEvent.setTheTeam(this.getTheTeams()[(int)(Math.random()*2)]);
        currEvent.setTheTeam(Math.random() > 0.5?homeTeam: awayTeam);
        currEvent.setThePlayer(currEvent.getTheTeam().
                getPlayerArray()[(int) (Math.random() * this.homeTeam.getPlayerArray().length)]);
        currEvent.setTheTime(0);
        eventList.add(currEvent);


        for (int i = 1; i <=Settings.GAME_LENGTH; i++){
            
            if (Math.random() > Settings.GAME_EVENT_FREQUENCY){
                
                // First need to get currTeam and currPlayer in case we need to change.
                // TODO - move Type declaration outside for loop
                currTeam = currEvent.getTheTeam();
                currPlayer = currEvent.getThePlayer();
                
                int currBallPos = currEvent.getBallPos(); // Need to get before setting up new Event
                
                // This is the code that selects an event randomly from the possible set of events.
                /*
                GameEvent[] possEvents = currEvent.getNextEvents();
                currEvent = possEvents[(int) (Math.random()
                        * (possEvents.length))];
                */
                // Need to replace with
                
                currEvent = currTeam.getNextPlayAttempt(currEvent);

                // This is now the new currEvent so need to know if should change player and team
                //currEvent.setTheTeam(currEvent.changeTeam()?getOtherTeam(currTeam): currTeam);
                
                // TODO for Shoot, ball should not move forward - should be same as end of prev event
                currEvent.setBallPos(currBallPos );  // 8 could be random.
                
                if (currEvent.changeTeam()) {
                    currTeam = getOtherTeam(currTeam);
                    // Reverse ball position
                    currEvent.reverseBallPos();
                }
                currEvent.setTheTeam(currTeam);
                
                
                //System.out.println(currEvent.getTheTeam().getTeamName());
               
                // Below code *could* pick same player by accident. Could be interpreted as 
                // passing to self i.e. dribbling.
                // For another approach - see code in ReceiveWinGoal2
                //currPlayer = event1.changePlayer()?currTeam.getPlayerArray()[playerIndex = (playerIndex + 1 + ((int)(Math.random()*(playerArrLength-1))))%playerArrLength]:currPlayer; // Always change

                //ArrayList currPlayerList = new ArrayList();
                
                // Needs ArrayList not List so object is ArrayList (for support of remove)
                // Below code sets things up so not same player twice 
                ArrayList <Player> currPlayerList = new ArrayList(Arrays.asList(currEvent.getTheTeam().getPlayerArray()));
                currPlayerList.remove(currPlayer); 
                currEvent.setThePlayer(
                    currEvent.changePlayer()?
                    //currEvent.getTheTeam().getPlayerArray()[(int)(Math.random() * currEvent.getTheTeam().getPlayerArray().length)]:
                    currPlayerList.get((int)(Math.random() * currPlayerList.size())):
                    //currEvent.changePlayer()?currTeam.getPlayerArray()[playerIndex = (playerIndex + 1 + ((int)(Math.random()*(playerArrLength-1))))%playerArrLength]:
                    currPlayer
                );

                currEvent.setTheTime(i);
                eventList.add(currEvent);
                //System.out.println(i);
            }
            this.events = new GameEvent[eventList.size()];
            eventList.toArray(events);
 
        }
    }
    
    public String getDescription(boolean showEvents) {

        // Announce the game
        StringBuilder returnString = new StringBuilder();
        returnString.append(this.getHomeTeam().getTeamName() + " vs. " +
                this.getAwayTeam().getTeamName() + " (" + 
                this.getTheDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) + ")");
        returnString.append("\n");
        
        // Returns result object based on the gameEvents array
        // GameResult theResult = new GameResult(this);
        GameResult theResult = getGameResult();
      
        // Announce result
        if (theResult.isDrawnGame()){
            returnString.append("It's a draw!");
        } else  {
            returnString.append(theResult.getWinner().getTeamName());
            returnString.append(" win!");
        }
        returnString.append(" (" + theResult.getHomeTeamScore() + " - " + theResult.getAwayTeamScore() + ") \n");
        
        // Add description of the events  
        if (showEvents){
            for (GameEvent currEvent: this.getEvents()) {
                returnString.append(currEvent.getBallPos() + " : " + currEvent + "after " + 
                currEvent.getTheTime() + " mins by " + 
                currEvent.getThePlayer().getPlayerName() + 
                " of " + currEvent.getTheTeam().getTeamName() + 
                "\n");
            }  
        }

        return returnString.toString();
    }
    
    
    public String getDescription() {
        return getDescription(false);
    }
    
    public String getScore(){
        
        String theScore;
        GameResult theResult = getGameResult();
        theScore = theResult.getHomeTeamScore() + " - " + theResult.getAwayTeamScore();
        return theScore;
        
    }
    
    // TODO - is there neater way? Ternary works.
    public Team getOtherTeam(Team currTeam){
        if (currTeam == homeTeam){
            currTeam = awayTeam;
        } else currTeam = homeTeam;
        return currTeam;
    }

    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the events
     */
    public GameEvent[] getEvents() {
        return events;
    }

    /**
     * @param events the events to set
     */
    public void setEvents(GameEvent[] events) {
        this.events = events;
    }

    /**
     * @return the localDateTime
     */
    public LocalDateTime getLocalDateTime() {
        return getTheDateTime();
    }

    /**
     * @param theDateTime the localDateTime to set
     */
    public void setLocalDateTime(LocalDateTime theDateTime) {
        this.setTheDateTime(theDateTime);
    }

    /**
     * @return the theDateTime
     */
    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }

    /**
     * @param theDateTime the theDateTime to set
     */
    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
    }
    
    
    
    // TODO. Perhaps better have the code here, not in constructor of GameResult
    public GameResult getGameResult(){
        return new GameResult(this);
    }
    
        // Remainder is displayDetailStuff
    
    public String getDisplayDetail(){
        return getScore();
    }
    public boolean isDetailAvailable (){
        return detailAvailable;
    }
    public int getID(){
        return id;
    }
    public String getDetailType() {
        return detailType;
    }

    /**
     * @param detailAvailable the detailAvailable to set
     */
    public void setDetailAvailable(boolean detailAvailable) {
        this.detailAvailable = detailAvailable;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the getDetailType
     */
    public String getGetDetailType() {
        return detailType;
    }

    /**
     * @param getDetailType the getDetailType to set
     */
    public void setGetDetailType(String detailType) {
        this.detailType = detailType;
    }
    
    
    
    
      
}
