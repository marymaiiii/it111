import javax.swing. *;
import java.awt.*;

public class ShowWindow2 extends JFrame {
    public static void main(String[] args) {
      JLabel myLabel1, myLabel2;
      JTextField windowTextField1, windowTextField2;

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        JFrame window = new JFrame();

        window.setTitle("My Simple Window");

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.setLocationRelativeTo(null);

        window.getContentPane().setBackground(Color.red);

        myLabel1 = new JLabel("My First Big Label!!!!");
        myLabel1.setFont(new Font("Arial",Font.PLAIN,25 ));
        myLabel1.setBounds(50,50, 250,30);
        windowTextField1 = new JTextField(15);
        windowTextField1.setBounds(20,100,300,30);

        myLabel2 = new JLabel("My Second Big Label!!!!");
        myLabel2.setFont(new Font("Arial",Font.BOLD,22 ));
        myLabel2.setBounds(50,150, 250, 30);
        windowTextField2 = new JTextField(15);
        windowTextField2.setBounds(20,200,300,30);


        window.add(myLabel1);
        window.add(myLabel2);
        window.add(windowTextField1);
        window.add(windowTextField2);

      window.setLayout(null);

      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      window.setVisible(true);


    }
}

