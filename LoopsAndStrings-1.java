import javax.swing.JOptionPane;

public class LoopsAndStrings
{
   public static void main(String[] args)
   {
      String s;
      int cCount = 0;
      
      s = JOptionPane.showInputDialog( "Enter a String" );
      
      System.out.println( "s.length() = " + s.length() );
      
      for ( int index = 0; index < s.length(); index++ )
      {
         System.out.println( s.charAt( index ) );
         
         if ( s.charAt( index ) == 'o' ||
              s.charAt( index ) == 'e' ||
              s.charAt( index ) == 'i' ||
              s.charAt( index ) == 'u' ||
              s.charAt( index ) == 'a' )
         {
            cCount++;
         }
      }// end for
           
      System.out.println("cCount = " + cCount);     
           
   }// end main
}