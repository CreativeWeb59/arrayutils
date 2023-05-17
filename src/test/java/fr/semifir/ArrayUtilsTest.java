package fr.semifir;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {
    @Test
    public void VerifierMaximum(){
        ArrayUtils arrayUtils;
        int valeurs[] = {2, 4, 5, 8};
        int expected = 8;
        int resultat;
        Given:
        arrayUtils = new ArrayUtils();
        When:
        resultat = arrayUtils.findMaximum(valeurs);
        Then:
        assertEquals(expected, resultat, "Le nombre le plus elevé doit être 5");
    }

    @Test
    public void VerifierMaximumPositifs(){
        ArrayUtils arrayUtils;
        int valeurs[] = {2, 4, 5, 5};
        int expected = 5;
        int resultat;
        Given:
        arrayUtils = new ArrayUtils();
        When:
        resultat = arrayUtils.findMaximum(valeurs);
        Then:
        assertEquals(expected, resultat, "Le nombre le plus elevé doit être 5 avec posifits");
    }

    @Test
    public void VerifierMaximumNegatifs(){
        ArrayUtils arrayUtils;
        int valeurs[] = {-2, -4, -5};
        int expected = -2;
        int resultat;
        Given:
        arrayUtils = new ArrayUtils();
        When:
        resultat = arrayUtils.findMaximum(valeurs);
        Then:
        assertEquals(expected, resultat, "Le nombre le plus elevé doit être 5 avec negatifs");
    }
    @Test
    @DisplayName("Test tableau vide")
    public void VerifierTableauVide(){
        ArrayUtils arrayUtils;
        int valeurs[] = {};
        int expected = 0;
        int resultat;
        Given:
        arrayUtils = new ArrayUtils();
        When:
        resultat = arrayUtils.findMaximum(valeurs);
        Then:
        assertEquals(expected, resultat, "Le tableau est vide");
        // assertThrows(IllegalArgumentException.class, ()-> arrayUtils.findMaximum(valeurs));
    }

}
