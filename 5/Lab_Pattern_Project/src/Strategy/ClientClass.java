package Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClientClass {
    private static Solution solution;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        EquatSolStrategy equatSolStrategy;
        double x;
        double eps; // необходимаяг точность
        int exit;

        System.out.print("Введите значение x: ");
        x = scanner.nextDouble();
        System.out.print("Введите нужную точность вычислений: ");
        eps = scanner.nextDouble();

        System.out.println("Пожалуйста, выберете метод решения:" + "\n" +
                "1 - Метод Ньютона" + "\n" +
                "2- Метод последовательных приближений" + "\n");
        String solMethod = reader.readLine();

        solution = new Solution();
        if (solMethod.equals("1")){
            solution.setEquatSolStrategy(new SolByNewtons());
            do{
                solution.executeEquatSolStrategy(x, eps);
                System.out.print("\nВыход? (1 or 0): ");
                exit = scanner.nextInt();
            } while (exit!= 1);
        }
        else{
            solution.setEquatSolStrategy(new SolByIterationMet());
            do{
                solution.executeEquatSolStrategy(x, eps);
                System.out.print("\nВыход? (1 or 0): ");
                exit = scanner.nextInt();
            } while (exit!= 1);
        }
        
    }
}
