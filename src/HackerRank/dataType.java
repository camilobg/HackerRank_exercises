package HackerRank;

import java.util.Scanner;
public class dataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte\n* short\n* int\n* long");
                else if(x>=-32768 && x<=32767)System.out.println("* short\n* int\n* long");
                else if(x>=-1-(int)Math.pow(-2,31) && x<=(int)Math.pow(2,31))System.out.println("* int\n* long");
                else System.out.println("* long");
                //else if(x>=-1*(int)Math.pow(2,63) && x<=(int)Math.pow(2,63)-1)System.out.println("* long");
                //else if(x==(long)Math.pow(1,14))System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
