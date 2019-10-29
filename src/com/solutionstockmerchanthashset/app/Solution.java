package com.solutionstockmerchanthashset.app;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Variables declaration
        int sockNumber = 9;
        int result = 0;

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Get number of socks
        sockNumber = in.nextInt();

        //Array declaration
        int[] arraySock = new int[sockNumber];

        //Add socks to array
        for (int i = 0; i < sockNumber; i++) {
            arraySock[i] = in.nextInt();
        }

        result = sockMerchant(sockNumber, arraySock);

        //Output result
        System.out.println(result);

        //Close input
        in.close();
    }

    static int sockMerchant(int n, int[] ar) {
        //Variables declaration
        int pairs = 0;

        //Object declaration
        HashSet<Integer> hashSet = new HashSet<Integer>();

        //Process find the pairs
        for (int element: ar)
        {
            //If the element is found it is removed from de hash
            if(hashSet.contains(element))
            {
                hashSet.remove(element);
                pairs++;
            }
            //If the element is missing it is added to the hashset
            else{
                hashSet.add(element);
            }
        }

        return pairs;
    }
}
