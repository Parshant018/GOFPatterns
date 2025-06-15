package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard>{

    private List<GamePeice> peices;

    public GameBoard() {
        peices = new ArrayList<>();
    }

    public void addPeice(GamePeice peice) {
        peices.add(peice);
    }

    @Override
    public GameBoard clone() {
        GameBoard board = new GameBoard();
        for(GamePeice p : peices) {
            board.addPeice(p.clone());
        }

        return board;
    }

    public String toString() {
        StringBuffer res = new StringBuffer("(");
        for(GamePeice peice : peices) {
            res.append(peice.toString()).append(",");
        }
        res.setLength(res.length()-1);
        res.append(")");
        return res.toString();
    }
}
