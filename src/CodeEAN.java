public class CodeEAN {

    // La methode qui permet de calculer la cle
    public int keyCalculate(int[] n) {
        int som = 0;
        int key = 0;
        int j = 0;

        if (n.length != 12) {
            return 0;
        }

        for (int i = 0; i < n.length; i++){
            som = som + n[i] * (isOdd(i+1) ? 3 : 1);
            // System.out.println(som);
        }

        // Dans le cas ou la somme n'est pas multiple de 10, je cherche donc le petit multiple de 10
        if (som % 10 != 0){
            while (((som % 10) + j) % 10  != 0){
                j = j+1;
            }
            key = j;
        }

        return key;
    }

    // La methode pour verifier la validite de la cle
    public void isValidKey(int[] n){
        if (keyCalculate(n) != 8){
            System.out.println("Le code n'est pas valide");
        }
        else {
            System.out.println("Le code est valide");;
        }
    }

    // J'ai constate qu'on alterne les chifres 1 et 3 si le nombre est impaire on multiplie par 1 sinon par 3
    // La methode qui me permet de verifier le type de nombre
    public boolean isOdd(int num){
        boolean odd = false;

        if (num == 1){
            return false;
        }

        if (num % 2 == 0){
            odd = true;
        }

        return odd;
    }
}
