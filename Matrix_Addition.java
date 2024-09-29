import java.util.Scanner;

public class CheckingLab4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Matrix A
        System.out.print("Enter your number of rows of A: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns of A: ");
        int col = input.nextInt();

        int[][] A = new int[rows][col];
        int[][] B = new int[rows][col];
        int[][] C = new int[rows][col];

        System.out.println("Enter your Matrix A: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix A is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }


        //Matrix B
        System.out.println("Enter your Matrix B: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                B[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix B is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }

        //Addition
       for(int i=0;i<rows;i++){
           for(int j=0;j<col;j++){
               C[i][j] = A[i][j] + B[i][j];
           }
       }

        System.out.println("Matrix After Addition: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(C[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
