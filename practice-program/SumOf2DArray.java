import java.util.*;

class SumOf2DArray{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the no. of colm: ");
		int colm = sc.nextInt();
		
		int[][] arr = new int[rows][colm];
		int sum = 0;
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i < rows; i++){
		    for(int j = 0; j < colm; j++){
			arr[i][j] = sc.nextInt();
			sum += arr[i][j];
			}
		}
		System.out.println("Sum of all elements: " + sum);
		sc.close();
	}
}