Conversor de Moedas 🌎💱
Descrição

## 🚀 O Conversor de Moedas é uma aplicação Java simples que permite converter valores entre diferentes moedas com base nas taxas de câmbio mais recentes, obtidas diretamente de uma API externa (ExchangeRate API).

## 💰 Atualmente, o programa suporta as seguintes moedas:

    BRL - Real Brasileiro
    USD - Dólar Americano
    ARS - Peso Argentino
    CLP - Peso Chileno
    PEN - Novo Sol Peruano
    COP - Peso Colombiano

## 📚 Como Funciona

    O programa apresenta um menu com as opções de moedas disponíveis.
    O usuário insere a moeda de origem, a moeda de destino e o valor a ser convertido.
    A aplicação faz uma requisição à API para obter a taxa de câmbio atualizada.
    O valor convertido é exibido ao usuário.

Caso o usuário digite "0" como opção de moeda de origem, o programa será encerrado.
Requisitos

    Java 8 ou superior: Certifique-se de que sua máquina tem o Java Development Kit (JDK) instalado.
    Biblioteca Gson: Para parsear os dados JSON da API.
    Conexão com a internet: Necessária para acessar as taxas de câmbio.

## 📦 Configuração e Execução
1. Clone o repositório:

git clone https://github.com/seu-usuario/conversor-de-moedas.git
cd conversor-de-moedas

2. Compile os arquivos Java:

javac -cp gson-2.8.9.jar:. Main.java

3. Execute o programa:

java -cp gson-2.8.9.jar:. Main

## ✅ Exemplo de Uso
Entrada:

*************************************************
No momento, dispomos destas moedas abaixo para troca:
1. BRL - Real brasileiro
2. USD - Dólar americano
3. ARS - Peso argentino         
4. CLP - Peso chileno
5. PEN - Novo sol peruano
6. COP - Peso colombiano
0. Sair  
*************************************************
Digite a moeda de origem (ex: USD): USD

Digite a moeda de destino (ex: BRL): BRL

Digite o valor a converter: 100

Saída:

100.00 USD equivale a 508.35 BRL
******************************
$ Obrigado pela preferência! $

## 🚧 Estrutura do Código
conversor-moedas/

├── src/

│   ├── Main.java

│   ├── ConversorDeMoeda.java

│   └── ServicoIndiceDeCambio/
└── TaxaDeCambioAPI.java

├── README.md

└── .gitignore
    
## 🛠️ API Utilizada

    ExchangeRate API: Oferece dados de taxas de câmbio em tempo real.

Exemplo de URL da API:

https://v6.exchangerate-api.com/v6/<sua-chave-de-api>/latest/USD

    Substitua <sua-chave-de-api> pela sua chave de API pessoal.

## 🖥️ Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.
