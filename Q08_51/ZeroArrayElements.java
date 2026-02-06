/* Method that sets to 0 all elements in an integer array
*  Anderson, Franceschi
*/

public class ZeroArrayElements
{
  public static void main( String [] args )
  {
    int [] intArray = { Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]) };

    System.out.print( "The elements are " );
    for ( int i = 0; i < intArray.length; i++ )
       System.out.print( intArray[i] + " " );
    System.out.println( );

    System.out.println( "Calling zeroArray method" );
    zeroArray( intArray );

    System.out.print( "The elements are " );
    for ( int i = 0; i < intArray.length; i++ )
       System.out.print( intArray[i] + " " );
    System.out.println( );
  }

  public static void zeroArray( int [] array )
  {
    //Complete this assignment by adding code within this method.
  }
}