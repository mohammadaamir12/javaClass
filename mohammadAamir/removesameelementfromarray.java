package mohammadAamir;


import java.util.HashSet;


public class removesameelementfromarray {

	public static void main(String[] args) {
		
		
		int a[]= {1,1,2};
		HashSet <Integer> set=new HashSet<>();
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++) {
			set.add(a[i]);
			if(set.contains(a[i])) {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
