//import java.util.Graphics;
import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet
{

  public void paint(Graphics g)
  {
    g.drawString("This is my first applet program ! ", 50, 50);
    setBackground(Color.CYAN);
  }
}
