package ejercicio1_6;

public class Main {

	public void lanzarSumador(Integer n1, Integer n2){
    String clase="ejercicio1_6.Suma";
    ProcessBuilder pb;
    try {
            pb = new ProcessBuilder(
                            "java",clase,
                            n1.toString(),
                            n2.toString());
            pb.start();
    } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    }
}
	
	public static void main(String[] args) {
		
		Main l=new Main();
        l.lanzarSumador(1, 51);
        l.lanzarSumador(51, 100);
        System.out.println("Ok");
	}

}
