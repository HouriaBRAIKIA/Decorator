package deco;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ImageNodeDecorator implements Event {
    private Event decoratedNode;
    private String imagePath;

    public ImageNodeDecorator(Event decoratedNode, String imagePath) {
        this.decoratedNode = decoratedNode;
        this.imagePath = imagePath;
    }

    public void display() {
        showImage();
        decoratedNode.display();
    }

    private void showImage() {
    	try {
        	JFrame f = new JFrame("Ajouter une image dans JFrame");
            ImageIcon icon = new ImageIcon(imagePath);
            f.add(new JLabel(icon));
            f.pack();
            f.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}