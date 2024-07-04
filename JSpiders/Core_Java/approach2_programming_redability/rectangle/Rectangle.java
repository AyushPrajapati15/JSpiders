package rectangle;
public class Rectangle {
    private int length;
    private int width;
    public void initialize(int length,int width)
    {
        if (validateLength(length)) {
            this.length = length;
        }
        else {
            System.err.println("Invalid Data");
        }
        if (validateWidth(width)) {
            this.width = width;
        }
        else {
            System.err.println("Invalid data");
        }
    }
    private boolean validateLength(int length)
    {
        if (length >= 9) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validateWidth(int width)
    {
        if (width >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public void display()
    {
        System.out.println("Length:"+length);
        System.out.println("Width:"+width);
    } 
}
