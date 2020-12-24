import java.util.function.Function;

public class NewtonStrategy implements MethodStrategy {

    @Override
    public double resolve(
            Function<Double, Double> f, Function<Double, Double> dfdx1, Function<Double, Double> dfdx2, final double a, final double b, final double eps) {
        double x1, dx;
        double x0 = a;
        do {
            x1 = x0 - dfdx1.apply(x0) / dfdx2.apply(x0);
            dx = Math.abs(x1 - x0);
            x0 = x1;
        } while (dx < eps);
        if (dfdx2.apply(x1) > 0) {
            return x1;
        } else {
            throw new RuntimeException("Экстремум на этом интервале не является минимумом!");
        }
    }
}
