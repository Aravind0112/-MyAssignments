package week2.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int a[]= {1,4,3,2,8,6,7};
		Arrays.sort(a);
		int sum=0;
		int n=8;
		int req = (n*(n+1))/2;
		for(int i=0;i<=a.length-1;i++) {
			sum+=a[i];
		}
		System.out.println(req-sum);
	}
}