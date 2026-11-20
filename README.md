# Sistema de Biblioteca

É um projeto que visa facilitar o funcionamento de uma biblioteca, com as opções de adicionar livro, listar, remover, emprestar e devolver. É um sistema de console em Java que guarda os livros em um ArrayList, uma lista que cresce conforme novos livros são cadastrados.

## Funcionalidades

- Adicionar livro com título, autor e categoria
- Listar todos os livros, mostrando se estão disponíveis
- Remover livro pelo título
- Emprestar livro, impedindo o empréstimo de um livro que já está emprestado
- Devolver livro, avisando quando ele já está disponível
- Buscar pelo título sem diferenciar maiúsculas de minúsculas

## Como executar

1. Baixe ou clone este repositório
2. Abra a pasta no VS Code
3. Execute o arquivo Main.java

## Conceitos praticados

- Classes, construtores, getters e setters
- Encapsulamento com atributos private
- ArrayList e laço for-each
- boolean para controlar o estado do livro (disponível ou emprestado)
- Comparação de textos com equalsIgnoreCase
- Menu no console com Scanner e switch