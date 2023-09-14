import javax.swing.*;

public class SnakeGame extends JFrame {


//    Importing Board
    Board board;

    // Intilize Constructor
    SnakeGame(){
//        intilize board Object

        board = new Board();

        add(board);  // Frame is basically adjusted to  the board size

        pack();      //  it will pack the child componenet into parent size componenet

        setResizable(false);

//        make sure it is ivisble
        setVisible(true);
    }
    public static void main(String[] args) {


//        Initiliza snakeGame object
        SnakeGame snakegame = new SnakeGame();
    }



}