package bai_8_clean_code_refactoring.bai_tap.refactoring;

public class TennisGame {

    public static String getScore(String playerOne, String playerTwo, int playerOneScore, int playerTwoScore) {
        String notifyScore = "";
        int tempScore = 0;
        if (playerOneScore == playerTwoScore) {
            notifyScore = getResultDraw(playerOneScore);
        } else if (playerOneScore >= 4 || playerTwoScore >= 4) {
            notifyScore = getResult(playerOneScore, playerTwoScore);
        } else {
            notifyScore = getResultPlayer(playerOneScore, playerTwoScore, notifyScore);
        }
        return notifyScore;
    }

    private static String getResultPlayer(int playerOneScore, int playerTwoScore, String notifyScore) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = playerOneScore;
            } else {
                notifyScore += "-";
                tempScore = playerTwoScore;
            }
            switch (tempScore) {
                case 0:
                    notifyScore += "Love";
                    break;
                case 1:
                    notifyScore += "Fifteen";
                    break;
                case 2:
                    notifyScore += "Thirty";
                    break;
                case 3:
                    notifyScore += "Forty";
                    break;
            }
        }
        return notifyScore;
    }

    private static String getResultDraw(int playerOneScore) {
        String notifyScore;
        switch (playerOneScore) {
            case 0:
                notifyScore = "Love-All";
                break;
            case 1:
                notifyScore = "Fifteen-All";
                break;
            case 2:
                notifyScore = "Thirty-All";
                break;
            case 3:
                notifyScore = "Forty-All";
                break;
            default:
                notifyScore = "Deuce";
                break;

        }
        return notifyScore;
    }

    private static String getResult(int playerOneScore, int playerTwoScore) {
        String result;
        int minusResult = playerOneScore - playerTwoScore;
        if (minusResult == 1) {
            result = "Advantage player1";
        } else if (minusResult == -1) {
            result = "Advantage player2";
        } else if (minusResult >= 2) {
            result = "Win for player1";
        } else {
            result = "Win for player2";
        }
        return result;
    }
}
