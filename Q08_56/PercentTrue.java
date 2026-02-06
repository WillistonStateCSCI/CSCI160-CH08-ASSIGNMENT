/* Method that returns the percentage of array elements having the value true
*  Anderson, Franceschi
*/

import java.text.DecimalFormat;

public class PercentTrue
{
  public static void main( String [] args )
  {
    boolean [] array = { Boolean.parseBoolean(args[0]), Boolean.parseBoolean(args[1]), Boolean.parseBoolean(args[2]), Boolean.parseBoolean(args[3]), Boolean.parseBoolean(args[4]), Boolean.parseBoolean(args[5]), Boolean.parseBoolean(args[6])};
    DecimalFormat percent = new DecimalFormat( "#0.0%" );

    System.out.print( "The elements are " );
    for ( int i = 0; i < array.length; i++ )
       System.out.print( array[i] + " " );
    System.out.println( );

    System.out.println( "The percentage of elements having the value true is "
                         + percent.format( percentTrue( array ) ) );
  }

  public static double percentTrue( boolean [] booleanArray )
  {
    //Complete this assignment by adding code within this method.
  }
}