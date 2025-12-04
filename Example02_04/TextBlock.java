/* Using Text Blocks
   Anderson, Franceschi
 */

public class TextBlock
{
  public static void main( String [] args )
  {
    String menu = """
      Please choose a language:
      \t1 - Java
      \t2 - Python
      \t3 - C++""";

    System.out.println( menu );
  }
}
