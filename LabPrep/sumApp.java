import java.awt.*;
import java.applet.*;

public class sumApp extends Applet
{
  TextField text1, text2;

  public void init()
  {
    text1 = new TextField(10);
    text2 = new TextField(10);

    add(text1);
    add(text2);

    text1.setText("0");
    text2.setText("0");
  }

  public void paint(Graphics g)
  {
    int x, y, z;
    String s1, s2, s3;

    s1 = text1.getText();
    s2 = text2.getText();

    x = Integer.parseInt(s1);
    y = Integer.parseInt(s2);

    z = x + y;
    s3 = String.valueOf(z);
    g.drawString("Sum : "+s3,10, 20);
  }

/*
  public boolean action(Event event, Object  object)
  {
    repaint();
    return time;
  }
*/
}
