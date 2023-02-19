package PasswordGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class DigitsToggle extends JCheckBox implements ActionListener {

        CustomFonts customFonts;
        ImageIcon onIcon;
        ImageIcon offIcon;
        DigitsToggle(){
        onIcon = new ImageIcon(Objects.requireNonNull(getClass().
                getClassLoader().getResource("toggle_inv.png")));
        offIcon = new ImageIcon(Objects.requireNonNull(getClass().
                getClassLoader().getResource("toggle_off_inv.png")));
        customFonts = new CustomFonts();
        setText(" Digits (e.g. 345)");
        setForeground(Color.white);
        setBounds(27,290,300,30);
        addActionListener(this);
        setFocusable(false);
        setSelected(false);
        setIcon(offIcon);
        setSelectedIcon(onIcon);
        //setFont(new Font("GungsuhChe",Font.PLAIN,18));
        setFont(customFonts.pixelMplus10R.deriveFont(20f));
        setOpaque(false);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

            if (this.isSelected()){
                EngineV2.number=true;
                ProgramPanel.pwTextField.setText(EngineV2.generatePassword().toString());
                }else {
                EngineV2.number=false;
                ProgramPanel.pwTextField.setText(EngineV2.generatePassword().toString());
            }




    }
}
