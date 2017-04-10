import java.util.*;

public class PirateCounter {
  static ArrayList<Pirate> pirates = new ArrayList<>();

  public static void main(String... args) {

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
    List<String> richWoodenLegPiratesName = getRichWoodenLegPiratesName(pirates);
    printRichWoodenLegPiratesName(richWoodenLegPiratesName);
  }

  public static List<String> getRichWoodenLegPiratesName(List<Pirate> pirates) {
    List<String> richWoodenLegPiratesName = new ArrayList<>();
    for (Pirate pirate : pirates) {
      if (pirate.hasWoodenLeg == true && pirate.gold > 15) {
        richWoodenLegPiratesName.add(pirate.name);
      }
    }
    return richWoodenLegPiratesName;
  }

  public static void printRichWoodenLegPiratesName(List<String> richWoodenLegPiratesName) {
    String finalListOfNames = new String();
    for (String name : richWoodenLegPiratesName) {
      finalListOfNames += name + "\n";
    }
    System.out.println(finalListOfNames);
  }
}
