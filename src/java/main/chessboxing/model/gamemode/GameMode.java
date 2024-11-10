package java.main.chessboxing.model.gamemode;

public abstract class GameMode {
    protected int playerTimeRemaining;
    protected int roundDuration;
    protected int roundTimeRemaining;
    protected boolean isCurrentMode;

    public abstract void startMode();
    public abstract void endMode();
}