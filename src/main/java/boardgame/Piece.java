package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece (Board board){
        this.board = board; //retornar o board
        position = null; //
    }

    protected Board getBoard(){
        return board;
    }

    //método abstrato: cada peça (rei, bispo, etc) vai implementar esse método
    public abstract boolean[][] possibleMoves();

}
