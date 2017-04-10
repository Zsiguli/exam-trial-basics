import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SecondsTest {

  @Test
  public void testSeconds() {
    List<Integer> originalList = new ArrayList<>();
    originalList.add(2);
    originalList.add(4);
    originalList.add(8);
    originalList.add(19);
    List<Integer> testList = new ArrayList<>();
    testList.add(4);
    testList.add(19);
    assertEquals(Seconds.returnEverySecondFromGivenList(originalList), testList);
  }
}
