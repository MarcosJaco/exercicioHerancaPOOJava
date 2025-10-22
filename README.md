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
