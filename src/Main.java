public class Main {
    public static void main(String[] args) {
        CodeEAN codeEAN = new CodeEAN();

        // Le tableau propose dans l'enoce
        int[] n = {1,2,3,4,5,6,7,8,9,0,1,2};

        // System.out.println(codeEAN.keyCalculate(n));
        codeEAN.isValidKey(n);
    }
}