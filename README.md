# Zoológico Virtual (Java)

Simulação de um zoológico via terminal, feita como projeto de fixação de conceitos de Programação Orientada a Objetos em Java.

## O que faz

O programa roda em loop contínuo e permite:

- **Cadastrar** animais (Leão ou Pinguim), informando nome, peso e idade
- **Listar** todos os animais cadastrados
- **Alimentar** um animal específico, com validação de peso máximo

## Tecnologias

Java puro, sem dependências externas. Entrada de dados via `Scanner`.

## Estrutura

```
Animal.java     -> classe base (abstrata na prática, embora não declarada como abstract)
Leao.java       -> herda de Animal, adiciona comportamento cacar()
Pinguim.java    -> herda de Animal, adiciona comportamento nadar()
Main.java       -> menu interativo em loop, controla o fluxo do programa
```

## Conceitos de POO aplicados

- **Encapsulamento**: atributos de `Animal` são privados, acessados via getters
- **Herança**: `Leao` e `Pinguim` estendem `Animal` e reutilizam o construtor via `super()`
- **Polimorfismo**: `emitirSom()` é sobrescrito de forma diferente em cada subclasse
- **Tratamento de exceções**: `alimentar()` lança uma exceção quando o peso ultrapassa o limite (300kg), capturada no `Main` com try/catch
- **Sobrescrita de `toString()`**: personaliza a exibição do animal na listagem, usando `getClass().getSimpleName()` para mostrar o tipo dinamicamente

## Como rodar

```bash
javac Main.java Animal.java Leao.java Pinguim.java
java Main
```

## Possíveis melhorias futuras

- Declarar `Animal` como classe abstrata, já que não deveria ser instanciada diretamente
- Adicionar mais espécies sem alterar o `Main` (usando um mapa de fábricas, por exemplo)
- Persistir os dados dos animais entre execuções (arquivo ou banco de dados)
