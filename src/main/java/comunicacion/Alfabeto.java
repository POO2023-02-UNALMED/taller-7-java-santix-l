package comunicacion;

public class Alfabeto extends Pictograma {
	
	private static String[] letras;
	private String interpretacion;
	
	

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		
		return letras.length;
	}

	@Override
	public String interpretacion() {
		
		return this.interpretacion;
	}

	@Override
	public String toString() {
		String cadena = null;
		for (String letra: letras) {
			
			if(letra.equals("z")) {
				
				cadena += letra;
			}
			
			else {
			cadena += letra + ", ";
			}
		}
			
		return cadena;
	}

	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
