public class ArithmeticFun {
    public static void main (String args[]) {
        int a = 10;
        int b = 15;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);

        sum += 20;
        System.out.println("New sum is: " + sum);

        sum++;
        System.out.println("New new sum is: " + sum);

        product *= 2;

        System.out.println(("New product is: " + product));
    }
}
