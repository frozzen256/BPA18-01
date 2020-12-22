import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTest {

    @Test
    void movement() {
         Right right=new Right(3,2,3 );
         //Вызываем метод и заполняем какие данные будут у нас по умолчанию должны быть 1 2 3
       int array []= right.Movement();
       int rezult []={2,3,1};
       assertEquals(rezult,array);

    }
}