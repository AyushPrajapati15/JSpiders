package ac;
public class AC {
    private String type;
    private int coolingCapacity;
    private String brand;

    public void initialize(String type,int coolingCapacity,String brand)
    {
        if (typeValidate(type)) {
            this.type = type;
        }
        else {
            System.err.println("Invalid Data");
        }
        if (coolingValidate(coolingCapacity)) {
            this.coolingCapacity = coolingCapacity;
        }
        else {
            System.err.println("Invalid Data");
        }
        if (brandValidate(brand)) {
            this.brand = brand;            
        }
        else {
            System.err.println("Invalid Data");
        }
    }

    private boolean typeValidate(String type)
    {
        if (type.equalsIgnoreCase("Split") || type.equalsIgnoreCase("central") || type.equalsIgnoreCase("carter")) {
            return true;
        } else {
            return false;
        }
    }
    private boolean coolingValidate(int coolingCapacity)
    {
        if (coolingCapacity >= 1 && coolingCapacity <= 16) {
            return true;
        } else {
            return false;
        }
    }

    private boolean brandValidate(String brand)
    {
        if (brand.equalsIgnoreCase("bluestar") || brand.equalsIgnoreCase("Samsung") || brand.equalsIgnoreCase("LG")) {
            return true;
        }
        else {
            return false;
        }
    }
    
    

    public void display()
    {
        System.out.println(type);

    }
    

}
