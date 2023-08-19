# Exercicios---Android-Studio

# Atividade de PAM
## Exercícios escolhidos: 3 e 6


## Criando Repositório
![Criando Repositorio](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/7d86d4b9-8cc3-4c09-bafb-34088d9fc59b)

## Colocando Projeto no Repositório criado, pelo GitBash (por linha de comando)
>
Comandos usados: git init e git add .
>
![git init e git add.](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/7550ff89-18a4-4508-9b8d-05c27c9c977d)

Comando usados: git status 
>
![git status](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/ac7ab4c1-9008-4160-9097-b4402f8a1559)
 

> Primeiro Commit, feito após o layout ficar pronto, 
Comando usado: git commit -m 
![git commit](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/42583d84-6a99-4d6b-a3f8-8e6a5fcd4638)


> Colocando o link no repositorio e empurrando o projeto
Comandos usados: git remote origin e git push
![Git Bash](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/e76b5e6f-c751-4792-920a-577b0790acfe)


## Resultado (Colocando o projeto no Repositório)
![Resultado do primeiro commit](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/abd4c9f9-2c38-4acc-9643-4a6ea498e5e6)


## Exercício 3
> Elementos de layout: Toolbar, 2 EditText, 2 buttons, 3 TextView
> 
> Toolbar (Elemento para enfeitar)
> 
> 2 EditText, onde o usuário irá digitar os minutos (Extras e Faltas)
> 
> 2 botões, 1 para verificar (onde todos os cálculos estaram programados) e outro para ir para o próximo exercício 
>
> No processo de criação de tela:(adicionando os elementos de layout), mudando seus id e posicionando na tela,
>
> Assim como as strings (textos/palavras) que irão aparecer na tela eram declaradas no ARQUIVO DE STRINGS, através do id declarados 
>
> 
## Elemento de Layout Utilizado: Toobar (Somente para o layout da pagina)
> Geralmente a Toolbar é implementada para servir como barra de tarefas de app, no entanto no exercício será somente utilizado para complementar o layout da tela 

## Print da tela
![Layout Exercicio 3](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/fa805771-189a-4ed8-9db8-8350d41f63bd)


### Código XML 
> No código do layout, foi adicionado um novo atributo sendo ele(android:inputType="number")
> Que serve para abrir somento o teclado númerico do celular
> 
>  ![teclado numerico](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/d7308c6f-4be3-4311-9354-87276695998f)

## Código Java 
>
> Primeiro os elementos que serão utilizados são declarados: tipo de elemento e o id dele
>
![Elementos](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/e9a98902-8648-4271-a48b-a93389fdc176)
>

> No codigo a seguir a anotação @SuppressLint("MissingInflatedId") foi inserida (por sugestão do android) pois um elemento de layout está sem id definido (toolbar) 
>
> E a seguir os elementos de layout que estão na activity_main_activity2_tela2 estão sendo instânciados 
> 
![Elementos](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/19a950e6-ad70-4cb8-a07a-d0313bb14305)
>
> O botão verificar será programado (onde todos os cálculos são programados)  
>
> Primeiro: Um método de tratamento de evento de clique o botão 
>
> 2 variáveis são criadas para receberem os valores digitados nas caixas de text
> Me para os minutos extras
>
> Mf para os minutos faltados
>
> Em seguida os valores digitados na caixa de texto serão convertidos em double, assim declarando novas variáveis para receberem o valor (Me e MF)
>(serão usados no calculo)
>
![Conversão](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/aabc2659-cf0c-4cbd-ac61-2098111e9a59)
>
> O Exercícios pede que os minutos digitados sejam transformados em horas e mostrados na tela junto com o valor do prêmio
>
> Então antes de verificar o prêmio os minutos serão convertidos e mostrados na tela 
>
> Novas Variáveis são criadas para receberem os novos valores, sendo elas Horas e Horas2
>
> A variável Horas pegará o valor dos minutos extras
>
> A variável Horas 2 pegará o valor dos Minutos Faltados
>
> Ambos transformados em horas e apresentados em textview diferentes

![image](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/e92894e5-72af-4483-bc2c-ac8060227019)



> Após converter os valores em horas o cálculo para verificar o prêmio é feito 
>
> Criando a variável H 
>
> Calculo: double H = Me - (2.0 / 3.0) * Mf;
>
> Após fazer o cálculo, o proximo  passo é fazer a verificação de acordo com a tabela do exercício, de acordo com o resultado os o valor do prêmio é definido
> 
> Utilizando a estrutura if e else
> 
> Após cada condição o resultado deve aparecer na tela
> 
>
> Exemplo: txtresult.setText("O prêmio é de R$500,00");

![Cálculo e Estrutura](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/eb07d7c7-29aa-4a4d-92c1-64a568929280)

> Por ultimo o botão próximo é programado, direcionando para a próxima tela, criando uma nova intent 
![Programando o botão próximo](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/271a135b-10dd-49d3-9b74-f2738390c1a8)

> Esse exercício foi testado no celular e está funcionado

## Git Bash
> Colocando o código do exercício 3 no repositório (Colocando as alterçoes feitas)
> 
> git add. e depois git commit e git push
>
> Print do git push
> 
![git push](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/6447af08-3c5b-4d51-9c59-596e96cc3936)
> 
### Colocando alterações do exercício 3
>
![alteracao](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/a81694ba-6608-4a5f-b8d0-eb4a04fa7df8)
>
![alteração](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/f9dec58d-5306-462e-878a-4a947f0bdd42)

