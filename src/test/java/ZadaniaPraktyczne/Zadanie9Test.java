package ZadaniaPraktyczne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie9Test {

    @Test
    void shouldReturnTrueIfWordsHaveSameLetters(){
        //given
        String firstWord = "MARA";
        String secondWord = "RAma";
        //when
        boolean result = Zadanie9.checkWordsAreWithTheSameLetters(firstWord, secondWord);
        //then
        assertEquals(result, true);
    }

    @Test
    void shouldReturnFalseIfWordsHaveNotSameLetters(){
        //given
        String firstWord = "OKNO";
        String secondWord = "RAMA";
        //when
        boolean result = Zadanie9.checkWordsAreWithTheSameLetters(firstWord, secondWord);
        //then
        assertEquals(result, false);
    }

}