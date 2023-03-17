package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGame {
    public static boolean canWin(int leap, int[] game) throws IndexOutOfBoundsException{
        // Return true if you can win the game; otherwise, return false.
        //System.out.println(Arrays.toString(game));
        System.out.println("inicia función");
        int pos=0;
        boolean result=true;
        boolean retroceder=false;
        while(pos+leap<game.length){
            if(!retroceder){
                if(game[pos+leap]==0)pos+=leap;
                else if(game[pos+1]==0)pos++;
                else retroceder=true;
            }
            if(retroceder){
                if(game[pos+leap]==0)pos+=leap;
                else if(pos-1>=0 && game[pos-1]==0)pos--;
                else{
                    result=false;
                    System.out.println("Es un break");
                    break;
                }
            }
        }
        //System.out.println("Hecho ");
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println("Prueba "+(5000-q)+" "+n+" "+leap);
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

}
