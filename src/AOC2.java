import java.io.IOException;

public class AOC2 extends help{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Task1");
		task1();
		
		System.out.println("Task2");
		task2();
	}
	
	static void task1() throws IOException{
		String[] stringInput = readLines("/Users/tobiassager/eclipse-workspace/AOC2021/src/input2.txt");
		int höhe = 0;
		int strecke =0;
		int value = 0;
		
		for(int i = 0; i < stringInput.length; i++) {
			String[] newStr = stringInput[i].split("\\s+");
			value = Integer.parseInt(newStr[1]);
			
			if(newStr[0].equals("forward")) {
				strecke += value;
			}
			else if(newStr[0].equals("up")) {
				höhe -= value;
			}
			else if(newStr[0].equals("down")) {
				höhe += value;
			}
		}
		
		int result = höhe * strecke;
		System.out.println(result);
	}
	
	static void task2() throws IOException{
		String[] stringInput = readLines("/Users/tobiassager/eclipse-workspace/AOC2021/src/input2.txt");
		int depth = 0;
		int horizontal =0;
		int aim=0;
		int value = 0;
		
		for(int i = 0; i < stringInput.length; i++) {
			String[] newStr = stringInput[i].split("\\s+");
			value = Integer.parseInt(newStr[1]);
			
			if(newStr[0].equals("forward")) {
				horizontal += value;
				depth = (aim * value) + depth;
			}
			else if(newStr[0].equals("up")) {
				aim -= value;
			}
			else if(newStr[0].equals("down")) {
				aim += value;
			}
		}
		
		int result = horizontal * depth;
		System.out.println(result);
	}
}
