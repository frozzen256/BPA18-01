/*
Вас попросили помочь изучить популяцию птиц, мигрирующих через континент. Каждый интересующий вас тип птицы будет обозначен целым числом.
Каждый раз, когда будет замечен конкретный вид птицы, ее идентификационный номер будет добавлен в список ваших наблюдений. Вы хотели бы узнать,
какой вид птиц наиболее распространен, учитывая список встреч. Ваша задача - распечатать типовой номер этой птицы, и если два или более типа птиц
одинаково распространены, выберите тип с наименьшим идентификационным номером.

Формат ввода
Всего 5 типов птиц.

Первая строка содержит целое число, обозначающее количество замеченных птиц, зарегистрированных в массиве.
Во второй строке описываются целые числа, разделенные пробелами, представляющие номера типов каждой увиденной птицы.

Пример ввода

6
1 4 4 4 5 3

4
*/


import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class Solution{

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int[] countByBirds = new int[5];
        for(int i=0;i<arr.size();i++){
            countByBirds[arr.get(i)-1] ++;
        }
        int maxIndex=-1;
        int max=-1;
        for(int i=0;i<countByBirds.length;i++){
            if(countByBirds[i]>max) {
                max=countByBirds[i];
                maxIndex=i;
            }
        }
        return  maxIndex+1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
*/
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());


        System.out.println(String.valueOf(migratoryBirds(arr)));

        bufferedReader.close();
    }


}
