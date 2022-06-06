public class ZadaniaOtwarteIZamkniete {
    /*
    1.	Czym różni się obiekt od klasy?
    Klasy służą do opisywania jakiś rzeczy/zdarzeń/ czynności czy relacji pomiędzy przedmiotami.
    Natomiast tworząc instancje klasy tworzymy obiekty. Różnicą między pomiędzy obiektem, a klasą jest taka,
    że klasa jest zestawem cech reprezentujących jakąś rzecz i czynnościami(metodami), które możemy na tej rzeczy wykonać.
    A obiektem jest konkretny egzemplarz tej klasy.

2.	Czy różni się klasa abstrakcyjna od interfejsu?
    Widoczność metod w interfejsie jest publiczna, a w klasie abstakcyjnej może być publiczna lub chroniona.
    Interfejs może zawierać jedynie deklarację metod, a klasa abtrakcyjna może posiadać metody zdefiniowane.
    Interfejsy nie mogą zawierać atrybutów, a w klasach abstrakcyjnych jest to możliwe.

    Różnicą jest także fakt, że klasa może implementować wiele interfejsów, ale może rozszerzać jedną klasę.

3.	Proszę wyjaśnić mechanizm dziedziczenia w Javie.
    Mechanizm dziedziczenia pozwala na wspóldzielenie zachowań pomiędzy klasami. Klasa może dziedziczyć po jednej klasie,
    dzięki czemu może definiować nowe zachowania i właściwości. Natomiast klasa z której dziedziczy jakaś klasa, również
    może dziedziczyć zachowania po innej klasie, przez co tworzy się hierarchia dziedziczenia. Ostatecznie wszystkie klasy
     dziedziczą po klasie Object.

4.	Co należy zdefiniować w klasie podrzędnej
        a.	Nic

5.	W którym miejscu klasy można deklarować zmienne
        a.	W dowolnym miejscu - poprawne

6.	Proszę omówić modyfikatory dostępu w Javie.
Modyfikatory jakie występują w Javie to public, protected, private oraz brak modyfikatora.
Metody i zmienne z modyfikatorem dostępu public są dostępne dla wszystkich.
Modyfikator protected jest przydatny jeśli zachodzi dziedziczenie. Oznacza to, że elementy poprzedzone tym modyfikatorem
są dostępne dla tej konretnej klasy, jej podklas, a także innych klas w tym samym pakiecie.
Modyfikator private stosowany jest przed elementami klasy i przed klasami wewnętrznymi. Mając modyfikator private elementy
są widoczne tylko w ramach konretnej klasy.
Modyfikator domyślny oznacza to samo co protected, wszystko jest dostępne w danym pakiecie.

7.	Które ze słów kluczowych powoduje przeskoczenie z bloku try do bloku finally
        a.	return

10. Tworząc system przechowujący informacje o sukcesach sportowych należy stworzyć bazę danych i tabelę, które będą gromadzić dane.
    Można przyjąć,że w najprostszym wydaniu będzie to tabela z zawodnikami, spisem nagród i kategoriami/dyscyplinami w jakich może
    zawodnik uczestniczyć. Zakładając, że nagrody są unikalne i inne dla każdej kategorii byłoby tu powiązanie 1:N(klucz obcy
    z tabeli nagród bedzie w tabeli zawodnicy), ponieważ zakładam, że zawodnik może wystąpić w wielu zawodach i zdobyć wiele nagród
    np. w trakcie sezonu. Powiązanie zawodnik - dyscyplina,  bedzie N:N przez co między dycypliną, a zawodnikiem będzie tabela pośrednia.
    Zakładam, że jeden zawodnik może brać udział w różnych dyscyplinach.
    Działania jakie będą zachodzić to:
    1. Pobranie danych o zawodniku (id usera, imie, nazwisko)
    2. Sprawdzenie poprawności danych.
    3. Przypisanie dyscypliny w której wystąpił zawodnik i nagrody jaką zdobył
    4. Pzesłanie wartości dalej
    5. Zapisanie danych w bazie

13.	Czy zbiór (Set) może zawierać duplikaty?
        b.	Nie
14.	 Zaznaczyć metody należące do java.util.Set:
        a.	addAll
        b.	contains
        c.	isEmpty
        d.	size
        e.	remove
15. Zakładając ze tabela nazywa się employees i przyjęłam założenie struktury firmy takie, że manager i president
nie mają już żadnych przełożonych i wtedy zapytanie by wyglądało tak:
SELECT count(*) FROM employees WHERE job_name != 'PRESIDENT' AND job_name != 'MANAGER';

16. SELECT min(salary) FROM employees;
18. Kod może się nie skompilować w przypadku próby dodania do listy elementu innego typu niż String. A także wywołując
metodę getElement i pobierać element z listy, którego nie ma. Aby się przed tym zabezpieczyć należy sprawdzić intrukcją warunkową
czy element, któy chcemy dodać jest Strigiem. Natomiast aby uchronić program przed Index Out Of Bounds Exception należy albo wcześniej
sprawdzić długość listy i nie przekraczać jej długości-1 (n-1), albo wywoływać elementy w pętli dopóki jest jeszcze element do wyświetlenia.
19.
Poprawmy zapis aby w tym przypadku porównać Stringi należy wybrać opcję nr 2 - if ("".equals(wartosc));
Opcja numer 3 nie jest możliwa. W ten sposób możemy porównywać typu proste. Porównanie obiektu za pomocą przyrównania,
przyrówna referencje do obiektu, a nie sam obiekt. Obiekty należy porównywać za pomocą equals. Poprawna jest opcja nr 2,
ponieważ 1 przypadku 1 gdyby String wartosc była nullem to pojawi się NullPointerException
Dlatego preferowanym rozwiązaniem jest odp. 2.

20.	Co to są obiekty immutable? Czy final sprawia że obiekt jest immutable i dlaczego?
Obiekt immutable to obiekt, który po utworzeniu i inicjalizaji pozostaje niezmienny. Takie obiekty nie mają metod, które
pozwolą na zmianę jego stanu i mają wszystkie pola prywatne. Jeśli dodamy słowo final przed typem np zmiennej to mamy
pewność, że tak zainicjowana zmienna nie zmieni swojej wartości.

21.	Czym różni się metoda http POST od GET?
Metoda POST umożliwia aktualizacje lub wstawianie/tworzenie zasobu.
Metoda GET pobiera zasób.
Dużą rożnicą jest to, że motoda GET umieszka paramatry wewnątrz URI, a metoda POST dołącza paramentry do ciała. Dlatego GET
zadziałałoby tylko dla kilku parametrów. W metodzie GET wszystkie informacje są widoczne w adresie URL, dlatego jeśli nie chcemy,
aby nasze dane były bezpieczniejsze należy wybrać metodę POST.

22.	Jak powinna wyglądac sygnatura metody do której można przekazać dowolną ilość parametrów tego samego typu?
varargs pwoinno się znaleźć w sygnaturze


     */

}
