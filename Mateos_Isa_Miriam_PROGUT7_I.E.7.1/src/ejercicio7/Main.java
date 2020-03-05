package ejercicio7;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Main {

	public static void main(String[] args) {

		Empleado as= new Asalariados("",0,2520000);
        EmpleadosPorHoras eh=new EmpleadosPorHoras("", 0, 0, 0);
        EmpleadosPorComision ec=new EmpleadosPorComision("", 0, 0,0);
        AsalariadosPorComision ac=new AsalariadosPorComision("", 0, 0, 0);
        Scanner sc=new Scanner(System.in);
        int numero =1;
      
      
      
        while(numero<=5){
        System.out.println("ingrese la opcion :\n1) Asalariados 2)Empleados por hora" +
                " 3)Empleado por comision" +
                " 4)Asalariado por comision" +
                " 5)salir de la aplicacion");
        int op= sc.nextInt();
      
        if (op==1){
            System.out.println("ingrese su nombre:");
            as.setNombre(sc.next());
            System.out.println("ingrese su identificacion");
            as.setIdentificacion(sc.nextInt());
        System.out.println("nombre:"+as.getNombre()+"\nid:"+as.getIdentificacion());
      
        as.pagar();
      
        numero ++;
        }
   
        if (op==2){
            System.out.println("ingrese su nombre:");
            as.setNombre(sc.next());
            System.out.println("ingrese su identificacion");
            as.setIdentificacion(sc.nextInt());
          
            System.out.println("ingrese el numero de horas trabajadas");
            eh.setHora(sc.nextInt());
          
            System.out.println("nombre:"+as.getNombre()+"\nid:"+as.getIdentificacion());
          
            eh.pagar();
            numero ++;
      
        }
      
   
        if (op==3){
            System.out.println("ingrese su nombre:");
            as.setNombre(sc.next());
            System.out.println("ingrese su identificacion");
            as.setIdentificacion(sc.nextInt());
          
            System.out.println("ingrese el valor de las ventas hechas");
            ec.setPorcentaje(sc.nextDouble());
          
            System.out.println("nombre:"+as.getNombre()+"\nid:"+as.getIdentificacion());
            ec.pagar();
            numero++;
        }
   
        if (op==4){
            System.out.println("ingrese su nombre:");
            as.setNombre(sc.next());
            System.out.println("ingrese su identificacion");
            as.setIdentificacion(sc.nextInt());
          
            System.out.println("ingrese el valor de las ventas hechas");
            ac.setPorcentaje(sc.nextDouble());
          
            System.out.println("nombre:"+as.getNombre()+"\nid:"+as.getIdentificacion());
            ac.pagar();
            numero ++;
        }
      
        if (op==5){
            System.out.println("gracias por utilizar la aplicacion");
            break;
        }
      
      
        }
   
   
   
    }
   

}
