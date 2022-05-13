import java.util.Scanner;
import java.io.*;
import java.util.*;

public class FailistLugemine {
    static final int MAX_CHAR = 256;

    static void getOccuringChar(String word)
    {


        int count[] = new int[MAX_CHAR];

        int len = word.length();

        ArrayList<Integer> numbers = new ArrayList<Integer>();


        for (int i = 0; i < len; i++) {
            count[word.charAt(i)]++;
        }


        char ch[] = new char[word.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = word.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {


                if (word.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
            System.out.println(
                        "Number of Occurrence of "
                                + word.charAt(i)
                                + " is:" + count[word.charAt(i)]);
        }
    }



    public static void main(String[] args) throws IOException {

        File file = new File("tekst.txt");
        Scanner input = new Scanner(file);

        ArrayList<String> list = new ArrayList<String>();



        String word = null;
        while (input.hasNext()) {
            word = input.next();
            System.out.println(word.charAt(word.length() - 1));
            list.add(String.valueOf(word.charAt(word.length() - 1)));
        }
        getOccuringChar(list.toString());
        Collections.sort(list, Collections.reverseOrder());
    }
}