package bai7;
import java.util.Scanner;
public class Teacher {
    public static void main(String[] agrs){
        int courses;
        String insitutionname;
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter name: ");
        person.name=input.nextLine();
        System.out.println("Enter address");
        person.address=input.nextLine();
        System.out.println("Enter age: ");
        person.age=input.nextInt();
        System.out.println("Enter courses: ");
        courses=input.nextInt();
        System.out.println("Enter institution name: ");
        insitutionname=input.nextLine();
        input.nextLine();
    }

}
