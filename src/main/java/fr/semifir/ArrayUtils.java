package fr.semifir;

public class ArrayUtils {
    public int findMaximum(int... tabInt){
        // teste si tableau vide
        if(!tableauVide(tabInt)){
            return 0;
        } else {
            return findInt(tabInt);
        }
    }

    private boolean tableauVide(int [] tabInt){
        if (tabInt.length == 0) {
            return false;
        }
        return true;
    }

    private int findInt(int[] tabInt){
        int resultat = Integer.MIN_VALUE;
        for (int element : tabInt  ) {
            if (resultat < element){
                resultat = element;
            }
        }
        return resultat;
    }
}
