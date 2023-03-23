package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        //String texto=scan.nextLine();
        int i=1;
        String texto;
        while(scan.hasNext()){
            texto=scan.nextLine();
            System.out.println(i+" "+texto);

            i=i+1;
            if(!scan.hasNext()){
                texto=scan.nextLine();
                System.out.println(i+" "+texto);
                break;
            }
        }



/**
        while(scan.HackerRank.hasNext("\n")){
            int i=1;
            texto="";
            texto=scan.nextLine();
            System.out.println(i+" "+texto);
            //ls.add(texto);
            i=i++;
        }

        for(int i=0;i<j;i++){
            System.out.println((i+1)+" "+lista[i]);
        }**/
    }
}
