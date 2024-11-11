package java.main.chessboxing.model.Player;

public class Player {
    private final String name;
    private int stamina;
    private int chessScore;
    private int boxingScore;

    public Player(String name) {
        this.name = name;
        this.stamina = 100;
        this.chessScore = 0;
        this.boxingScore = 0;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void reduceStamina(int amount) {
        this.stamina = Math.max(0, this.stamina - amount);
    }

    public int getChessScore() {
        return chessScore;
    }

    public void increaseChessScore(int points) {
        this.chessScore += points;
    }

    public int getBoxingScore() {
        return boxingScore;
    }

    public void increaseBoxingScore(int points) {
        this.boxingScore += points;
    }

    public boolean isExhausted() {
        return stamina <= 0;
    }
}
