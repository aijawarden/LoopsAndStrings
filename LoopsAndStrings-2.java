import javax.swing.JOptionPane;

public class LoopsAndStrings
{
   public static void main(String[] args)
   {
      String s;
      int cCount = 0, vCount = 0;
      
      s = JOptionPane.showInputDialog( "Enter a String" );
      
      System.out.println( "s.length() = " + s.length() );
      
    while ( i<str.length() )
    {
    char ch=str.charAt(i);
    if (ch == 'a'|| 
        ch == 'e'|| 
        ch == 'i'|| 
        ch == 'o'|| 
        ch == 'u')
       {
        vowCount++;
       }
    
    else if ((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ))
    {
        cCount++;
    }
     i++;
      }// end for
           
      System.out.println("cCount = " + cCount);
      System.out.println("vCount = " + vCount);     
           
   }// end main
}