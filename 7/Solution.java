/*
����� � �������� ��������� PDF-������ ������ ����������� ���� ������, ��������� �������� ���������� ����� ���������������. � ���� ��������� ��������� PDF 
������ ����� ���������� ����������. ���������� ������ ����� ��������, ����������� �� ������� �� �� ������. ��������, �a� ��������� � ������� 0, � 
�z� - � 25 �������. ����� ����� ������. ��������� ��������� ������ ����, ���������� ������� ��������� �������������� � �������������, ��� ��� ����� ������ 1 ��.

Sample Input 0

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc

Sample Output 0
9

Sample Input 1

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
zaba

Sample Output 1

28
*/

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
