package intermediario.dominio;

public class Gerente extends Funcionario {

    protected double bonus;

    public Gerente(String nome, String departamento, double salario, double bonus) {
        super(nome, departamento, salario);
        this.bonus = bonus;
    }

    @Override
public void exibirDados(){
        System.out.println("--------- Gerente ----------");
        System.out.println("Nome: "+nome);
        System.out.println("Departamento: "+departamento);
        System.out.println("salario: "+salario);
        System.out.println("bonus: "+bonus);
    }

    @Override
    public void aumentarSalario(double percentual){
        salario = (salario + (salario * (percentual / 100) + (bonus * 0.5)));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
