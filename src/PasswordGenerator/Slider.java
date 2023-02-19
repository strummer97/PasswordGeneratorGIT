package PasswordGenerator;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Slider extends JSlider implements ChangeListener, MouseWheelListener {

    Slider(){
             this.setPreferredSize(new Dimension(100,50));
             this.setBounds(180,251,290,15);
             this.setPaintLabels(true);
             this.setMinimum(5);
             this.setMaximum(30);
             this.setValue(5);
             this.setBackground(null);
             this.addChangeListener(this);
             this.addMouseWheelListener(this);
             this.setOpaque(false);

    }
    @Override
    public void stateChanged(ChangeEvent e) {

        ProgramPanel.pwTextField.setText(EngineV2.generatePassword().toString());

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        int notches = e.getWheelRotation();
        if(notches < 0)
            this.setValue((this.getValue()+1));
        else
            this.setValue((this.getValue()-1));

    }
}
