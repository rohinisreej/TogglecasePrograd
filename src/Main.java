import java.util.Scanner;
class Main
{
public static void main(String[] args)
        {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String value=scanner.nextLine();
        int n=value.length();
        char[] ch = new char[n];
        for (int i = 0; i < n; i++)
        {
            char c=value.charAt(i);
            ch[i] = (char)(c^(1<<5));
            System.out.println(ch[i]);
        }


        }
}