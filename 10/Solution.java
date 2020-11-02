import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Solution {

       /* Каждый студент оценивается по шкале от 0 до 100 баллов. Оценка меньше
	* 40 - не аттестован. 
	* Итоговые результаты округляются до ближайщего числа, кратного 5,
	* если разница между оценкой и этим числом меньше 3. Результаты меньше 
	* 38 не округляются.
	* Дано: n - количество студентов
	* 	g[i] - оценка студента 
	* 	1 <= n <= 60
	* 	0 <= gr[i] <= 100
	* Вычислить  итоговые результаты.
	* 
	*/
    static int[] func(int[] gr) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] gr = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            gr[gradesItr] = gradesItem;
        }

        int[] result = func(gr);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
