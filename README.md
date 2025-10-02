# Sistema de Registro e Aumento Salarial de Funcionários

[![GitHub user](https://img.shields.io/badge/GitHub-mauricioffdev-blue?style=flat-square&logo=github)](https://github.com/mauricioffdev)

## 📖 Sobre o Projeto

Este é um projeto simples em Java, desenvolvido para fins didáticos, que simula o cadastro de funcionários, verifica a unicidade dos IDs e permite o aumento percentual do salário de um funcionário específico.

O código foi inicialmente escrito por mim, baseado em uma aula do curso do **Professor Nélio Alves** e, posteriormente, revisado e corrigido com o auxílio do Gemini.

> **Nota:** Os comentários originais contendo as correções e sugestões de melhoria do Gemini foram mantidos no código-fonte como material de estudo e referência.

## ✨ Funcionalidades

O programa executa as seguintes etapas:

1.  **Registro de Funcionários:** Solicita a quantidade de funcionários a serem registrados.
2.  **Validação de ID:** Garante que cada funcionário tenha um ID único. Caso um ID repetido seja inserido, o usuário é solicitado a tentar novamente.
3.  **Aumento Salarial:** Solicita o ID do funcionário e o percentual de aumento.
    * Se o ID não for encontrado, exibe uma mensagem de erro.
    * Se o ID for encontrado, aplica o aumento ao salário.
4.  **Listagem Final:** Imprime no console a lista completa dos funcionários, mostrando seus IDs, nomes e salários formatados.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 11+
* **Estruturas:** `ArrayList`, `List`, `Scanner`
* **Recursos:** Java Stream API (para busca e validação de ID)

## ⚙️ Como Executar

Para rodar este projeto:

1.  Clone o repositório para sua máquina local.
2.  Abra o projeto em sua IDE Java preferida (IntelliJ, Eclipse, VS Code).
3.  Execute a classe `Program.java` dentro do pacote `application`.
