package review;

public class brandonscode {
	public static void main(String [] args){
		String word = "Caleb Baleb";
		int len = word.length();
		char letter;
		
		int counter = 0;
		String sub = "";
		
		do{
			int counter1 = counter;
			while(counter < len){
				letter = word.charAt(counter);
				if(letter == ' '){
					sub = word.substring(counter1, counter);
					System.out.println(sub);
				}
				counter++;
			}
		}while(sub == "");
	}
}
