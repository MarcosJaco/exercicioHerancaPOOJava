package dominio;

public class Funcionario{
    private String nome;
    private double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}