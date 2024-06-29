package Constructor;

public class Teacher {
    // Default Constructor. No parameter

    String name, gender;
    int age;
    int id;

    Teacher(String n, String g, int a){
        name = n;
        gender = g;
        age = a;


    }
    Teacher(int n1, int n2){
         age = n1;
          id = n2;
    }

    Teacher(){

    }
    void displayInfo(){
        System.out.println("Name is :" + name);
        System.out.println("Gender is: " + gender);
        System.out.println("Age is : " + age);
        System.out.println("Id number" + id);
    }
}
