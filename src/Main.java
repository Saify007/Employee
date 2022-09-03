import java.util.Scanner;
class Employee
{
    int id;
    String name;
    String desig;
    float salary;
}
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees? ");
        int n = sc.nextInt();
        Employee emp[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("Enter " + (i + 1) + " Employee data :");
            System.out.print("Enter employee id :");
            emp[i].id = sc.nextInt();
            System.out.print("Enter employee name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee Type :");
            emp[i].desig = sc.next();
            System.out.print("Enter employee salary :");
            emp[i].salary = sc.nextFloat();
        }

        System.out.println("Enter The Type Of Employee  (1. Permanent, 2. Contractual, 3. Temporary  )   : ");
        int num=sc.nextInt();


        System.out.println("\n\n********* All Employee Details are :*********\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee Id:" + emp[0].id);
            System.out.println("Employee Name:"  + emp[i].name);
            System.out.println("Employee Type:"  + emp[i].desig);
            System.out.println("Employee Salary :" +emp[i].salary);


        }




        if(num==1) {
            System.out.println(" Employee is eligible for Provient Fund  : true");

        }
        else{

            System.out.println(" Employee is eligible for Provient Fund  : false");
        }


    }
}

