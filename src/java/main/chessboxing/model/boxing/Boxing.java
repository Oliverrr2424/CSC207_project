package java.main.chessboxing.model.boxing;

public class Boxing {
    private int round;
    private int player1Score;
    private int player2Score;

    public Boxing() {
        this.round = 1;
        this.player1Score = 0;
        this.player2Score = 0;
    }

    // Getter and Setter for round
    public int getRound() {
        return round;
    }

    public void nextRound() {
        this.round++;
    }

    // Methods for scoring
    public void addScoreForPlayer1(int points) {
        this.player1Score += points;
    }

    public void addScoreForPlayer2(int points) {
        this.player2Score += points;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }
}
