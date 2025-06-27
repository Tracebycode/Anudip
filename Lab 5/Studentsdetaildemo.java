// Create a class called Student. Inside the Student class, implement the following instance variables (fields): ● String name ● int age ● String department Implement the following constructors in the Student class: ● A default constructor that initializes the name to "Unknown", age to 20, and department to "Unassigned". ● A constructor that takes two parameters: name and age, and initializes the department to "IT". ● A constructor that takes three parameters: name, age, and department. In the Main class, create instances of the Student class using each constructor. P rin t o u t t h e d e t ails o f e a c h s t u d e n t, in clu din g t h eir n a m e, a g e, a n d d e p a r t m e n t

class Student{
    String name;
    int age;
    String department;

    Student(){
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void showdetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);    
    }

}

class Studentsdetaildemo{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Abhishek", 22);
        Student s3 = new Student("Piyush", 21, "Computer Science");

        System.out.println("Student 1 Details:");
        s1.showdetails();   
        System.out.println("\nStudent 2 Details:");
        s2.showdetails();
        System.out.println("\nStudent 3 Details:");
        s3.showdetails();


    }
}