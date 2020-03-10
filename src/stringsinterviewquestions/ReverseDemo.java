package stringsinterviewquestions;

public class ReverseDemo {

    public static void main(String[] args) {
        String s="The quick brown fox jumps write over the black lazy dog";
        reverseString(s);
reverseWord(s);
    }

    private static void reverseWord(String s) {
String reverseWord="";
    String[] str= s.split(" ");
    for(int i=str.length-1;i>=0;i--)
    {
     reverseWord=reverseWord+str[i]+" ";
    }
    System.out.println(reverseWord);
    }

    private static void reverseString(String s) {
    char[] str= s.toCharArray();
    String reverse = "";

    for(int i= str.length-1; i>=0; i--)
    {
reverse =reverse + str[i];
    }
System.out.println(reverse);

    }
}
