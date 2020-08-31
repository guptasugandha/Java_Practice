public class StringSpaces {
  public static void main(String[] args) {	
    String str = "  Hello    World		";
    str = str.replaceAll("\\s+", "");
    System.out.println("String- " + str);
  }
}
