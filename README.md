# Projeto de Collections Java - Operações Básicas, Pesquisa e Ordenação

Este projeto é uma aplicação Java que demonstra o uso de estruturas de dados como *List, **Set* e *Map* para realizar operações básicas, pesquisa de elementos e ordenação. O programa está dividido em três módulos principais: *Operações Básicas, **Pesquisa* e *Ordenação*, explorando diversas funcionalidades dessas coleções.

## Funcionalidades Principais

1. *Operações Básicas:*
   - Inserção, remoção e listagem de itens utilizando listas e conjuntos.

2. *Pesquisa de Elementos:*
   - Métodos para buscar elementos específicos dentro de listas e mapas, como a busca por autor ou livro.

3. *Ordenação:*
   - Ordenação de elementos, como a organização de livros pelo preço ou outras características utilizando a interface Comparable.

## Passo a Passo do Projeto

### Passo 1: Instanciar a Livraria Online
O projeto cria uma instância da livraria online que utiliza mapas (Map<String, Livro>) para gerenciar uma coleção de livros. Cada livro tem um *título, **autor* e *preço*.

### Passo 2: Operações Básicas
As principais operações disponíveis no sistema incluem:
- *Adicionar Livro:* Permite adicionar livros com base no título, autor e preço.
- *Remover Livro:* Exclui um livro com base no título informado.
- *Exibir Livros:* Exibe todos os livros armazenados, mostrando seus detalhes.

### Passo 3: Pesquisa de Livros
O projeto oferece métodos para pesquisar livros por diferentes critérios, como:
- *Pesquisar por Autor:* Pesquisa e exibe todos os livros de um autor específico.
- *Obter Livro Mais Caro:* Retorna o livro mais caro da coleção.
- *Exibir Livro Mais Barato:* Exibe o livro com o preço mais baixo.

### Passo 4: Ordenação de Livros
O projeto implementa a interface Comparable na classe Livro para permitir a ordenação:
- *Ordenar Livros por Preço:* Utiliza Collections.sort() para ordenar os livros com base no preço, do menor para o maior.

### Estrutura do Projeto

#### Classes e Métodos

- *OperacoesBasicas.java:*
  - Define operações como adicionar, remover e listar livros em coleções como List e Set.
  
- *Pesquisa.java:*
  - Implementa métodos de pesquisa por título e autor em estruturas como Map e Set.
  
- *Ordenacao.java:*
  - Realiza ordenação de elementos com base em diferentes atributos usando a interface Comparable e métodos utilitários de Collections.

## Tecnologias Utilizadas

- *Java:* Linguagem de programação utilizada para desenvolver o projeto.
- *List, Set e Map (java.util):* Principais coleções utilizadas.
- *Collections (java.util.Collections):* Utilizado para ordenação e manipulação das coleções.

## Autor

- *Nome:* Lucas Degrande