# Projeto de Ordenação, Operações Básicas e Pesquisa com Listas

Este projeto é uma aplicação Java que implementa funcionalidades de ordenação, operações básicas com um carrinho de compras e operações de pesquisa e manipulação de números inteiros. O projeto está estruturado em diferentes pacotes, cada um responsável por um conjunto de operações.

## Funcionalidades Principais

### 1. **Ordenação de Alunos (Pacote: `List.Ordenacao`)**
   - Os alunos podem ser ordenados por matrícula (ordem crescente) utilizando a interface `Comparable`.
   - Também podem ser ordenados por nome, utilizando um `Comparator` personalizado.

#### Métodos principais:
- `preencherSalaAlunos(String novoAluno, int novaMatricula)`: Adiciona alunos à lista da sala de aula.
- `organizarPorMatricula()`: Ordena a lista de alunos por matrícula.
- `organizarPorNome()`: Ordena a lista de alunos por nome.

### 2. **Operações Básicas em Carrinho de Compras (Pacote: `List.OperacoesBasicas`)**
   - Simulação de um carrinho de compras com adição e remoção de itens, e cálculo do valor total.

#### Métodos principais:
- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho.
- `removerItemPorNome(String nome)`: Remove um item do carrinho com base no nome.
- `calcularValorTotal()`: Calcula o valor total dos itens no carrinho.

### 3. **Pesquisa e Manipulação de Números Inteiros (Pacote: `List.Pesquisa`)**
   - Adiciona números a uma lista e permite encontrar o maior e o menor número, além de calcular a soma total.

#### Métodos principais:
- `adicionarNumeros(int novoNumeroParaLista)`: Adiciona números à lista.
- `ordemCrescente()` e `ordemDecrescente()`: Ordenam os números de forma crescente e decrescente.
- `encontrarMaiorNumero()`: Retorna o maior número da lista.
- `encontrarMenorNumero()`: Retorna o menor número da lista.
- `calcularSoma()`: Calcula a soma de todos os números da lista.

## Estrutura do Projeto

- **Pacote `List.Ordenacao`**: Contém classes para ordenação de objetos do tipo `Alunos` utilizando `Comparable` e `Comparator`.
- **Pacote `List.OperacoesBasicas`**: Implementa um sistema simples de carrinho de compras com a classe `CarrinhoDeCompras` e a classe auxiliar `Item`.
- **Pacote `List.Pesquisa`**: Implementa operações de pesquisa em uma lista de números inteiros, com classes como `SomaNumeros`, `Numeros` e `ComparatorOrdemDecrescente`.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento da aplicação.
- **Java Collections Framework**: Utilizado para a manipulação de listas e ordenação.
- **Interfaces Comparator e Comparable**: Implementadas para ordenação customizada.

## Como Executar

1. Clone o repositório ou baixe os arquivos do projeto.
2. Abra o projeto em sua IDE preferida.
3. Execute as classes com o método `main`, como `OrdenacaoEPesquisa`, `ProcessoCompra` ou `OperacoesComNumerosInteiros`, para testar as funcionalidades.

## Autor

- **Nome:** Lucas Degrande