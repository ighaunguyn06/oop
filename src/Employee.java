public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int i, String f, String l, int sa) {
        id = i;
        firstName = f;
        lastName = l;
        salary = sa;}
    public int getid(){return id;}
    public String getfirstName(){return firstName;}
    public String getlastName(){return lastName;}
    public String getName(){return firstName+" "+lastName;}
    public int getsalary(){return salary;}
    public void setSalary(int sa){salary=sa;}
    public int getAnnualSalary(){return (salary*12);}
    public int raiseSalary(int p)
    { return this.salary*10/100+this.salary;}
    public String toString(){
        return "Employee [id ="+ this.id+",name = "+this.firstName +" "+lastName+",salary="+this.salary+"]";
    }
}

