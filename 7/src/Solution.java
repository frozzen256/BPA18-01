/*
Когда в средстве просмотра PDF-файлов выбран непрерывный блок текста, выбранный фрагмент выделяется синим прямоугольником.
В этой программе просмотра PDF
каждое слово выделяется независимо. Существует список высот символов, выровненных по индексу по их буквам.
Например, «a» находится в индексе 0, а
«z» - в 25 индексе. Также будет строка. Используя указанную высоту букв, определите область выделения прямоугольника в предположении,
что все буквы ширины 1 мм.

Sample Input 0

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
a b c

abc

Sample Output 0
9

Sample Input 1

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7

zaba

Sample Output 1

28
*/

import java.util.Scanner;

public class Solution {

    // Complete the designerPdfViewer function below.

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }


        String word = scanner.nextLine();
        new Thread(() -> {
            findRectangle findRectangle = new findRectangle(h, word);
            System.out.print(findRectangle.designerPdfViewer());
        }).start();

        scanner.close();
    }
}
