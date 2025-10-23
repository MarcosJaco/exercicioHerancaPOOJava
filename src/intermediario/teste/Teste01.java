package intermediario.teste;

import intermediario.dominio.Diretor;
import intermediario.dominio.Funcionario;
import intermediario.dominio.Gerente;

public class Teste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marcos", "Atendimento", 3000);
        Gerente gerente = new Gerente("Otavio", "Vendas", 5000, 2000);
        Diretor diretor = new Diretor("Marcelo", "Gestão", 7000, 2000, 4000);

        funcionario.exibirDados();
        gerente.exibirDados();
        diretor.exibirDados();

        funcionario.aumentarSalario(10);
        gerente.aumentarSalario(10);
        diretor.aumentarSalario(10);

        System.out.println("\n\n-------- Após aumento --------\n\n");

        funcionario.exibirDados();
        gerente.exibirDados();
        diretor.exibirDados();


    }
}
