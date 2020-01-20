package com.company;

public class Main {

    public static void main(String[] args) {

        //modulopDodawanie(6, 15, 6);
        modulopmnożenie(111, 103, -37);
        //równanieKongruencyjne(103 , 1, 111);

        //rozwiazanie(111,1, 103);

        //LECIMYZKURWAMI();


    }

    public static void modulopmnożenie(int a, int p, int b)
    {
        for(int i=0; i<p; i++){
            if((i*a)%p==b){
                System.out.println("1.Odpowiedź to: " + i);
            }
        }
    }

    public static void modulopDodawanie(int a, int p, int b)
    {
        for(int i=0; i<p; i++){
            if((i+a)%p==b){
                System.out.println("2.Odpowiedź to: " + i);
            }
        }
    }

    public static void równanieKongruencyjne(int a, int b, int p)
    {
        for(int i=0; i<p; i++){
            if((a*i-b)%p==0){
                System.out.println("3. Odpowiedź to: " + i);
            }
        }
    }

    public static void LECIMYZKURWAMI(){
        for(int i=-1000; i<1000; i++ ){
            if((1 +1641*i)%1589==0){
                System.out.println(i);
                int b = (i*1641-1)/1589;
                System.out.println("Liczba b to: " + b);
            }
        }

    }



}
