package ThucHanh1;

public class Mains {
    public static void main(String[] args) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "C");
        Student s2 = new Student(222, "T");
        Student s3 = new Student(333, "M");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
