## Site ToDo - Lista de Tarefas

O aplicativo consiste em um ToDo, ou seja, uma lista de tarefas, gravando-as em um banco de dados utilizando persistência (JPA). Estas tarefas, por sua vez, serão exibidas em uma lista, e seu status pode ser alterado pelos botões Finalizar (caso a tarefa estaja ativa e tenha terminado) e Iniciar (caso a tarefa tenha sido finalizada e precise ser iniciada novamente). É possível alternar entre três tipos de tabela: A tabela principal (Todo) que exibe todas as tarefas do banco de dados, a tebela "Finalizado" que exibe todas as tarefas concluidas e a tabela "Em andamento" que mostra as tarefas ativas. Essa transição entre tabelas fica por conta do controlador criado utilizando Spring MVC. 
Além disso, o botão "Apagar Finalizados" permite que o usuário apague do banco de dados todas as tarefas finalizadas.

### Itens implementados

Dos itens dispostos para implementar o projeto, foram utilizados:

A. Fazer uma aplicação utilizando JSF

B. Utilizar persistência em um banco de dados (qualquer banco desejado)

C. Utilizar Hibernate e JPA

D. Utilizar Spring MVC

E. Utilizar Bootstrap 4

F. Utilizar Primefaces

G. Utilizar testes de unidades

H. Criar single page app utilizando react (que pode ser vista em [ffb_todo](https://github.com/felipeferreirabarbosa/ffb_todo_spa))

I. Publicar projeto no heroku ([http://ffbtodo.herokuapp.com/](http://ffbtodo.herokuapp.com/))

### Instruções para execução em um ambiente local

Para execução deste projeto em ambiente local, deve-se baixar e "deszipar" o arquivo neste repositório, preencher as configurações referêntes ao banco de dados (Usuário, senha, Et Cetera) contidos no arquivo todo/src/main/webapp/META-INF/persistence.xml (indica-se utilizar um banco de dados PostgreSQL).
A realização do projeto utilizou a IDE Eclipse JEE, então, indica-se que abra o projeto nesta IDE, executando-o em um servidor Tomcat versão 7.0.



