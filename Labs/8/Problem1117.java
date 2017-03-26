import java.util.Scanner;
import java.util.ArrayList;
public class Problem1117 {

	public static void main(String[] args) {
		//John Kendrat CMPT 220
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        getFactors(m, numbers);

        int smallestSquare = perfectSquare(numbers);
        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
        System.out.println("m * n = " + (m * smallestSquare));
    }

    private static int perfectSquare(ArrayList<Integer> numbers) {

        int[][] itterations = copy(numbers);
        for (int i : numbers) {
            search(itterations, i);
        }

        // remove the duplicates and get odd sequence numbers
        ArrayList<Integer> oddSequence = removeDuplicates(itterations);

        // get smallest square by multiplying oddSequencenumbers
        int smallestSquare = 1;
        for (int i : oddSequence) {
            smallestSquare *= i;
        }
        return smallestSquare;
    }

    private static ArrayList<Integer> removeDuplicates(int[][] m) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //Adds these to the ArrayList
        for (int i = 0; i < m.length; i++) {
            if (m[i][1] % 2 != 0) {
                numbers.add(m[i][0]);
            }
        }

        // remove any found duplicates
        ArrayList<Integer> removeDuplicate = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {

            if (!removeDuplicate.contains(numbers.get(i))) {
                removeDuplicate.add(numbers.get(i));
            }
        }

        return removeDuplicate;
    }

    private static void search(int[][] m, int number) {
        //Searches for itterations
    	for (int i = 0; i < m.length; i++) {
            if (m[i][0] == number) {
                m[i][1]++;
            }
        }
    }

    private static int[][] copy(ArrayList<Integer> numbers) {
        //Copies the integers onto a matrix
        int[][] temp = new int[numbers.size()][2];

        for (int i = 0; i < temp.length; i++) {
            temp[i][0] = numbers.get(i);
        }
        return temp;
    }

    private static void getFactors(int num, ArrayList<Integer> numbers) {
    //Gets all of the integers factors
        int count = 2;
        while (count <= num) {
            if (num % count == 0) {
                numbers.add(count);
                num /= count;
            } else {
                count++;
            }
        }
    }

}
