package board;

import javax.swing.*;

public class BoardMain {

    public static void main(String[] args) {
        JFrame game = new JFrame();
        game.setTitle("2048 Game");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(340, 400);
        game.setResizable(false);

        game.add(new Board());

        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
