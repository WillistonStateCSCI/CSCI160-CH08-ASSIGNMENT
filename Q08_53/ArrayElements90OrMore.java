/* Method that returns the percentage of array elements 90 or above
*  Anderson, Franceschi
*/

import java.text.DecimalFormat;

public class ArrayElements90OrMore
{
  public static void main( String [] args )
  {
    int [] array = { Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8]) };
    DecimalFormat percent = new DecimalFormat( "#0.0%" );

    System.out.print( "The elements are " );
    for ( int i = 0; i < array.length; i++ )
       System.out.print( array[i] + " " );
    System.out.println( );

    System.out.println( "The percentage of elements 90 or greater is "
                         + percent.format( percent90OrMore( array ) ) );
  }

  public static double percent90OrMore( int [] intArray )
  {
    //Complete this assignment by adding code within this method.
  }
}