package com.mycompany.trabalho2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * 
 * @author LEAND
 */
public class Trabalho2 {
    public static void main(String[] args) {
        // Lista para armazenar perguntas e respostas
        List<String[]> perguntas = new ArrayList<>();

        try {
            // Abre o arquivo CSV para leitura
            BufferedReader lerArquivo = new BufferedReader(new FileReader("Perguntas e Respostas.csv"));
            String linha;
            
            // Lê cada linha do arquivo e divide os dados pelo delimitador '|'
            while ((linha = lerArquivo.readLine()) != null) {
                String[] partes = linha.split("\\|");
                
                // Garante que a linha possui exatamente 5 partes (pergunta + 4 alternativas)
                if (partes.length == 5) {
                    perguntas.add(partes);
                }
            }
            
            
            lerArquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
            return; 
        }

        // Verifica se há perguntas carregadas
        if (perguntas.isEmpty()) {
            System.out.println("Nenhuma pergunta encontrada.");
            return;
        }

        // Embaralha a lista de perguntas para que apareçam em ordem aleatória
        Collections.shuffle(perguntas);
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        // Loop para percorrer todas as perguntas
        for (String[] dados : perguntas) {
            // Lista para armazenar as opções de resposta
            List<String> opcoes = new ArrayList<>();
            opcoes.add(dados[1]); // Resposta correta
            opcoes.add(dados[2]); // Alternativa errada
            opcoes.add(dados[3]); // Alternativa errada
            opcoes.add(dados[4]); // Alternativa errada
            
            // Embaralha as opções de resposta
            Collections.shuffle(opcoes);
            
            System.out.println("\n" + dados[0]);
            
            // Exibe as opções de resposta numeradas
            for (int i = 0; i < opcoes.size(); i++) {
                System.out.println((i + 1) + ". " + opcoes.get(i));
            }
            
            // Lê a resposta do usuário
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            
            // Verifica se a opção escolhida está correta
            if (opcoes.get(escolha - 1).equals(dados[1])) {
                System.out.println("Correto!");
                pontuacao++; // Incrementa a pontuação
            } else {
                System.out.println("Errado! Resposta correta: " + dados[1]);
            }
        }
        
        // Exibe a pontuação final
        System.out.println("\nPontuação final: " + pontuacao + "/" + perguntas.size());
        
        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
