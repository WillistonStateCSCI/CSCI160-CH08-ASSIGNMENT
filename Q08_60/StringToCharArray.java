/* Method that returns a char array created from a String
*  Anderson, Franceschi
*/

public class StringToCharArray
{
  public static void main( String [] args )
  {
    String s = args[0];

    char [] charArray = stringToChar( s );

    System.out.print( "The elements of the char array are " );
    for ( int i = 0; i < charArray.length; i++ )
       System.out.print( charArray[i] + " " );
    System.out.println( );
  }

  public static char [] stringToChar( String string )
  {
    //Complete this assignment by adding code within this method.
  }
}