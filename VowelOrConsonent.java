package basicprograms;
/*
*Java Program to Check Whether an Alphabet is Vowel or Consonant
*/
public class VowelOrConsonent {

    public static void main(String[] args) {

        char ch = 'k';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}

