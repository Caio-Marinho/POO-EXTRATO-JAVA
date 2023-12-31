package objeto;
import java.util.Scanner;
public class conta {
	private double saldo;
	private int numero;
	private double saque;
	private double deposito;

	public conta(double saldo, int numero, double saque, double deposito) {
		this.saldo = 2000;
		this.numero = numero;
		this.saque = saque;
		this.deposito = deposito;
		
	}
	public double getsaldo() {
		return saldo;
	}
    public void setsaldo(double saldo) {
    	if(saldo<0) {
    		System.out.println("O saldo não pode ficar negativo");
    	}else {
    		this.saldo = saldo;
    	}
    }
    public double getsaque() {
		return saldo;
    }
    public void setsaque(double valor) {
    	if (valor>=0) {
    		saldo -= valor;
    		if (saldo>=valor) {
    			System.out.println("Saque Realizado com sucesso!!!");
    		}
    	}while(valor<0 || valor>saldo) { 
    		System.out.println("ERRO AO SACAR!!!");
    		try (Scanner value = new Scanner(System.in)) {
				System.out.println("Digite novamente o valor de saque: ");
				valor = value.nextInt();
			}
    	}
			System.out.println("O valor sacado "
			+ ": R$"+valor);
    		saldo -=valor;
		
    }
    public double getdeposito(){
    	return deposito;
    }
    public void setdeposito(double valor){
    	if(valor>0) {
    		saldo+=valor;
    		if (saldo>=valor) {
    			System.out.println("Deposito Realizado "
    					+ "com sucesso!!!");
    		}
    	}while(valor<=0) {
    		System.out.println("ERRO AO DEPOSITAR!!!");
    		try (Scanner value = new Scanner(System.in)) {
				System.out.println("Digite novamente o "
						+ "valor de deposito: ");
				valor = value.nextInt();
			}
    	}
		System.out.println("O valor depositado "
			+ ": R$"+valor);
    	saldo+=valor;
    }
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
