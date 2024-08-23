
public class Peluqueria {
	
	private double valorTotal;
	private int cantidadServicios;
	
	public  Peluqueria(){
		valorTotal =0;
		cantidadServicios =0;
	}
	
	
	public double capturarValorTotal(){
		return valorTotal;
	}
	
	public int capturarCantidadServicios(){
		return cantidadServicios;
	}
	
	public void agregarServicio(double valor){
		cantidadServicios ++;
		valorTotal=valorTotal+valor;
	}
	
	public void reiniciar(){
		valorTotal =0;
	   cantidadServicios=0;
	   
	}

}
