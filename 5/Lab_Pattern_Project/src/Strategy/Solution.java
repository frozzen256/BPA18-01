package Strategy;

import Strategy.EquatSolStrategy;

public class Solution {
    EquatSolStrategy equatSolStrategy;

    public void setEquatSolStrategy(EquatSolStrategy equatSolStrategy) {
        this.equatSolStrategy = equatSolStrategy;
    }

    public void executeEquatSolStrategy(double x, double eps){
        equatSolStrategy.solveEquation(x, eps);
    }
}
