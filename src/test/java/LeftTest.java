import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftTest {

    @Test
    void movement() {
        Left left=new Left(3,2,3 );
        //Вызываем метод и заполняем какие данные будут у нас по умолчанию должны быть 1 2 3
        int array []= left.Movement();
        int rezult []={3,1,2};
        assertEquals(rezult,array);
    }
}