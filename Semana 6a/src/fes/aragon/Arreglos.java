package fes.aragon;

public class Arreglos {

	public static void main(String[] args) {
		String []arr={"Norte","Sur","Este","Oeste"};
		int[][]arr2={{1,2,3}, {3,4}};
		int []arr3=new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j]+"");
			}System.out.println();
		}
		for (int i = 0; i < arr3.length; i++) {
			arr3[i]=i;
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+"");
		}
	}	 

}
