import java.util.Arrays;
import java.util.Scanner;
public class ObjectOriented1 {
    public static void main(String[] args) {

        //Objects
//        Student[] students = new Student[5];
//        Student student1 = new Student();
//        Student student2 = new Student();
//        student1.name = "Aman";
//        student2.name = "Shruti";
//        //student1.rollno = 15;
//        //student2.rollno = 16;
//        student1.marks = 97.8;
//        student2.marks = 99.6;
//      System.out.println(student1.getRollno());
//        student1.setRollno(16);
//        System.out.println(student1.getRollno());
//        System.out.println(student1.name +"\t"+ "Loves"+"\t"+ student2.name);
//        System.out.println(student2.marks);
//        System.out.println(student1.schoolName);
        Student student1 = new Student("Aman", 16,96.9);
        System.out.println(student1.noOfStudents);
        Student student2 = new Student("Shruti", 15,99.9);//using constructor
        System.out.println(student2.noOfStudents);

//        Scanner sc = new Scanner(System.in);
//        Car car1 = new Car();
//        Car car2 = new Car();
//        car1.name = sc.nextLine();
//        car2.name = sc.nextLine();
//        System.out.println(car1.name +"\t"+"vs"+"\t"+car2.name);
    }
    //class
    static class Car {
        String name;
        String type;
        int price;
    }
}