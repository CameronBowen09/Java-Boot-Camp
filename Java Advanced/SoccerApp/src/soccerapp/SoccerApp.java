/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soccerapp;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SoccerApp {
    
    static HashMap<String, Integer> scoreBoard = new HashMap<>();
    
    public static void main(String[] args) {

        Integer position = 0;

        BufferedReader in = getReader("Soccer.txt");
        String succes = checkGames(in, scoreBoard);
        while (succes != null) {
            succes = checkGames(in, scoreBoard);
        }

        System.out.println("\nThats the end of the league");

        System.out.println("\n" + scoreBoard.toString());

        scoreBoard.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .forEach(e -> System.out.println(e + " " + scoreBoard.get(e)));
    }

    private static BufferedReader getReader(String name) //→19
    {
        BufferedReader in = null;
        try {
            File file = new File(name);
            in = new BufferedReader(
                    new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println(
                    "The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static String checkGames(BufferedReader in, HashMap<String, Integer> scoreBoard) {
        
        String line;
        String[] game;
        String[] team1score1;
        String[] team2score2;
        String team1;
        int score1;
        String team2;
        int score2;

        try {
            line = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (line == null || line.equals(""))
            return null;
        else {
            game = line.split(",");
            team1score1 = game[0].split(" ");
            team2score2 = game[1].trim().split(" ");
            team1 = team1score1[0];
            score1 = Integer.parseInt(team1score1[1]);
            team2 = team2score2[0];
            score2 = Integer.parseInt(team2score2[1]);


            if (score1 > score2) {
                System.out.println(team1 + " beats " + team2 + " " + score1 + ":" + score2);
                if (scoreBoard.containsKey(team1)) {
                    scoreBoard.put(team1, scoreBoard.get(team1) + 3);
                } else {
                    scoreBoard.put(team1, 3);
                }

                if (!scoreBoard.containsKey(team2)) {
                    scoreBoard.put(team2, 0);
                }
            } else if (score1 < score2) {
                System.out.println(team2 + " beats " + team1 + " " + score2 + ":" + score1);
                if (scoreBoard.containsKey(team2)) {
                    scoreBoard.put(team2, scoreBoard.get(team2) + 3);
                } else {
                    scoreBoard.put(team2, 3);
                }

                if (!scoreBoard.containsKey(team1)) {
                    scoreBoard.put(team1, 0);
                }
            } else {
                System.out.println("It's a draw between " + team1 + " and " + team2 + " " + score1 + ":" + score2);
                if (scoreBoard.containsKey(team1)) {
                    scoreBoard.put(team1, scoreBoard.get(team1) + 1);
                } else {
                    scoreBoard.put(team1, 1);
                }

                if (scoreBoard.containsKey(team2)) {
                    scoreBoard.put(team2, scoreBoard.get(team2) + 1);
                } else {
                    scoreBoard.put(team2, 1);
                }
            }
            return "Succesfull ReadLine";
        }
    }
}
