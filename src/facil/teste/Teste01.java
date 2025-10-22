package facil.teste;

import facil.dominio.Funcionario;
import facil.dominio.Gerente;

public class Teste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Fulano", 3000);
        Gerente gerente = new Gerente("Marcos", 7000, 3000);

        funcionario.imprimir();
        System.out.println("-------------------------------");
        gerente.imprimir();

    }
}
