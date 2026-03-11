# 🧠 Java Quiz System (CLI)

Este projeto é um simulador de jogos de perguntas e respostas desenvolvido em Java. O sistema foca no processamento de dados externos e na manipulação de coleções para criar uma experiência dinâmica no terminal.

## 🎯 Objetivo
Desenvolver um programa capaz de gerenciar um banco de questões de forma flexível, garantindo que o usuário nunca responda ao mesmo quiz na mesma ordem.

## 🚀 Funcionalidades Principais
* **Integração com CSV:** O sistema carrega perguntas e alternativas diretamente de um arquivo `.csv`, facilitando a atualização do banco de dados sem mexer no código.
* **Aleatoriedade Dupla:** 1. As perguntas são sorteadas aleatoriamente.
    2. As alternativas (A, B, C, D) são embaralhadas a cada exibição, garantindo que a resposta correta mude de posição.
* **Validação de Respostas:** Feedback instantâneo para o usuário após cada tentativa.
* **Relatório de Desempenho:** Exibição da pontuação final acumulada ao encerrar o quiz.



## 🏗️ Estrutura Técnica
* **Manipulação de Arquivos:** Utilização das classes `Scanner` e `File` para leitura de dados.
* **Algoritmos de Embaralhamento:** Implementação de lógica para reordenar listas de opções.
* **Interface via Console:** Interação simplificada focada em usabilidade via prompt de comando.

## 💻 Como executar
1. Certifique-se de que o arquivo `perguntas.csv` está na pasta raiz do projeto.
2. Compile o arquivo fonte:
   ```bash
   javac Main.java