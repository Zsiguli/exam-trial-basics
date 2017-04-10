import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountAs {
  public static void main(String[] args) {
    List<String> rawDataFromFile = getListFromFile("file.txt");
    Map<Character, Integer> letterOccurrences = getLetterOccurrences(rawDataFromFile);
    System.out.println(letterOccurrences.get('a'));
  }

  public static List<String> getListFromFile(String fileName) {
    Path path = Paths.get(fileName);
    List<String> listFromFile;
    try {
      listFromFile = Files.readAllLines(path);
    } catch (IOException e) {
      listFromFile = new ArrayList<>();
    }
    return listFromFile;
  }

  public static Map<Character, Integer> getLetterOccurrences(List<String> rawDataFromFile) {
    Map<Character, Integer> letterOccurrences = new HashMap<>();
    for (String line : rawDataFromFile) {
      for (int i = 0; i < line.length(); ++i) {
        char currentChar = line.charAt(i);
        if (letterOccurrences.get(currentChar) == null) {
          letterOccurrences.put(currentChar, 1);
        } else {
          int currentValue = letterOccurrences.get(currentChar);
          letterOccurrences.put(currentChar, ++currentValue);
        }
      }
    }
    return letterOccurrences;
  }
}
