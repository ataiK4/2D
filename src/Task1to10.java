import java.util.Scanner;
public class Task1to10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1
        int[] array1 = {4,7,9,2,5,8,1,6};
        System.out.println(array1[0]+" "+array1[2]+" "+array1[4]+" "+array1[6]+" ");

        //Task2
        int[] array2 = {5, -3, 12, 0, -8, 7, 4, -1, 9, 2};
        int sum = 0;

        for (int num : array2) {
            if (num > 0) {
                sum += num;
            }
        }

        System.out.println("Sum of positive integers: " + sum);

        //Task3
        int[] array3 = new int[8];
        int count3 = 0;
        for(int i = 0; i < array3.length; i++) {
            System.out.print("Enter the " + (i+1) + " number: ");
            array3[i] = scanner.nextInt();
            if(array3[i] >= 10 && array3[i] <=20) {
                count3 += 1;
            }
        }
        System.out.println("The amount of numbers from 10 to 20: " + count3);

        // Task 4
        int[] array4 = {8, 3, 5, 3, 9, 2, 6};
        int min = array4[0];
        int minIndex = 0;
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] < min) {
                min = array4[i];
                minIndex = i;
            }
        }
        System.out.println("Min: " + min + ", index: " + minIndex);

        // Task 5
        int[] array5 = {1, 4, -2, 0, 8, 3};
        for (int i = 0; i < array5.length; i++) {
            array5[i] += 5;
            System.out.print(array5[i] + " ");
        }
        System.out.println();

        // Task 6
        int[] array6 = {6, 9, 3, 8, 6, 10, 2, 7};
        int countGreater = 0;
        for (int i = 1; i < array6.length; i++) {
            if (array6[i] > array6[0]) {
                countGreater++;
            }
        }
        System.out.println("Count: " + countGreater);

        // Task 7
        int[] array7 = {3, 8, 5, 2, 7, 4, 9, 6};
        int[] evenArray = new int[array7.length];
        int evenCount = 0;
        for (int num : array7) {
            if (num % 2 == 0) {
                evenArray[evenCount++] = num;
            }
        }
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        // Task 8
        double[] temps = {15, 16, 21, 9, 9, 4, 11};
        double sumTemp = 0;
        for (double t : temps) {
            sumTemp += t;
        }
        double avg = sumTemp / temps.length;
        int aboveAvg = 0;
        for (double t : temps) {
            if (t > avg) {
                aboveAvg++;
            }
        }
        System.out.println("Average: " + avg + "; above: " + aboveAvg);

        // Task 9
        int[][] matrix9 = {{1, 2, 3},
                           {4, 5, 6}};
        for (int i = 0; i < matrix9.length; i++) {
            for (int j = 0; j < matrix9[i].length; j++) {
                System.out.print(matrix9[i][j] + " ");
            }
            System.out.println();
        }

        // Task 10
        int[][] matrix10 = {
                {0, 2, 3},
                {4, 0, 6},
                {0, 8, 0}
        };
        int zeros = 0;
        for (int i = 0; i < matrix10.length; i++) {
            for (int j = 0; j < matrix10[i].length; j++) {
                if (matrix10[i][j] == 0) {
                    zeros++;
                }
            }
        }
        System.out.println("Zeros: " + zeros);
    }
}
