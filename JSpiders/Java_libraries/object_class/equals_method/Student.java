public class Student {

    public int sId;
    public String sName;

    public Student(int sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public void display()
        {
            System.out.println("Student id: " + sId);
            System.out.println("Student name: " + sName);
        }

        public boolean equals(Object o)
        {
            Student s=(Student)o;
            return this.sId == s.sId;
        }

    public static void main(String[] args) {
        Student e = new Student(1024, "Bob");
        Student e1 = new Student(1024, "Bob");
        e.display();
        System.out.println(e.equals(e1));

    }

}
