package dev.codescreen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciCalculatorTest {

  @Test void test1() {
    assertEquals(0, FibonacciCalculator.calculate(0));
  }

  @Test void test2() {
    assertEquals(5, FibonacciCalculator.calculate(5));
  }

  @Test void test3() {
    assertEquals(6765, FibonacciCalculator.calculate(20));
  }

  @Test void test4() {
    assertEquals(75025, FibonacciCalculator.calculate(25));
  }

}
