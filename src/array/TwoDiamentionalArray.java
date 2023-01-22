package array;

public class TwoDiamentionalArray {
	public static void main(String[] args) {
		int a[][]=new int [3][2];
		a[0][0]=10;
		a[0][1]=100;
		a[0][2]=1000;
		a[1][0]=20;
		a[1][1]=60;
		a[1][2]=2000;
		a[2][0]=30;
		a[2][1]=300;
		a[2][2]=3000;
		a[1][2]=70;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				System.out.println(a[i][j]);
//				
//			}
//			
//		}
		for (int[] is : a) {
			for (int i : is) {
				System.out.println(i);
				
			}
			
		}
		
		
		
		
	}

}
