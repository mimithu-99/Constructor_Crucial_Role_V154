package Constructor;

public class Test {
    public static void main(String[] args) {


        Teacher t = new Teacher("Mithu", "Male", 42);
        t.displayInfo();

        Teacher t3 = new Teacher();
        t3.displayInfo();

        Teacher t4 = new Teacher(20, 101);
        t4.displayInfo();

    }
}
