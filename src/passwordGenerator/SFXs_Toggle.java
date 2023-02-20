package passwordGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SFXs_Toggle extends JCheckBox implements ActionListener {

    CustomFonts customFonts;
    ImageIcon soundOnIcon;
    ImageIcon soundOffIcon;



    SFXs_Toggle(){
        soundOnIcon = new ImageIcon(Objects.requireNonNull(getClass().
                getClassLoader().getResource("Sound_On.png")));
        soundOffIcon = new ImageIcon(Objects.requireNonNull(getClass().
                getClassLoader().getResource("Sound_Off.png")));
        customFonts = new CustomFonts();
        setText("Sound FX");
        setForeground(Color.yellow);
        setBounds(536,25,100,30);
        addActionListener(this);
        setFocusable(false);
        setSelected(true);
        setBackground(null);
        setIcon(soundOffIcon);
        setSelectedIcon(soundOnIcon);
        setHorizontalTextPosition(SwingConstants.LEFT);
        setFont(customFonts.quinqueFive.deriveFont(7f));
        setOpaque(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
