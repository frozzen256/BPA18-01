import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Module {


    private List<Integer> arr;


    public int migratoryBirds() {
        int[] countByBirds = new int[5];
        for (Integer integer : arr) {
            countByBirds[integer - 1]++;
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

    public List<Integer> getArr() { return arr; }

    public void setArr(List<Integer> arr1) {
        this.arr = arr1;
    }


}
