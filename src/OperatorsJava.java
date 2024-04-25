public class OperatorsJava {
    public static void main(String[] args) {
       // +1 2269610264

        //1. Arithmetic Operator (+, -, *, /, %, ++, --)

//        int a = 65;
//        int b = 5;
//
//        int ans = a%b;
//        System.out.println(ans);

        //2. Assignment Operators (=, +=)
        // in maths
//        int a;
//        int b=1; // a<--b
//        a=b; // value of b has been assigned to a
//        System.out.println(a);
        // a=b it means a is equivalent to b lhs=rhs
        // but that's not the case in programming;
        // here if we write a=b (a<--b); it means the value of b is getting assigned inside a.
        int d = 1;
        d = d + 1; // the value of d has got inc by 1
        d += 1;  // the value of d has got inc by 1
        d-=1; // d=d-1
        d/=10; // d=d/10;
        d+=7; // d=d+7;
        d*=3; // d=d*3;

//        int a=10;
//        // there are 2 kinds of incremental and decremental operators.
//        // a++ or ++a both of them will going to increase the value of a by 1.
//        System.out.println(a++);
//        int c=a+5;
//        System.out.println(c);

        //3. Relational/Comparison Operators: (==, <=,>=, <,>,!=)
        // they always return boolean type mins true or false;

//        int p=20;
//        int q=200;
//
//        System.out.println(p!=q);


        //4. Logical Operators (AND &&, OR ||, NOT), they also return boolean(true or false) output.
          // AND (&&) means both of the conditions must be true only then it will return true otherwise false.
          // OR (||) means if any of the conditions are true, then it will return true.

          // block space between two curly braces

//        { int h=10;
//            int i=20;
//            int j =30;
//            System.out.println(i);
//        }



//        int h=100;
//        int i=200;
//        int j=300;
//
//        System.out.println(i);
//        int x=100;
//        int y=200;
//
//        Logical AND
//        System.out.println(x==y && x<y);
        // Logical OR
//        System.out.println(x == y || x < y);
        // Logical NOT
//        boolean bool=true;
//        boolean bool1=!bool;
//        System.out.println(bool1);

       //5.incremental and decremental operators. (++,--)




        // ++z or z++ means increasing the value of z by 1
        // --z or z-- means decreasing the value of z by 1
        // pre incremental/decremental operator ++z: here increment or decrement takes place first then value gets printed.
        // post-incremental/decremental operator z++: here the original value gets printed first after that increment or decrement takes place accordingly.
        // z++ or ++z or z=z+1 or z+=1 (value of z getting incremented by 1)
        int i=1;

        System.out.println(--i);

//        int z=35;
//        System.out.println(z++); // 36
//        System.out.println(--z); // 33
//        System.out.println(z);   // 34
//        System.out.println(++z); // 35
//        System.out.println(z--); // 36
//        System.out.println(z);   // 35  // 6 out of 6 A+

             
             
         }
       





    }

