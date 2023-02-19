package PasswordGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenerateButton extends JButton implements ActionListener {
    CustomFonts customFonts;

    GenerateButton(){
       customFonts = new CustomFonts();
       addActionListener(this);
       setBounds(500,165,100,40);
       setText("Generate");
       setBackground(Color.white);
       //setFont(new Font("GungsuhChe",Font.BOLD,14));
       setFont(customFonts.quinqueFive.deriveFont(7f));
       setFocusable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        ProgramPanel.pwTextField.setText(EngineV2.generatePassword().toString());



    }
}
