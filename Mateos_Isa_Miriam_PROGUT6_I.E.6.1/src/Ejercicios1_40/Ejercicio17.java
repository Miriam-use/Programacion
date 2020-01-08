package Ejercicios1_40;

public class Ejercicio17 {

	public static void main(String[] args) {

		int cnp = 0;
        int num[] = new int[10];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
            int res = 0;
            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    res++;
                }
            }
            if (res == 2) {
                cnp++;
                System.out.println("numero primo = " + num[i]);
            }
 
        }
        System.out.println("La cantidad de numeros primos es: " + cnp);
	}
}
