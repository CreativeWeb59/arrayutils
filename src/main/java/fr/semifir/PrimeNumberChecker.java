package fr.semifir;

public class PrimeNumberChecker {
    public boolean isPrime(int nombre){
        if (!isPositif(nombre) || (isZero(nombre) || (isUn(nombre)))){
            return false;
        } else {
            return calculPrimeNumber(nombre);
        }
    }

    /**
     * Calcule si un nombre est un nombre premier
     * Un nombre premier est un nombre entier supérieur à 1 qui n'a aucun diviseur autre que 1 et lui-même.
     * @param number
     * @return true si c'est le cas
     */
    private boolean calculPrimeNumber(int number){
        boolean resultat = true;
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                resultat = false;
            }
        }
        return resultat;
    }

    /**
     * Teste si un nombre est positif
     * @param nombre
     * @return true si positif
     */
    private boolean isPositif(int nombre){
        return nombre>=0 ;
    }

    /**
     * Teste si un nombre égale 0
     * @param nombre
     * @return true si vrai
     */
    private boolean isZero(int nombre){
        return nombre == 0 ;
    }

    private boolean isUn(int nombre){
        return nombre == 1 ;
    }
}
