package Ejercicio3;

public class Libro {

	private String titulo, autor, isbn, lugar, ciudad, pais;
	private int edicion, paginas, dia, mes, a�o;
	
	Libro(String t, String a, String i, String c, String p){
		this.titulo=t;
		this.autor=a;
		this.isbn=i;
		this.ciudad=c;
		this.pais=p;
	}
	
	public void setTitulo(String t) {
		this.titulo=t;
	}
	
	public void setAutor(String a) {
		this.autor=a;
	}
	
	public void setISBN(String i) {
		this.isbn=i;
	}
	
	public void setLugar(String c, String p) {
		this.ciudad=c;
		this.pais=p;
	}
	
	public String getLugar() {
		return ciudad+", "+pais;
	}
	
	public void setEdicion(int e) {
		this.edicion=e;
	}
	
	public void setFecha(int di, int me, int an) {
		this.dia=di;
		this.mes=me;
		this.a�o=an;
	}
	
	public String getFecha() {
		if(mes==1) {
			return "Enero "+dia+" de "+a�o;
		}else {
			if(mes==2) {
				return "Febrero "+dia+" de "+a�o;
			}else {
				if(mes==3) {
					return "Marzo "+dia+" de "+a�o;
				}else {
					if(mes==4) {
						return "Abril "+dia+" de "+a�o;
					}else {
						if(mes==5) {
							return "Mayo "+dia+" de "+a�o;
						}else {
							if(mes==6) {
								return "Junio "+dia+" de "+a�o;
							}else {
								if(mes==7) {
									return "Julio "+dia+" de "+a�o;
								}else {
									if(mes==8) {
										return "Agosto "+dia+" de "+a�o;
									}else {
										if(mes==9) {
											return "Septiembre "+dia+" de "+a�o;
										}else {
											if(mes==10) {
												return "Octubre "+dia+" de "+a�o;
											}else {
												if(mes==11) {
													return "Noviembre "+dia+" de "+a�o;
												}else {
													if(mes==12) {
														return "Diciembre "+dia+" de "+a�o;
													}else {
														return "Mes erroneo";
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	public void setPagina(int p) {
		this.paginas=p;
	}
	
	public String getMostrar() {
		return "T�tulo: "+titulo+"\n"+edicion+"a. edici�n \nAutor: "+autor+
				"\nISBN: "+isbn+"\n"+getLugar()+"\n"+getFecha()+"\n"+paginas+" p�ginas";
	}
}
