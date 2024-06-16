package marker;

public class Marker{
    private int height = 12;
    private String color;
    private String brand;

    public Marker(String color,String brand)
    {
        if (color.equals("red") || color.equals("blue") || color.equals("black")) {
            this.color = color;
        } else {
            System.err.println("invalid color");
        }
        if (brand.equals("cello") || brand.equals("reynolds") || brand.equals("parker")) {
            this.brand = brand;
        } else {
            System.err.println("invalid brand");
        }
    }
    

    public void display()
    {
        System.out.println(color);
        System.out.println(brand);
    }
}