package com.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StonePaperscissors {
    private JPanel mypanel3;
    private JTextField myscore;
    private JTextField compscore;
    private JTextField compchoice;
    private JRadioButton stoneRadioButton;
    private JRadioButton scissorRadioButton;
    private JRadioButton paperRadioButton;
    private JButton Play_button;
    private JLabel Stoneps;
    private int no3;
    private int player;
    private int comp;


    public StonePaperscissors() {
        stoneRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                no3 = (int) ((Math.random() * 10) % 3);
                //System.out.println(no3+"Stone Radio button");
                if (no3==0){
                    player++;
                    comp++;
                }
                else if(no3==1){
                    comp++;
                }
                else{
                    player++;
                }

            }
        });
        paperRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                no3 = (int) ((Math.random() * 10) % 3);
                if (no3==0){
                    player++;
                }
                else if(no3==1){
                    comp++;
                    player++;
                }
                else{
                    comp++;
                }

            }
        });
        scissorRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                no3 = (int) ((Math.random() * 10) % 3);
                if (no3==0){
                    comp++;
                }
                else if(no3==1){
                    player++;
                }
                else{
                    comp++;
                    player++;
                }

            }
        });
        Play_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (no3==0){
                    compchoice.setText("Stone");
                }
                else if(no3==1){
                    compchoice.setText("Paper");
                }
                else{
                    compchoice.setText("Scissor");
                }
                myscore.setText(String.valueOf(player));
                compscore.setText(String.valueOf(comp));
            }
        });
    }

    public void setVisible(boolean var2) {
            JFrame frame3=new JFrame("Stone,Paper & Scissors");
            frame3.setContentPane(new StonePaperscissors().mypanel3);
            frame3.setSize(800,400);
            frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame3.setVisible(true);
            frame3.setResizable(false);
            //int no3 ;
            int player=0;
            int comp=0;

        }
}
