/**
 *
 * @author s1256822
 */
//This is the initial code to check that jfugue is up and running
import org.jfugue.*; 
public class MyMusicApp 
{ 
    public static void main(String[] args) throws InterruptedException 
            { 
        Player player = new Player(); 
        Pattern pattern = new Pattern("C D E F G A B"); 
        player.play(pattern); 
        Thread.sleep(10000);
                System.exit(0); // If using Java 1.4 or lower
    } 
} 
