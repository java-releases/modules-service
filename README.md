![](https://github.com/ocpjp-study/modules-service/blob/main/modules-service.png)

### Tópico: Serviços em uma aplicação modular
### Objetivos
- Descrever os componentes de serviços incluindo diretivas;
- Desenhar um Tipo de serviço, usando ServiceLoader, consumindo e fornecendo módulos;

<hr>

### Resumo

> #### Service Provider Interface
  - É o fornecimento de uma interface ou uma classe abstrata;
  - É considerado parte de um serviço;
  - Diretivas:
    - `exports`: indica os pacotes que serão exportados, para outros módulos poderem utilizar. 
   <br/><br/>
    
> #### Service Provider 
- É a implementação de um Provider Interface;
- Não é considerado parte de um serviço;
- É possível ter muitas implementações;
- Não exportamos o pacote contendo a implementação;
- Java permite apenas um service provider por interface, se você quiser oferecer um outro , então deverá criar um outro módulo;
- Diretivas: 
  - `requires`: indica os módulos que o mesmo depende para executar.
  - `provides`: indica que um módulo fornece uma implementação de um serviço.  
  <br/><br/>
  
> #### Service Locator
  - Responsável por encontrar qualquer classe que implemente um Service Provider Interface;
  - É considerado parte de um serviço;
  - Diretivas:
    - `requires`: indica os módulos que o mesmo depende para executar.
    - `exports`: indica os pacotes que serão exportados, para outro módulos poderem utilizar.
    - `uses`: indica que um módulo usa um serviço. Declara que uma API é chamada.
  <br/><br/>
  
> #### Consumer (client)
  - É o módulo que obtém, e usa o serviço de fato;
  - Não é considerado parte de um serviço;
  - Diretivas:
    - `requires`: indica os módulos que o mesmo depende para executar.
