package com.jenkins.docker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DockerApplicationTests {


    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        Assert.hasText("t", "rien");
    }


}
