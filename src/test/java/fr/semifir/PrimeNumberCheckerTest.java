package fr.semifir;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCheckerTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199})
    public void verifierPrimeNumberChecker(int nombre){
        PrimeNumberChecker primeNumberChecker;
        //int nombre = 7;
        boolean resultat;
        Given:
        primeNumberChecker = new PrimeNumberChecker();
        When:
        resultat = primeNumberChecker.isPrime(nombre);
        Then:
        assertTrue(resultat);
    }

    @Test
    public void verifierPrimeNumberNegatif(){
        PrimeNumberChecker primeNumberChecker;
        int nombre = -4;
        boolean expected = false;
        boolean resultat;
        Given:
        primeNumberChecker = new PrimeNumberChecker();
        When:
        resultat = primeNumberChecker.isPrime(nombre);
        Then:
        assertFalse(resultat);
    }

    @Test
    public void verifierPrimeNumberZero(){
        PrimeNumberChecker primeNumberChecker;
        int nombre = 0;
        boolean expected = false;
        boolean resultat;
        Given:
        primeNumberChecker = new PrimeNumberChecker();
        When:
        resultat = primeNumberChecker.isPrime(nombre);
        Then:
        assertFalse(resultat);
    }
    @Test
    public void verifierPrimeNumberUn(){
        PrimeNumberChecker primeNumberChecker;
        int nombre = 1;
        boolean expected = false;
        boolean resultat;
        Given:
        primeNumberChecker = new PrimeNumberChecker();
        When:
        resultat = primeNumberChecker.isPrime(nombre);
        Then:
        assertFalse(resultat);
    }
}
