package com.kn.poc.module1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main1Test {

  @Test
  public void testBasics() {

    System.err.println("*** Testing in Module1 ***");
    Assertions.assertEquals(Main1.getMagicValue(), "42");
  }

}
