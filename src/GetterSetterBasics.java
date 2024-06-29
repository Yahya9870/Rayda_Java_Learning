class Associate{
    // Instance variables
    private String name;
    private int id;

    // Setter method --> It is used to modify or set or edit a specific value.

    // Getter method --> It is used to access those value or data modified or set by setter method.

    // Both setter and getter methods should be declared as public.

    // Setter does not have any return type mean void and it will take argument/input.

    // Getter should have return type according to which instance variable we are accessing and it does not take argument.



    // Setter method for name:

    public void setName(String name){

        this.name=name;
    }

    // Setter method for ID:

    public void setId(int id){

        this.id=id;
    }

    // Getter method for name:

    public String getName(){

        return name;
    }


    // Getter for id:

    public int getId(){

        return id;
    }



}


public class GetterSetterBasics {
    public static void main(String[] args) {

        Associate obj=new Associate();

//        obj.name="Alex";   --> Error
//        obj.id=123;        --> Error due to private access of name and ID within Associate class
//
//        System.out.println("Name: "+obj.name);
//        System.out.println("ID: "+obj.id);

        obj.setName("Sushil");
        System.out.println(obj.getName());

        obj.setId(144);
        System.out.println(obj.getId());

    }
}
