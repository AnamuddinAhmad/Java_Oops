
import java.util.Scanner;

class myemploy{
private int id;
private String name;
public void setid(int i){
System.out.println("If name is Start with @$#% or 4758 is not valid !!");
id=i;
}
public int getid(){
return id;
}
public void setname(String n){

name=n;
}
public String getname(){
return name;
}

}

public class OopsPractic{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
myemploy me = new myemploy();
// System.out.println( me.getid());
System.out.println("Only Number allow ");
System.out.print("Set Id here : ");
int idd=Integer.parseInt(sc.nextLine()) ;
me.setid(idd);
System.out.print("Set name : ");
String nn = sc.nextLine();
me.setname(nn);
System.out.println("Your Set Id is : "+me.getid());
System.out.println("Your Set Name is : "+me.getname());
// me.name="hello";
// me.id=54; this is throws an error due to access modifier...

}

}
