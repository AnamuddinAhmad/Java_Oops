// its code of access modifier of java you can check the code
import java.util.Scanner;

class form {

        Scanner sc = new Scanner(System.in);
        private String f_name;
        private String m_naem;
        private String L_name;
        private String classs;
        private String vill;
        private String post;
        private String dist;
        private String state;
        private String country;
        private String display;

        public void f_name() {
                System.out.println("\n" + "\t<---ENTER YOUR DETAIL HERE--->");
                System.out.print("Enter your first name : ");
                f_name = sc.nextLine();
        }

        public void m_naem() {
                System.out.print("Enter your Middle name : ");
                m_naem = sc.nextLine();
        }

        public void L_name() {
                System.out.print("Enter the last name : ");
                L_name = sc.nextLine();
        }

        public void classs() {
                System.out.print("Enter your class : ");
                classs = sc.nextLine();
        }

        public void vill() {
                System.out.print("Enter your village : ");
                vill = sc.nextLine();
        }

        public void post() {
                System.out.print("Enter your post : ");
                post = sc.nextLine();
        }

        public void dist() {
                System.out.print("Enter your dist : ");
                dist = sc.nextLine();
        }

        public void state() {
                System.out.print("Enter your state : ");
                state = sc.nextLine();
        }

        public void country() {
                System.out.print("Enter your country : ");
                country = sc.nextLine();
        }

        public void display() {
                System.out.println("\t<----Your Detail---->");
                System.out.println("Your name is : " + f_name + m_naem + L_name);
                System.out.println("Class : " + classs + "\n Village : " + vill + "\n Post :" + post + "\n Distic : "
                + dist + "\n State : " + state + "\n Country : " + country);
                // System.out.println(display); this method is not allow the dislplay methoed
        }

}
