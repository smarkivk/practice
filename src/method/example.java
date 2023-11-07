package method;

public class example {
    private int myPrivateField=1;


    public example(int value) {
       myPrivateField = value; // Constructor sets the initial value
    }

    public int getPrivateFieldValue() {//get method used for private
        return myPrivateField; // Accessor method allows access
    }

    public static void main(String[] args) {
        //example obj = new example(1);
        //System.out.println("value of obj",obj.myPrivateField);//as it is private
        example obj = new example(4);//to have value we need contructor
        int value = obj.getPrivateFieldValue();
        System.out.println("Value of obj.myPrivateField: " + value);
    }
}

