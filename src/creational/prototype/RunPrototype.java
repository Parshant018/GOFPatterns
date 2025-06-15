package creational.prototype;

public class RunPrototype {

    public void run() {
        GameBoard board = new GameBoard();
        board.addPeice(new GamePeice(1, "white"));
        board.addPeice(new GamePeice(3, "black"));
        System.out.println("Original : "+board.toString());
        GameBoard board1 = board.clone();
        System.out.println("Clone : "+board1.toString());
    }

}
