public class Marker {
    public String brand;
    public int cost;
    public String color;

    
    public Marker(String brand,int cost,String color)
    {
        this.brand = brand;
        this.cost = cost;
        this.color = color;
    }

    public void display()
    {
        System.out.println("Market brand is: " + brand);
        System.out.println("Market cost is: " + cost);
        System.out.println("Market color is: " + color);
    }

    @Override
    public String toString()
    {
        return brand+" "+color;
    }
    public static void main(String[] args) {
        Marker m1 = new Marker("cello", 50, "blue");
        m1.display();
        System.out.println(m1.toString());
    }
    
}
