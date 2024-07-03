package marker;
public class Marker {
    private int height;
    private int color;
    private String brand;
    public void initialize(int height,int color)
    {
        if (validateheight(height)) {
            this.height = height;
        }
        else {
            System.err.println("Invalid Data");
        }
        if (validatecolor(color)) {
            this.color = color;
        }
        else {
            System.err.println("Invalid data");
        }
    }
    private boolean validateheight(int height)
    {
        if (height >= 9) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validatecolor(int color)
    {
        if (color >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public void display()
    {
        System.out.println("Length:"+height);
        System.out.println("color:"+color);
    } 
}
