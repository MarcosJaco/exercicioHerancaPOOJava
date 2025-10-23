package intermediario.dominio;

public class Diretor extends Gerente {

    protected double participacaoLucros;

    public Diretor(String nome, String departamento, double salario, double bonus, double participacaoLucros) {
        super(nome, departamento, salario, bonus);
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public void exibirDados(){
        System.out.println("--------- Diretor ----------");
        System.out.println("Nome: "+nome);
        System.out.println("Departamento: "+departamento);
        System.out.println("Salário: "+salario);
        System.out.println("Bônus: "+bonus);
        System.out.println("Participação nos Lucros: "+participacaoLucros);
    }

    @Override
    public void aumentarSalario(double percentual){
        salario = (salario + (salario * (percentual / 100) + (bonus * 0.5)) + participacaoLucros);
    }

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }
}
