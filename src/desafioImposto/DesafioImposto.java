package desafioImposto;

import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double RendaAnual, PrestacaoServico, GanhoCapital, GastosMedicos, GastosEducacionais,
			   ImpostoSalario, ImpostoServicos, ImpostoGanhoCapital, MaximoDedutivel, GastosDedutiveis,
			   ImpostoBruto, Abatimento, ImpostoDevido;
		
		System.out.print("Renda anual com salario: ");
		RendaAnual = sc.nextDouble();
		
		System.out.print("Renda anual com prestacao de servico: ");
		PrestacaoServico = sc.nextDouble();
		
		System.out.print("Renda anual com ganho de capital: ");
		GanhoCapital = sc.nextDouble();
		
		System.out.print("Gastos medicos: ");
		GastosMedicos = sc.nextDouble();
		
		System.out.print("Gastos educacionais: ");
		GastosEducacionais = sc.nextDouble();

		
		ImpostoSalario = 0;
		ImpostoDevido = 0;
		
		if (RendaAnual/12 >= 5000) {
			ImpostoSalario = RendaAnual * 0.2;
		} else if (RendaAnual/12 >= 3000 && RendaAnual/12 < 5000) {
			ImpostoSalario = RendaAnual * 0.1;
		}
		
		
		ImpostoServicos = PrestacaoServico * 0.15;

		ImpostoGanhoCapital = GanhoCapital * 0.2;
		
		ImpostoBruto = ImpostoSalario + ImpostoServicos + ImpostoGanhoCapital;
		
		MaximoDedutivel = (ImpostoBruto) * 0.3;
		
		GastosDedutiveis = GastosMedicos + GastosEducacionais;
		
		
		if (MaximoDedutivel > GastosDedutiveis) {
			Abatimento = GastosDedutiveis;
		} else {
			Abatimento = MaximoDedutivel;
		}
		
		ImpostoDevido = ImpostoBruto - Abatimento;

		
		System.out.println("\nRELATORIO DE IMPOSTO DE RENDA\n");
		
		System.out.println("\nCONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salario: %.2f", ImpostoSalario);
		System.out.printf("\nImposto sobre servicos:  %.2f", ImpostoServicos);
		System.out.printf("\nImposto sobre ganho de capital: %.2f", ImpostoGanhoCapital);
		
		System.out.println("\n\nDEDUCOES:");
		System.out.printf("Maximo dedutivel: %.2f", MaximoDedutivel);
		System.out.printf("\nGastos dedutiveis: %.2f", GastosDedutiveis);
		
		System.out.println("\n\nRESUMO:");
		System.out.printf("Imposto bruto total: %.2f", ImpostoBruto);
		System.out.printf("\nAbatimento: %.2f", Abatimento);
		System.out.printf("\nImposto devido: %.2f", ImpostoDevido);
		
		
		sc.close();
	}

}
