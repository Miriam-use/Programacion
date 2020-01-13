package Ejercicios32;
import java.util.*;
import java.util.ArrayList;
/**
 * Creamos un Binfo con 1 carton.
 * @author Miriam
 *
 */
public class Main {

public static void main(String[] args) {/*
 /**
  * La clase ArrayList en Java, es una clase que permite almacenar datos en memoria de forma similar a los Arrays   
  
		ArrayList<Carton>bingoList = new ArrayList<Carton>();
	
        for(int i=0; i<1; i++) {
        	Carton bingo=new Carton();
        	bingoList.add(bingo);
        	bingo.syso();
        }*/
        Scanner input=new Scanner(System.in);

        int cartones[][] ,copiaCartones[][],  numCarton, bolas[] = new int [90], numeroLineas[];

        System.out.println("*********************");
        System.out.println("*       BINGO       *");
        System.out.println("*********************\n");

        /**
         * Se pide al usuario cuantos cartones va a jugar y
         * se guarda en la 1ª dimension del array cartones, tambien la copia.
         * El número no puede ser mayor que 1.p
         */

        System.out.print("Introduce el numero de cartones a jugar: ");
        numCarton = input.nextInt();

        while(numCarton < 1)
        {
            System.out.println("El numero no es válido, tiene que ser 2 o mayor a 2.");
            System.out.println("Introduce un nuevo número");
            numCarton = input.nextInt();
        }

        cartones = new int[numCarton][15];
        copiaCartones = new int[numCarton][15];
        numeroLineas = new int[numCarton];
        //Rellena la 2ª dimension del array cartones con numeros aleatorios.
        fillArray(cartones);
        //Copiamos el array, cartones en el array de copiaCartones, para guardar los datos.
        copyArray(cartones, copiaCartones);

        for (int i = 0; i < cartones.length; i++) {
            System.out.println("Carton " + i);
            printArray(i, cartones);
        }

        throwBall(bolas,copiaCartones,cartones,numeroLineas);
    }

    /**
     * Generamos de forma aleatoria los numeros entre 1 y 90 en una funcion llamada "random"
     *
     * @param num es la variable en la que se genera el numero "aleatorio"
     * @return devuelve la variable 'num'
     */
    static int random (int num){
        num = ((int) (1+Math.random() * 90));
        return num;
    }

    /**
     * Con esta funcion rellenamos los cartones
     *
     * @param cartones es el array usado para guardar tanto el nº de cartones, como los numeros del mismo.
     */
    static void fillArray(int cartones[][]) {
        int num = 0;

        //Tenemos un booleano que nos marcará, a través de la funcion checkNumber, si está o no repetido, el numero.
        boolean check = false;

        /**
         * Recorremos el array dandole a la variable num un valor aleatorio a traves de la funcion random y
         * probamos con checkNumber si está o no repetido el numero en el array
         */
        for (int i = 0; i < cartones.length ; i++) {
            for (int j = 0; j < cartones[i].length ; j++) {
                do {
                    num = random(num);
                    check = checkNumber(cartones,num,i);
                }while (check == true);
                cartones[i][j] = num;
            }
            Arrays.sort(cartones[i]);
        }
    }


    /**
     * Copiamos los cartones en otro array llamado copiaCartones para que
     * posteriormente, cada bola que salga, si esta en el carton, se reste y se ponga a 0.
     *
     * @param cartones el array original de los cartones y sus numeros
     * @param copiaCartones , la copia del array original para la comprobacion de los numeros
     */
    static void copyArray (int cartones[][], int copiaCartones[][]){
        for (int i = 0; i < cartones.length ; i++) {
            for (int j = 0; j < cartones[0].length ; j++) {
                copiaCartones[i][j] = cartones[i][j];
            }
        }
    }

