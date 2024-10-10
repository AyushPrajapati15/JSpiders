public class Employee {
    public int eId;
    public int eSal;
    public String eName;
    
    public Employee(int eId,int eSal,String eName)
    {
        this.eId = eId;
        this.eSal = eSal;
        this.eName = eName;
    }

    public void display()
    {
        System.out.println("Employee id: " + eId);
        System.out.println("Employee sal: " + eSal);
        System.out.println("Employee name: " + eName);
    }
    
    public boolean equals(Object o)
    {
        Employee emp = (Employee)o;
        return this.eSal==(emp.eSal);
    }

    public static void main(String[] args) {
        Employee e = new Employee(1024, 5000, "Alice");
        Employee e1 = new Employee(1024, 5000, "Alice");
        e.display();
        System.out.println(e.equals(e1));
    }
    
}
