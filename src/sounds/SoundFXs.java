package sounds;

import javax.sound.sampled.*;
import java.net.URL;

public class SoundFXs {
    Clip clip;
    URL[] soundURL = new URL[30];
    boolean mute = false;
    float previousVolume = 0f;
    float currentVolume = 0f;
    FloatControl fc;

    public SoundFXs(){
        soundURL[1] = getClass().getResource("mixkit-modern-technology-select-3124.wav");
        soundURL[2] = getClass().getResource("mixkit-cool-interface-click-tone-2568.wav");
        soundURL[3] = getClass().getResource("mixkit-cool-interface-click-tone-2568_2.wav");
    }
    public void setFile(int i){
        try{

            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
            fc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

        }catch (Exception ignored){

        }

    }
    public void play(){
        if(!mute) {
            if (clip.isRunning()) clip.stop();
            clip.start();
        }

    }
    public void volumeMute(){
        if(!mute){
            currentVolume = -80.0f;
            fc.setValue(currentVolume);
            mute = true;
        }else{
            currentVolume = 0;
            fc.setValue(currentVolume);
            mute = false;
        }

    }

}
