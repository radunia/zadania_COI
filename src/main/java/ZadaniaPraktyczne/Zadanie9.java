package ZadaniaPraktyczne;

import java.util.Arrays;
import java.util.Locale;

public class Zadanie9 {
    /*
    9.	Proszę zaproponować kod źródłowy metody weryfikującej czy podane 2 wyrazy składają się z tych samych liter np.
MARA – składa się z 1 litery M, 2 liter A, 1 litery R
RAMA – składa się z 1 litery R, 2 liter A, 1 litery M
Podane przykłady składają się z tych samych liter.
Napisać podstawowe testy jednostkowe dla tej metody (jUnit).
     */
    public static void main(String[] args) {
        String firstWord = "MARA";
        String secondWord = "RAma";

        System.out.println(checkWordsAreWithTheSameLetters(firstWord, secondWord));
    }

    public static boolean checkWordsAreWithTheSameLetters(String firstWord, String secondWord) {
        firstWord = firstWord.toLowerCase(Locale.ROOT);
        secondWord = secondWord.toLowerCase(Locale.ROOT);

        String[] tabPierwszyWyraz = firstWord.split("");
        String[] tabDrugiWyraz = secondWord.split("");

        Arrays.sort(tabPierwszyWyraz);
        Arrays.sort(tabDrugiWyraz);
        return Arrays.equals(tabPierwszyWyraz, tabDrugiWyraz);
    }
}
