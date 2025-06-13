
class Student{
    private String name;
    private int age;
    private String grade;

    void set(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    
}

public class main{
    public static void main (String[] args) {
        Student student = new Student();
        student.set("John Doe", 20, "A");
        student.display();
    } 
}
