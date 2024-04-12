package com.codingbox.test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M, N;
		M = sc.nextInt();
		N = sc.nextInt();
		
		int[] aaa = new int [N];
		

		int Min = N, Sum = 0, count=0;
		
		for (int i = M; i < N; i++) {
			boolean sosu=true;
			
			int j = 2;
			while (i <= j) {
				if (i % j == 0 ) {
					sosu = false;
					break;
				}
				j++;
			
			}
			if (sosu && i != 1) {
				 aaa[count]=i;
				 Sum += i;
				 count++;
				 if(i < Min ) {
					 Min = i;
				 }
			}
		}
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		System.out.println(aaa[3]);
		System.out.println(aaa[4]);
		System.out.println(aaa[5]);
		
		System.out.println(Sum);
		if(Min != N) {
			System.out.println(Min);
		}
	}

}