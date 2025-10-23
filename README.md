# exerciciosHerancaPOOJava

## 🧩 Exercício 1 (fácil): Funcionário e Gerente

Você deve criar um pequeno sistema para representar funcionários de uma empresa.
A empresa possui dois tipos de pessoas que trabalham nela:

Funcionário comum

Gerente

### 🔹 Instruções:

Crie uma classe chamada Funcionario com os seguintes atributos:

nome (String)

salario (double)

E os seguintes métodos:

Um construtor para inicializar os dados.

Um método exibirDados() que mostra o nome e o salário.

Crie uma classe chamada Gerente que herda de Funcionario.

Adicione o atributo bonus (double).

Crie um construtor que inicialize todos os atributos (incluindo os da classe mãe).

Crie um método exibirDados() que mostre o nome, salário e bônus.

Crie uma classe Main (com o método main) para:

Criar um objeto de Funcionario.

Criar um objeto de Gerente.

Chamar o método exibirDados() para cada um.

🧠 Objetivo:

Esse exercício serve para treinar:

O uso de herança (extends)

A chamada do construtor da classe mãe (super())

A diferença entre atributos da classe base e da classe filha



# 🧩 Exercício 2 (intermediário): Funcionário, Gerente e Diretor

Você deve criar um sistema que represente diferentes cargos em uma empresa com herança e polimorfismo.

### 🔹 Instruções:

Classe Funcionario (base)

Atributos:

nome (String)

salario (double)

departamento (String)

Métodos:

Construtor para inicializar os dados

exibirDados() → mostra nome, salário e departamento

aumentarSalario(double percentual) → aumenta o salário pelo percentual informado

Classe Gerente (herda de Funcionario)

Atributos:

bonus (double)

Métodos:

Construtor que inicializa todos os atributos (incluindo os da classe mãe)

exibirDados() → mostra nome, salário, departamento e bônus

aumentarSalario(double percentual) → aumenta o salário + aplica 50% do bônus como aumento adicional (sobrescrevendo o método da classe mãe)

Classe Diretor (herda de Gerente)

Atributos:

participacaoLucros (double)

Métodos:

Construtor que inicializa todos os atributos (incluindo os da classe mãe)

exibirDados() → mostra nome, salário, departamento, bônus e participação nos lucros

Classe Main

Criar pelo menos:

Um Funcionario

Um Gerente

Um Diretor

Testar:

exibirDados() de cada um

aumentarSalario() de cada um e mostrar novamente os dados

🧠 Objetivo:

Esse exercício serve para treinar:

Herança múltipla de níveis (Funcionario → Gerente → Diretor)

Polimorfismo (sobrescrever métodos)

Uso de atributos adicionais em classes filhas

Chamadas a super() no construtor e em métodos

# 🧩 Exercício 3 (avançado): Sistema de Funcionários com Tipos e Cálculo de Pagamento

🧠 Objetivo geral:

Criar uma estrutura hierárquica de funcionários que permita o cálculo polimórfico dos salários com base em diferentes critérios (bônus, comissão, lucro etc.), utilizando classes abstratas, métodos sobrescritos e listas de objetos (polimorfismo em coleção).

### 🔹 Estrutura de classes:
Classe abstrata Funcionario (base)

Atributos:

nome (String)

salarioBase (double)

Métodos:

Construtor para inicializar os dados.

public abstract double calcularSalarioFinal() → método abstrato que será implementado pelas subclasses.

public void exibirDados() → mostra nome e salário base.

public String toString() → retorna uma descrição textual do funcionário e do salário final.

Classe Gerente (herda de Funcionario)

Atributos:

bonus (double)

Métodos:

Construtor que inicializa todos os atributos.

@Override calcularSalarioFinal() → retorna salarioBase + bonus.

@Override exibirDados() → mostra nome, salário base e bônus.

Classe Vendedor (herda de Funcionario)

Atributos:

comissao (double)

vendasRealizadas (int)

Métodos:

Construtor que inicializa todos os atributos.

@Override calcularSalarioFinal() → retorna salarioBase + (comissao * vendasRealizadas).

@Override exibirDados() → mostra nome, salário base, comissão e número de vendas.

Classe Diretor (herda de Gerente)

Atributos:

participacaoLucros (double)

Métodos:

Construtor que inicializa todos os atributos (usando super()).

@Override calcularSalarioFinal() → retorna salarioBase + bonus + participacaoLucros.

@Override exibirDados() → mostra nome, salário base, bônus e participação nos lucros.

Classe Empresa (gerenciadora)

Atributos:

List<Funcionario> funcionarios

Métodos:

adicionarFuncionario(Funcionario f)

exibirFolhaPagamento() → percorre a lista e exibe o toString() de cada funcionário.

calcularCustoTotal() → soma o salário final de todos os funcionários.

Classe Main (teste)

Criar uma instância de Empresa.

Adicionar:

1 Gerente

2 Vendedores

1 Diretor

Exibir a folha de pagamento.

Mostrar o custo total da empresa com salários.

💡 Conceitos que esse exercício treina:
Conceito	Explicação
Herança de múltiplos níveis	Funcionario → Gerente → Diretor
Polimorfismo	Lista de Funcionario que armazena diferentes tipos (Gerente, Vendedor, Diretor)
Métodos abstratos	Forçam subclasses a implementar calcularSalarioFinal()
Sobrescrita de métodos	Cada tipo de funcionário calcula o salário de forma diferente
Encapsulamento	Uso de atributos private e getters/setters opcionais
toString() personalizado	Representação legível dos objetos
