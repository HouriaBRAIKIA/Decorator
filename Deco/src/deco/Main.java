package deco;


public class Main {
    public static void main(String[] args) {
        // Exemple d'utilisation
        Event myNode = new Node("I am DEVIL");
        Event myNode1 = new Node("I am DEVIL");

        Event nodeWithSound = new SoundNodeDecorator(myNode, "audio.wav");
        nodeWithSound.display();

        Event nodeWithImage = new ImageNodeDecorator(myNode, "img.jpg");
        nodeWithImage.display();

        
    }
}
