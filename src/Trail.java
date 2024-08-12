import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class Trail {
    // fields
    Color color = new Color(0, 0, 0, 0.1f);
    Point[] trails = new Point[100];

    // constructors

    // methods
    public void paint(Graphics g, Point mousePos) {

        if (mousePos == null) {
            mousePos = new Point(0, 0);
        }

        if (trails[0] == null) {
            trails[0] = new Point(0, 0);
        }

        if (mousePos.x != trails[0].x) {

            for (int i = 99; i >= 1; i--) {
                trails[i] = trails[i - 1];
            }

            trails[0] = mousePos;

        }

        for (int i = 0; i < 99; i++) {
            if (trails[i] != null) {
                g.setColor(color);
                g.fillOval(trails[i].x - 10, trails[i].y - 10, 20, 20);
            }
        }

    }
}
