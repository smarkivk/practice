package Abstract; //18 sep

//package Abstract;

abstract class Animal {
    public abstract void animalSound(int a);

    public void sleep() {
        System.out.println("Zzz");
    }
}


    class Dog1 extends Animal {
        @Override
        public void animalSound(int a) {
            System.out.println("Bow wow");
            System.out.println(a*a);
        }


        public static void main(String[] args) {
            // Create an instance of the Dog class
            Dog1 myDog = new Dog1();
            Animal obj = new Animal() {
                @Override
                public void animalSound(int a) {
                    System.out.println(a);
                }
            };
            obj.sleep();
            // Call methods on the Dog instance
            myDog.animalSound(5);
            myDog.sleep();
            obj.animalSound(5);
        }
    }
