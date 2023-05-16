package com.kn.poc.module2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main2Test {

  @Test
  public void testBasics() {

    System.err.println("*** Testing in Module2 ***");
    Assertions.assertEquals(Main2.getMagicValue(), "its a kind of magic");
  }

}
