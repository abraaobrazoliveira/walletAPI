package com.abosolutions.wallet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorld {

    @Test
    public void testHelloWorld() {
        assertEquals(1,1);
    }

}
