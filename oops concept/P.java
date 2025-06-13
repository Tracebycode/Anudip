

class human{
    String name;
    int age;

    human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class man extends human {
    String profession;
    man(String profession, String name, int age) {
        super(name, age);
        this.profession = profession;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Profession: " + profession);
    }

}

class child extends man{
    String school;

    child(String school, String profession, String name, int age) {
        super(profession, name, age);
        this.school = school;
    }
    
    @Override
    void display() {
        super.display();
        System.out.println("School: " + school);
    }
}


public class P {
    public static void main(String[] args) {
        human h = new human("Abhi", 20);
        h.display();

        man m = new man("student","Rahul" ,21);
        m.display();

        child c=new child("Changu Kana Thakur Vidyalaya", "Student", "Piyush", 12);
        c.display();
        



    

    }}