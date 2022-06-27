package Assignments;

public class Assignment15pythagoras {
	
	
	public static void main(String[] args) {
		int a[]= {3,4,5,12,13,4,8,45,89};
		int temp=0;
		for(int i=0;i<a.length-3;i++) {
			int b=a[i]*a[i];
			int c=a[i+1]*a[i+1];
			int d=a[i+2]*a[i+2];
			if (b==c+d||c==b+d||d==b+c){
				temp++;
				System.out.println("Pythagoras Theorem satisfying Pair="+a[i]+" "+a[i+1]+" "+a[i+2]);	
			}
		}
		
		System.out.println("Total Number Of Pairs : "+temp);
	}
	}