    /**
     * Imprime los cartones dandole a cada 5 numeros un salto de linea
     *
     * @param arrayImprimir es el array que se va a imprimir mostrando todos los numeros del carton.
     */
    static void printArray(int i, int arrayImprimir[][]) {

        for (int j = 0; j < arrayImprimir[0].length; j++) {
            System.out.print(arrayImprimir[i][j] + " ");
            if ((j + 1) % 10 == 0 || (j + 1) % 10 == 5) {
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * Comprueba que el numero generado de forma aleatoria no se repita en el carton.
     *
     * @param carton es el array que contiene el nº de cartones y los numeros del mismo en el.
     * @param num es la variable del numero del carton que se va a añadir al carton.
     * @param nCarton es la variable que se usa para recorrer el carton
     * @return devuelve el booleano para que se sepa que el numero esta repetido en el carton y lo descarte.
     */
    static boolean checkNumber (int carton[][],int num,int nCarton){

        //Tenemos un booleano que será el que marcará si está o no repetido el numero
        boolean repetido = false;

        // En el bucle vamos probando que el numero que nos han mandado a la funcion
        // esté repetido en el array, y si lo está marca como verdadero el booleano.
        for (int i = 0; i < carton[nCarton].length ; i++) {
            if (num == carton[nCarton][i]) {
                repetido = true;
            }
        }
        return repetido;
    }

    /**
     * La bola se tira a través de la funcion, que llama a otra funcion @see
     * checkBall para ver si el numero aleatorio generado ha salido antes.
     *
     * Si ha salido, la bola se descarta, si no, se guarda en un array.
     * Una variable nos guarda el numero de bolas que han salido.
     * Imprimimos las bolas y la cantidad
     *
     * @param arraybolas es el array donde estan guardados los numeros de las bolas.
     * @param arrayCopiaCarton es la copia del carton/es del array original.
     * @param cartones
     * @param numeroLineas es la variable utilizada para comprobar el numero de lineas comprobadas que hay en el carton.
     */

    static void throwBall (int arraybolas [],int arrayCopiaCarton[][], int cartones[][],int numeroLineas[]){
        boolean checkBola = false, bingo = false, linea = false;
        int num = 0,contador = 0, contadorLinea = 0;

        do {
            for (int i = 0 ; i < arraybolas.length ; i++) {

                do {
                    num = random(num);
                    checkBola = checkBall(arraybolas, num);
                } while (checkBola == true);
                arraybolas[i] = num;
                contador++;
                System.out.println();
                System.out.println("Bola " + num);
                System.out.println();
                restaNumeroCopiaArray(num, arrayCopiaCarton);
                for (int j = 0; j < cartones.length; j++) {
                    linea = checkLinea(j, arrayCopiaCarton, cartones, numeroLineas);
                    if (linea == true) {
                        numeroLineas[j] += 1;
                    }
                    if (numeroLineas[j] > 2){
                        bingo = checkBingo(j,arrayCopiaCarton,cartones);
                        if (bingo == true){
                            i = arraybolas.length - 1;
                            j = cartones.length - 1;
                        }
                    }
                }
            }
        }while (bingo == false);
        System.out.println();
        System.out.println();
        System.out.println("Han salido " + contador + " bolas:");
        System.out.println();
        for (int i = 0; i < arraybolas.length ; i++) {
            if (arraybolas[i] != 0) {
                System.out.printf("%3d", arraybolas[i]);
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    /**
     * Con esta funcion probamos si la bola es repetida o no. Para ello recorremos el array probando si el numero
     * dado por la funcion random es igual al que haya en el array. Si lo es ponemos un booleano a true y hacemos en
     * throwBall que nos de otra bola.
     *
     * @param cheakArray variable utilizada para comprobar el array que se llame en la funcion.
     * @param num es el numero que se va a comprobar.
     * @return devuelve el booleano que comprueba si la bola esta repetida u no.
     */
    static boolean checkBall (int cheakArray [], int num){
        boolean repetido = false;

        for (int i = 0; i <cheakArray.length ; i++) {
            if (num == cheakArray[i]) {
                repetido = true;
            }
        }
        return repetido;
    }

    /**
     * Pone a 0 las bolas que hayan salido en una copia de los cartones para su posterior comprobacion
     * Primero prueba si es bingo en una una funcion llamada chackBingo, y si no hay bingo probamos en la funcion
     * checkLinea si hay linea, y si hay linea, poneamos el booleano de linea a
     * true para que no vuelva a comprobar si hay linea.
     *
     * @param numeroBola es la variable para comprobar el numero de la bola.
     * @param copiaCarton es el array copia del array de los cartones, usado para la comprobacion de los numeros.
     * @return
     */
    static void restaNumeroCopiaArray (int numeroBola, int copiaCarton[][]) {
        boolean linea = false;

        for (int i = 0; i < copiaCarton.length; i++) {
            for (int j = 0; j < copiaCarton[i].length; j++) {
                if (numeroBola == copiaCarton[i][j]) {
                    copiaCarton[i][j] = 0;
                }
            }
        }
    }

    /**
     * Esta funcion nos prueba si hay bingo.
     * Para ello, comprobamos si la suma de los numeros del carton = 1500 y si lo es, es que hay bingo.
     * Lo especificamos en una variable booleana y nos mostrará por pantalla un mensaje
     * cantando el bingo y el cartón ganador.
     *
     * @param i es la variable utilizada para mostrar el nº del carton ganador.
     * @param copiaCarton la copia del carton para recorrerla.
     * @param cartones es utilizada para su impresion.
     * @return devuelve un booleano para la funcion de tirar las bolas, para saber cuando es necesario parar.
     */
    static boolean checkBingo(int i, int copiaCarton[][], int cartones[][]) {
        boolean bingo = false;
        int controlador = 0;

        for (int j = 0; j < copiaCarton[i].length; j++) {
            controlador = controlador + copiaCarton[i][j];
        }

        if (controlador == 1500) {
            bingo = true;
            System.out.println();
            System.out.printf("Bingo para el carton " + i + " con los numeros ");
            System.out.println();
            System.out.println();
            printArray(i,cartones);
        }
        return bingo;
    }

    /**
     *
     * Esta funcion nos prueba si las bolas que hayan salido hacen linea en algun carton.
     * Para ello, comprobamos cada 5 numeros si la suma de ellos es = 0 y si el resultado es 0 es que hay linea.
     * Lo especificamos en una variable booleana y mostramos un mensaje por pantalla que canta la linea y
     * nos dice qué carton ha tenido linea.
     * Ponemos los numeros de la linea a 100 para que la linea no se vuelva a comprobar. Aumentamos en el array
     * numeroLineas +1 en la posicion que nos marque la variable i para que cuando sea mayor o igual que 2 no cante
     * la linea y cante directamente el bingo.
     *
     * @param i es la variable que se utiliza para recorrer los array
     * @param copiaCartones la copia de los arrays utilizadas para comprobar el numero de las mismas.
     * @param cartones los arrays originales utilizados para imprimir cual es el numero del carton ganador.
     * @param numeroLineas variable utilizada para comprobar el numero de lineas de los cartones y si son el ganador.
     * @return devuelve la comprobacion de las lineas para ver si el carton comprobado hace linea u bingo.
     */
    static boolean checkLinea (int i,int copiaCartones[][], int cartones[][],int numeroLineas[]) {
        boolean checkLinea = false;
        int linea = 0;


        linea = copiaCartones[i][0] + copiaCartones[i][1] + copiaCartones[i][2] + copiaCartones[i][3] + copiaCartones[i][4];
        if (linea == 0) {
            checkLinea = true;
            copiaCartones[i][0] = 100;
            copiaCartones[i][1] = 100;
            copiaCartones[i][2] = 100;
            copiaCartones[i][3] = 100;
            copiaCartones[i][4] = 100;

        } else {
            linea = copiaCartones[i][5] + copiaCartones[i][6] + copiaCartones[i][7] + copiaCartones[i][8] + copiaCartones[i][9];
            if (linea == 0) {
                checkLinea = true;
                copiaCartones[i][5] = 100;
                copiaCartones[i][6] = 100;
                copiaCartones[i][7] = 100;
                copiaCartones[i][8] = 100;
                copiaCartones[i][9] = 100;

            } else {
                linea = copiaCartones[i][10] + copiaCartones[i][11] + copiaCartones[i][12] + copiaCartones[i][13] + copiaCartones[i][14];
                if (linea == 0) {
                    checkLinea = true;
                    copiaCartones[i][10] = 100;
                    copiaCartones[i][11] = 100;
                    copiaCartones[i][12] = 100;
                    copiaCartones[i][13] = 100;
                    copiaCartones[i][14] = 100;

                }
            }
        }
        if (numeroLineas[i] < 2) {
            if (checkLinea == true) {
                System.out.println();
                System.out.println("Hay linea en el carton " + i);

                printArray(i,cartones);

                System.out.println();
            }
        }
        return checkLinea;
    }
}
