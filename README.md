UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
TPPE - Técnicas de Programação para Plataformas Emergentes  

## Integrantes do grupo

| Nome | Matrícula |
|--- |--- |
| Amanda Nobre | 19/0124997 |
| Irwin Schmitt | 17/0105342 |
| Sara Campos | 17/0045269 |
| Thaís Rebouças | 18/0078224 |
| Thiago França | 17/0114929 |
| Victor Yukio | 18/0068229 |


## Trabalho Prático 1 - _Test-Driven Development_

**Enunciado** 

Seja o cenário descrito a seguir: 

> Cálculo da completude de informações estruturadas, aninhadas ou não: 
> 
> Um sistema de informações deve, dentre várias outras atribuições, calcular o
> quão completa é uma informação que ele processa baseado em um modelo
> descritivo das informações sob análise. As informações são sempre tratadas
> como valores textuais, independentemente se o valor é de fato um texto ou não.
> Avaliar a completude, nesse caso, significa verificar a presença ou ausência
> de algum valor para o campo correspondente. 
> 
> Um registro, i.e. um conjunto de informações científicas agregadas, é composto
> de vários campos, podendo cada um desses campos serem atômicos ou compostos em
> vários níveis. Exemplos: 
> * Atômico: CPF
> * Atômico: Matricula
> * Atômico: Sexo 
> * Atômico: Email
> * Composto: Nome
>   * Atômico: PrimeiroNome
>   * Atômico: NomeMeio
>   * Atômico: UltimoNome
> 
> Os campos podem ser agrupados para criar novos campos formando uma árvore de
> campos para os registros. Essa árvore deve respeitar o modelo de dados sob
> análise. Exemplo:
> * Composto: PessoaFisica
>   * Composto: Nome
>     * Atômico: PrimeiroNome
>     * Atômico: NomeMeio
>     * Atômico: UltimoNome
>   * Atômico: CPF
>   * Atômico: Matricula
>   * Atômico: Sexo 
>   * Atômico: Email
> 
> Os campos aninhados podem ser agrupados seguindo duas regras lógicas bem
> conhecidas. A regra OU EXCLUSIVO estabelece que o campo raiz é considerado
> completo quando apenas um dos campos filhos está presente, qualquer um dos
> campos filhos agregados. A regra OU INCLUSIVO estabelece que o campo raiz é
> considerado preenchido quando pelo menos um campo filho está presente. O caso
> especial em que nenhum campo filho está presente é considerado como
> não-preenchido. Para o campo raiz ser considerado completo, todos os campos
> filhos devem estar presente. 
> 
> Para o caso de campo atômico, ele é considerado completo se há um valor
> atribuído a ele. 
> 
> O cálculo da completude de um registro é feito de maneira recursiva, de modo
> que o valor da completudo do campo pai de um registro é dado pelo valor da
> completude de seus filhos, considerando as regras apresentadas anteriormente. 
>
>O trabalho deverá apresentar o emprego das três técnicas de TDD (falsificação,
duplicação e triangulação) em, pelo menos, nas três seguintes situações: 
>
> * Calculo da completude de campos OR EXCLUSIVO; 
> * Cálculo da completude de registros multi-campos.
>
> Nesses dois casos deverá, para efeito de evidência, ter a seguinte sequencia de
_commits_:
> * falsificação; 
> * duplicação; 
> * triangulação.
---

## Resolução do grupo

Para resolver o problema em questão, o grupo utilizou a seguinte lógica para calcular a completude dos campos:

![logica](assets/logica.png)

Foram criadas classes para representar o Publication e os atributos compostos (Identifier e Author) e resto dos campos atômicos foram tratados como atributos.

O trabalho apresenta as três técnicas do TDD, falsificação, duplicação e triangulação, feitas nessa respectiva ordem como pode ser visto nos seguintes commits:

Falsificação: [Falsificação Identifier](https://github.com/yukioz/TP1-TPPE-2023.1_TDD_Grupo-TIVAS/commit/731424ba30a19a63390adc9a12b6342c908c48e4), [Falsificação Author](https://github.com/yukioz/TP1-TPPE-2023.1_TDD_Grupo-TIVAS/commit/6c146cb18ae0d45e8fd0613e63ab73e6e94055fa), [Falsificação Publication](https://github.com/yukioz/TP1-TPPE-2023.1_TDD_Grupo-TIVAS/commit/0c1aded8fbd5f96b6323a4a49442619d50be487a)

Duplicação: [Duplicação Identifier](https://github.com/yukioz/TP1-TPPE-2023.1_TDD_Grupo-TIVAS/commit/6b05548cb4206ae32263ea7918e01cc5ee22109f), [Duplicação Author](https://github.com/yukioz/TP1-TPPE-2023.1_TDD_Grupo-TIVAS/commit/b351d84ee5326ed98b895013db2ecce4e82af316), [Duplicação Publication](https://github.com/yukioz/TP1-TPPE-2023.1_TDD_Grupo-TIVAS/commit/4e5c76e2650067372a4f5f381842b1ed5ec6f1fe)

Triangulação: [Triangulação Identifier](https://github.com/yukioz/TP1-TPPE-2023.1_TDD_Grupo-TIVAS/commit/a8c1449947aca456afe7b61792d42e21c8dfd276), [Triangulação Author](https://github.com/yukioz/TP1-TPPE-2023.1_TDD_Grupo-TIVAS/commit/3b7a3f843fa46ad20c323f254d7e88444c26a762), [Triangulação Publication](https://github.com/yukioz/TP1-TPPE-2023.1_TDD_Grupo-TIVAS/commit/dde7478715b911f1a6bb777d64216de6b3edcf5d)

Todos os métodos para verificar a completude estão testados e parametrizados a partir do JSON dispoibilizado pelo professor.

## Screenshots
Testes sendo executados no VSCode
![rodando-1](./assets/rodando.png)

Testes sendo executados no IntelliJ
![rodando-2](./assets/rodando-2.png)

## Instalação 
**Linguagem**: Java (gradle) JDK 17

### Eclipse

Siga os passos:

![eclipse-1](./assets/eclipse-1.png)

![eclipse-2](./assets/eclipse-2.png)

![eclipse-3](./assets/eclipse-3.png)

![eclipse-4](./assets/eclipse-4.png)

![eclipse-4](./assets/eclipse-5.png)

### vsCode

Siga os passos:

1) Verifique se o gradle na versão 8.1.1 está instalado na sua máquina.

2) Vá para a pasta do projeto (T1-Project) e digite os comandos no terminal:

```console
 $ gradle build
 $ gradle test
```

### Intellij

Siga os passos:

1) Abra o projeto com a opção de gradle e java.

2) Execute o passo:

![intellij-1](./assets/intellij-1.png)