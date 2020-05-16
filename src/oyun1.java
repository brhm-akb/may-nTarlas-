import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class oyun1 extends JFrame {
    public oyun1(){
        JFrame frame = new JFrame("Mayin Tarlasi");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(1286,829);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Board board = new Board();
        this.setContentPane(board);
    }
    
    public class Board extends JPanel{
        public void paintComppnent(Graphics g){
            g.setColor(Color.red);
            g.fillRect(87, 348, 69, 234);
        }
    }
    
}