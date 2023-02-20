package passwordGenerator;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class ProgramFrame extends JFrame {

    ProgramPanel panel;
    ImageIcon backgroundImage;
    ImageIcon programLogo = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("icons8-password-91-shadow.png")));
    JLabel imageLabel;
        ProgramFrame(){
        /*backgroundImage = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().
                getResource("PWgeneratorbackgr.png")));*/
        setContentPane(new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().
                getResource("PWgeneratorbackgr.png")))));
        setLayout(new FlowLayout());
        panel = new ProgramPanel();
        setIconImage(programLogo.getImage());

        imageLabel = new JLabel();
        imageLabel.setIcon(backgroundImage);
        imageLabel.setSize(640,480);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640,480);
        //panel.add(imageLabel);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Password Generator");
    }
}
