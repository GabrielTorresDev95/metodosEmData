package Produtos;

public class DesafioMetodo02 {
	
	public static void main(String[] args) {
		
		DesafioMetodo01 dt01 = new DesafioMetodo01();
		
		dt01.dia = 9;
		dt01.mes = 10;
		dt01.ano = 2022;
		
		var dt02 = new DesafioMetodo01();
		
		dt02.dia = 8;
		dt02.mes = 10;
		dt02.ano = 2022;
		
		String dataFormatada = dt01.obterDataFormatada();
		
		System.out.println(dataFormatada);
		
		System.out.println(dt02.obterDataFormatada());
		
		dt01.imprimirDataFormatada();
		dt02.imprimirDataFormatada();
		
		
		
		
		
			
	
	}
}
