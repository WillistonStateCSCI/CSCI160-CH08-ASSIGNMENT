/* Method that returns the difference between the largest
*  and smallest elements of an array of doubles
*  Anderson, Franceschi
*/

public class ArrayDifference
{
  public static void main( String [] args )
  {
    double [] array = { Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]) };

    System.out.print( "The elements are " );
    for ( int i = 0; i < array.length; i++ )
       System.out.print( array[i] + " " );
    System.out.println( );

    System.out.println( "The difference between the largest and "
                        + "smallest elements is "
                        + largestSmallestDifference( array ) );
  }

  public static double largestSmallestDifference( double [] doubleArray )
  {
    //Complete this assignment by adding code within this method.
  }
}