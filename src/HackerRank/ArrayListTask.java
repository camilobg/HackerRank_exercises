package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> li=new ArrayList<>(Arrays.asList(scan.nextLine().split(" ")));
        ArrayList<Integer> lista=new ArrayList<>();
        for(String n:li)lista.add(Integer.parseInt(n));
        Collections.sort(lista);
        int n=scan.nextInt();

        int menorDif=100000000;
        int menorIndice=0;
        String indice="";
        for(int i=0;i<lista.size();i++){
            int resta=n-lista.get(i);
            if(resta<0)resta*=-1;
            if(resta<menorDif){
                menorDif=resta;
                menorIndice=i;
            }
        }
        for(int i=0;i<lista.size();i++){
            if(Math.abs(n-lista.get(i))==menorDif) System.out.print(lista.get(i)+" ");
        }



    }
}
