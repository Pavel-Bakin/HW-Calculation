public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();

        int sumResult = calc.sum(5, 3);
        int multResult = calc.mult(5, 3);
        int powResult = calc.pow(5, 3);

        System.out.println("Sum: " + sumResult);
        System.out.println("Multiplication: " + multResult);
        System.out.println("Power: " + powResult);
    }
}
