import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumbersReader {

    ArrayList<String> readNumbers(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        ArrayList<String> numbers = new ArrayList<>(lines);

        while (scanner.hasNextLine()) {
            numbers.add(scanner.nextLine());

        }
        return numbers;
    }


    private int countLines(String fileName) throws FileNotFoundException {
        int noOfLines = 0;
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            noOfLines++;
            scanner.nextLine();
        }
        scanner.close();
        return noOfLines;
    }

    ArrayList<String> unicList(ArrayList<String> list) {
        ArrayList<String> uList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String x = list.get(i);
            boolean con = uList.contains(x);
            if (!con) {
                uList.add(x);
            }
        }
        return uList;
    }

    void arrCount(ArrayList<String> list, ArrayList<String> uList) {
        Collections.sort(uList);
        for (int i = 0; i < uList.size(); i++) {
            String x = uList.get(i);
            int arrCounter = Collections.frequency(list, x);
            System.out.println(uList.get(i) + " - liczba wystąpień: " + arrCounter);
        }
    }




}

