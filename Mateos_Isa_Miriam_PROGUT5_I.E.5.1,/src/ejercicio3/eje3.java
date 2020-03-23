package ejercicio3;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * 
 * @author Miriam
 *
 */
public class eje3 {

	public static void main(String[] args){
		FileInputStream f=null;
		String s="";
		char c;
		try{
			f=new FileInputStream("a.txt");
			int size = f.available();
			for (int i=0;i<size;i++){
				c=(char)f.read();
				s=s+c;
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println(s);
			try{
				f.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

