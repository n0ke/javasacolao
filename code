import java.util.Scanner;

public class CalculadoraSacolao {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
      
		boolean continuar = true;
      
		while (continuar) {
			System.out.println("\nSelecione uma opção:");
			System.out.println("1- Calcular preço de venda por unidade");
			System.out.println("2- Calcular preço venda para uma quantidade especifica de unidades");
			System.out.println("3- Sair\n");
         
			int opcao = s.nextInt();
			s.nextLine(); // Limpa a tela
         
			switch (opcao) {
            	default:
            		System.out.println("Opção inválida! Tente novamente.");
            	case 1:
            		// Pedir informações do produto
            		System.out.print("Digite o nome do produto: ");
            		String nome1 = s.next();
               
            		System.out.print("Digite o preço de compra de uma unidade do produto: R$");
            		double precoCompra1 = s.nextDouble();
               
            		// Pedir informações do lucro desejado 
            		System.out.print("Digite o lucro desejada (%): ");
            		double lucro1 = s.nextDouble();
               
            		// Calcular preço de venda
            		double precoVenda1 = precoCompra1 * (1 + (lucro1 / 100));
               
            		// Exibir resultado
            		System.out.printf("Para %.2f%% de lucro em %s, o preço de venda por unidade deve ser de R$%.2f.", lucro1, nome1, precoVenda1);
            		break;
               
            	case 2:
            		// Pedir informações do produto
            		System.out.print("Digite o nome do produto: ");
            		String nome2 = s.next();
               
            		System.out.print("Digite a quantidade de unidades do produto comprado: ");
            		int quantidade = s.nextInt();
               
            		System.out.print("Digite o preço total de compra: R$");
            		double precoCompra2 = s.nextDouble();
               
            		// Pedir informações do lucro desejado
            		System.out.print("Digite a margem de lucro desejada (%): ");
            		double lucro2 = s.nextDouble();
               
            		// Calcular preço de venda
            		double precoVenda2 = precoCompra2/quantidade * (1 + (lucro2 / 100));
            		double precoTotal = precoVenda2 * quantidade;
               
            		// Exibir resultado
            		System.out.printf("Para %.2f%% de lucro em %s, o preço de venda por unidade deve ser de R$%.2f.\nPara %d unidades, o preço de venda é de R$%.2f.",lucro2,nome2,precoVenda2, quantidade, precoTotal);
            		break;
            	case 3:
            		continuar = false;
            		break; 
			}
		}
	}
}
