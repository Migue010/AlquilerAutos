
public class Empresa {
	private int corte;
	private int tintura;
	private int cepillado;
	private int peinado;
	
	
	public  Empresa(){
		corte=0;
		tintura=0;
		cepillado=0;
		peinado=0;
		
	}
	
	public void sumarServicioCorte(){
		corte++;
	}
	
	public void getServicioTintura(){
		tintura++;
	}
	
	public void getServicioCepillado(){
		cepillado++;
	}
	
	
	public void getServicioPeinado(){
		peinado++;
	}
	
	public int serviciocorte(){
		return corte;
	}
	
	public int setServicioTintura(){
		return tintura;
	}
	
	public int setServicioCepillado(){
		return cepillado;
	}
	
	public int setServicioPeinado(){
		return peinado;
	}
	

	
	public void reiniciar(){
		corte=0;
		tintura=0;
		cepillado=0;
		peinado=0;
	}

}
