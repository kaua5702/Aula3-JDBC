# 📚 Aula 3 — JDBC com MySQL

Projeto de exemplo para conexão com banco de dados MySQL usando **JDBC (Java Database Connectivity)**, desenvolvido com Java e Maven.

---

## 🛠️ Tecnologias utilizadas

- Java (OpenJDK 25)
- MySQL
- MySQL Connector/J 8.0.33
- Maven

---

## 📋 Pré-requisitos

- JDK 11 ou superior instalado
- MySQL instalado e rodando localmente
- Maven instalado

---

## 🗄️ Configuração do banco de dados

Execute o script abaixo no seu MySQL para criar o banco e a tabela utilizados no projeto:

```sql
CREATE DATABASE escola;

USE escola;

CREATE TABLE estudante (
    id   INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    idade INT,
    curso VARCHAR(100)
);
```

---

## ⚙️ Configuração do projeto

No arquivo `Main.java`, ajuste as credenciais de acordo com o seu ambiente:

```java
String url   = "jdbc:mysql://localhost:3306/escola";
String uname = "root";
String pass  = "sua_senha";
```

---

## ▶️ Como executar

1. Clone o repositório:
```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Acesse a pasta do projeto:
```bash
   cd Aula-3-JDBC
```

3. Compile com Maven:
```bash
   mvn compile
```

4. Execute a classe principal:
```bash
   mvn exec:java -Dexec.mainClass="Main"
```

---

## 📝 O que o projeto faz

- Conecta ao banco de dados MySQL via JDBC
- Insere um registro na tabela `estudante`
- Exibe no console a quantidade de linhas afetadas

---

