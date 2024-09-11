package student;

import java.util.ArrayList;

public class MainClass3 {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Students rect1 = (Students) al.get(0);
        rect1.initialize(9, 10);
        rect1.display();

    }
}
