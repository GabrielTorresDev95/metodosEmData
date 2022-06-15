package Produtos;

public class DesafioMetodo01 {
	int dia;
	int mes;
	int ano;
	
	String  obterDataFormatada() {
		
		return String.format("%d/%d/%d", dia, mes, ano);


	}
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
		
	}

	
}
	

