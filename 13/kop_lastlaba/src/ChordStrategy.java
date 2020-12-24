import java.util.function.Function;

public class ChordStrategy implements MethodStrategy {

    @Override
    public double resolve(
            Function<Double, Double> f, Function<Double, Double> dfdx, Function<Double, Double> dfdx2, final double a, final double b, final double eps
    ) {
        double x_prev = a;
        double x_curr = b;
        double x_next = 0;
        double tmp;
        do{
            tmp = x_next;
            x_next = x_curr - f.apply(x_curr) * (x_prev - x_curr) / (f.apply(x_prev) - f.apply(x_curr));
            x_prev = x_curr;
            x_curr = tmp;
        } while (Math.abs(x_next - x_curr) > eps);
        return x_next;
    }
}
