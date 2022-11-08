package javaChallenge8;

import java.util.Scanner;

//Java Problem (8/20)
//
//Given an integer array nums andPr an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false

public class Problem8{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		System.out.println("============================");
		System.out.println("Enter the array values");
		
		int[] nums = new int[size];
		
		for(int i=0;i<=size-1;i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println("==============================");
		System.out.println("Enter the Integer value");
		int k=sc.nextInt();
		
		sc.close();

		int count=0;
		for(int i=0;i<=size-1;i++)
		{
			for(int j=i+1;j<=size-1;j++)
			{
				if((nums[i]==nums[j])&&Math.abs((i-j))<=k)
				{
					count++;
				}
			}
		}
	if(count>0)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
		
	}

}
