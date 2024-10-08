import java.sql.SQLOutput;
import java.util.Scanner;
public class bt5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name,address;
        int age, toan, anh, ly;
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your address: ");
        address = input.nextLine();
        System.out.println("Enter your toan: ");
        toan = input.nextInt();
        System.out.println("Enter your anh: ");
        anh = input.nextInt();
        System.out.println("Enter your ly");
        ly = input.nextInt();
        System.out.println((float)(toan+anh+ly)/3);
    }
}


