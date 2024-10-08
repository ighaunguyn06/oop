import java.util.Scanner;
public class bt6{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        String name,address;
        int cast,income,benefit;
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your address: ");
        address = input.nextLine();
        System.out.print("Enter your cast: ");
        cast = input.nextInt();
        System.out.print("Enter your income: ");
        income = input.nextInt();
        System.out.println(income-cast);
    }
}