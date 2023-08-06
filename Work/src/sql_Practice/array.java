package sql_Practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3,7,8,9,1};
		int [] b  = {8,9,1,2};
		
		
		int [] c = new int[a.length+b.length];
		
		int count1=0;
		
		int m=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					c[m++]=a[i];
					count1++;
				}
			}
		}
		
		int [] tem = new int[count1];
		
		for(int i=0;i<count1;i++) {
			tem[i]=c[i];
		}
		
		for(int i=0;i<count1;i++) {
			TreeSet tree = new TreeSet<>();
			tree.add(tem[i]);
			System.out.println(tree);
		}
		
		
	
		
		
		
		//System.out.println(Arrays.toString(tem));
		
		

	}

}
