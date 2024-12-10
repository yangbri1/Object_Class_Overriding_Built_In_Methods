class Person {

    private String name;

    // getter method/function
    public String getName() {
        return name;
    }

    // setter? -- set above instance field 'name' to String arg 'name'
    // functionality seems awfully familiar like class Constructor ...
    public void setName(String name) {
        this.name = name;
    } 
}

// class 'ObjectTest'
public class ObjectTest {
    // static String method 'print()' 
    /* Note: static to as main() method is static & static can call on static easier
    while static main() method can call to instance methods too but will need to 
    create an instance of class beforehand*/
    public static String print(Object obj) {
        // print memory address of 'obj' to console
        return obj.toString();
    }

    // standard static main() method w/ of void (no return) type
    // brain of operation where JVM looks for
    public static void main(String[] args) {
        // instantiate a new Person obj
        Person somebody = new Person();
        // print out by default the name of class & that instance's hashCode
        // ex. Person@15db9742
        System.out.println(print(somebody));
    }
}