public class Mocnina {
    public static void main(String[] args) {
        int e;
        int vysledok;

        for(int i=0; i<10; i++){
            vysledok = 1;
            e = i;
            while (e > 0){
                vysledok *= 2;
                e--;
            }
            System.out.println("Čislo 2 umocnene cislom" + i + "sa rovna" +vysledok);
        }
    }


}
