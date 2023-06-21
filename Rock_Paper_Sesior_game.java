import java.util.Random;
//Import random package 
import java.util.Scanner;
public class OopsPractic{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// 0 For Rock
// 1 For Paper
// 2 For Sesior

System.out.println("Enter 0 For Rock 1 For Paper 2 For Sesior");
int userinput = sc.nextInt();
Random random = new Random();
//Here using random functiuon to genrate the random int value 
//And (bond :3) is given posobolity of random genrate time
int Computerinput =random.nextInt(3);
if (userinput==Computerinput) {
System.out.println("Match Draw");
}
else if(userinput == 0 && Computerinput == 2 || userinput== 1 &&
Computerinput == 0 || userinput == 2 && Computerinput == 1){
System.out.println("You are Win !!");
}
else{
System.out.println("Computer Win !! ");
}
if (Computerinput==0) {
System.out.println("Computer Choice Rock ");
}
else if (Computerinput==1) {
System.out.println("Computer Choice Paper ");
}
if (Computerinput==2) {
System.out.println("Computer Choice Sesior ");
}
System.out.println("Computer Choice : "+Computerinput);
}
}
