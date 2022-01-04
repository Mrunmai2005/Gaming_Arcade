package com.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArcadeGame {
    private JPanel mypanel;
    private JButton guessTheNumberButton;
    private JButton stonePaperScissorsButton;

    public ArcadeGame() {
        guessTheNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Guess_the_number g1=new Guess_the_number();
                g1.setVisible(true);
            }
        });
        stonePaperScissorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StonePaperscissors g2= new StonePaperscissors();
                g2.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame1=new JFrame("Gaming_arcade");
        frame1.setContentPane(new ArcadeGame().mypanel);
        frame1.setSize(600,300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setResizable(false);


    }


}
