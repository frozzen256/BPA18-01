/*
��� ��������� ������ ������� ��������� ����, ����������� ����� ���������. ������ ������������ ��� ��� ����� ����� ��������� ����� ������. 
������ ���, ����� ����� ������� ���������� ��� �����, �� ����������������� ����� ����� �������� � ������ ����� ����������. �� ������ �� ������, 
����� ��� ���� �������� �������������, �������� ������ ������. ���� ������ - ����������� ������� ����� ���� �����, � ���� ��� ��� ����� ���� ���� 
��������� ��������������, �������� ��� � ���������� ����������������� �������.

������ �����
����� 5 ����� ����.

������ ������ �������� ����� �����, ������������ ���������� ���������� ����, ������������������ � �������.
�� ������ ������ ����������� ����� �����, ����������� ���������, �������������� ������ ����� ������ ��������� �����.

������ ����� 

6
1 4 4 4 5 3

4
*/

import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());


        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
