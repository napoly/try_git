package com.example.demo;

import com.example.demo.service.DemoService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private DemoService demoService;

    @Test
    void testHelloWorld() {
        assertEquals("hello world.. change for rebase", demoService.helloWorld());
    }

}
