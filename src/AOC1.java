import java.io.IOException;

public class AOC1 extends help{

	public static void main(String[] args) throws IOException {
		System.out.println("Task1");
		task1();
		
		System.out.println("Task2");
		task2();
	}
	
	static void task1() throws IOException {
		
		String[] stringInput = readLines("/Users/tobiassager/eclipse-workspace/AOC2021/src/input1.txt");
		
		int[] input = new int[stringInput.length];
		for(int i = 0 ; i < stringInput.length; i++) {
			input[i] = Integer.parseInt(stringInput[i]);
		}
		
		int count = 0;
		
		for(int i = 0; i < input.length - 1; i++) {
			if(input[i] < input[i+1])
				count++;
		}
		System.out.println(count);
	}
	
	static void task2() throws IOException {
		String[] stringInput = readLines("/Users/tobiassager/eclipse-workspace/AOC2021/src/input1.txt");
		
		int[] input = new int[stringInput.length];
		for(int i = 0 ; i < stringInput.length; i++) {
			input[i] = Integer.parseInt(stringInput[i]);
		}
		
		int count = 0;
		int check1 = 0;
		int check2 = 0;
		
		for(int i = 0; i < input.length-3; i++) {
			check1 = input[i] + input[i+1] + input[i+2];
			check2 = input[i+1] + input[i+2] + input[i+3];
			if(check1 < check2)
				count++;
		}
		System.out.println(count);
	}
}
