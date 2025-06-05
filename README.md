# 💱 Conversor de Moedas - Java

Este é um projeto desenvolvido como parte do **Challenge ONE - Back-End com Java** da [Alura](https://www.alura.com.br) em parceria com a [Oracle](https://www.oracle.com/br/education/oracle-next-education/).

O objetivo principal do desafio é criar um conversor de moedas que consuma dados em tempo real de uma API de câmbio.

---

## 🚀 Funcionalidades

- ✅ Conversão de moedas em tempo real usando API
- ✅ Interface simples via terminal (console)
- ✅ Estrutura de código clara e modular
- ✅ Tratamento de exceções para erros de rede ou conversão
- ✅ Moedas disponíveis: `BRL`, `USD`, `EUR`, `GBP`, `ARS`, `CLP`

---

## 🔧 Tecnologias e ferramentas

- Java 21
- `HttpClient` (requisições HTTP)
- Biblioteca **Gson** para parse de JSON
- API [ExchangeRate-API](https://www.exchangerate-api.com/)
- IntelliJ IDEA / VSCode

---

## 🌐 Exemplo de uso

```bash
Escolha uma opção:
1. BRL para USD
2. BRL para EUR
...

Digite o valor: 100
Resultado: 100.00 BRL = 19.20 USD
