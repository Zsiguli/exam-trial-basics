import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CountAsTest {

  @Test
  public void testGetListFromFile() throws Exception {
    Path path = Paths.get("afile.txt");
    List<String> listFromFile;
    try {
      listFromFile = Files.readAllLines(path);
    } catch (IOException e) {
      listFromFile = new ArrayList<>();
      System.out.println("Something wrong happened, during the file read. Check afile.txt");
    }
    assertEquals(CountAs.getListFromFile("afile.txt"), listFromFile);
  }
}