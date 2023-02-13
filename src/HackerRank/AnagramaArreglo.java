package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class AnagramaArreglo {

    public static String Letras(String A){
        String[] lista1=A.replaceAll(" ", "").toLowerCase().split("");
        String contar1="";
        String cant1="";

        for(int i=0;i<lista1.length;i++){
            int num1=0;
            boolean sent=false;
            if(!contar1.contains(lista1[i])){
                contar1+=lista1[i];
                sent=true;
            }
            for(int j=0;j<lista1.length;j++){
                if(lista1[i].equals(lista1[j])){
                    num1++;
                }
            }
            if(sent)cant1+=num1;
        }
        return contar1;
    }
    public static String Frecuencias(String A){
        String[] lista1=A.replaceAll(" ", "").toLowerCase().split("");
        String contar1="";
        String cant1="";

        for(int i=0;i<lista1.length;i++){
            int num1=0;
            boolean sent=false;
            if(!contar1.contains(lista1[i])){
                contar1+=lista1[i];
                sent=true;
            }
            for(int j=0;j<lista1.length;j++){
                if(lista1[i].equals(lista1[j])){
                    num1++;
                }
            }
            if(sent)cant1+=num1;
        }
        return cant1;
    }

    static boolean isAnagrama(String a, String b){
        HashMap<Character,Integer> mapa1=new HashMap();
        HashMap<Character,Integer> mapa2=new HashMap();
        for(int i=0;i<Letras(a).length();i++){
            mapa1.put(Letras(a).charAt(i),Integer.parseInt(Frecuencias(a).split("")[i]));
        }
        for(int i=0;i<Letras(b).length();i++){
            mapa2.put(Letras(b).charAt(i),Integer.parseInt(Frecuencias(b).split("")[i]));
        }
        System.out.println(mapa1+"\n"+mapa2);
        //Letras(a).equals(Letras(b)) && Frecuencias(a).equals(Frecuencias(b)) &&
        if(mapa2.equals(mapa1)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        String a="AAbb";
        String b="AAbba";

        //Scanner scan=new Scanner(System.in);
        //String a=scan.nextLine();
        //String b=scan.nextLine();
        System.out.println(Letras(a));
        System.out.println(Frecuencias(a));

        System.out.println(Letras(b));
        System.out.println(Frecuencias(b));
        System.out.println(isAnagrama(a,b));
        //System.out.println(Arrays.stream(lista1).anyMatch(x->x.equals("o")));

    }
}
