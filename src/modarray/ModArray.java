package modarray;

import java.util.Scanner;

public class ModArray {

	public static int modArray(int array[],int B) {
		int power = 1;
		int result = 0;
		for(int i=array.length - 1;i>=0;i--) {
			result = (result + ((array[i]%B)*power))%B;
			power = (power*10)%B;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int B = scanner.nextInt();
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int results = modArray(array,B);
		System.out.println(results);
	}

}
