package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuery {
    public static void Queries(ArrayList <ArrayList<Integer>> arr, int p, int q) throws IndexOutOfBoundsException{
        try{
            System.out.println(arr.get(p-1).get(q-1));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList <ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList <Integer> lista=new ArrayList<>();
            int y=scan.nextInt();
            for(int j=0;j<y;j++){
                lista.add(scan.nextInt());
                //System.out.println("Lista: "+lista);
            }
            arr.add(lista);
            //System.out.println("Lista mayor"+arr);
        }


        //Queries
        int nqueires=scan.nextInt();
        for(int i=0;i<nqueires;i++){
            int p=scan.nextInt();
            int q=scan.nextInt();
            Queries(arr,p,q);
        }


    }
}
