package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class BoardGraphics extends JPanel
{
    public static int p;
    public static int q;
    public void paint(Graphics g){ //local variable
        g.setColor(Color.gray); //graphics
        int[]a={75,90,60}; //array
        int[]b={25,80,80};
        g.fillPolygon(a,b,3);
        int[]c={50,65,35};
        int[]d={40,95,100};
        g.fillPolygon(c,d,3);
        int[]e={85,95,70};
        int[]f={30,60,60};
        g.fillPolygon(e,f,3);
        int[]h={70,100,145};
        int[]i={60,45,100};
        g.fillPolygon(h, i, 3);
        int[]j={62,45,100};
        int[]k={40,80,80};
        g.fillPolygon(j, k, 3);
        int[]l={125,70,170};
        int[]m={60,100,100};
        g.fillPolygon(l, m, 3);
        int[]n={35,75,90,170};
        int[]o={100,50,50,100};
        g.fillPolygon(n, o, 4);
        g.setColor(Color.black);
        g.fillRect(175, 103, 20, 20);
        g.setColor(Color.white);
        g.drawString("100", 175, 116); //100
        g.setColor(Color.black);
        g.fillRect(205, 103, 20, 20);
        g.setColor(Color.red);
        g.fillRect(190, 135, 20, 20);
        g.setColor(Color.black);
        g.fillRect(160, 150, 20, 20);
        g.fillRect(130, 165, 20, 20);
        g.fillRect(120, 190, 20, 20);
        g.setColor(Color.green);
        g.fillRect(135, 215, 20, 20);
        g.setColor(Color.black);
        g.fillRect(165, 210, 20, 20);
        g.fillRect(190, 200, 20, 20);
        g.fillRect(215, 190, 20, 20);
        g.fillRect(240, 180, 20, 20);
        g.setColor(Color.white);
        g.drawString("90", 243, 195); //90
        g.setColor(Color.black);
        g.fillRect(270, 160, 20, 20);
        g.fillRect(300, 150, 20, 20);
        g.fillRect(330, 140, 20, 20);
        g.fillRect(360, 155, 20, 20);
        g.fillRect(390, 165, 20, 20);
        g.fillRect(420, 190, 20, 20);
        g.fillRect(450, 165, 20, 20);
        g.fillRect(480, 180, 20, 20);
        g.fillRect(510, 190, 20, 20);
        g.fillRect(540, 200, 20, 20);
        g.setColor(Color.white);
        g.drawString("80", 543, 215); //80
        g.setColor(Color.black);
        g.fillRect(540, 225, 20, 20);
        g.fillRect(540, 250, 20, 20);
        g.fillRect(540, 275, 20, 20);
        g.fillRect(540, 300, 20, 20);
        g.fillRect(540, 325, 20, 20);
        g.fillRect(540, 350, 20, 20);
        g.fillRect(510, 350, 20, 20);
        g.setColor(Color.blue);
        g.fillRect(485, 330, 20, 20);
        g.setColor(Color.black);
        g.fillRect(460, 310, 20, 20);
        g.fillRect(435, 310, 20, 20);
        g.setColor(Color.white);
        g.drawString("70", 438, 325); //70
        g.setColor(Color.black);
        g.fillRect(410, 290, 20, 20);
        g.fillRect(380, 290, 20, 20);
        g.fillRect(350, 290, 20, 20);
        g.fillRect(320, 305, 20, 20);
        g.setColor(Color.red);
        g.fillRect(290, 325, 20, 20);
        g.setColor(Color.black);
        g.fillRect(260, 325, 20, 20);
        g.fillRect(230, 325, 20, 20);
        g.fillRect(200, 340, 20, 20);
        g.fillRect(200, 365, 20, 20);
        g.fillRect(200, 390, 20, 20);
        g.setColor(Color.white);
        g.drawString("60", 203, 405); //60
        g.setColor(Color.black);
        g.fillRect(200, 415, 20, 20);
        g.fillRect(200, 440, 20, 20);
        g.fillRect(200, 465, 20, 20);
        g.fillRect(230, 475, 20, 20);
        g.fillRect(260, 490, 20, 20);
        g.fillRect(290, 505, 20, 20);
        g.fillRect(320, 490, 20, 20);
        g.fillRect(320, 465, 20, 20);
        g.fillRect(320, 440, 20, 20);
        g.fillRect(320, 415, 20, 20);
        g.setColor(Color.white);
        g.drawString("50", 323, 430); //50
        g.setColor(Color.blue);
        g.fillRect(320, 390, 20, 20);
        g.setColor(Color.black);
        g.fillRect(345, 370, 20, 20);
        g.fillRect(370, 350, 20, 20);
        g.fillRect(395, 350, 20, 20);
        g.fillRect(420, 350, 20, 20);
        g.fillRect(445, 350, 20, 20);
        g.fillRect(470, 370, 20, 20);
        g.fillRect(495, 390, 20, 20);
        g.fillRect(495, 415, 20, 20);
        g.fillRect(495, 440, 20, 20);
        g.setColor(Color.white);
        g.drawString("40", 498, 455); //40
        g.setColor(Color.green);
        g.fillRect(495, 465, 20, 20);
        g.setColor(Color.black);
        g.fillRect(470, 465, 20, 20);
        g.fillRect(445, 480, 20, 20);
        g.fillRect(420, 495, 20, 20);
        g.fillRect(395, 510, 20, 20);
        g.fillRect(370, 525, 20, 20);
        g.fillRect(395, 540, 20, 20);
        g.setColor(Color.red);
        g.fillRect(420, 555, 20, 20);
        g.setColor(Color.black);
        g.fillRect(445, 555, 20, 20);
        g.fillRect(470, 555, 20, 20);
        g.setColor(Color.white);
        g.drawString("30", 473, 570); //30
        g.setColor(Color.black);
        g.fillRect(495, 540, 20, 20);
        g.setColor(Color.blue);
        g.fillRect(520, 525, 20, 20);
        g.setColor(Color.black);
        g.fillRect(545, 510, 20, 20);
        g.fillRect(570, 500, 20, 20);
        g.fillRect(595, 485, 20, 20);
        g.setColor(Color.red);
        g.fillRect(595, 510, 20, 20);
        g.setColor(Color.black);
        g.fillRect(595, 535, 20, 20);
        g.fillRect(595, 560, 20, 20);
        g.fillRect(595, 585, 20, 20);
        g.setColor(Color.blue);
        g.fillRect(595, 610, 20, 20);
        g.setColor(Color.white);
        g.drawString("20", 598, 625); //20
        g.setColor(Color.black);
        g.fillRect(570, 620, 20, 20);
        g.fillRect(545, 630, 20, 20);
        g.fillRect(520, 640, 20, 20);
        g.setColor(Color.green);
        g.fillRect(495, 650, 20, 20);
        g.setColor(Color.black);
        g.fillRect(470, 640, 20, 20);
        g.fillRect(445, 630, 20, 20);
        g.fillRect(420, 620, 20, 20);
        g.fillRect(395, 620, 20, 20);
        g.fillRect(370, 625, 20, 20);
        g.fillRect(370, 650, 20, 20);
        g.setColor(Color.white);
        g.drawString("10", 373, 665); //10
        g.setColor(Color.black);
        g.fillRect(370, 675, 20, 20);
        g.fillRect(370, 700, 20, 20);
        g.setColor(Color.red);
        g.fillRect(345, 710, 20, 20);
        g.setColor(Color.black);
        g.fillRect(320, 720, 20, 20);
        g.setColor(Color.blue);
        g.fillRect(295, 730, 20, 20);
        g.setColor(Color.black);
        g.fillRect(270, 740, 20, 20);
        g.fillRect(245, 750, 20, 20);
        g.fillRect(220, 760, 20, 20);
        g.fillRect(195, 770, 20, 20);
        g.fillRect(170, 780, 20, 20);
        g.setColor(Color.white);
        g.drawString("0", 177, 795); //0
        g.fillOval(p, q, 10, 10);
        g.setColor(Color.blue);
        g.fillRect(620, 10, 20, 20);
        g.setColor(Color.red);
        g.fillRect(620, 35, 20, 20);
        g.setColor(Color.green);
        g.fillRect(620, 60, 20, 20);
        g.setColor(Color.black);
        g.drawString("Sherpa Station",530,25);
        g.drawString("Take a Hike",545,50);
        g.drawString("Cliff",586,75);




    }

    public static void main(String[] args){
        JFrame frame= new JFrame("Take A Hike!");
        frame.getContentPane().add(new BoardGraphics());
        frame.setSize(650, 850);
        frame.setVisible(true); //boolean
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}



