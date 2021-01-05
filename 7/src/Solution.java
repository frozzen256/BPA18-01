/*
����� � �������� ��������� PDF-������ ������ ����������� ���� ������, ��������� �������� ���������� ����� ���������������.
� ���� ��������� ��������� PDF
������ ����� ���������� ����������. ���������� ������ ����� ��������, ����������� �� ������� �� �� ������.
��������, �a� ��������� � ������� 0, �
�z� - � 25 �������. ����� ����� ������. ��������� ��������� ������ ����, ���������� ������� ��������� �������������� � �������������,
��� ��� ����� ������ 1 ��.

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
import java.util.logging.Logger;

public class Solution {

    // Complete the designerPdfViewer function below.

    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger("default logger");
    public static void main(String[] args) {
        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        logger.info("Height inserted");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }


        String word = scanner.nextLine();
        logger.info("Word inserted");
        new Thread(() -> {
            logger.info("New thread started");
            findRectangle findRectangle = new findRectangle(h, word);
            System.out.print(findRectangle.designerPdfViewer());
            logger.info("Rectangle found");
        }).start();

        scanner.close();
    }
}