# Exercício 6 
> Elementos de layout: Toolbar, 3 EditText, 2 buttons, 3 Check Box
>
> Toobar (Somente para enfeitar)
>
> 3 Edit text, todas servem para a entrada da quantidade de cada produto
>
> 2 button, 1 para Finalizar o pedido, somando tudo e outro  para voltar ao começo do app 
>
> 3 CheckBox, as 3 servem para o usuário selecinar o produto ao seu pedido
>
>  No processo de criação de tela (adicionando os elementos de layout), mudando seus id e posicionando na tela,
> Assim como as  strings (textos/palavras) que irão aparecer na tela eram declaradas no arquivo de strings, através do id 

## Elemento de Layout Utilizado: CheckBox
> O elemento de layout "CheckBox" foi utilizado para que o usuário possa selecionar o produto desejado, tendo um sistema de escolha
> 
> Como o própio nome diz é uma caixa de seleção, possibilitando o usuário a escolher vários itens
> 
> No exercício o usuário irá selecionar o codigo no produto
> 
> O usuário irá escolher o código do produto, sendo eles:
> 
> C para CachorroQuente
> 
> R para Refri
> 
> S para sobremessa  

## Print da tela
![Print - Exercício ](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/21b2cf35-2400-4139-aceb-6bb5ded89b8f)

### Código XML 
>
> Assim como no exercício 3 o atributo (android:inputType="number") foi inserido no código de cada EditText, servindo para abrir somente o teclado númerico 
>
## Código Java 
>
> Em primeiro os elementos de layout e seus id's são declarados
> [ID elementos](https://github.com/EloaVasconcelos/Programacao-Web-PESSOAL-/assets/127448572/4a07c563-8b8a-4766-b95c-ba23c712cc37)
> 
> Em seguidas esses elementos são instânciados, antes do botão (Finalizar Pedido)
> 
![Instânciando](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/612698ab-32e5-49c5-9af7-f5c22b3da344)

> Calucando o PEDIDO:
> 
> De inicio dentro do bntfinalizar, 4 variáveis são criadas, recendo valor nulo de inicio. Pois em seguida serão utilizadas para Cálculos
> 
![4 variáves](https://github.com/EloaVasconcelos/Programacao-Web-PESSOAL-/assets/127448572/81ef1df6-7629-41be-945d-93d3a6acdba3)
>
> Após declarar as variáveis uma estrutura de if vai ser criada, e as variáveis criadas serão usadas em cada checkbox 
>
> Na estrutura if e else abaixo: As 3 checkbox são programadas, onde caso estejam selecionadas um calculo será feito
>
> Pegando a quantidade do produto (definido pelo usuário na edittext referente ao produto)
>
>  E multiplicando pelo seu respectivo valor
>
> Isso se repete nas 3 checkbox
>
> Cada cálculo irá cair em uma variável diferente
>
> ![Estrutura if nas check box](https://github.com/EloaVasconcelos/Programacao-Web-PESSOAL-/assets/127448572/18f013a7-1e27-4cef-be6c-6940cc86f4f2)
>
> Em seguida todos os valores obtidos com os produtos selecionados (CHECKBOX)  e suas devidas quantidades (EDITTEXT)
>
> Um cálculo é feito somandos todas, através da variáveis que estão "armazenando" o valor de cada uma
>
> Criando uma última variável = "Valor final" que somará tudo
>
![Somando os resultados](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/835f7cdd-9247-401e-9614-7572e8e29228)
>
> Após todo processo o resultado é mostrado na tela através da textview
>
> Onde um formato é declarado para o resultado final, sendo ele:
>
> String.format("%.2f", valorFinal)) possibilitando um valor com 2 casas decimais (ponto flutuante) no resultado 
![Mostrando resultado final](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/5588e5fe-f106-4954-9b3d-7425064f15f6)

>
> Por final o botão voltar é programada com uma intent (voltar)
>
> Esse botão leverá para a tela inicial do projeto 
![Botão voltar](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/653caa77-541d-4c23-a915-029d94582ae5)


### Penultimo commit - 
> Exercícios testados e funcionando
> Colocando as alterações no repositório do github
> 
> ![git add.](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/efc3f742-4fc3-43dc-913f-186990c8377a)
> 
> ![git commit](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/fdd0912c-c214-49d0-a842-c4e3362e1737)
> 
> ![git push](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/9813c3f5-ee02-4827-bc6a-733f229799ab)

## Ultimo commit - Alteracao 
>
![image](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/a1d31dfc-2021-442b-93f2-25b65e20e4e1)
>
![image](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/b9e7ac37-f194-4b7b-a1ca-151930793c7f)



## Arquivo de Strings do projeto

![image](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/92d95839-92be-42c1-9d63-7e1750672179)

# Vídeo da execução da app (De cada exercício)  
>
### Exercício 3
https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/4d876453-8d7f-41cf-b251-ab5df7439de5

>
### Exercício 6
https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/c1d6ba1e-898b-42d0-9f7c-b47202f18f04

>
### Interação das Telas
https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/a9238421-9617-451b-90bc-6bf0a136901a







