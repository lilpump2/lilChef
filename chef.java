package review;
import java.util.Scanner;

public class chef {
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter sentence");
	String sentence = input.nextLine().toUpperCase();
	 
	char letter;
	int len = word.length();
	int count = 0; 
	int count1 = 0;
	String sub = "";
		
		do{
			int count1 = count;
			while(count < len){
				letter = word.charAt(count);
				if(letter == ' '){
					sub = word.substring(count1, count);
					System.out.println(sub);
				}
				count++;
			}
		}while(sub == "");

	 
	 
	 
	 while(count < len)
	 {
	 	letter = word.charAt(count);
		
		 if (count == 0) 
		 { 
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
	else {  //End of Beginning-of-word rules, Start of In-Word rules
                if (letter == 'e') {
                    if (!isLast && word.charAt(count + 1) == 'w') {
                        buff.append("oo");
                        count += 2;
                        continue;
                    } else if (isLast) {
                        buff.append("e-a");
                        count++;
                        continue;
                    }
                } else if (letter == 'f') {
                    buff.append("ff");
                    count++;
                    continue;
                } else if (letter == 'i') {
                    if (!isLast && word.charAt(count + 1) == 'r') {
                        buff.append("ur");
                        count += 2;
                        continue;
                    } else if (!i_seen) {
                        buff.append("ee");
                        count++;
                        i_seen = true;
                        continue;
                    }
                } else if (letter == 'o') {
                    if (!isLast && word.charAt(count + 1) == 'w') {
                        buff.append("oo");
                        count += 2;
                        continue;
                    } else {
                        buff.append("u");
                        count++;
                        continue;
                    }
                } else if (count <= len - 4 && letter == 't' && word.charAt(count + 1) == 'i'
                        && word.charAt(count + 2) == 'o' && word.charAt(count + 3) == 'n') {
                    buff.append("shun");
                    count += 4;
                    continue;
                } else if (letter == 'u') {
                    buff.append("oo");
                    count++;
                    continue;
                } else if (letter == 'U') {
                    buff.append("Oo");
                    count++;
                    continue;
                }
            }  //end if In-word rules
            //End if Word-placement rules, Start of Anywhere rules
            if (letter == 'A') {
                if (!isLast && word.charAt(count + 1) == 'n') {
                    buff.append("Un");
                    count = count + 2;
                    continue;
                } else if (!isLast && word.charAt(count + 1) == 'u') {
                    buff.append("Oo");
                    count = count + 2;
                    continue;
                } else if (!isLast) {
                    buff.append("E");
                    count++;
                    continue;
                }
            } else if (letter == 'a') {
                if (!isLast && word.charAt(count + 1) == 'n') {
                    buff.append("un");
                    count = count + 2;
                    continue;
                } else if (!isLast && word.charAt(count + 1) == 'u') {
                    buff.append("oo");
                    count = count + 2;
                    continue;
                } else if (!isLast) {
                    buff.append("e");
                    count++;
                    continue;
                }
            } else if (letter == 'e') {
                if (!isLast && word.charAt(count + 1) == 'n'
                        && count == len - 2) {
                    buff.append("ee");
                    count += 2;
                    continue;
                } else if (count > 0) {
                }
            } else if (letter == 't') {
                if (count == len - 2 && word.charAt(count + 1) == 'h') {
                    buff.append("t");
                    count += 2;
                    continue;
                } else if (count <= len - 3 && word.charAt(count + 1) == 'h'
                        && word.charAt(count + 2) == 'e') {
                    buff.append("zee");
                    count += 3;
                    continue;
                }
            } else if (letter == 'T' && count <= len - 3 && word.charAt(count + 1) == 'h'
                    && word.charAt(count + 2) == 'e') {
                buff.append("Zee");
                count += 3;
                continue;
            } else if (letter == 'v') {
                buff.append("f");
                count++;
                continue;
            } else if (letter == 'V') {
                buff.append("F");
                count++;
                continue;
            } else if (letter == 'w') {
                buff.append("v");
                count++;
                continue;
            } else if (letter == 'W') {
                buff.append("V");
                count++;
                continue;
            }	 	 		 
 }
 }
}
