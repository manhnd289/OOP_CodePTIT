package J06003;

public class Student {

    private String Id, name, phone_num;

    public Student(String Id, String name, String phone_num, int ordinal_num_group) {
        this.Id = Id;
        this.name = name;
        this.phone_num = phone_num;
    }

    @Override
    public String toString() {
        return Id + " " + name + " " + phone_num;
    }
    
}
