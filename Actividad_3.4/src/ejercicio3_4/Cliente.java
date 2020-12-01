package ejercicio3_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	static String HOST = "localhost";
    static int PUERTO = 5000;
    Socket sc;
    DataOutputStream salida;
    DataInputStream entrada;
    int mensajeRecibido;

    public void initCliente(){
        Scanner teclado = new Scanner(System.in);
        try{
            sc = new Socket(HOST, PUERTO);
            salida = new DataOutputStream(sc.getOutputStream());
            entrada = new DataInputStream(sc.getInputStream());
            String msn = "";
            while(!msn.equals("x")){
                System.out.println("Escriba un numero");
                msn = teclado.nextLine().toLowerCase();
                salida.writeUTF(msn);//enviamos mensaje
                mensajeRecibido = entrada.available();//Leemos respuesta
                System.out.println(mensajeRecibido);
            }
            
            sc.close();
        }catch(Exception e){

        }
    }

    public static void main(String[] args){
        Cliente o = new Cliente();
        o.initCliente();
    }
}
