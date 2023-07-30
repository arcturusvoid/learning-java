package section2;

import java.util.Scanner;

public class arrays {

    int bigger(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }

    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    static int search(int arr[], int searchElement){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == searchElement)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[][] = new int[3][4];
        int b[][] = new  int[3][];
        b[0] = new int[4];
        b[1] = new int[3];
        b[2] = new int[5];



    }
}
