package method;

// Class containing a public method
public class MyClass1 {
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void packagePrivateMethod() {
        System.out.println("This is a package-private method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

// Another class accessing methods from MyClass1
/*public class MyClass2 { // why
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();

        // Accessing public method (works)
        obj.publicMethod();

        // Accessing protected method (works because MyClass2 is in the same package)
        obj.protectedMethod();

        // Accessing package-private method (works because MyClass2 is in the same package)
        obj.packagePrivateMethod();

        // Attempting to access private method (won't work)
        // obj.privateMethod(); // This would result in a compilation error
    }
}
*/
