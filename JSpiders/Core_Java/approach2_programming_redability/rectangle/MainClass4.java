package rectangle;

import java.util.ArrayList;

public class MainClass4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        ArrayList<Rectangle> al = new ArrayList<>();
        al.add(r1);
        al.add(r2);
        Rectangle rect1 = al.get(0);
        rect1.initialize(10, 12);
        rect1.display();

    }
    
}
