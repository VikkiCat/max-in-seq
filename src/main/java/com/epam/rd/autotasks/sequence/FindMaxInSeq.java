package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        /*
        while (scan.hasNextInt()){
            int num = scan.nextInt();
            if(num==0){
                scan.close();
                break;
            }
            max = Math.max(max,num);
        }*/
        do {
            int num = scan.nextInt();
            if(num==0){
                scan.close();
                break;
            }
            max = Math.max(max,num);
        } while (scan.hasNextInt());

        return max;
    }

    public static void main(String[] args) {

        //System.out.println("Test your code here!\n");

        // Get a result of your code

        int count = 0;
      //  System.out.println(max());
        for (int i = 8;i >= 1 ; i--) {
            for (int j = 1; j <= 8 ; j++) {
                count++;
                System.out.println(count);
            }
        }
       // System.out.println(count);
       // int pizza = count/8;
       // System.out.println(pizza);
    }
}
