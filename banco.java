package objeto;
import java.util.Scanner;
public class banco {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in)) {
			conta c = new conta(0,0,0,0);
			String dnv = "sim";
			while(dnv.equals("sim")){
				
				System.out.println("DESEJA REALIZAR "
						+ "UM DEPOSITO OU SAQUE: ");
				String texto = b.next();
				if(texto.equals("deposito")|| texto.equals("Deposito")) {
				System.out.println("Digita o valor de deposito: ");
				double valor = b.nextInt();
				c.setdeposito(valor);
				System.out.println("saldo atual da conta"
						+ ": R$"+c.getsaldo());
				}else if(texto.equals("saque") || texto.equals("Saque")){
					System.out.println("Digita o valor de saque: ");
					double valor = b.nextInt();
					c.setsaque(valor);
					System.out.println("saldo atual da conta "
							+ ": R$"+c.getsaldo());
				}
			
					System.out.println("Deseja realizar novamente? ");
				dnv = b.next();
			
				
			}
		}
	}

}
