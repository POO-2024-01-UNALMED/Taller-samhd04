package comunicacion;

public class Alfabeto extends Pictograma {
	
	private static String[] letras;
	private String interpretacion;

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}

	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		String newAlfabeto = "";
		
		for(int i = 0; i < alfabeto.length(); i++) {
			String subString = alfabeto.charAt(i) + ", ";
			
			if(i == 25) {
				subString = String.valueOf(alfabeto.charAt(i));
			}
			
			newAlfabeto += subString;
		}
		
		return newAlfabeto;
	}
	
	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
