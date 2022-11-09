package duplicateelements;

import java.util.Arrays;

public class DuplicateElements {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,1,2,3,4,5,8,9,9};
		Arrays.sort(a);
		int result[] = new int[a.length];
		int k=0;
		//1,1,2,2,3,3,4,4,5,5,6,7,8,9,9
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1])
				result[k++] = a[i];
		}
		result[k++] = a[a.length-1];
		for(int j=0;j<k;j++) {
			System.out.println(" "+result[j]);
		}
	}
}
