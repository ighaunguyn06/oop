public class TextEmployee {
    public static void main(String[] args) {
            Employee e1 = new Employee(8, "Hau", "Nguyen", 2500);
            System.out.println(e1);
            e1.setSalary(999);
            System.out.println(e1);
            System.out.println("id is: " + e1.getid());
            System.out.println("firstname is: " + e1.getfirstName());
            System.out.println("lastname is: " + e1.getlastName());
            System.out.println("salary is: " + e1.getsalary());
            System.out.println("name is: " + e1.getName());
            System.out.println("annual salary is: " + e1.getAnnualSalary());
            System.out.println(e1.raiseSalary(10));
            System.out.println(e1);
        }
    }

