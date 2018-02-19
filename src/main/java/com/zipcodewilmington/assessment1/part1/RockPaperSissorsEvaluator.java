package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */

    public String getWinningMove(String handSign) {
        String outPut = "";
        if (handSign.equals("rock")) {
            outPut += "paper";
        } else if (handSign.equals("scissors")) {
            outPut += "rock";
        } else if (handSign.equals("paper")) {
            outPut += "scissors";
        }

        return outPut;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String outPut = "";
        if (handSign.equals("rock")) {
            outPut += "scissors";
        } else if (handSign.equals("scissors")) {
            outPut += "paper";
        } else if (handSign.equals("paper")) {
            outPut += "rock";
        }

        return outPut;


    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        if ((handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("paper")) ||
                handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("rock")) {
            winner += "paper";
        } else if ((handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("scissors")) ||
                handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("rock")) {
            winner += "rock";
        } else if ((handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("paper")) ||
                handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("scissors")) {
            winner += "scissors";

        }
        return winner;
    }
}
