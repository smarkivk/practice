package Abstract;

abstract class Animal1 {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}
    class Dog extends Animal1 {
        //@Override
        public void animalSound() {
            System.out.println("bow bow ");

        }

    }

    public class dpad {
        public static void main(String[] args) {
            // Animal b = new Animal(); //why this came  @Override //public void animalSound() //obj of dog to be created not animal
            Dog obj = new Dog();//error java: non-static variable this cannot be referenced from a static context
            obj.animalSound();
            obj.sleep();


        }
    }