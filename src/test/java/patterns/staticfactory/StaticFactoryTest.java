package patterns.staticfactory;

import org.testng.annotations.Test;

public class StaticFactoryTest {
    @Test
    public void testUser(){
        User hanna = StaticFactory.createSimpleUser();
        System.out.println(hanna);
        User olga = StaticFactory.createUserFromBirthDate(1988).withName("Olga");
        System.out.println(olga);
    }

}
