package HackerRank;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Calendar calendario=Calendar.getInstance();
        Scanner scan=new Scanner(System.in);

        String entrada=scan.nextLine();
        int[] fecha=new int[3];
        for(int i=0;i<3;i++){
            fecha[i]=Integer.parseInt(entrada.split(" ")[i]);
        }
        int mm=fecha[0]-1;
        int dd=fecha[1];
        int yy=fecha[2];
        calendario.set(yy,mm,dd);
        System.out.println(calendario.getTime());
        System.out.println(calendario.get(calendario.DAY_OF_WEEK));
        System.out.println(calendario.getDisplayName(Calendar.DAY_OF_WEEK,2, Locale.of("en")).toUpperCase());



        scan.close();
    }
}
