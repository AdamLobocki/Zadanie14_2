import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        NumbersReader numbersReader = new NumbersReader();
        ArrayList<String> liczby = numbersReader.readNumbers("Liczby.txt");
        ArrayList<String> unic = numbersReader.unicList(liczby);
        System.out.println(liczby);
        System.out.println(unic);


        numbersReader.arrCount(liczby, unic);


    }
}
