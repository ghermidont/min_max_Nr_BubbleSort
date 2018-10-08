import java.util.Random;

public class minAndMaxBubbleSort {

        private static int[] num_list = new int[5];

        public static void main(String[] args) {

            Random numG = new Random();

            // Add numb to the Array.
            for(int i = 0; i < 5; i++) {
                int randNumGen = numG.nextInt(10);
                num_list[i] = randNumGen;
            }

            num_display();

            System.out.println();

            bubbleSort(num_list);

            System.out.println("*********************");
            System.out.println("The largest number is: " + num_list[4]);
            System.out.println("The smallest number is: " + num_list[0]);
        }

        private static void num_display() {
            for (int n : num_list) {
                System.out.println(n);
            }
        }

        private static void bubbleSort(int[] numArray) {

            int n = numArray.length;
            int temp;

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (numArray[j - 1] > numArray[j]) {
                        temp = numArray[j - 1];
                        numArray[j - 1] = numArray[j];
                        numArray[j] = temp;
                    }
                }
            }
        }

}
