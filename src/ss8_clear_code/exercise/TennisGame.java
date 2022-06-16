package ss8_clear_code.exercise;

public class TennisGame {
    public static void main(String[] args) {

        System.out.println(getScore("tri","tam",4,3));
    }
    public static String deuce(int score1){
        String score;
        switch (score1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (score1==score2)
        {
            score = new StringBuilder(deuce(score1));
        }
        else if (score1>=4 || score2>=4)
        {
            int minusResult = score1-score2;
            if (minusResult==1) score = new StringBuilder("Advantage " + player1Name);
            else if (minusResult ==-1) score = new StringBuilder("Advantage " + player2Name);
            else if (minusResult>=2) score = new StringBuilder("Win for " + player1Name);
            else score = new StringBuilder("Win for " + player2Name);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = score1;
                else { score.append("-"); tempScore = score2;}
                switch(tempScore)
                {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }

}
