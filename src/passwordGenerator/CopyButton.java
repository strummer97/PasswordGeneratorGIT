package passwordGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopyButton extends JButton implements ActionListener {

        CustomFonts customFonts;
        CopyButton() {

        customFonts = new CustomFonts();
        this.setBounds(500, 240, 100, 35);
        this.setText("Copy");
        this.setBackground(Color.white);
        //this.setFont(new Font("GungsuhChe", Font.BOLD, 14));
        setFont(customFonts.quinqueFive.deriveFont(7f));
        this.setFocusable(false);
        this.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String result = ProgramPanel.pwTextField.getText();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection stringSelection = new StringSelection(result);
        clipboard.setContents(stringSelection,null);
    }
}
