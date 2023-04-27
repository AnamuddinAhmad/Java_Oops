// A normal program of School and Employ
import java.util.Scanner;

class Employ {
        int empId;
        String empName;
        String empDept;

}

class School {
        String Name;
        int Roll_No;
        long Ph_No;
        String Address;
        String SchoolName;

}

public class OopsPractic {
        public static void main(String[] args)

        {
                Scanner sc = new Scanner(System.in);
                School s = new School();
                Employ e = new Employ();
                System.out.println();
                System.out.print("\t Enter your choice \n 1. Enter for Student. \n 2. Enter For Employ. \n ");
                int a = Integer.parseInt(sc.nextLine());
                while (true) {
                        if (1 == a) {
                                System.out.print("Enter Your Name : ");
                                s.Name = sc.nextLine();
                                System.out.print("Enter Your Roll No : ");
                                s.Roll_No = Integer.parseInt(sc.nextLine());
                                System.out.print("Enter Your Phone No : ");
                                s.Ph_No = Long.parseLong(sc.nextLine());
                                System.out.print("Write Your School Name : ");
                                s.SchoolName = sc.nextLine();
                                System.out.print("Enter Your Address : ");
                                s.Address = sc.nextLine();

                                System.out.println("\n" + "\t <---YOUR DETAIL PRINT HERE'S--->");

                                System.out.println("\n" + "Your Name :" + s.Name);
                                System.out.println("Your Roll No :" + s.Roll_No);
                                System.out.println("Your Phone No :" + s.Ph_No);
                                System.out.println("Your Address :" + s.Address);
                                System.out.println("Your School Name is :" + s.SchoolName);
                        } else if (a == 2) {

                                System.out.print("Enter the Emp ID : ");
                                e.empId = Integer.parseInt(sc.nextLine());
                                System.out.print("Enter your Emp Name : ");
                                e.empName = sc.nextLine();
                                System.out.print("Enter your Department : ");
                                e.empDept = sc.nextLine();

                                System.out.println();
                                System.out.println("Your Emp id = " + e.empId);
                                System.out.println("Your Emp Name = " + e.empName);
                                System.out.println("Your Emp Dept = " + e.empDept);

                        }
                }
        }
}
