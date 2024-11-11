package java.main.chessboxing.model.Match;

public class Match {
    private final int totalRounds;
    private int player1Wins;
    private int player2Wins;

    public Match(int totalRounds) {
        this.totalRounds = totalRounds;
        this.player1Wins = 0;
        this.player2Wins = 0;
    }

    public void recordWinForPlayer1() {
        this.player1Wins++;
    }

    public void recordWinForPlayer2() {
        this.player2Wins++;
    }

    public int getPlayer1Wins() {
        return player1Wins;
    }

    public int getPlayer2Wins() {
        return player2Wins;
    }

    public boolean isMatchOver() {
        return player1Wins > totalRounds / 2 || player2Wins > totalRounds / 2;
    }
}
