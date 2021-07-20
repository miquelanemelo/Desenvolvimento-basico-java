public class Array {
    public static void main(String[] args) {
        /*array simples*/
        int [] meuArray = {1,6,5,8,15,63};
        for(int i = 0; i< meuArray.length; i++){
            System.out.println("Array Simples: " + meuArray[i]);
        }
        /*array multi*/
        int [][] meuArrayMulti = {{5,6,85,63,12,5}, {8,4,7,5,14,96}};
        for (int i =0; i< meuArrayMulti.length; i++){
            for(int m = 0; m< meuArrayMulti[i].length; m++ ){
                System.out.println("Array Multi " + meuArrayMulti[i][m]);
            }
        }
    }

}
