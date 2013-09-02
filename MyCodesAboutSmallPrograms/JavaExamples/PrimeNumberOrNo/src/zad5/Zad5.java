package zad5;

public class Zad5 {
    
     private static int nLimit=10000;
     
     public Zad5(int number)
     {
         
     }

    public boolean isPrime(int number) {
        int divider;
        divider=number%10;
        if(divider==2){
            return true;
        }
        if(divider==3){
            return true;
        }
        if(divider==5){
            return true;
        }
        if(divider==7){
            return true;
        }
        else {
            return false;
        }
        
    }

    public static void main(String[] args) {
        for(int i=0;i<=nLimit;i++)
        {
            int p=1;
            Zad5 test=new Zad5(i);
            if(test.isPrime(i)==true){
            System.out.printf("The number is prime %d%n",i);
        }
            else {
               
            }
            p++;
    }
}
}
