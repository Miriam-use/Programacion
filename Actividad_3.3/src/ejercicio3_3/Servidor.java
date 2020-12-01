package ejercicio3_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	static int PUERTO = 5000;
    ServerSocket sc;
    Socket so;
    DataOutputStream salida;
    DataInputStream entrada;
    String mensajeRecibido;

    public void initServidor(){
        
        Scanner teclado = new Scanner(System.in);
        try{
            sc = new ServerSocket(PUERTO);
            so = new Socket();
            
            System.out.println("Esperando conexi�n...");
            so = sc.accept();
            System.out.println("Se conecto uno...");
            entrada = new DataInputStream(so.getInputStream());
            salida = new DataOutputStream(so.getOutputStream());
            String msn = "";
            while(!msn.equals("x")){
                
                mensajeRecibido = entrada.readUTF();//Leemos respuesta
                System.out.println(mensajeRecibido);
                System.out.println("Escriba un msn para enviar");
                msn = teclado.nextLine().toLowerCase();
                salida.writeUTF(""+msn);//enviamos mensaje

            }
            sc.close();
        }catch(Exception e){

        }
    }
    
    public static void main(String[] args){
        Servidor o = new Servidor();
        o.initServidor();
    }
}
