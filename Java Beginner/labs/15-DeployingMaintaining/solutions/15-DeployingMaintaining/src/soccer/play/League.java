/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer.play;

import soccer.event.GameEvent;
import soccer.event.Goal;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import soccer.util.PlayerDatabase;
import soccer.util.PlayerDatabaseException;
import soccer.util.Settings;

/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    
    // Possibly should have Team[] and Game[] as member variables
    // Make Team and Game (and any others) implement getDisplay()
    // Wrap Team[] and Game[] somehow? E.g. Have TeamsDisplay and pass Teams?
    
    // TODO - Still some problems with displaying League when less (or more) than five teams
    // The horizontal lines are not lined up correctly
    
    
    public static void main(String[] args) {
        
        League theLeague = new League();
        String teamNames = "The Robins,The Pelicans,The Sparrows,The Magpies,The Crows";
        int teamSize = 5;

        try {
            Team[] theTeams = theLeague.createTeams(teamNames, teamSize);
            Game[] theGames = theLeague.createGames(theTeams);

            System.out.println(theLeague.getLeagueAnnouncement(theGames));
            for (Game currGame : theGames) {
                currGame.playGame();
                //break;
                System.out.println(currGame.getDescription(true));
            }

            // setTeamStats() separate from showBestTeam() as used in other places too (e.g. getDescription())
            theLeague.setTeamStats(theTeams, theGames); // This could be the first call in showBestTeam.
            theLeague.showBestTeam(theTeams);

        //theLeague.setPlayerStats(theGames);
            //theLeague.showBestPlayersByTeam(theTeams);
            //theLeague.showBestPlayersByLeague(theTeams);
            IDisplayDataItem[][] dataGrid = theLeague.getLeagueDataGrid(theGames, theTeams);
            theLeague.outputTextLeagueGrid(dataGrid);
            //theLeague.simpleDisplay(dataGrid);

        } catch (PlayerDatabaseException e) {
            e.printStackTrace(System.err);
        }
        

    }

    public Team[] createTeams(String teamNames, int teamSize) throws PlayerDatabaseException {

        PlayerDatabase playerDB = new PlayerDatabase();
        
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        for (int i =0; i < theTeams.length; i++){
             theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }
       

        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        int daysBetweenGames = 0;
        
        ArrayList theGames = new ArrayList();
        
        for (Team homeTeam: theTeams){
            for (Team awayTeam: theTeams){
               if (homeTeam != awayTeam) {
                   daysBetweenGames += Settings.DAYS_BETWEEN_GAMES;
                   theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGames)));
               } 
            
            }
        }
        
        
        
        return (Game[]) theGames.toArray(new Game[1]);
    }
    
    // TODO - tidy this method
    // Maybe this should be half of showBestTeam
    // Do we really need theTeams here? Can we get from the Games?
    public void setTeamStats(Team[] theTeams, Game[] theGames) {

        
        // zero all Team scores and Player scores
        for (Team currTeam: theTeams){
            currTeam.setGoalsTotal(0);
            currTeam.setPointsTotal(0);
                    // zero all Player scores
            for (Player currPlayer: currTeam.getPlayerArray()){
                currPlayer.setGoalsScored(0);
            }
        }
        
        // Repopulate goalsTotal and pointsTotal on each Team object
        //
        // Note all that is needed from GameResult is:
        // 1. Is the game drawn?
        // 2. Who won the game? (no winner equals drawn? but not good to pass null).
        // 3. What did homeTeam score, what did awayTeam score?
        //
        // Should be possible to get homeTeam and awayTeam from currGame
        
        for (Game currGame: theGames){
            
            GameResult theResult = currGame.getGameResult(); // 
            //GameResult theResult = new GameResult(currGame); // Maybe above is better
            
            // Increment pointsTotal on Team
            if (theResult.isDrawnGame()) {
                currGame.getHomeTeam().incPointsTotal(Settings.DRAWN_GAME_POINTS);   // Another way to do it currGame vs. theResult
                theResult.getAwayTeam().incPointsTotal(Settings.DRAWN_GAME_POINTS);
            }

            else {
                theResult.getWinner().incPointsTotal(Settings.WINNER_GAME_POINTS);
            }
            
            // Increment goalsTotal in Team
            theResult.getHomeTeam().incGoalsTotal(theResult.getHomeTeamScore());
            theResult.getAwayTeam().incGoalsTotal(theResult.getAwayTeamScore());
            
        }
    }
    
    
    public void showBestTeam(Team[] theTeams) {
        
        Arrays.sort(theTeams);
        Team currBestTeam = theTeams[0];  
        System.out.println("\nTeam Points");       
           
        for (Team currTeam: theTeams){
            System.out.println(currTeam.getTeamName() + " : " + currTeam.getPointsTotal() + " : "
                     + currTeam.getGoalsTotal());

        }
        
        System.out.println("Winner of the League is " + currBestTeam.getTeamName());
        
    }
    
    public String getLeagueAnnouncement(Game[] theGames){
        
        Period thePeriod = Period.between(theGames[0].getTheDateTime().toLocalDate(), 
        theGames[theGames.length - 1].getTheDateTime().toLocalDate());
        
        return "The league is scheduled to run for " +
        thePeriod.getMonths() + " month(s), and " +
        thePeriod.getDays() + " day(s)\n";
    }
    
    
    // Should this zero all players first therefore make getAllPlayers() a util method? TODO
    public void setPlayerStats(Game[] theGames) {
        for (Game currGame : theGames) {
            for (GameEvent currEvent : currGame.getEvents()) {
                if (currEvent instanceof Goal) {
                    currEvent.getThePlayer().incGoalsScored();
                }
            }
        }

    }
    
    public void showBestPlayersByLeague(Team[] theTeams){
        ArrayList <Player> thePlayers = new ArrayList();
        for (Team currTeam: theTeams){
            thePlayers.addAll(Arrays.asList(currTeam.getPlayerArray()));
        }
        
        Collections.sort(thePlayers, (p1, p2) -> Double.valueOf(p2.getGoalsScored()).compareTo(Double.valueOf(p1.getGoalsScored())));
        
        // How to get the team the player is in? TODO.
        System.out.println("\n\nBest Players in League");
        for (Player currPlayer: thePlayers){
            System.out.println(currPlayer.getPlayerName() + " : " + currPlayer.getGoalsScored());
        }
    }    
    
    public void showBestPlayersByTeam(Team[] theTeams){

        for (Team currTeam: theTeams){
            Arrays.sort(currTeam.getPlayerArray(), (p1, p2) -> Double.valueOf(p2.getGoalsScored()).compareTo(Double.valueOf(p1.getGoalsScored())));

            System.out.println("\n\nBest Players in " + currTeam.getTeamName());
            for (Player currPlayer: currTeam.getPlayerArray()){
                System.out.println(currPlayer.getPlayerName() + " : " + currPlayer.getGoalsScored());
            }
        
        }
     
    }
    
    public IDisplayDataItem[][] getLeagueDataGrid(Game[] theGames, Team[] theTeams) {

        int numTeams = theTeams.length;

        // Size of grid allow for extra column on the left for list of Teams, and two 
        // extra columns on right for Points and Goals. Also extra column on top for list of
        // Teams.
        IDisplayDataItem[][] theGrid = new IDisplayDataItem[numTeams + 1][numTeams + 3];

        int colNum = 0;
        int rowNum = 0;

        // Starting at 0, 0, insert a blank top left corner.
        theGrid[rowNum][colNum] = new DisplayString("");

        // Do the first row of Teams (headings);
        for (int i = 0; i < theTeams.length; i++) {

            theTeams[i].setId(i);   // set the Id to the index
            theGrid[rowNum][colNum + 1] = theTeams[i];
            colNum++;
        }

        // Add Points and Games columns to the first row (headings)
        theGrid[rowNum][colNum + 1] = new DisplayString("Points");
        theGrid[rowNum][colNum + 2] = new DisplayString("Goals");

        // Add each row of Games for each home team (note all Team IDs will be set by previous for loop
        // Also note rowNum = i + 1; therefore starting on second row.
        for (int i = 0; i < theTeams.length; i++) {
            rowNum = i + 1;
            
            // Add the home Team to the first column of the current row
            colNum = 0;
            Team currHomeTeam = theTeams[i];
            theGrid[rowNum][colNum] = currHomeTeam;

            // Inner loop through all away teams on current row to add Games
            for (Team currAwayTeam : theTeams) {
                colNum++;   // Could also use traditional for loop here
                if (currHomeTeam != currAwayTeam) {
                    for (Game theGame : theGames) {
                        if (theGame.getHomeTeam() == currHomeTeam && theGame.getAwayTeam() == currAwayTeam) {
                            theGrid[rowNum][colNum] = theGame;
                            break;
                        }
                    }
                } else {
                    theGrid[rowNum][colNum] = new DisplayString(" X ");    // Mark with X as team doesn't play itself
                }
            }

            // Add last two columns to current row (team points and goals)
            theGrid[rowNum][colNum + 1] = new DisplayString(new Integer(currHomeTeam.getPointsTotal()).toString());
            theGrid[rowNum][colNum + 2] = new DisplayString(new Integer(currHomeTeam.getGoalsTotal()).toString());
        }
        return theGrid;
    }
    
    public void outputTextLeagueGrid(IDisplayDataItem[][] dataGrid) {
        
        // It is simple to iterate throught the dataGrid and get each item. However, this outputTextLeagueGrid() method
        // will output a grid using monospaced text and therefore needs to calculate how wide to make each column.

        // First find the longest item in any column
        int[] stringLength = new int[dataGrid[0].length];   // stringLength gives a width for each column
        int totalLength = 0;                                // totalLength helps calculate length needed for horizontal line between columns
        
        for (int i = 0; i < dataGrid[0].length; i++){
            
            int currLongest = 0;
            for (IDisplayDataItem[] dataGrid1 : dataGrid) {
                int currLength = dataGrid1[i].getDisplayDetail().length();
                if (currLength > currLongest) currLongest = currLength;
            }
            stringLength[i] = currLongest;
            totalLength += currLongest;
        }

        // work out how many extra characters needed for horizontal line between rows
        int numCols = dataGrid[0].length;
        int numExtraCharsPerColum = 3; // One vertical line + space before text and a space after text
        // Create horizontal line of correct length. One extra added to line length for last vertical bar
        String separatorLine = new String(new char[totalLength + (numCols * numExtraCharsPerColum) + 1]).replace("\0", "-"); 
        System.out.println(separatorLine);    
        for (IDisplayDataItem[] theRow: dataGrid){

            for (int j = 0; j < theRow.length; j++){
                // How many extra chars required to pad out each item
                int extraChars = stringLength[j] - theRow[j].getDisplayDetail().length();
                // Print out each item in the row    
                System.out.print("| " + theRow[j].getDisplayDetail() + new String(new char[extraChars]).replace("\0", " ") + " ");

            } 
           
            System.out.print("|");  // Print last item in row
            System.out.println();   // Move to next row
            System.out.println(separatorLine);  // Print howizontal separator line
        }
    }
        
    public void simpleDisplay(IDisplayDataItem[][] dataGrid) {
    // Iterate through everything using nested enhanced for loop     
    for (IDisplayDataItem[] theRow: dataGrid){

            for (IDisplayDataItem theItem: theRow){

                    System.out.print(theItem.getDisplayDetail() + " : ");

            } 
            System.out.println();
        }
    }
    
}
