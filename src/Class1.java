public class Class1 {
    public static void main(String[] args) {
        Sushil obj = new Sushil(); // ypu have created an object of sushil class.

        obj.printName();
        obj.showAge();
    }


}

class Sushil{

   public void printName(){

       System.out.println("Hello, My Name is Sushil and I am from Nepal.");
   }

   public void showAge(){

       System.out.println("I am 29 years old.");
   }

}
