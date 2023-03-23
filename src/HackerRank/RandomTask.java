package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RandomTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> lista=new ArrayList<>();
        ArrayList<Integer> maximums=new ArrayList<>();
        int A=scan.nextInt();
        int B=scan.nextInt();
        int N=scan.nextInt();
        int K=scan.nextInt();
        for(int i=A;i<=B;i++){
            ArrayList<Integer> num=new ArrayList<>();
            Random random=new Random(i);
            for(int j=0;j<N;j++){
                num.add(random.nextInt(K));
            }
            lista.add(num);
        }
        for(ArrayList li:lista) maximums.add((int)Collections.max(li));

        int minMaximum=Collections.min(maximums);
        int seed=maximums.indexOf(minMaximum)+A;
        System.out.println(seed);
        System.out.println(minMaximum);
    }
}
