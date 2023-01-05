package me.potato.lec01.sec01.tightlycoupled.games;

public class CounterStrike {
    public void launch() {
        this.loadGame();
        this.keyUp();
        this.keyDown();
        this.keyLeft();
        this.keyRight();
    }

    private void loadGame() {
        System.out.println("Loading Counter Strike...");
    }

    private void keyUp() {
        System.out.println("Move forward...");
    }

    private void keyDown() {
        System.out.println("Move backward...");
    }

    private void keyLeft() {
        System.out.println("Move left...");
    }

    private void keyRight() {
        System.out.println("Key right...");
    }
}
