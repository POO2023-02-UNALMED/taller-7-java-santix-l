package comunicacion;

public class Tesis extends Escrito {
	
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
			String conclusion, String referencias, String interpretacion) {
		
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		
		return this.getPaginas()*palabrasPagina*5;
	}

	@Override
	String interpretacion() {
	
		return this.interpretacion;
	}

	@Override
	public String toString() {
		
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.idea + "\n";
		r += Tesis.argumentos.length + "\n";
		r += this.conclusion+ "\n";
		r += this.referencias;
		return  r;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
