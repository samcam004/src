import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testCalculator {
  private Calculator calc;
  public int a, b, sum;
  @Test
  public void test() {
  testPositive();
  testNegative();
  testMax();
  }

  public void testPositive(){
    a = 10;
    b = 25;
    sum = calc(a,b);
    assertEquals(35,10);
  }

  public void testNegative(){

  }

  public void testMax(){

  }
}
