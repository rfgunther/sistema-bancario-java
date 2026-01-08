# Sistema Bancário em Java (Terminal)

Projeto prático para solidificar **Programação Orientada a Objetos (POO)** em Java puro (sem frameworks ou Gradle).

## Objetivo
Criar um sistema bancário simples via terminal com as seguintes funcionalidades:
- Criação de clientes (com validação de CPF)
- Criação de contas
- Depósito, saque e transferência
- Extrato de transações
- Persistência em arquivo (futuro)

## Status Atual (Janeiro 2026)
✅ Estrutura de pacotes completa  
✅ Menu principal funcional  
✅ Classe `Cliente` implementada (campos privados, construtor, getters, validação CPF 11 dígitos, toString)  
✅ Criação de cliente integrada no menu  

Em desenvolvimento ativo 🚀

## Tecnologias
- Java 17 (OpenJDK)
- Compilação e execução manual (`javac` e `java`)

## Estrutura do Projeto
src/main/java/br/com/banco/
├── App.java                → Menu e ponto de entrada
├── model/
│   ├── Cliente.java        → Entidade Cliente (funcional)
│   ├── Conta.java          → Em desenvolvimento
│   └── Transacao.java      → Em desenvolvimento
└── service/
└── BancoService.java   → Lógica central (em desenvolvimento)


## Como Rodar
Da raiz do projeto:
```bash
javac src/main/java/br/com/banco/App.java src/main/java/br/com/banco/model/Cliente.java
java -cp src/main/java br.com.banco.App

Demo Atual
Demo criação de cliente
(Em breve adicionarei screenshot real do terminal)
Exemplo de saída:

Cliente criado com sucesso!
Cliente{nome='Adolfo Roberto Campos', cpf='09235418900', telefone='55 984213456'}

Próximos Passos

Implementar classe Conta (número sequencial, saldo, referência ao cliente)
Operações básicas (depósito/saque)
BancoService para centralizar lógica
Persistência em arquivo

Autor
Rudolf Gunther
Estudante de Análise e Desenvolvimento de Sistemas @ IFSC
Policial Militar de Santa Catarina
Foco: Java → Redes → Cibersegurança (CCNA → OSCP path)