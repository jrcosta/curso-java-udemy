import java.util.Scanner;

public class ProgramExercicioMatriz {
    
    public static void main(String[] args) {
        
        System.out.print("Digite o tamanho da matriz: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n]; 


        System.out.println("Digite os valores da matriz: ");
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz em formato de quadrado:");
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int count = 0;

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) { // mat[i].Length é a quantidade de colunas da matriz
                if(mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Quantidade de números negativos: " + count);

        sc.close();

    }

}
