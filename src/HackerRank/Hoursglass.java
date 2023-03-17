package HackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hoursglass {
    public static int Major(int[] k){
        int l=k[0];
        for(int i=0;i<k.length;i++){
            if(k[i]>l)l=k[i];
        }
        return l;
    }
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        try{
            for (int i = 0; i < 6; i++) {
                String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> arrRowItems = new ArrayList<>();

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowTempItems[j]);
                    arrRowItems.add(arrItem);
                }

                arr.add(arrRowItems);
            }
            int counter=0;
            int[][] index=new int[2][16];
            for(int i=0;i<arr.size()-2;i++){
                for(int j=0;j<arr.get(i).size()-2;j++){
                    //System.out.println(counter+". Proceso i: "+i+" - j: "+j);
                    int k=arr.get(i).get(j);
                    k+=arr.get(i).get(j+1);
                    k+=arr.get(i).get(j+2);

                    k+=arr.get(i+1).get(j+1);

                    k+=arr.get(i+2).get(j);
                    k+=arr.get(i+2).get(j+1);
                    k+=arr.get(i+2).get(j+2);
                    index[0][counter]=k;
                    index[1][counter]=counter;
                    counter++;

                    //System.out.println(Arrays.toString(index[0]));
                    //System.out.println(Arrays.toString(index[1]));
                }
            }
            System.out.println(Major(index[0]));
            bufferedReader.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        finally{

        }




    }
}
