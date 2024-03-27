public class Methods {
    public static void main(String[] args) { // main is the entry point
        // What is a method in Java?
        //They are basically block of code that performs some specific tasks.

        //syntax

        // access modifier(public/private) static(optional) return type(void/int/double) nameOfMethod(parameters can be passed){
        //
        // coding logics whatever you want
        //
        //
        // }

        //  showMessage(); // calling of method
        String country = "Saudi Arabia and USA";
        //  showNationality(country);
        int ageYears = 20;
        int result = showAgeMonths(ageYears);
        System.out.println(result+" months");
    }

    //declaration and definition of method
    // void (non-returning) and non parametrized method.).
//    public static void showMessage(){  // it's a non parametrized method (it is not taking any input for showing the output).
//
//        showAge();
//        System.out.println("You are a beautiful Java Programmer");

//
//
//
//
//    }


//    public static void showAge(){
//
//        System.out.println("I am 20 years old");
//
//    }


    // Parametrized but void methods

//    public static void showNationality(String country){
//
//        System.out.println("I belong to: "+country);
//    }
//
    // Parametrized and non-void methods.

    public static int showAgeMonths(int ageYears) {

        int ageMonths = 12 * ageYears;

        return ageMonths; // This is true that method is returning a value however in order to display that on the output console we need System.out.println();
    }
}


