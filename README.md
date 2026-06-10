# Lista de Exercícios 02 - Teste Estrutural e Teste de Mutação

## Contexto geral

Este projeto Maven já está configurado com Java 17, JUnit 5 e JaCoCo. As classes necessárias já estão implementadas no pacote `br.ufrn.dimap.services`.

Nesta lista, você deve analisar o código, criar testes unitários com JUnit 5 e interpretar os relatórios gerados pelas ferramentas de cobertura e mutação.

Você não deve alterar as classes para resolver as questões. Crie apenas classes de teste em `src/test/java/br/ufrn/dimap/services`.

## Instruções de execução

Para compilar o projeto:

```bash
mvn clean compile
```

Para executar os testes unitários:

```bash
mvn test
```

Para gerar o relatório de cobertura com JaCoCo:

```bash
mvn clean test
```
Após a execução, com a extensão Live Preview da Microsoft, procure arquivo index.html em target/pit-reports, aperte o botão direito do mouse em cima do arquivo e na opção "Show Preview" e visualize os resultados.
