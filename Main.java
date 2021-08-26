package funcionario;

import java.util.ArrayList;
import java.util.Scanner;

import funcionario.f_diarista;
import funcionario.f_fixo;

public class Main {
	public static void main(String[] args) {
		// cria uma lista de funcionarios
		ArrayList<f_fixo> listaF_fixos = new ArrayList<>();
		ArrayList<f_diarista> listaF_diaristas = new ArrayList<>();
		Scanner leitor = new Scanner(System.in);
		String nome = "";
		double salario;
		int tipo, horaExtra, dias, horas;
		while (true) {
			System.out.printf("\nQual o tipo do funcionario, Digite 1 se for fixo ou 2 para diarista");
			tipo = leitor.nextInt();
			System.out.printf("\nEntre com o nome do funcionario, ou \"fim\" para sair:");
			nome = leitor.nextLine();
			if (nome.equalsIgnoreCase("fim")) {
				break;
			}

			System.out.printf("\nEntre com o salário do funcionario:");
			salario = Double.parseDouble(leitor.nextLine());

			if (tipo == 1) {
				System.out.printf("\nDigite as Horas Extras do funcionario fixo:");
				horaExtra = leitor.nextInt();

				listaF_fixos.add(new f_fixo(nome, salario, horaExtra));
			} else if (tipo == 2) {
				System.out.printf("\nDigite as horas trabalhadas por dia");
				horas = leitor.nextInt();

				System.out.printf("\nDigite os dias trabalhados");
				dias = leitor.nextInt();
				listaF_diaristas.add(new f_diarista(nome, salario, dias, horas));
			} else {
				System.out.printf("\n[ERRO] Tipo de funcionario invalido");
			}
		}

		// mostra a lista de funcionarios
		for (f_diarista f : listaF_diaristas) {
			System.out.printf("\nNome = %s, Salario = %.2f, ID = %d", f.getNome(), f.calculaSalarioDiarista(),
					f.getId());
		}
		for (f_fixo f : listaF_fixos) {
			System.out.printf("\nNome = %s, Salario = %.2f, ID = %d", f.getNome(), f.calculaSalarioFixo(), f.getId());
		}

	}
}