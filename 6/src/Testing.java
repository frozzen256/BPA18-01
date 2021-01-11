import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class Testing{
    void testResult(){
       Module m = new Module();
       List<Integer> testList = Stream.of(1,4,4,4,5,3).collect(Collectors.toList());
       m.setArr(testList);
       int result = m.migratoryBirds();
       assertEquals(4,result);
    }

}
