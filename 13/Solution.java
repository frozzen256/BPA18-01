import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

       /* ��⥫� �ᮢ���� ���� ����� ������ ����� �� ������ ��࠭���. 
	* ���� ����� ����� ��५���뢠�� ��࠭��� ����� ᭠砫� ��� � ����. 
	* �ᥣ�� ��ॢ��稢��� ��࠭��� �� �����. ����� ���뢠�� �����, � 1 ��࠭�� �ᥣ�� ��室���� �ࠢ�.
	* ��᫥���� ��࠭�� ����� ���� �����⠭� �� ����� ��࠭��, 
	* ������ �� ������⢠ ��࠭�� � �����. 
	* ����쪮 ࠧ ������ �㦭� ����� ��ॢ����� �࠭���, �⮡� ���� �㦭��.
	* ������ ����� ��� ᭠砫�, ⠪ � � ����.
	*
	* n - ������⢮ ��࠭�� � �����
	* p - ����� �㦭�� ��࠭���
	* 1 <= n <= 10e5
	* 1 <= p <= n
	*
	* �ਬ��: 6 2;	4 5; 
	* �⢥�:  1;	0.
      	*/

    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}