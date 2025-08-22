# 🥐🥖 Padaria Digital 🫓

<p align="center">
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow" alt="Status do Projeto: Em Desenvolvimento">
</p>

<p align="center">
  <em>Um sistema de gerenciamento para padarias, construído com as tecnologias mais modernas do ecossistema Java.</em>
</p>

<p align="center">
  <img src="./assets/logo-padaria.png" alt="Logo da Padaria" width="200">
</p>

---

## 📋 Índice

* [Sobre o Projeto](#-sobre-o-projeto)
* [Tecnologias Utilizadas](#-tecnologias-utilizadas)
* [Como Executar o Projeto](#-como-executar-o-projeto)
* [Endpoints Principais](#-endpoints-principais)
* [Comandos Git Úteis](#-comandos-git-úteis)

---

## 📖 Sobre o Projeto

Este projeto tem como objetivo criar uma simulação de um sistema de gerenciamento para uma padaria, permitindo o cadastro de funcionários, controle de estoque e outras funcionalidades essenciais para o dia a dia do negócio.

---

## ✨ Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias:

| Tecnologia | Ícone |
| :--- | :---: |
| **Java 21** | <img src="./assets/logo-java.png" alt="Java" width="40"> |
| **Spring Boot** | <img src="./assets/logo-spring.png" alt="Spring Boot" width="40"> |
| **HTML5** | <img src="./assets/logo-html.png" alt="HTML5" width="40"> |
| **CSS3** | <img src="./assets/logo-css.png" alt="CSS3" width="40"> |

---

## 🚀 Como Executar o Projeto

Siga os passos abaixo para executar o projeto em sua máquina local.

**Pré-requisitos:**
* Java JDK 21 ou superior
* Maven
* Git

**Passos:**
1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/robertoc4t/Padaria.git](https://github.com/robertoc4t/Padaria.git)
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd Padaria
    ```
3.  **Execute a aplicação usando o Maven Wrapper:**
    * No Windows:
      ```bash
      ./mvnw spring-boot:run
      ```
    * No Linux ou macOS:
      ```bash
      ./mvnw spring-boot:run
      ```
4.  A aplicação estará disponível em `http://localhost:8080`.

---

## 🔗 Endpoints Principais

Após iniciar a aplicação, você pode acessar os seguintes painéis:

* **Painel de Cadastro de Padeiros:**
    * URL: `http://localhost:8080/painel/padeiros/novo`
    * Descrição: Formulário para cadastrar um novo padeiro no sistema.

* **API de Funcionários (Exemplo):**
    * URL: `http://localhost:8080/painel/funcionario`
    * Descrição: Endpoint da API para listar funcionários (retorna JSON).

---

##  git Comandos Git Úteis

Aqui estão alguns comandos úteis para contribuir com o projeto.

### Fluxo de Trabalho do Dia a Dia

1.  **Sincronize sua branch local com a remota:**
    * Antes de começar a trabalhar, sempre puxe as últimas alterações.
    ```bash
    git pull
    ```
    * _Caso sua branch local e a remota divirjam (o erro `fetch first`), use o comando abaixo para sincronizar:_
    ```bash
    git pull --rebase
    ```

2.  **Adicione e salve suas alterações:**
    * Adicione todos os arquivos modificados.
    ```bash
    git add .
    ```
    * Crie um commit com uma mensagem descritiva.
    ```bash
    git commit -m "feat: Adiciona funcionalidade de cadastro de produtos"
    ```

3.  **Envie suas alterações para o GitHub:**
    ```bash
    git push
    ```
