package com.afwolfe.lambdatest;

import com.afwolfe.lambdatest.model.MyRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyHandlerTest {

  private static MyHandler myHandler;

  @BeforeAll
  private static void setup() {
    myHandler = new MyHandler();
  }

  @Test
  public void testGreeting() {

    MyRequest request = MyRequest.builder()
        .name("Test")
        .build();
    String expected = "Hello World: Test";
    String result = myHandler.handleRequest(request, null);

    Assertions.assertEquals(expected, result);
  }

}
