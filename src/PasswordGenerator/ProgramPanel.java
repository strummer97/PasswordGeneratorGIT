package PasswordGenerator;

import Sounds.Music;
import Sounds.SoundFXs;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class ProgramPanel extends JPanel implements ActionListener, MouseWheelListener, ChangeListener {

    final  int PANEL_WIDTH = 640;
    final  int PANEL_HEIGHT = 480;
    JLabel title = new JLabel();
    JLabel pwLabel = new JLabel();
    JLabel versionLbl = new JLabel();

    SoundFXs soundFXs = new SoundFXs();
    Music music = new Music();


static JTextField pwTextField = new JTextField();
static JLabel length = new JLabel();
    GenerateButton generateButton;
    CopyButton copyButton;
    Slider slider;
    DigitsToggle digitsToggle;
    LettersToggle lettersToggle;
    SymbolsToggle symbolsToggle;
    UppercaseToggle uppercaseToggle;
    Music_Toggle music_toggle;
    CustomFonts customFonts;
    SFXs_Toggle sfXs_toggle;
    ProgramPanel(){

        //Music
        slider = new Slider();
        generateButton = new GenerateButton();//adds "Generate" button
        copyButton = new CopyButton();// adds "Copy" button
        digitsToggle = new DigitsToggle();
        lettersToggle = new LettersToggle();
        symbolsToggle = new SymbolsToggle();
        uppercaseToggle = new UppercaseToggle();
        music_toggle = new Music_Toggle();
        customFonts = new CustomFonts();
        sfXs_toggle = new SFXs_Toggle();

        this.setOpaque(false);
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        //this.setBackground(new Color(0,34,54));
        this.add(title);
        this.setLayout(null);
        this.add(pwTextField);
        this.add(pwLabel);
        this.add(generateButton);
        this.add(copyButton);
        this.add(slider);
        this.add(length);
        this.add(digitsToggle);
        this.add(lettersToggle);
        this.add(symbolsToggle);
        this.add(uppercaseToggle);
        this.add(music_toggle);
        this.add(versionLbl);
        this.add(sfXs_toggle);

        //Version title
        versionLbl.setText("Version 1.0");
        versionLbl.setFont(customFonts.quinqueFive.deriveFont(7f));
        versionLbl.setBounds(530,445,150,15);
        //Title "Password Generator"
        title.setText("PASSWORD GENERATOR");
        title.setForeground(Color.white);
       //title.setFont(new Font("Impact",Font.PLAIN,45));
        title.setFont(customFonts.computerPixel7.deriveFont(70f));
        title.setBounds(73,60,600,60);
        //Password Text Field
        pwTextField.setPreferredSize(new Dimension(250,40));
        pwTextField.setBounds(180,165,290,40);
        pwTextField.setFont(new Font("Times New Roman",Font.BOLD,14));
        pwTextField.setText(EngineV2.generatePassword().toString());
        pwTextField.setEditable(false);

        //Password label
        pwLabel.setText("Password: ");
        pwLabel.setForeground(Color.white);
        //pwLabel.setFont(new Font("GungsuhChe",Font.BOLD,25));
        pwLabel.setFont(customFonts.halfBoldPixel7.deriveFont(22f));
        pwLabel.setBounds(35,170,150,30);
        //Length label
        length.setForeground(Color.white);
        length.setText("Length: "+slider.getValue());
        //length.setFont(new Font("GungsuhChe",Font.BOLD,25));
        length.setFont(customFonts.halfBoldPixel7.deriveFont(22f));
        length.setBounds(35,240,150,30);

        //adds ChangeListener for slider

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                length.setText("Length: "+slider.getValue());
                EngineV2.pwLength = slider.getValue();
            }
            //or
            //slider.addChangeListener(e -> length.setText("Length: "+slider.getValue()));
        });
        generateButton.addActionListener(this);
        slider.addMouseWheelListener( this);
        slider.addChangeListener(this);
        copyButton.addActionListener(this);
        symbolsToggle.addActionListener(this);
        uppercaseToggle.addActionListener(this);
        digitsToggle.addActionListener(this);
        lettersToggle.addActionListener(this);
        music_toggle.addActionListener(this);
        sfXs_toggle.addActionListener(this);
        //Plays music on startup
        playSFX(3);
        playMusic(0);//plays background music

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (symbolsToggle.isSelected() && !uppercaseToggle.isSelected()
                && !digitsToggle.isSelected() && !lettersToggle.isSelected()) {
            lettersToggle.setSelected(true);
            symbolsToggle.setSelected(true);
            EngineV2.lower = true;
            EngineV2.symbol = true;

        } else if (!symbolsToggle.isSelected() && !uppercaseToggle.isSelected()
                && !digitsToggle.isSelected() && !lettersToggle.isSelected()) {
            lettersToggle.setSelected(true);
            EngineV2.lower = true;

        } else if (!symbolsToggle.isSelected() && uppercaseToggle.isSelected()
                && !digitsToggle.isSelected() && !lettersToggle.isSelected()) {
            lettersToggle.setSelected(true);
            playSFX(1);
            uppercaseToggle.setSelected(true);
            playSFX(1);
            EngineV2.lower = true;
            EngineV2.upper = true;
        }
        if (e.getSource() == digitsToggle) {//digits toggle sound
            playSFX(1);
        } else if (e.getSource() == lettersToggle) {//letters toggle sound
            playSFX(1);

        } else if (e.getSource() == uppercaseToggle) {//upper toggle sound
            playSFX(1);

        } else if (e.getSource() == symbolsToggle) {//symbols toggle sound
            playSFX(1);
        } else if (e.getSource() == generateButton) {//generate button sound
            playSFX(2);
        } else if (e.getSource() == copyButton) {//copy button sound
            playSFX(2);
        }
        if (e.getSource()== music_toggle &&!music_toggle.isSelected()){
            stopMusic();
        } else if (e.getSource()== music_toggle && music_toggle.isSelected()) {
            playMusic(0);
        }
        if(e.getSource()==sfXs_toggle)
            soundMute();


    }
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

        if (e.getSource()==slider){
            playSFX(3);
        }

    }
    public void playMusic(int i){
        music.setFile(i);
        music.play();
        music.loop();

    }
    public void stopMusic( ){
        music.stop();

    }
    public void playSFX(int i){
        soundFXs.setFile(i);
        soundFXs.play();
    }
    public void soundMute(){
        soundFXs.volumeMute();

    }

    @Override
    public void stateChanged(ChangeEvent e) {
       if (e.getSource()==slider) {
           playSFX(3);
       }
    }
}
