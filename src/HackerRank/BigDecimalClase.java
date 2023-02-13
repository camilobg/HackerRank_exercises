package HackerRank;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalClase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        String[] claves = new String[n];
        BigDecimal[] valores = new BigDecimal[n];
        for(int i=0;i<n;i++){
            String num= scan.next();
            claves[i]=num;
            valores[i]=new BigDecimal(num);
        }
        System.out.println("CLAVES");
        System.out.println(Arrays.toString(claves));
        System.out.println("VALORES");
        System.out.println(Arrays.toString(valores));
        String[] orden= new String[n];

        for(int i=0;i<n;i++){
            int igualdad=0;
            String stringa=claves[i];

            BigDecimal nume1=valores[i];

            for(int j=0;j<n;j++){
                igualdad=0;
                String stringb=claves[j];
                BigDecimal nume2=valores[j];
                System.out.println("Número 1: "+nume1+" String: "+stringa);
                System.out.println("Número 2: "+nume2+" String: "+stringb);
                System.out.println("Número 1 es mayor a número 2?: "+(nume1.compareTo(nume2)>0));
                System.out.println("Número 2 está en la lista?: "+!Arrays.asList(orden).contains(stringb));
                System.out.println("------------------------------");
                if(nume1.compareTo(nume2)==0 && !Arrays.asList(orden).contains(stringb) && !stringa.equals(stringb) && i!=j){
                    orden[i]=stringa;
                    igualdad=1;
                }
                if(nume1.compareTo(nume2)>0 && !Arrays.asList(orden).contains(stringb)){
                    nume1=nume2;
                    stringa=stringb;
                    System.out.println("El número menor del recorrido es: "+stringa);
                    System.out.println("Proceso i "+i+" "+nume1.toString());
                }
            }
            if(igualdad==1){
                continue;
            }
            else{
                orden[i]=stringa;
            }
            System.out.println(Arrays.toString(orden));
        }
        System.out.println(Arrays.toString(orden));
            }
    }

