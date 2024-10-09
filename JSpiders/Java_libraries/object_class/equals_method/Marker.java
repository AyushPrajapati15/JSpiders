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
    public boolean equals(Object o)
    {
        Marker m=(Marker)o;
        return this.brand.equals(m.brand);
    }
    public static void main(String[] args) {
        Marker m1 = new Marker("cello", 50, "blue");
        Marker m2 = new Marker("cello", 50, "blue");
        m1.display();
        System.out.println(m1.equals(m2));
    }
    
}
