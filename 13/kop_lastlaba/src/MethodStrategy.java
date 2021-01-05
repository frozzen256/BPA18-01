import java.util.function.Function;

public interface MethodStrategy {
    double resolve(Function<Double, Double> f, Function<Double, Double> dfdx, Function<Double, Double> dfdx2, final double a, final double b, final double eps);
}