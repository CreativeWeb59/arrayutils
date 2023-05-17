package fr.semifir;

public class AnagramChecker {
    public boolean isAnagram(String chaine1, String chaine2){
        // teste la taille des chaines de caratères
        if((!compareTailleChaine(chaine1, chaine2)) || (!chaineVide(chaine1, chaine2))){
            return false;
        } else {
            return compareChaines(chaine1, chaine2);
        }

    }

    private boolean compareTailleChaine(String chaine1, String chaine2){
         return chaine1.length() == chaine2.length();
    }

    /**
     * Compare les deux chaines de caracctere
     * @param chaine1
     * @param chaine2
     * @return true si c'est un anagramme
     */
    private boolean compareChaines(String chaine1, String chaine2){
        // parcours la premiere chaine
        // stocke le premier caractere
        // verifie avec chaque lettre de la 2ème chaine
        // retourne false si au moins une ne correspond pas
        // on va reconstruire la chaine à partir de la 2ème
        // et verifier que c'est la meme que la premiere
        String nouvChaine ="";

        for (int i = 0; i < chaine1.length(); i++) {
            char char1 = chaine1.charAt(i);
            for (int j = 0; j < chaine2.length(); j++) {
                if(char1 == chaine2.charAt(j)){
                    nouvChaine += char1;
                    break;
                }
            }
        }
        return chaine1.equals(nouvChaine);
    }

    /**
     * Teste la longueur des chaines de caratères
     * @param chaine1
     * @param chaine2
     * @return false si l'une des deux chaines est vide
     */
    private boolean chaineVide(String chaine1, String chaine2){
        return (chaine1.length() != 0 && chaine2.length() != 0);
    }
}
