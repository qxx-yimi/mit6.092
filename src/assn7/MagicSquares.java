package assn7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {

    public static void isRight(String filename) throws IOException {
        int[][] num = new int[100][100];
        FileReader fr1 = new FileReader(filename);
        BufferedReader br1 = new BufferedReader(fr1);
        String line = null;
        int row = 0;
        while ((line = br1.readLine()) != null) {
            if (line.equals("")) continue;
            String[] numbersString = line.split("\t");
            for (int i = 0; i < numbersString.length; i++) {
                num[row][i] = Integer.parseInt(numbersString[i]);
            }
            row++;
        }
        br1.close();
        //cntRows(num, row);
        cntAll(num, row);
    }

    public static void cntRows(int[][] num, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += num[0][i];
        }

        for (int i = 0; i < n; i++) {
            int sumRow = 0;
            for (int j = 0; j < n; j++) {
                sumRow += num[i][j];
            }
            if (total != sumRow) {
                System.out.println("Row is not right!");
                return;
            }
        }
        System.out.println("Row is right!");
    }

    public static void cntAll(int[][] num, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += num[0][i];
        }

        // for row
        int i;
        for (i = 0; i < n; i++) {
            int sumRow = 0;
            for (int j = 0; j < n; j++) {
                sumRow += num[i][j];
            }
            if (total != sumRow) {
                System.out.println("Row is not right!");
                break;
            }
        }
        if (i == n)
            System.out.println("Row is right!");

        // for column
        for (i = 0; i < n; i++) {
            int sumCol = 0;
            for (int j = 0; j < n; j++) {
                sumCol += num[j][i];
            }
            if (total != sumCol) {
                System.out.println("Col is not right!");
                break;
            }
        }
        if (i == n)
            System.out.println("Col is right!");


        // for diagonal
        int sumDia1 = 0, sumDia2 = 0;
        for (i = 0; i < n; i++) {
            sumDia1 += num[i][i];
            sumDia2 += num[i][n-i-1];
        }
        if (total != sumDia1 || total != sumDia2) {
            System.out.println("Diagonal is not right!");
        } else {
            System.out.println("Diagonal is right!");
        }
    }


    public static void main(String[] args) throws IOException {
        System.out.println("File: Luna.txt");
        String filename1 = "src/assn7/Luna.txt";
        isRight(filename1);

        System.out.println("\nFile: Mercury.txt");
        String filename2 = "src/assn7/Mercury.txt";
        isRight(filename2);
    }
}
