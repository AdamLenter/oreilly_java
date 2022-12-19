public class RelationalFun {
    public static void main (String[] args) {
        boolean myBool = true;
        boolean yourBool = false;

        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        String myName = "Adam";
        String yourName = "Adam";

        System.out.println("My bool is: " + myBool);
        System.out.println("Your bool is: " + yourBool);


        boolean ageComparison = myAge > yourAge;
        System.out.println("My age > your age: " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("Your age > Bob's age: " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("Your age == Bob's age: " + ageComparison);

        boolean sameName = myName.equals(yourName);
        System.out.println("Same name: " + sameName);

        boolean oldMan = myAge > 21;
        System.out.println("Older than 21? " + oldMan);
    }
}
