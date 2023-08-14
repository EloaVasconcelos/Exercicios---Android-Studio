# Exercicios---Android-Studio

# Atividade de PAM
## Exercícios escolhidos: 3 e 6



## Criando Repositório
![Criando Repositorio](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/7d86d4b9-8cc3-4c09-bafb-34088d9fc59b)

## Colocando Projeto no Repositório criado, pelo GitBash (por linha de comando)
 Comandos usados: git init e git add .
![git init e git add.](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/7550ff89-18a4-4508-9b8d-05c27c9c977d)

Comando usados: git status 
![git status](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/ac7ab4c1-9008-4160-9097-b4402f8a1559)
 

> Primeiro Commit, feito após o layout ficar pronto, 
Comando usado: git commit -m 
![git commit](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/42583d84-6a99-4d6b-a3f8-8e6a5fcd4638)


> Colocando o link no repositorio e empurrando o projeto
Comandos usados: git remote origin e git push
![image](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/e76b5e6f-c751-4792-920a-577b0790acfe)


## Resultado (Colocando o projeto no Repositório)
![Resultado do primeiro commit](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/abd4c9f9-2c38-4acc-9643-4a6ea498e5e6)


## Exercício 3
> Elementos de layout: Toolbar, 2 EditText, 2 buttons, 2 
> TextView 

![Print do Layout](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/e073a5f6-723f-46c2-9273-7fb794833549)

### Código XML 
> No código do layout, foi adicionada, sendo ela (android:inputType="number") que serve para abrir somento o teclado númerico do celular 
>  ![teclado numerico](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/d7308c6f-4be3-4311-9354-87276695998f)

## Código Java 
> Primeiro os elementos que serão utilizados são, declarando o tipo de elemento e o id dele
![elementos](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/83ab16b9-23fd-4a91-9823-4e83c4087bdf)

##

> No codigo a seguir a anotação @SuppressLint("MissingInflatedId") pois um elemento de layout esta sem id definido 
>
> E a seguir os elementos de layout que estão na activity_main_activity2_tela2
![elementos](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/a1958f63-2bd5-4d2d-a3aa-12cab1ee8bab)


# 
> O botão verificar será programado 
>
> Primeiro: um método de tratamento de evento de clique para algum botão
>
> Em seguida os valores digitados na caixa de texto serão convertidos em double, assim declarando novas variaveis para receberem o valor (serão usados no calculo)
![convertendo os valores](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/015b80ba-0001-4ace-94ec-bf9b8f4fbb0f)




> O próximo passo é fazer que os valores inseridos(em horas) sejam transformados em minutos 
>
> Novas Variaveis são criadas para receberem os novos valores, sendo elas He (Horas extras) e Hf (Horas Faltas )
![Transformando em minutos](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/8d945f1d-9aad-4c6a-b64f-cb5a45ff2b21)

> Após converter os valores em minutos o calculo para verificar o prêmio é feito 
>
> Criando a variaveis H 
>
> Calculo: double H = Me - (2.0 / 3.0) * Mf;
![calculo](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/6e6d24d7-b5b2-43b4-a298-f4cf1352e349)

> Agora o proximo passo é fazer a verificação de acordo com a tabela do exercício, de acordo com o resultado os o valor do prêmio é definido 
>
> Utilizando a estrutura if e else 
>
> Após cada condição o resultado deve aparecer na tela 
> txtresult.setText("O prêmio é de R$500,00");
>
![Estrutura if e else](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/9f246222-c49b-4f7f-b48e-2fa5f8dd4c49)

> Por ultimo o botao próximo é programado, direcionando para a próxima tela 
![Programando o botão próximo](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/271a135b-10dd-49d3-9b74-f2738390c1a8)


> Esse exercício foi testado em celular e está funcionado

## Git Bash
> Colocando o código do exercício 3 no repositorio (Colocando as alterçoes feitas)
> git add., depois git commit e git push
>
> Print do git push
![git push](https://github.com/EloaVasconcelos/PamExercicios/assets/127448572/6447af08-3c5b-4d51-9c59-596e96cc3936)
### Colocando alterações do exercícioo 6 
![image](https://github.com/EloaVasconcelos/Exercicios---Android-Studio/assets/127448572/a81694ba-6608-4a5f-b8d0-eb4a04fa7df8)

