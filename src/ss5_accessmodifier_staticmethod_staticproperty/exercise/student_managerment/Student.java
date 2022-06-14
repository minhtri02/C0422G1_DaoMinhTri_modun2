package ss5_accessmodifier_staticmethod_staticproperty.exercise.student_managerment;

public class Student {
    protected static int count;
    private  int id;
    private String name;
    private String address;
    private boolean gender;
    private String email;
    public static String school="CodeGym";

    public Student() {
    }
    public Student(String name, String address, boolean gender, String email, String school) {
//        Student.id = id;
        count++;
        this.id=count;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.school = school;
    }
    public Student( String name, String address, boolean gender, String email) {
//        this.id = id;
        count++;
        this.id=count;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        if (id>0){
//            this.id = id;
//        }
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    // hàm tostring biểu diễn thông tin của đối tượng
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
