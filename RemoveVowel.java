import java.util.Scanner;
import java.lang.Character;
public class RemoveVowel{
	public static void main(String [] args){
		System.out.println("enter the sentence");
		Scanner Input = new Scanner(System.in);
		String sen = Input.nextLine();
		String only_vowel= "";
		for(char i: sen.toCharArray())
		{
			char x=Character.toLowerCase(i);
		if (x!='a'& x!='e'& x!='i'& x!='o'& x!='u'){
			only_vowel=only_vowel+i;
		}
		}
			System.out.println(only_vowel);

	}
}