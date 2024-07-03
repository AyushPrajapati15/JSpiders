package ac;

import java.util.ArrayList;

public class MainClass5 {

    public static void main(String[] args) {
        AC a1 = new AC();
        AC a2 = new AC();
        AC a3 = new AC();
        ArrayList al = new ArrayList();
        al.add(a1);
        al.add(a2);
        al.add(a3);

        // RAW type collection
        AC ac1 = (AC) al.get(0);
        ac1.initialize("Central", 5, "Samsung");
        a1.display();
        AC ac2 = (AC) al.get(1);
        ac2.initialize("Split", 10, "LG");
        ac2.display();
        AC ac3 = (AC) al.get(2);
        ac3.initialize("Split", 4, "solo");
        ac3.display();

    }
}


