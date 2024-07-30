import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Main {

    public static void alt_tab() {
        Robot robot;

        while(true){
            try {
                robot = new Robot();
                robot.delay(10000);
                robot.keyPress(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.delay(1000);
                robot.keyRelease(KeyEvent.VK_ALT);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }

    }

    public static void  mouseJiggle() throws AWTException {
        Robot robot = new Robot();
        Random random = new Random();
        System.out.println("Script is active");
        while(true) {
            // adding 1 min delay
            robot.delay(1000 * 3);
            // Assuming you have 640 * 480 resolution laptop screen
            int x = random.nextInt() % 640;
            int y = random.nextInt() % 480;
            System.out.println(x + " , " + y);
            robot.mouseMove(x, y);	//Moving the mouse
        }
    }

    public static void main(String[] args) throws Exception {
        Main.alt_tab();
    }
}
