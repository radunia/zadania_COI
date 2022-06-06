package ZadaniaPraktyczne;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        isPersonAdult();
    }

    public static boolean isPersonAdult() {
        Scanner scanner = new Scanner(System.in);
        String pesel;
        do {
            System.out.println("Write your pesel number");
            pesel = scanner.nextLine();
            if (pesel.length() != 11) {
                System.out.println("Invalid number of characters! Please try again");
            }
        } while (pesel.length() != 11);

        if(pesel.charAt(2) == '0' || pesel.charAt(2) == '1') {
            System.out.println("Person is adult");
            return true;
        }

        String charToChange = pesel.substring(2,3);
        int parsedChar = Integer.parseInt(charToChange) - 2;
        charToChange = String.valueOf(parsedChar);

        StringBuilder builder = new StringBuilder(pesel);
        String birthDate = builder
                .insert(0, "0")
                .insert(0, "2")
                .insert(4, "-")
                .insert(7, "-")
                .replace(5, 6, charToChange)
                .substring(0, 10);

        LocalDate parsedLocalDate = LocalDate.parse(birthDate);
        LocalDate now = LocalDate.now();

        Period age = Period.between(parsedLocalDate, now);
        int ageInYears = age.getYears();

        if (ageInYears < 18) {
            System.out.println("Person is not adult");
            return false;
        } else {
            System.out.println("Person is adult");
            return true;
        }

    }
}
