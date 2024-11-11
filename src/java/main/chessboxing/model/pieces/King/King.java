package java.main.chessboxing.model.pieces.King;

public class King {
    private boolean isCaptured;

    public King() {
        this.isCaptured = false;
    }

    public void capture() {
        this.isCaptured = true;
    }

    public boolean isCaptured() {
        return isCaptured;
    }
}
