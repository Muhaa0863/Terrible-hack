package app;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class gui{
private static Clip clip;
private static AudioInputStream audioInputStream;
  public static void main(String[] args) throws Exception{
      audioInputStream = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir")+"\\src\\app\\Bruh Sound Effect 2.wav").getAbsoluteFile());
      JFrame f = new JFrame("bruh clicks");
      f.setSize(1920, 1080);
      f.setLocation(300,200);
      final JTextArea textArea = new JTextArea(100, 100);
      f.getContentPane().add(BorderLayout.CENTER, textArea);
      final JButton button = new JButton("Click Me");
      clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      f.getContentPane().add(BorderLayout.EAST, button);
      long start = System.currentTimeMillis();
      button.addActionListener(new ActionListener() {
          int c = 0;
          @Override
          public void actionPerformed(ActionEvent e){
              c++;
              long end = System.currentTimeMillis();
              float sec = (end - start) / 1000F;
              textArea.setText("Clicks per second: " + c / sec);
              clip.start();
              try {
                  audioInputStream = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "\\src\\app\\Bruh Sound Effect 2.wav").getAbsoluteFile());
                  clip = AudioSystem.getClip();
                  clip.open(audioInputStream);
              }
              catch (IOException d){
                  System.out.println("Broken");
              }
              catch (UnsupportedAudioFileException f){
                  System.out.println("Brokens");
              }
              catch (LineUnavailableException g){
                  System.out.println("Brokenss");
              }
          }
    });
      f.setVisible(true);

  }

}