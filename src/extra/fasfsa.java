package extra;

class Animal {
    //void makeSound() {
        public int add(int a, int b) {
            return a + b;
       // System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
   // void makeSound() {
     //   System.out.println("The dog barks");
    public int add(int a, int b) {
        return a * b;
    }
}

//class Cat extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("The cat meows");
//    }
//}

public class fasfsa {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        //Animal cat = new Cat();
        Animal ani1 = new Dog();
        System.out.println(ani1.add(2,4));
        Animal ani2 = new Animal();
        System.out.println(ani2.add(2,4));


//        animal.makeSound(); // Calls the makeSound method in Animal
//        dog.makeSound();    // Calls the overridden makeSound method in Dog
//        cat.makeSound();    // Calls the overridden makeSound method in Cat
    }
}
