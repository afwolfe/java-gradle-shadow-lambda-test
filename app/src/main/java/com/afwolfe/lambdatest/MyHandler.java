package com.afwolfe.lambdatest;

import com.afwolfe.lambdatest.model.MyRequest;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyHandler implements RequestHandler<MyRequest, String> {

  @Override
  public String handleRequest(MyRequest input, Context context) {
    return "Hello World: " + input.getName();
  }
}
