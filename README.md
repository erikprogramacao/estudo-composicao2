# 📝 Post & Comments - Estudo de Composição em Java

Este projeto simula o funcionamento do sistema de postagens e comentários de uma rede social. O objetivo principal foi aplicar conceitos de **composição de objetos** e implementar uma forma eficiente de manipulação de textos.

---

## 💡 Destaque de Aprendizado: `StringBuilder`

Este projeto marca o meu **primeiro uso prático da classe `StringBuilder`** em Java. 

Utilizei o `StringBuilder` no método `toString()` da classe `Post` para otimizar a concatenação de strings. É ideal usar essa abordagem em vez do operador `+` quando precisamos construir textos grandes em loops, pois ela economiza memória RAM.

### 📌 Cola de Sintaxe para Consulta Futura:
```java
// 1. Instanciar o construtor
StringBuilder sb = new StringBuilder();

// 2. Adicionar textos ou variáveis em sequência
sb.append("Texto estático: ");
sb.append(variavelObjeto);
sb.append("\n"); // Quebra de linha

// 3. Converter tudo para String no final
return sb.toString();
```

---

## 🛠️ Tecnologias Utilizadas

* **Java 17** (ou superior)
* **Paradigma de Programação Orientada a Objetos (POO)**

## 🧱 Estrutura de Composição

O sistema demonstra a relação **1 para muitos (1:N)**, onde:
* Um `Post` possui um momento, título, conteúdo e saldo de curtidas.
* Um `Post` contém uma lista de vários objetos do tipo `Comment`.

---

## 📋 Pré-requisitos e Como Executar

Você precisa ter o **JDK 17** (ou superior) instalado na sua máquina.

1. Clone o repositório:
```bash
git clone https://github.com
```
2. Acesse a pasta do projeto:
```bash
cd estudo-composicao2
```
3. Compile e execute a classe principal (geralmente com método `main`) através do seu terminal ou de uma IDE como IntelliJ IDEA ou Eclipse.

---
Feito com ☕ por [Erik](https://github.com)
