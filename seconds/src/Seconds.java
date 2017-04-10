import java.util.ArrayList;
import java.util.List;

public class Seconds {
  public static void main(String[] args) {
    List<Integer> originalNumbers = new ArrayList<>();
    originalNumbers.add(1);
    originalNumbers.add(2);
    originalNumbers.add(3);
    originalNumbers.add(4);
    originalNumbers.add(5);

    List<Integer> everySecondNumber = returnEverySecondFromGivenList(originalNumbers);
    System.out.println(everySecondNumber);
  }

  public static List<Integer> returnEverySecondFromGivenList(List<Integer> originalNumbers) {
    List<Integer> everySecondNumber = new ArrayList<>();
    for (int i = 1; i < originalNumbers.size(); i += 2) {
      everySecondNumber.add(originalNumbers.get(i));
    }
    return everySecondNumber;
  }
}
