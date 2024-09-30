import java.util.Scanner;
public class matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row1,row2,col1,col2,i,j,k;
		System.out.println("enter the no of rows & columns of first matrix :");
		row1 = sc.nextByte();
		col1 = sc.nextByte();
		System.out.println("enter the no of rows & columns of second matrix :");
		row2 = sc.nextInt();
		col2 = sc.nextInt();
		if(row1 == col2){
		 int[][] a1 = new int[row1][col1];
            int[][] a2 = new int[row2][col2];
            int[][] result = new int[row1][col2];
			System.out.println("Enter the first matrix :");
			for (i=0;i<row1;i++){
				for(j=0;j<col1;j++){
					a1[i][j] = sc.nextByte();
				}
			}
			System.out.println("Enter the second matrix :");
			for (i=0;i<row2;i++){
				for(j=0;j<col2;j++){
					a2[i][j] = sc.nextByte();
				}}
				
			for(i=0;i<row1;i++){
				for(j=0;j<col2;j++){
					for(k=0;k<col1;k++){
						result[i][j] += a1[j][k] * a2[k][j];
					}
				}
			}
			System.out.println("The product is :");
			for (i=0;i<row2;i++){System.out.println("");
			
				for(j=0;j<col2;j++){
					System.out.print(result[i][j]+", ");
				}}
			}  
		}
	}

