package dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in).useLocale(Locale.US);
		boolean continuar = true;

		do {
			System.out.println("Por favor, digite o número da Agência !");
			int numeroAgencia = s.nextInt();
			System.out.println("Por favor, digite a Conta !");
			String conta = s.next();
			System.out.println("Por favor, digite o nome e sobrenome do cliente!");
			String nome = null;
			while (s.hasNext()) {
				if (nome == null) {
					nome = s.next();
				} else {
					nome += " " + s.next();
					break;
				}
			}
			System.out.println("Por favor, digite o Saldo !");
			float saldo = s.nextFloat();

			System.out.printf(
					"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %f já está disponível para saque",
					nome, numeroAgencia, conta, saldo);

			System.out.println(" ");
			System.out.println("Criar nova conta ? sim ou nao");
			String nova = s.next();

			continuar = nova.equals("sim");
		} while (continuar);

		s.close();
		System.out.println("Finalizado!");

	}
}