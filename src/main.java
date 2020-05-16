import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mayin Tarlasi");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(1286,829);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);
        
        
        JMenu ayarlar = new JMenu("Ayarlar");
        menu.add(ayarlar);
        
        JMenuItem yeniOyun = new JMenuItem("Yeni Oyun");
        ayarlar.add(yeniOyun);
        
        JSeparator ara1 = new JSeparator();
        ayarlar.add(ara1);
        
        JMenuItem baslangic = new JMenuItem("Başlangıç");
        ayarlar.add(baslangic);
        
        JMenuItem orta = new JMenuItem("Orta");
        ayarlar.add(orta);
        
        JMenuItem zor = new JMenuItem("Zor");
        ayarlar.add(zor);
        
        JMenuItem ozel = new JMenuItem("Özel");
        ayarlar.add(ozel);
        
        JSeparator ara2 = new JSeparator();
        ayarlar.add(ara2);
        
        JMenuItem cikis = new JMenuItem("Çıkış");
        ayarlar.add(cikis);
        
        
        
        baslangic.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                oyun1 tarla1 = new oyun1();
                tarla1.setVisible(true);
                frame.dispose();
            }
        });
        
        orta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                oyun2 tarla2 = new oyun2();
                tarla2.setVisible(true);
                frame.dispose();
            }
        });
        
        zor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                oyun3 tarla3 = new oyun3();
                tarla3.setVisible(true);
                frame.dispose();
            }
        });
        
        ozel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                oyun4 tarla4 = new oyun4();
                tarla4.setVisible(true);
                frame.dispose();
            }
        });
        
       
        
        cikis.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}