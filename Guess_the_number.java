package com.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guess_the_number {
    private JPanel mypanel4;
    private JTextField My_no;
    private JButton guessButton;
    private JTextField message;
    private JTextField comp_no;

    public Guess_the_number() {
        guessButton.addActionListener(new ActionListener() {
            @Override
                    public void actionPerformed(ActionEvent e) {
                        int myno= Integer.parseInt(My_no.getText());
                        //random number generation
                        int no2= (int) (Math.random()*10);

                        if (myno==no2){
                            message.setText("Correct guess!");
                        }
                        else if(myno>no2){
                            message.setText("Too Big!");
                        }
                        else if(myno<no2){
                            message.setText("Too Small!");
                        }

                        comp_no.setText(String.valueOf(no2));

            }
        });
    }

    public void setVisible(boolean var) {
        JFrame frame2=new JFrame("Guess the Number");
        frame2.setContentPane(new Guess_the_number().mypanel4);
        frame2.setSize(600,300);
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);

    }

}
