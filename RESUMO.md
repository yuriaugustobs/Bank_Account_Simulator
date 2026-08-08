# Resumo — Método `exibirResumo()`

Este documento descreve o método `exibirResumo()` presente no projeto **Bank Account Simulator**.

## O que é

O `exibirResumo()` é um método utilitário que imprime no terminal um resumo rápido e centralizado das informações da conta criada pelo usuário. Ele foi pensado para ser usado depois que a conta já foi cadastrada (opção `1` do menu), reunindo em uma única linha os dados essenciais: **nome do titular**, **número da agência** e **saldo atual**.

## Onde está

- **Classe:** `BankAccountSimulator`
- **Arquivo:** `src/BankAccountSimulator.java`

## O que ele imprime e em que formato

O método gera **uma única linha** de saída no console, no formato abaixo:

```
Resumo da conta — Nome: <nome> | Agência: <agência> | Saldo: $<saldo>
```

Os campos são separados por ` | ` e a linha começa com o prefixo `Resumo da conta — `.

## Campos da classe utilizados

O método não recebe parâmetros. Ele lê diretamente três atributos estáticos da própria classe `BankAccountSimulator`:

| Campo           | Tipo     | Descrição                          |
|-----------------|----------|------------------------------------|
| `name`          | `String` | Nome do titular da conta.          |
| `agencyNumber`  | `String` | Número da agência informada.       |
| `balance`       | `double` | Saldo atual da conta.              |

## Exemplo de saída

Se o usuário cadastrou uma conta com nome `Maria`, agência `1234` e saldo `250.0`, a chamada `exibirResumo()` produz:

```
Resumo da conta — Nome: Maria | Agência: 1234 | Saldo: $250.0
```

> Observação: o método não faz validação por conta própria — ele assume que os campos já foram preenchidos pela rotina de criação de conta (opção `1` do menu). Caso a conta ainda não tenha sido criada, os valores padrão (`name = ""`, `agencyNumber = ""`, `balance = 0`) serão exibidos.