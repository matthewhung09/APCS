import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        Scanner blah = new Scanner(System.in);
        System.out.print("enter a word! ");
        String word = blah.nextLine();

        for(int num = 0; num < word.length(); num++)
        {
            System.out.println(word);
        }
    }
}