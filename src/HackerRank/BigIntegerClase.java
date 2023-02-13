package HackerRank;

import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerClase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        BigInteger A=new BigInteger(scan.next());
        BigInteger B=new BigInteger(scan.next());

        System.out.println(A.add(B));
        System.out.println(A.multiply(B));


    }
}
