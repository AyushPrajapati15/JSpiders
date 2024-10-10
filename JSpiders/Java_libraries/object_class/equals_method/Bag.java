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

        public boolean equals(Object o)
    {
        Bag b = (Bag) o;
        return this.color.equals(b.color);
    }

    public static void main(String[] args) {
        Bag e = new Bag(1000, "blue");
        Bag e1 = new Bag(1000, "red");
        e.display();
        System.out.println(e.equals(e1));
    }

}
