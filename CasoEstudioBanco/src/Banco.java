import javax.swing.JOptionPane;

public class Banco {
	
	private int numeroTransacciones;
	private double saldo;
	private double totalRetirado;
	private double valorUltimaTransaccion;
	private double totalConsignado;

	
	public Banco(){
		numeroTransacciones=0;
		saldo=1000000;
		totalRetirado=0;
		valorUltimaTransaccion=0;
		
	}
	
	public int capturarNumeroTransacciones(){
		return numeroTransacciones;
	}

	public double capturarSaldo(){
		return saldo;
	}
	
	public double capturarTotalRetirado(){
		return totalRetirado;
	}
	
	public double capturarTotalConsignado(){
		return totalConsignado;
	}
	
	public double capturarUltimaTransaccion(){
		return valorUltimaTransaccion;
	}
	
	public void mostrarSaldo(double valor, int tipo){
		if(tipo==0){
			saldo=saldo+valor;
			totalConsignado= totalConsignado+valor;
			
		
		}else if(tipo==1){
			saldo=saldo-valor;
			totalRetirado= totalRetirado+valor;
			
		}
		
		numeroTransacciones ++;
	}
	
	public void realizarTransaccion(double valor , int tipo){
		
		if(saldo<valor && tipo==1){
				JOptionPane.showMessageDialog(null,"Tu saldo es insuficiente");
				
				
				
			}else{JOptionPane.showMessageDialog(null,"Transaccion Realizada");
			mostrarSaldo(valor,tipo);
			}
		
		
	}
}