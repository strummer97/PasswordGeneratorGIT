package sounds;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Music {
    Clip clip;
    URL[] soundURL = new URL[30];
    long clipTime;


    public Music(){
        soundURL[0] = getClass().getResource("RELOADED - Torchlight II installer.wav");
    }
    public void setFile(int i){
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        }catch (Exception ignored){

        }

    }
    public void play(){
        if(clip.isRunning())clip.stop();
        clip.setMicrosecondPosition(clipTime);
        clip.start();
    }
    public void loop(){
        if(clip.isRunning())clip.stop();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop(){
        clipTime = clip.getMicrosecondPosition();
        clip.stop();
    }

}
