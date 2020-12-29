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

    private static int result;

    public static void main(String[] args) throws IOException, InterruptedException {

        Module m = new Module();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());


        new Thread(() -> {
            m.setArr(arr);
            result = m.migratoryBirds();
        }).start();


        Thread.sleep(600);
        System.out.println(result);
        /*Testing t = new Testing();
        t.testResult();*/
        bufferedReader.close();
    }


}
