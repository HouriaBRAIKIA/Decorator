package deco;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class SoundNodeDecorator implements Event {
    private Event decoratedNode;
    private String soundPath;

    public SoundNodeDecorator(Event decoratedNode, String soundPath) {
        this.decoratedNode = decoratedNode;
        this.soundPath = soundPath;
    }

    public void display() {
        playSound();
        decoratedNode.display();
    }

    private void playSound() {
    	try {
            File file = new File(soundPath);
            // AudioInputStream est utilisé pour lire les données audio à partir du fichier.
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            // Clip est un objet qui peut être utilisé pour jouer des clips audio courts.
            Clip clip = AudioSystem.getClip();
            clip.open(sound);
            clip.start();
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}
