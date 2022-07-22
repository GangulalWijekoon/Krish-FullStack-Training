;import java.util.Scanner;

public class WaterFallProb1 {


        public static void main(String[] args) {
             int[][] arr = new int[][]{
                    {0, 0, 0, 0, 0, 0, 0},
                    {1, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 1, 0},
                    {0, 0, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0},
            };

            System.out.println("Enter where to pour water: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();


            int[][] waterdrop = pour(arr, input);


            int[] results = waterdrop[waterdrop.length-1];

            for(int value : results) {
                System.out.print(value+"   ");
            }
            System.out.println();

        }


        public static int[][] pour(int[][] array, int point) {

            int[][] percentage = new int[array.length][array[0].length];


            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    if(percentage[row][col] > 0){
                        water.add(col);
                    }

                }
                for(int q : water) {
                    if (row != 6) {
                        if (array[row][q] == 1) {
                            if (q == 0)
                                percentage[row + 1][q + 1] = percentage / 2;
                            else if (q == (array[0].length - 1))
                                percentage[row + 1][q - 1] = percentage / 2;
                            else {
                                percentage[row + 1][q + 1] = percentage / 2;
                            }
                        } else {
                            percentage[row + 1][q] = percentage[row][q];
                        }

                    }
                }

            }
            return percentage;

        }


}
