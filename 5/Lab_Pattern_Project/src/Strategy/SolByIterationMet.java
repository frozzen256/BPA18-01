package Strategy;

import Strategy.EquatSolStrategy;

public class SolByIterationMet implements EquatSolStrategy {

    double x;
    double eps;

    @Override
    public void solveEquation(double x, double eps) {
        this.x = x;
        this.eps = eps;

        double res;
        int iter = 0;
        do{
            res = x;
            x = 1/ (Math.sin(Math.PI * x / 180));
            iter++;

        }
        while (Math.abs(res - x) > eps && iter < 20000);
        System.out.printf("Количество итераций: %d\n", iter);
        System.out.printf("Ответ: X = %.3f", x);

    }

    static double f(double x){
        return 1 / (Math.sin(Math.PI *x / 180));
    }
}
