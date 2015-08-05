package fes.aragon;

public class CicloFor {

	public static void main(String[] args) {
		/*for (int i=0; i<100; i++) {
			for (int x=0; x < i; x++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i=0; i< 10; i++) {
			for (int j=0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=0; i<10; i++) {
			for (int x=10; x > i; x--){
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*int i=0;
		do{
			int j=0;
			System.out.println(" ");
			do{
				System.out.print("*");
				j++;
			}while(j<i);
			i++;	
		}while(i<10);*/
		
		/*int i=0;
		while(i<10){
			i++;
			System.out.println(" ");
			int j=0;
			while(j<i){
				j++;
				System.out.print("*");
			}			
		}*/
		
		int i=0;
		while(i<10){
			i++;
			System.out.println(" ");
			int j=0;
			while(j<i){
				j++;
				System.out.print("*");
			}			
		}
		int k=0;
		while(k<10){
			k++;
			System.out.println("_");
			int l=9;
			while(l>i){
				l--;
				System.out.print("*");
			}			
		}
	}

}
