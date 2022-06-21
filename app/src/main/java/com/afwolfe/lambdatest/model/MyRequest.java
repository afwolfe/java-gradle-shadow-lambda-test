package com.afwolfe.lambdatest.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MyRequest {
  private int id;
  private String name;
}
