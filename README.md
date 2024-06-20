# 𝕋𝕣𝕒𝕓𝕒𝕝𝕙𝕠 𝔽𝕚𝕟𝕒𝕝


# FootballShirtsStore

FootballShirtsStore é um sistema de vendas de camisas de futebol desenvolvido em Java, utilizando Swing para a interface gráfica e SQLite para o banco de dados.

## Funcionalidades

- **Login e Registro de Usuários**: Sistema de autenticação de usuários.
- **Vitrine de Produtos**: Exibição de camisas de futebol com nomes e imagens dos jogadores.
- **Carrinho de Compras**: Adicionar e remover produtos do carrinho.
- **Pagamento**: Inserir detalhes do cartão e finalizar a compra.
- **Persistência de Dados**: Utilização de SQLite para armazenar dados de usuários, produtos e vendas.

## Tecnologias Utilizadas

- **Java 17**
- **Swing**
- **SQLite**

## Estrutura do Projeto

FootballShirtsStore/

├── images/
│   ├── messi.jpg
│   ├── ronaldo.jpg
│   ├── neymar.jpg
│   ├── mbappe.jpg
│   └── salah.jpg
├── src/

│   ├── database/

│   │   └── Database.java
│   ├── models/

│   │   ├── Pessoa.java
│   │   ├── Cliente.java
│   │   ├── Vendedor.java
│   │   ├── Produto.java
│   │   ├── Venda.java
│   │   ├── ItemVenda.java
│   │   ├── Carrinho.java
│   │   ├── FormaPagamento.java
│   │   └── Estoque.java
│   ├── views/

│   │   ├── MainView.java
│   │   ├── LoginView.java
│   │   ├── CartView.java
│   │   └── PaymentView.java
│   ├── controllers/

│   │   ├── MainController.java
│   │   ├── LoginController.java
│   │   ├── CartController.java
│   │   └── PaymentController.java
│   └── App.java
└── FootballShirtsStore.iml



## Instalação e Execução

### Pré-requisitos

- JDK 17 ou superior
- IDE de sua escolha (recomendado: IntelliJ IDEA)
- SQLite JDBC Driver

### Passos para Configuração

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/FootballShirtsStore.git
    cd FootballShirtsStore
    ```

2. **Adicione o SQLite JDBC Driver ao projeto**:
    - Baixe o driver JDBC para SQLite [aqui](https://github.com/xerial/sqlite-jdbc/releases).
    - Adicione o arquivo JAR do driver ao classpath do seu projeto.

3. **Estrutura de Diretórios para Imagens**:
    - Certifique-se de que as imagens das camisas estejam na pasta `images` na raiz do projeto, conforme mostrado na estrutura do projeto.

4. **Compile e Execute o Projeto**:
    - Abra o projeto na sua IDE.
    - Compile e execute a classe principal `App.java`.

### Estrutura das Classes

- **Database**: Gerencia a conexão com o banco de dados SQLite e a criação de tabelas.
- **Pessoa**: Classe base para `Cliente` e `Vendedor`.
- **Cliente**: Subclasse de `Pessoa`, representando um cliente.
- **Vendedor**: Subclasse de `Pessoa`, representando um vendedor.
- **Produto**: Representa uma camisa de futebol.
- **Carrinho**: Gerencia os itens que o cliente deseja comprar.
- **ItemVenda**: Representa um item dentro de uma venda.
- **FormaPagamento**: Representa os diferentes tipos de pagamento.
- **Estoque**: Gerencia a quantidade de produtos disponíveis.
- **MainView**: Interface da vitrine de produtos.
- **LoginView**: Interface de login.
- **CartView**: Interface do carrinho de compras.
- **PaymentView**: Interface de pagamento.

## Melhorias Futuras

- **Melhorar a Aparência Visual**: Usar `LookAndFeel` personalizado para uma melhor experiência do usuário.
- **Sistema de Cadastro e Login de Usuários**: Implementar registro de usuários e armazenamento seguro de senhas.
- **Persistência do Carrinho**: Salvar o carrinho no banco de dados para sessões futuras.
- **Sistema de Avaliação e Comentários de Produtos**: Permitir que os usuários avaliem e comentem sobre os produtos.
- **Integração com APIs de Pagamento**: Integrar com APIs reais como Stripe ou PayPal.
- **Testes Unitários**: Adicionar testes unitários e de integração para garantir a funcionalidade do sistema.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorar o projeto.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

- Autores: Gabriel Menezes / Bruce Vinicius
- Email: gabrielmenezesrezende@gmail.com / bruce.vinicius.bv@gmail.com
- GitHub: ((https://github.com/gabrielmenezesr)) (https://github.com/brucemonteiro)
- 
