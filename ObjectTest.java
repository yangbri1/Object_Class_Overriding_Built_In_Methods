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

    /* UPDATE: Overriding the built-in .toString() Object class method */
    public String toString() {
        // now instead of returning class name & unique hashCode (default behavior) ...
        // calling .toString() method will now look for the .toString() in class 'Person' -> return String
        return("Hullo I'm " + this.name);
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

        // calling .setName() method from 'Person' obj to set instance field w/ a custom name
        somebody.setName("Jack the Ripper");

        // print out by default the name of class & that instance's hashCode
        // ex. Person@15db9742
        System.out.println(print(somebody));
    }
}