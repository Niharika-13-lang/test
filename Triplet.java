import java.util.*;
public class Triplet {
	static boolean isTriplet(int A[],int N) {
		for(int i=0;i<N;i++)
		{
			for(int j=i+1;j<N;j++) {
				for(int k=j+1;k<N;k++) {
					int x=A[i]*A[i],y=A[j]*A[j],z=A[k]*A[k];
					if(x==y+z||y==z+x||z==x+y)
						return true;
				}
			}
				
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the testcases from 1 to 100:");
		int T=sc.nextInt();
		for(int n=1;n<=T;n++) {
		System.out.println("Enter the size of array from 1 to 107:");
		int N=sc.nextInt();
		int A[]=new int[N];
		System.out.println("Enter the elements of an array from 1 to 1000 :");
		for(int i=0;i<N;i++)
			A[i]=sc.nextInt();
		boolean b=Triplet.isTriplet(A,N);
		if(b==true)
			System.out.println("Yes");
		}
			
	}

}
