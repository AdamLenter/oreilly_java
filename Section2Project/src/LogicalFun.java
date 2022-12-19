public class LogicalFun {
    public static void main (String[] args) {
        boolean isRaining = false;
        boolean isWarm = true;

        boolean combined = isRaining && isWarm;
        System.out.println("It is raining and warm: " + combined);

        combined = isRaining || isWarm;
        System.out.println("It is raining or warm: " + combined);

        combined = !isRaining;
        System.out.println("It is NOT raining: " + combined);
    }
}
