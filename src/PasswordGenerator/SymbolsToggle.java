package PasswordGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SymbolsToggle extends JCheckBox implements ActionListener{

    CustomFonts customFonts;
    ImageIcon onIcon;
    ImageIcon offIcon;
    SymbolsToggle(){
        onIcon = new ImageIcon(Objects.requireNonNull(getClass().
                getClassLoader().getResource("toggle_inv.png")));
        offIcon = new ImageIcon(Objects.requireNonNull(getClass().
                getClassLoader().getResource("toggle_off_inv.png")));
        customFonts = new CustomFonts();
        setText(" Symbols (e.g. @$#!)");
        setForeground(Color.white);
        setBounds(27,370,250,30);
        addActionListener(this);
        setFocusable(false);
        setSelected(false);
        setBackground(null);
        setIcon(offIcon);
        setSelectedIcon(onIcon);
        //setFont(new Font("GungsuhChe",Font.PLAIN,18));
        setFont(customFonts.pixelMplus10R.deriveFont(20f));
        setOpaque(false);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (this.isSelected()){
            EngineV2.symbol=true;
            ProgramPanel.pwTextField.setText(EngineV2.generatePassword().toString());
        }else if (!this.isSelected())
            EngineV2.symbol = false;
            ProgramPanel.pwTextField.setText(EngineV2.generatePassword().toString());

    }
}
