

public class LineaCelular extends LineaTelefonica{
	private int numeroMinutosLocal;
	private int numeroMinutosCelular;
	private double saldoDisponibleLocal;
	private double costoLlamadas;
	
	
	public LineaCelular() {
		numeroMinutosLocal = 0;
		numeroMinutosCelular = 0;
		saldoDisponibleLocal = 50000;
		
	}
	
	public double darSaldoDisponibleLocal() {
		return saldoDisponibleLocal;
	}
	public int darNumeroMinutosCelular() {
		return numeroMinutosCelular;
	}
	public int darNumeroMinutosLocal() {
		return numeroMinutosLocal;
	}
	public double calcularCostoLlamadasLocal() {
		return saldoDisponibleLocal;
	}
	public void agregarLlamadaLocal(int minutos) {
		numeroMinutosLocal += minutos;
		costoLlamadas += (minutos+20);
		modificarCostoLlamada(costoLlamadas);
		saldoDisponibleLocal = saldoDisponibleLocal - (minutos * 20);
		numeroLlamadas ++;
	}
	public void agregarLlamadaCelular(int minutos) {
		numeroLlamadas ++;
		numeroMinutosCelular += minutos;
		costoLlamadas += (minutos+10);
		modificarCostoLlamada(costoLlamadas);
	}
}
