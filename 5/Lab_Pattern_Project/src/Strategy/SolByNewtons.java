package Strategy;

import Strategy.EquatSolStrategy;
public class SolByNewtons implements EquatSolStrategy {

    double x;
    double eps;

    @Override
    public void solveEquation(double x, double eps) {
        this.x = x;
        this.eps = eps;

        int iter = 0;        // переменные для выхода и цикла

        for (iter = 0; Math.abs(f(x)) > eps; iter++) {
            if (df(x) == 0) { // Если производная = 0 выходим
                break;
            }
            x -= f(x) / df(x);  // последующие приближения
            System.out.println(iter + "-ая итерация:" + String.format("%.3f",x));
        }

        System.out.printf("x = %.3f;\n", x);
        System.out.println("Клоичество итераций: " + iter + ";");
    }

    static double f(double x){
        return Math.sin(Math.PI * x / 180) - 1/x;
    }
    static double df(double x){
        return  Math.PI / 180 * Math.cos(Math.PI * x / 180) + 1/ (x*x);
    }
}


