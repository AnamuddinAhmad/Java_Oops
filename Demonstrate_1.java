//It's example of access modifier in this program we are using access modifier access the another file of data.
// And next file name is Demonstrate_2. in which all the method or opreation on that file.
public class Demonstrate_1 {
    public static void main(String[] args) {
        Demostrate_2 myObject = new Demostrate_2("Hello, World!");
        Demostrate_2.displayMessage();
        Demostrate_2.add();
    }
}
