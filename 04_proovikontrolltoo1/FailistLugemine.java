import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.util.List;

public class FailistLugemine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("kirjeldus.txt")
        );
        String rida = br.readLine();
        System.out.println(rida);
            //String[]
        List<String> tykeldus = List.of(rida.split("es"));
        System.out.println(tykeldus);
        System.out.println(tykeldus.size());
        System.out.println(Math.sqrt(tykeldus.size()));
        System.out.println(Math.pow(tykeldus.size(), 3));

        //absoluutväärtus Math.abs --- if (number < 0) -- number *= -1
    }
}
