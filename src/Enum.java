
enum Days{

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Status{

    Running, Failed, Pending, Success, NoIdea;
}



public class Enum {

    public static void main(String[] args) {

        int i=5;
        Status s = Status.NoIdea;
        System.out.println(s.ordinal());

        Days[] d = Days.values();

        System.out.println(d[4]);
        System.out.println("Through Enhanced For Loop");
        for (Days elements:d ){

            System.out.println(elements);
        }

        for (int j = 0; j < d.length ; j++) {

            System.out.print(d[j]+" ");
        }

    }
}
