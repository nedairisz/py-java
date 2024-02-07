package tombnelkul;

import java.util.Scanner;

public class ElemiProgTetelek {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       //ÖSSZEGZÉS
       
       //System.out.print("szám: ");
       //int s = sc.nextInt();
       //System.out.println("s = " +(s+3));
       
       int n = 4;
       while (n<0){
           System.out.print("N= ");     //n=int(input("N= "))
           n = sc.nextInt();
       }
       int ossz = 0;
       for (int i=0; i<n+1; i++){
           ossz += i;
       }
       System.out.printf("Az elso %d szám összege: %d\n", n, ossz);
        
       //KIVÁLASZTÁS
        int db =0;
        for (int i=10; i<100; i++){
            if (i % 2 == 0){
                db++;
            }  
        }
        System.out.printf("Kétjegyű párosak száma: %d\n", db);
        
        //MINIMUM KIVÁLASZTÁS
        int VEGE = 0;
        db =0;
        int min = Integer.MAX_VALUE;//2147483647;
        int szam;
        System.out.print(VEGE+"-ra/re kilép: ");
        while((szam = sc.nextInt()) != VEGE)
        {
            if (szam < min){
                min=szam;
            }
            db++; //db +=1;
        }
        System.out.printf("%d számból a legkisebb: %d\n", db, min);
    }//main vége
    
}//class vége
