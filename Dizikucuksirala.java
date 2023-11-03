
package dizikucuksirala;

import java.util.Scanner;

public class Dizikucuksirala {


    public static void main(String[] args) {
        int [] dizi =  new int[10];
        
        int i,j,k,gecici=0;
        Scanner scan = new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.println("bir sayi giriniz:");
            dizi[i] = scan.nextInt();
        }
        for(i=0;i<9;i++){
            for(j=i+1;j<10;j++){
                if(dizi[i]>dizi[j]){
                    gecici = dizi[j];
                    dizi[j] = dizi[i];
                    dizi[i] = gecici;
                }
            }
        }
        for(i=0;i<10;i++){
            System.out.println("dizinin" +(i+1) +".elemani:"+dizi[i]);
        }
    }
    
}
