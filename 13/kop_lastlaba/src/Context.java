import java.util.function.Function;

public class Context {

    private final double a, b, eps;
    private final Function<Double, Double> f, dfdx, dfdx2;

    public Context(
            double a, double b, double eps, Function<Double, Double> f, Function<Double, Double> dfdx,
            Function<Double, Double> dfdx2
    ) {
        this.a = a;
        this.b = b;
        this.eps = eps;
        this.f = f;
        this.dfdx = dfdx;
        this.dfdx2 = dfdx2;
    }

    public double calculate(MethodStrategy methodStrategy) {
        return methodStrategy.resolve(f, dfdx, dfdx2, a, b, eps);
    }

}