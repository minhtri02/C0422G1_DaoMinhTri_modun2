package ss5_accessmodifier_staticmethod_staticproperty.practice;

public class StaticMethod {
    private int id;
    private String name;
    private static String truong ="ABCDE";

    public StaticMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void changs(){
        truong = "CODEGYM";
    }

    @Override
    public String toString() {
        return "StaticMethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", truong='" + truong + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StaticMethod tri = new StaticMethod(111,"trii");
        tri.changs();
        StaticMethod thanh = new StaticMethod(222, "thanh");
        System.out.println(tri.toString());
        System.out.println(thanh);
    }
}
