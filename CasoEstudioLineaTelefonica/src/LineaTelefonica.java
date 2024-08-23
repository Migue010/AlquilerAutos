public class LineaTelefonica {
	protected int numeroLlamadas;
	protected int numeroMinutos;
	private double costoLlamadas;
	
	
	public LineaTelefonica() {

	}
	public void reiniciar(){
		numeroLlamadas=0;
		numeroMinutos=0;
		costoLlamadas=0;
		
	}
	public double darCostoLlamadas() {
		return costoLlamadas;
	}
	public int darNumeroLlamadas() {
		return numeroLlamadas;
	}
	public int darNumeroMinutos() {
		return numeroMinutos;
	}
	public double modificarCostoLlamada() {
		return costoLlamadas;
	}
	public void modificarCostoLlamada(double pCostoLlamada) {
		this.costoLlamadas= costoLlamadas+pCostoLlamada;
	}
	public void agregarLlamadaLocal(int minutos) {
		numeroLlamadas ++;
		numeroMinutos += minutos;
		costoLlamadas = costoLlamadas + (minutos*35);
	}
	public void agregarLlamadaLargaDistancia(int minutos) {
		numeroLlamadas ++;
		numeroMinutos += minutos;
		costoLlamadas = costoLlamadas + (minutos*380);
	}
	public void agregarLlamadaCelular(int minutos) {
		numeroLlamadas ++;
		numeroMinutos += minutos;
		costoLlamadas = costoLlamadas + (minutos*999);
	}
}