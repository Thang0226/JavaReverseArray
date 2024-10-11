import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		do {
			System.out.println("Enter array size: ");
			size = input.nextInt();
			if (size > 20 || size < 2) {
				System.out.println("Size cannot exceed 20 or less than 2");
			}
		} while (size > 20 || size < 2);

		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1) + ":");
			array[i] = input.nextInt();
		}
		System.out.printf("%-20s", "Elements in array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + "    ");
		}

		for (int i = 0; i < size / 2; i++) {
			int temp = array[i];
			array[i] = array[size - i - 1];
			array[size - i - 1] = temp;
		}

		System.out.println();
		System.out.printf("%-20s", "Reversed array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + "    ");
		}
	}
}
