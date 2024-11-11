package java.main.chessboxing.model.gamemode;

public class GameMode {
    private boolean isChessMode;

    public GameMode() {
        this.isChessMode = true;  // Start with chess mode
    }

    // Switches between chess and boxing mode
    public void switchMode() {
        this.isChessMode = !this.isChessMode;
    }

    public boolean isChessMode() {
        return isChessMode;
    }

    public boolean isBoxingMode() {
        return !isChessMode;
    }
}
