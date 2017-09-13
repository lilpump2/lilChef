package review;
import java.util.Scanner;
public class brandonscode {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Sentance");
		String word = input.nextLine();
		
		int len = word.length();
		char letter;
		
		int counter = 0;
		String sub = "";
		
		do{
			int counter1 = counter;
			while(counter > len){
				letter = word.charAt(counter);
				if(letter == ' '|| counter <= len){
					sub = word.substring(counter1, counter);
					System.out.println(sub);
				}
				counter++;
			}
		}while(sub == "");
	}
}
