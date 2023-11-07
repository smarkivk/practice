package HashSet;

public class MyClass {
    private int value;
    private String name;

    public MyClass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass{value=" + value + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(42, "Sample");
        System.out.println(obj.toString());

       // System.out.println(person.toString()); // This can be simplified to just System.out.println(person);
    }
}
