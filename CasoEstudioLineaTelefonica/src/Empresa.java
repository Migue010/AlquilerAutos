

public class Empresa {
	

		private LineaTelefonica linea1;
		private LineaTelefonica linea2;
		private LineaTelefonica linea3;
		
		private LineaCelular lineaCelular1;
		
		public Empresa () {
			linea1 = new LineaTelefonica();
			linea2 = new LineaTelefonica();
			linea3 = new LineaTelefonica();
			lineaCelular1 = new LineaCelular();
		}
		
		public LineaTelefonica darLinea1() {
			return linea1;
		}
		public LineaTelefonica darLinea2() {
			return linea2;
		}
		public LineaTelefonica darLinea3() {
			return linea3;
		}
		public LineaCelular darLineaCelular1() {
			return lineaCelular1;
		}
		
		public void agregarLlamadaLocalLinea1 (int minutos) {
			linea1.agregarLlamadaLocal(minutos); 
		}
	    public void agregarLlamadaLocalLinea2 (int minutos) {
			linea2.agregarLlamadaLocal(minutos);
		}
	    public void agregarLlamadaLocalLinea3 (int minutos) {
		    linea3.agregarLlamadaLocal(minutos);
	    }
	    public boolean agregarLlamadaLocalLineaCelular1(int minutos) {
	    	
	    	if (lineaCelular1.darSaldoDisponibleLocal()>(minutos)) {
	    		
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    	
	    }
	    public void agregarLlamadaLargaDistanciaLinea1(int minutos) {
	    	linea1.agregarLlamadaLargaDistancia(minutos);
	    }
	    public void agregarLlamadaLargaDistanciaLinea2(int minutos) {
	    	linea2.agregarLlamadaLargaDistancia(minutos);
	    }
	    public void agregarLlamadaLargaDistanciaLinea3(int minutos) {
	    	linea3.agregarLlamadaLargaDistancia(minutos);
	    }
	    public void agregarLlamadaCelularLinea1(int minutos) {
	    	linea1.agregarLlamadaCelular(minutos);
	    }
	    public void agregarLlamadaCelularLinea2(int minutos) {
	    	linea2.agregarLlamadaCelular(minutos);
	    }
	    public void agregarLlamadaCelularLinea3(int minutos) {
	    	linea3.agregarLlamadaCelular(minutos);
	    }
	    public void agregarLlamadaCelularLineaCelular1(int minutos) {
	    	lineaCelular1.agregarLlamadaCelular(minutos);
	    }
	    public int darTotalNumeroLlamadasDesdeLineasNoAlternativas() {
	    	return linea1.darNumeroLlamadas() + linea2.darNumeroLlamadas() + linea3.darNumeroLlamadas();
	    }
	    public int darTotalNumeroLlamadasDesdeLineasAlternativas() {
	    	return lineaCelular1.darNumeroLlamadas();
	    }
	    public int darTotalMinutosDesdeLineasNoAlternativas() {
	    	return linea1.darNumeroMinutos() + linea2.darNumeroMinutos() + linea3.darNumeroMinutos();
	    }
	    public int darTotalMinutosDesdeLineasAlternativas() {
	    	return lineaCelular1.darNumeroMinutosLocal() + lineaCelular1.darNumeroMinutosCelular();
	    }
	    public double darTotalCostoLlamadaDesdeLineasNoAlternativas() {
	    	return linea1.darCostoLlamadas() + linea2.darCostoLlamadas() + linea3.darCostoLlamadas();
	    }
	    public double darTotalCostoLlamadasDesdeLineasAlternativas() {
	    	return lineaCelular1.darCostoLlamadas();
	    }
	    public double darCostoPromedioMinutoDesdeLineasNoAlternativas() {
			return darTotalCostoLlamadaDesdeLineasNoAlternativas() / darTotalMinutosDesdeLineasNoAlternativas();
		}
		public double darCostoPromedioMinutoDesdeLineasAlternativas() {
			return darTotalCostoLlamadasDesdeLineasAlternativas() / darTotalMinutosDesdeLineasAlternativas();
		}
		public double darSaldoDisponibleLineasAlternativas () {
			return lineaCelular1.darSaldoDisponibleLocal();
		}
		public void reiniciarLineasNoAlternativas() {
			linea1.reiniciar();
			linea2.reiniciar();
			linea3.reiniciar();
		}
		public void reiniciarLineasAlternativas() {
			lineaCelular1 = new LineaCelular();

		}
	}


