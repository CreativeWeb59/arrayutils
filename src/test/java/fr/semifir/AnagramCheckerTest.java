package fr.semifir;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AnagramCheckerTest {
    @Test
    public void verifierAnagrammeVrai(){
        AnagramChecker anagramChecker;
        String chaine1 = "migraine";
        String chaine2 = "imaginer";
        boolean expected = true;
        boolean resultat;
        Given:
        anagramChecker = new AnagramChecker();
        When:
        resultat = anagramChecker.isAnagram(chaine1, chaine2);
        Then:
        assertEquals(expected, resultat, "Les deux chaines ne sont pas des anagrammes");
    }
//    @Test
//    public void verifierAnagrammeFaux(){
//        AnagramChecker anagramChecker;
//        String chaine1 = "chaine";
//        String chaine2 = "hainee";
//        boolean expected = false;
//        boolean resultat;
//        Given:
//        anagramChecker = new AnagramChecker();
//        When:
//        resultat = anagramChecker.isAnagram(chaine1, chaine2);
//        Then:
//        assertEquals(expected, resultat, "Les deux chaines ne sont pas des anagrammes");
//    }

    @Test
    public void verifierTailleDesChaines(){
        AnagramChecker anagramChecker;
        String chaine1 = "migraine";
        String chaine2 = "imagine";
        boolean resultat;
        Given:
        anagramChecker = new AnagramChecker();
        When:
        resultat = anagramChecker.isAnagram(chaine1, chaine2);
        Then:
        assertFalse(resultat);
    }
    @Test
    public void verifierChaineVides(){
        AnagramChecker anagramChecker;
        String chaine1 = "gfhfh";
        String chaine2 = "";
        boolean resultat;
        Given:
        anagramChecker = new AnagramChecker();
        When:
        resultat = anagramChecker.isAnagram(chaine1, chaine2);
        Then:
        assertFalse(resultat);
    }
}
