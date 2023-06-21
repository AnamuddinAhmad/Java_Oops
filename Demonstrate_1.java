//It's example of access modifier in this program we are using access modifier access the another file of data.
// And next file name is Demonstrate_2. in which all the method or opreation on that file.
public class Demonstrate_1 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Hello, World!");
        myObject.displayMessage();
        myObject.add();
    }
}
