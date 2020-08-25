package com.foxminded;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    CharCounter charCounter;

    @BeforeEach
    void init() {
        charCounter = new CharCounter();
    }


    @Test
    void counterOfUniqueCharacters_ShouldThrowExceptionWhenInputIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> charCounter.counterOfUniqueCharacters(null));
    }

    @Test
    void counterOfUniqueCharacters_ShouldReturnEmptyStringWhenInputIsEmptyString() {
        String expected = "";
        String actual = charCounter.counterOfUniqueCharacters("");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfSpacesAndReturnExpectedStringWhenInputIsOneSpace() {
        String expected =   " \n" +
                            "\" \" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters(" ");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfSpacesAndReturnExpectedStringWhenInputIsSomeSpaces() {
        String expected =   "     \n" +
                            "\" \" - 5\n";
        String actual = charCounter.counterOfUniqueCharacters("     ");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfLowercaseLettersAndReturnExpectedStringWhenInputIsOneLowercaseLetter() {
        String expected =   "g\n" +
                            "\"g\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("g");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUppercaseLettersAndReturnExpectedStringWhenInputIsOneUppercaseLetter() {
        String expected =   "H\n" +
                            "\"H\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("H");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfNonLetterSymbolsAndReturnExpectedStringWhenInputIsOneNonLetterSymbol() {
        String expected =   "$\n" +
                            "\"$\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("$");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfLowercaseLettersAndReturnExpectedStringWhenInputIsSameLowercaseLetters() {
        String expected =   "aaaaa\n" +
                            "\"a\" - 5\n";
        String actual = charCounter.counterOfUniqueCharacters("aaaaa");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUppercaseLettersAndReturnExpectedStringWhenInputIsSameUppercaseLetters() {
        String expected =   "ZZZ\n" +
                            "\"Z\" - 3\n";
        String actual = charCounter.counterOfUniqueCharacters("ZZZ");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfNonLetterSymbolsAndReturnExpectedStringWhenInputIsSameNonLetterSymbols() {
        String expected =   "!!!!!!!\n" +
                            "\"!\" - 7\n";
        String actual = charCounter.counterOfUniqueCharacters("!!!!!!!");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueLowercaseSimbolsAndReturnExpectedStringWhenInputIsOneLowercaseLettersWord() {
        String expected =   "lowercase\n" +
                            "\"l\" - 1\n" +
                            "\"o\" - 1\n" +
                            "\"w\" - 1\n" +
                            "\"e\" - 2\n" +
                            "\"r\" - 1\n" +
                            "\"c\" - 1\n" +
                            "\"a\" - 1\n" +
                            "\"s\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("lowercase");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueUppercaseSimbolsAndReturnExpectedStringWhenInputIsOneUppercaseLettersWord() {
        String expected =   "UPPERCASE\n" +
                            "\"U\" - 1\n" +
                            "\"P\" - 2\n" +
                            "\"E\" - 2\n" +
                            "\"R\" - 1\n" +
                            "\"C\" - 1\n" +
                            "\"A\" - 1\n" +
                            "\"S\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("UPPERCASE");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueLowercaseAndUppercaseSimbolsAndReturnExpectedStringWhenInputIsLowerAndUppercaseLettersWord() {
    String expected =   "sooooManYTesTSss\n" +
                        "\"s\" - 4\n" +
                        "\"o\" - 4\n" +
                        "\"M\" - 1\n" +
                        "\"a\" - 1\n" +
                        "\"n\" - 1\n" +
                        "\"Y\" - 1\n" +
                        "\"T\" - 2\n" +
                        "\"e\" - 1\n" +
                        "\"S\" - 1\n";
    String actual = charCounter.counterOfUniqueCharacters("sooooManYTesTSss");
    assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueNonLetterSimbolsAndReturnExpectedStringWhenInputIsNonLetterSequence() {
        String expected =   "!@#$%#$%^&*^&*()\n" +
                "\"!\" - 1\n" +
                "\"@\" - 1\n" +
                "\"#\" - 2\n" +
                "\"$\" - 2\n" +
                "\"%\" - 2\n" +
                "\"^\" - 2\n" +
                "\"&\" - 2\n" +
                "\"*\" - 2\n" +
                "\"(\" - 1\n" +
                "\")\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("!@#$%#$%^&*^&*()");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueSimbolsAndReturnExpectedStringWhenInputIsOneWordWithDifferentSymbols() {
        String expected =   "$HellOWoRlDDD!!andAGainHeLLoWorlD!!!$\n" +
                            "\"$\" - 2\n" +
                            "\"H\" - 2\n" +
                            "\"e\" - 2\n" +
                            "\"l\" - 4\n" +
                            "\"O\" - 1\n" +
                            "\"W\" - 2\n" +
                            "\"o\" - 3\n" +
                            "\"R\" - 1\n" +
                            "\"D\" - 4\n" +
                            "\"!\" - 5\n" +
                            "\"a\" - 2\n" +
                            "\"n\" - 2\n" +
                            "\"d\" - 1\n" +
                            "\"A\" - 1\n" +
                            "\"G\" - 1\n" +
                            "\"i\" - 1\n" +
                            "\"L\" - 2\n" +
                            "\"r\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("$HellOWoRlDDD!!andAGainHeLLoWorlD!!!$");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfLowercaseSymbolAndSpacesAndReturnExpectedStringWhenInputIsSameLowercaseLetterSequences() {
        String expected =   "aaaa aaaaaaaa aa\n" +
                            "\"a\" - 14\n" +
                            "\" \" - 2\n";
        String actual = charCounter.counterOfUniqueCharacters("aaaa aaaaaaaa aa");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUppercaseSymbolAndSpacesAndReturnExpectedStringWhenInputIsSameUppercaseLetterSequences() {
        String expected =   "AA AAAAA A AAAAAA AA\n" +
                            "\"A\" - 16\n" +
                            "\" \" - 4\n";
        String actual = charCounter.counterOfUniqueCharacters("AA AAAAA A AAAAAA AA");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfNonLetterSymbolAndSpacesAndReturnExpectedStringWhenInputIsSameNonLetterSequences() {
        String expected =   "*** ***** ** *** *****  \n" +
                            "\"*\" - 18\n" +
                            "\" \" - 6\n";
        String actual = charCounter.counterOfUniqueCharacters("*** ***** ** *** *****  ");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueLowercaseSymbolsAndSpacesAndReturnExpectedStringWhenInputIsSomeLowercaseLettersWords() {
        String expected =   "i like to write tests\n" +
                            "\"i\" - 3\n" +
                            "\" \" - 4\n" +
                            "\"l\" - 1\n" +
                            "\"k\" - 1\n" +
                            "\"e\" - 3\n" +
                            "\"t\" - 4\n" +
                            "\"o\" - 1\n" +
                            "\"w\" - 1\n" +
                            "\"r\" - 1\n" +
                            "\"s\" - 2\n";
        String actual = charCounter.counterOfUniqueCharacters("i like to write tests");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueUppercaseSymbolsAndSpacesAndReturnExpectedStringWhenInputIsSomeUppercaseLetterWords() {
        String expected =   "IT IS MY FIFTH TASK\n" +
                            "\"I\" - 3\n" +
                            "\"T\" - 3\n" +
                            "\" \" - 4\n" +
                            "\"S\" - 2\n" +
                            "\"M\" - 1\n" +
                            "\"Y\" - 1\n" +
                            "\"F\" - 2\n" +
                            "\"H\" - 1\n" +
                            "\"A\" - 1\n" +
                            "\"K\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("IT IS MY FIFTH TASK");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueUpperAndLowercaseSymbolsAndSpacesAndReturnExpectedStringWhenInputIsLowerAndUppercaseLettersWords() {
        String expected =   "It is MY FavouriTe TasK\n" +
                            "\"I\" - 1\n" +
                            "\"t\" - 1\n" +
                            "\" \" - 4\n" +
                            "\"i\" - 2\n" +
                            "\"s\" - 2\n" +
                            "\"M\" - 1\n" +
                            "\"Y\" - 1\n" +
                            "\"F\" - 1\n" +
                            "\"a\" - 2\n" +
                            "\"v\" - 1\n" +
                            "\"o\" - 1\n" +
                            "\"u\" - 1\n" +
                            "\"r\" - 1\n" +
                            "\"T\" - 2\n" +
                            "\"e\" - 1\n" +
                            "\"K\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("It is MY FavouriTe TasK");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueNonLetterSymbolsAndSpacesAndReturnExpectedStringWhenInputIsNonLetterSequences() {
        String expected =   "*#$%^&* &^%$#! ,,.(^#@\n" +
                            "\"*\" - 2\n" +
                            "\"#\" - 3\n" +
                            "\"$\" - 2\n" +
                            "\"%\" - 2\n" +
                            "\"^\" - 3\n" +
                            "\"&\" - 2\n" +
                            "\" \" - 2\n" +
                            "\"!\" - 1\n" +
                            "\",\" - 2\n" +
                            "\".\" - 1\n" +
                            "\"(\" - 1\n" +
                            "\"@\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("*#$%^&* &^%$#! ,,.(^#@");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueSymbolsAndSpacesAndReturnExpectedStringWhenInputIsDifferentSymbolWords() {
        String expected =   "a1Bcd %Te!st& llU&..aI *sI%!se,\n" +
                            "\"a\" - 2\n" +
                            "\"1\" - 1\n" +
                            "\"B\" - 1\n" +
                            "\"c\" - 1\n" +
                            "\"d\" - 1\n" +
                            "\" \" - 3\n" +
                            "\"%\" - 2\n" +
                            "\"T\" - 1\n" +
                            "\"e\" - 2\n" +
                            "\"!\" - 2\n" +
                            "\"s\" - 3\n" +
                            "\"t\" - 1\n" +
                            "\"&\" - 2\n" +
                            "\"l\" - 2\n" +
                            "\"U\" - 1\n" +
                            "\".\" - 2\n" +
                            "\"I\" - 2\n" +
                            "\"*\" - 1\n" +
                            "\",\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("a1Bcd %Te!st& llU&..aI *sI%!se,");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueSymbolsAndSpacesAndReturnExpectedStringWhenInputIsDifferentSymbolWordsSeparatedBySomeSpaces() {
        String expected =   "a1Bcd   %Te!st&  llU&..aI *sI%!se,\n" +
                            "\"a\" - 2\n" +
                            "\"1\" - 1\n" +
                            "\"B\" - 1\n" +
                            "\"c\" - 1\n" +
                            "\"d\" - 1\n" +
                            "\" \" - 6\n" +
                            "\"%\" - 2\n" +
                            "\"T\" - 1\n" +
                            "\"e\" - 2\n" +
                            "\"!\" - 2\n" +
                            "\"s\" - 3\n" +
                            "\"t\" - 1\n" +
                            "\"&\" - 2\n" +
                            "\"l\" - 2\n" +
                            "\"U\" - 1\n" +
                            "\".\" - 2\n" +
                            "\"I\" - 2\n" +
                            "\"*\" - 1\n" +
                            "\",\" - 1\n";
        String actual = charCounter.counterOfUniqueCharacters("a1Bcd   %Te!st&  llU&..aI *sI%!se,");
        assertEquals(expected, actual);
    }

    @Test
    void counterOfUniqueCharacters_ShouldCountNumberOfUniqueSymbolsAndSpacesAndReturnExpectedStringWhenInputIsDifferentStyleWordsSeparatedBySomeSpaces() {
        String expected =   "ihope   THISIS  myLaST Te$t,) !!!!!!!\n" +
                            "\"i\" - 1\n" +
                            "\"h\" - 1\n" +
                            "\"o\" - 1\n" +
                            "\"p\" - 1\n" +
                            "\"e\" - 2\n" +
                            "\" \" - 7\n" +
                            "\"T\" - 3\n" +
                            "\"H\" - 1\n" +
                            "\"I\" - 2\n" +
                            "\"S\" - 3\n" +
                            "\"m\" - 1\n" +
                            "\"y\" - 1\n" +
                            "\"L\" - 1\n" +
                            "\"a\" - 1\n" +
                            "\"$\" - 1\n" +
                            "\"t\" - 1\n" +
                            "\",\" - 1\n" +
                            "\")\" - 1\n" +
                            "\"!\" - 7\n";
        String actual = charCounter.counterOfUniqueCharacters("ihope   THISIS  myLaST Te$t,) !!!!!!!");
        assertEquals(expected, actual);
    }
}