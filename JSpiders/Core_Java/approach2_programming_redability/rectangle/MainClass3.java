package rectangle;

import java.util.ArrayList;

public class MainClass3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        ArrayList al = new ArrayList();
        al.add(r1);
        al.add(r2);
        al.add(r3);
        Rectangle rect1 = (Rectangle) al.get(0);
        rect1.initialize(9, 10);
        rect1.display();

    }
}
