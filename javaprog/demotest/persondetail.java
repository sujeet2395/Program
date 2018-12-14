package javaprog;

public class persondetail {
    public static void main(String[] args) {
        person p=new person("Sachin Tendulkar",56,'M',"Wankhede, Mumbai");
        p.show();
    }
    
}
class human
{
    private String name;
    private int age;

    public human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show()
    {
        System.out.println("Name : "+name+"\nAge : "+age);
    }
}
class person extends human
{
    private char sex;
    private String address;

    public person(String name, int age, char sex, String address) {
        super(name, age);
        this.sex = sex;
        this.address = address;
    }
    public void show()
    {
        super.show();
        System.out.println("Sex : "+sex+"\nAddress : "+address);
    }
}