public class Main {
    private static final double A = 2;
    private static final double B = 10;
    private static final double EPS = 0.001;

    public static void main(String[] args) {
        MethodStrategy methodStrategy1 = new ChordStrategy();
        MethodStrategy methodStrategy2 = new NewtonStrategy();
        Context context = new Context(A, B, EPS, Main::funct, Main::dfdx1, Main::dfdx2);
        double result1 = context.calculate(methodStrategy1);
        double result2 = context.calculate(methodStrategy2);
        System.out.println(result1 + "  " + result2);
    }

    private static double funct(double x) {
        return Math.pow(x, 3) - x;
    }

    private static double dfdx1(double x) {
        return 3 * Math.pow(x, 2);
    }

    private static double dfdx2(double x) {
        return 6 * x;
    }
}
