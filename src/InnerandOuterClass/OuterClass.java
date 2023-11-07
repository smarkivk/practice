package InnerandOuterClass;

  class OuterClass {
     int x = 10;

     private class InnerClass {
         //protected=15
         //private = 15


         int y = 5;
     }


     //public class Main { //extra class made//java: class, interface, enum, or record expected this errorcomes
         public static void main(String[] args) {//when main was outside class have error
             OuterClass myOuter = new OuterClass();
             OuterClass.InnerClass myInner = myOuter.new InnerClass();
             System.out.println(myInner.y + myOuter.x);
         }
     }


