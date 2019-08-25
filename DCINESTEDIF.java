import java.util.Scanner;

public class DCINESTEDIF {

    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value a:");
        a = input.nextInt();
        System.out.println("Enter value b:");
        b = input.nextInt();
        System.out.println("Enter value c:");
        c = input.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("Bigger is " +a);
            }
        }
        else
        {
                    if(b>c)
                    {
                    System.out.println("Bigger is " +b);
                    }
                    else
                    {
                    System.out.println("Bigger is " +c);
                    }
        }

    }
    
}