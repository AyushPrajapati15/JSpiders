public class Bag {

    public int cost;
    public String color;

    public Bag(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public void display()
        {
            System.out.println("Bag cost is: " + cost);
            System.out.println("Bag color: " + color);
        }

    public String toString() {
        return color + " ";// TYPECASTING USING CONCATENATION.

    }

    public static void main(String[] args) {
        Bag e = new Bag(1024, "Bob");
        e.display();
        System.out.println(e.toString());
    }

}
