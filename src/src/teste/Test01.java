package teste;

import dominio.Funcionario;
import dominio.Gerente;

public class Test01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Fulano", 3000);
        Gerente gerente = new Gerente("Marcos", 7000, 3000);

        funcionario.imprimir();
        System.out.println("-------------------------------");
        gerente.imprimir();

    }
}
