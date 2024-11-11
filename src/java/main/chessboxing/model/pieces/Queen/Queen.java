package java.main.chessboxing.model.pieces.Queen;

public class Queen {
    private boolean isCaptured;

    public Queen() {
        this.isCaptured = false;
    }

    public void capture() {
        this.isCaptured = true;
    }

    public boolean isCaptured() {
        return isCaptured;
    }
}
