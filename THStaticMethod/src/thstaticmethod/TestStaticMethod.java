package thstaticmethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "huynh");
        Student s2 = new Student(131, "huynh4");
        Student s3 = new Student(151, "huynh2");
        s1.display();
        s2.display();
        s3.display();
    }
}
