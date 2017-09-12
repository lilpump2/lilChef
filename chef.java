package review;
import java.util.Scanner;

public class chef {
 public static void main(String [] args){
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter Word");
	 String word = input.nextLine();
	 
	 char letter;
	 int len = word.length();
	 int count = 0; 
	 
	 while(count < len){
		 letter = word.charAt(count);
	 
		  if (count == 0) { //Beginning-of-word rules
              if (letter == 'e') {
                  word.replaceAll("i", word);
                  count++;
                  continue;
              } else if (letter == 'E') {
                  buff.append("I");
                  count++;
                  continue;
              } else if (letter == 'o') {
                  buff.append("oo");
                  count++;
                  continue;
              } else if (letter == 'O') {
                  buff.append("Oo");
                  count++;
                  continue;
              }
	 }
 }
 }
}
