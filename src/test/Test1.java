package test;


public class Test1 {
    static int count = 0;

    public Test1() {
    }

    public static int getCount() {
        return count;
    }

    public void visit() {
        count++;
        this.print();
    }

    public void print() {
        System.out.println("count = " + count);
    }

    public static void main(String[] args) {
        Test1 c1 = new Test1();
        c1.visit();
        Test1 c2 = new Test1();
        c2.visit();
        Test1 c3 = new Test1();
        c3.visit();
    }
}