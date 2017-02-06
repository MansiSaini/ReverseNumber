/*
 Write a program to reverse a number using numeric operations. 
 */
package reversenumber;

public class ReverseNumber 
{
    public int reverse_number(int num)
    {
         int reverse = 0;
         while(num != 0)
         {
             reverse = (reverse*10)+(num%10);
             num= num/10;
         }
        return reverse;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
