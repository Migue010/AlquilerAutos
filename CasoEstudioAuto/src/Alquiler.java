public class Alquiler {
    private Auto auto;
    private Cliente cliente;
    private int kilometrajeInicial;
    private boolean accidentado;
    private boolean multado;

    public Alquiler(Auto auto, Cliente cliente, int kilometrajeInicial) {
        this.auto = auto;
        this.cliente = cliente;
        this.kilometrajeInicial = kilometrajeInicial;
        this.accidentado = false;
        this.multado = false;
    }

   
    public Auto getAuto() {
    	return auto; }
    
    public Cliente getCliente() { 
    	return cliente; }
    
    public int getKilometrajeInicial() { 
    	return kilometrajeInicial; }
    
    public boolean isAccidentado() { 
    	return accidentado; }
    
    public boolean isMultado() { 
    	return multado; }
    
    public void setAccidentado(boolean accidentado) { 
    	this.accidentado = accidentado; }
    
    public void setMultado(boolean multado) {
    	this.multado = multado; }
}

