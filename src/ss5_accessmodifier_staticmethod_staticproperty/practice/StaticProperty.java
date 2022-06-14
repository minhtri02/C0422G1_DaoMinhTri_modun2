package ss5_accessmodifier_staticmethod_staticproperty.practice;

public class StaticProperty {
    private String address;
    private String name;

    public static int numberOfCars;


    public StaticProperty(String name, String address) {

        this.name = name;

        this.address = address;

        numberOfCars++;

    }

    @Override
    public String toString() {
        return "StaticProperty{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", numberofcars"+ numberOfCars+ '\'' +
                '}';
    }

    public static void main(String[] args) {
        StaticProperty mazda3 = new StaticProperty("mazda3","Đà Nẵng");
        System.out.println(mazda3);
        StaticProperty mazda4 = new StaticProperty("mazda6","Đà Nẵng");
        System.out.println(mazda4);
        StaticProperty mazda5 = new StaticProperty("mazda9","Đà Nẵng");
        System.out.println(mazda5);
    }

}
