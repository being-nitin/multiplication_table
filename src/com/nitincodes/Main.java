package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java program to print multiplication table of a given number
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("The multiplication table of "+n+" is");
    for(int i=1;i<=10;i++){
        System.out.println(n+"x"+i+"="+n*i);
    }
    }
}
