## Tabela de Decisão utilizando Framework de DMN (Camunda)

Gostaria de apresentar uma engine de Decisão que tem o core desenvolvido em Java e é opensource, 
podemos utilizar em projetos e abstrair as regras e decisões da codificação, permitindo uma maior flexibilidade do sistema e foco no negócio.
<!-- blank line -->
<!-- blank line -->
### Framework: Camunda DMN 
<https://camunda.org/dmn>
<!-- blank line -->
<!-- blank line -->
_Fiz um exemplo hipotético de uma possível utilização do sistema._
<!-- blank line -->
### Caso de uso
<!-- blank line -->
_Valor do Resgate de um Plano de Previdência Privada_
<!-- blank line -->
**Descrição:** É preciso descobrir o valor do percentual de resgate do plano de acordo com os anos de contribuição.
<!-- blank line -->
### Solução por DMN

#### Passo 1. Criação da decisão
_Pode ser criada por XML, Excel (Equipe de Negócio) ou Java e importada para o dmn via linha de comando ou serviço REST._

**Exemplo em Excel:**
<!-- blank line -->
![Excel](https://github.com/darioajr/resgate-dmn/raw/master/screenshot/excel.png "Excel")


#### Passo 2 - Testar as decisões via portal do dmn
<!-- blank line -->
![Simulação](https://github.com/darioajr/resgate-dmn/raw/master/screenshot/simulate.png "Simulação")

#### Passo 3 - Utilização (Chamar a decisão passando os parâmetros de entrada)
_Pode ser realizado a chamada por REST, Java ou Fluxo de BPM._
<!-- blank line -->
![REST](https://github.com/darioajr/resgate-dmn/raw/master/screenshot/response.png "REST")


**Exemplo REST:**
<!-- blank line -->
_Exemplo em Java (Consumindo a regra via código)_
https://github.com/darioajr/resgate-dmn
<!-- blank line -->
![REST](https://github.com/darioajr/resgate-dmn/raw/master/screenshot/vscode.jpg "REST")

<!-- blank line -->
<!-- blank line -->
**Informações Extras:**
<!-- blank line -->
<https://github.com/camunda/camunda-engine-dmn>
<!-- blank line -->
<https://github.com/camunda/camunda-bpm-spring-boot-starter>
<!-- blank line -->
<https://docs.camunda.org/manual/7.7/modeler/camunda-modeler/dmn/>
<!-- blank line -->
<https://github.com/camunda/camunda-dmn-xlsx>
<!-- blank line -->
