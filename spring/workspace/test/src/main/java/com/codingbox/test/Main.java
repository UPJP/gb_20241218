package com.codingbox.test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M, N;
		M = sc.nextInt();
		N = sc.nextInt();


		int Min = N, Sum = 0;

		for (int i = M; i <= N; i++) {
			boolean jo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0 ) {
					jo = false;
					break;
				}
			}
			
			if(jo && i!=1) {
				Sum += i;
				if(i < Min) {
					Min = i;
				}
			}

		}
		
	
		 if (Sum > 0) {
	            System.out.println(Sum);
	            System.out.println(Min);
	        } else {
	            System.out.println(-1);
	        }
	}
}