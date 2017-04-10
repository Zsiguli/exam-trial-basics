import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountAs {
  public static void main(String[] args) {
    List<String> rawDataFromFile = getListFromFile("afile.txt");
  }

  public static List<String> getListFromFile(String fileName) {
    Path path = Paths.get(fileName);
    List<String> listFromFile;
    try {
      listFromFile = Files.readAllLines(path);
    } catch (IOException e) {
      listFromFile = new ArrayList<>();
      System.out.println("Something wrong happened, during the file read. Check afile.txt");
    }
    return listFromFile;
  }
}
