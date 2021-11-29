package validarCPF;

import java.util.*;
import validarCPF.validaCPF;

public class validar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		String CPF;
		
		System.out.println("Informe um CPF: ");
		CPF = ler.next();
		
		System.out.println("\nResultado: ");
		
		if (validaCPF.isCPF(CPF) == true)
			System.out.printf("%s\n", validaCPF.imprimeCPF(CPF));
		else System.out.println("Erro, CPF invalido!!!\n");

	}

}
