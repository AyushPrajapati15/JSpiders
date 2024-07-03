package marker;

import java.util.ArrayList;

public class MainClass3 {
    public static void main(String[] args) {
        Marker m1 = new Marker();
        Marker m2 = new Marker();
        Marker m3 = new Marker();
        ArrayList al = new ArrayList();
        al.add(m1);
        al.add(m2);
        al.add(m3);
        Marker rect1 = (Marker) al.get(0);
        rect1.initialize(9, 10);
        rect1.display();

    }
}
