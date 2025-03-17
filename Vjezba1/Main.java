public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 10000; i++){
            int armstrongovBroj = 0;
            int zbrojZnamenki = 0;
            if(i > 0){
                int znamenka;
                int brojZnamenki = 1;
                if(i > 10 && i < 100){
                    brojZnamenki = 2;
                } else if (i >= 100 && i < 1000 ){
                    brojZnamenki = 3;
                } else if (i>=1000 ) {
                    brojZnamenki = 4;
                }
                int broj = i;
                for(int j = 0; j < brojZnamenki; j++){
                    znamenka = ( broj % 10);
                    broj = broj / 10;
                    if(znamenka > 0){
                        int ostatak = broj % znamenka;
                        if (ostatak > 0 && brojZnamenki == 1){
                            broj = ostatak;
                        }
                        zbrojZnamenki += (int)Math.pow(znamenka, brojZnamenki);
                    }
                }
                if(zbrojZnamenki == i){
                    armstrongovBroj = i;
                }
            }
            if(armstrongovBroj > 0) System.out.println(armstrongovBroj);
        }
    }
}
