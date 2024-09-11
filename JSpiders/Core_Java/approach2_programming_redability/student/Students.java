package student;
public class Students {
    private int schoolName;
    private int sName;
    private int percentage;
    
    public void initialize(int schoolName,int sName)
    {
        if (validateschoolName(schoolName)) {
            this.schoolName = schoolName;
        }
        else {
            System.err.println("Invalid Data");
        }
        if (validatesName(sName)) {
            this.sName = sName;
        }
        else {
            System.err.println("Invalid data");
        }
    }
    private boolean validateschoolName(int schoolName)
    {
        if (schoolName >= 9) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validatesName(int sName)
    {
        if (sName >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public void display()
    {
        System.out.println("schoolName:"+schoolName);
        System.out.println("sName:"+sName);
    } 
}
