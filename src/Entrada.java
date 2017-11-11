import java.util.Scanner;

public class Entrada {

	public static String leiaEscolha(String escolha) {
		
		Venda venda = new Venda();
		
		
		switch (escolha) 
		{
		case "1":
		
			System.out.println(venda.TemosCoca());
		
			return "1";
		case "2":
			
			System.out.println(venda.TemosGuarana());
		
			return "2";
		case "3":
			
			System.out.println(venda.TemosPepsi());
			
			return "3";
		case "4":
			
			System.out.println(venda.TemosCheetos());
			
			return "4";
		case "5":
			
			System.out.println(venda.TemosSkini());
			
			return "5";
		case "6":
	
			System.out.println(venda.TemosBaconzitos());
			return "6";
	
		default:
			
			System.out.println("Desculpe, nao entendi o seu pedido");
			return null;
		}
		
		
	}

	public static double leiaDouble(String string) {
		
		return 0;
	}



}
