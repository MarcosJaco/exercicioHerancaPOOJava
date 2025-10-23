package intermediario.dominio;

public class Funcionario {
    protected String nome;
    protected String departamento;
    protected double salario;

    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("--------- Funcionário ----------");
        System.out.println("Nome: "+nome);
        System.out.println("Departamento: "+departamento);
        System.out.println("Salário: "+salario);
    }

    public void aumentarSalario(double percentual){
        percentual = percentual / 100;
        this.salario = this.salario + (this.salario * percentual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
