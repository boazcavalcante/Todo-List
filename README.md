# Todo List com JSF e MySQL
## Descrição
<p>
Esta é uma aplicação Java Web (Java EE 7) que faz a criação, listagem, atualização e remoção de um registro (CRUD).

A aplicação foi desenvolvida no NetBeans IDE 8.2 RC. Ela roda sobre o servidor Apache TomCat (v8.0.27) e é acessada através de um navegador de internet (Google Chrome, Mozilla Firefox, etc).

A base da aplicação foi construída em JSF (v2.2) com JDK (v1.8), e utiliza o SGBD MySQL (v5.5). Na camada de persistência de dados foi utilizado o framework ORM (Object Relational Mapping) Hibernate (v4.3) que implementa a especificação JPA (v2.1). Para o Hibernate se conectar ao MySQL foi utilizado o driver mysql-connector-java (v5.1.13). A interface foi estruturada em XHTML, com componentes Primefaces (v7.0) e Bootstrap (BootsFaces v1.4.2).
</p>

## Execução
<p>
Para a execução correta da aplicação recomendo as ferramentas NetBeans IDE 8.2 (Distribuição Java EE) e MySQL Server 5.7. 
As bibliotecas disponibilizadas suportam apenas esta versão do MySQL. Tendo isto, siga os seguintes passos:

1 - Inicie o MySQL Server e execute o Script “todo.sql” que se encontra na pasta “/database”, para criar o banco de dados com a tabela usada na aplicação. 

2 - Abra o projeto no NetBeans e rode o servidor.

3 -  Acesse a aplicação localmente no endereço “http://localhost:8084/TodoList/” ou remotamente trocando o “localhost” pelo IP da máquina com o TomCat.
</p>

## Troubleshooting
<p>
Durante a configuração das ferramentas alguns erros podem ocorrer. Algumas bibliotecas podem ser incompativeis com versões diferentes de ferramentas instaladas.
Para minimizar a chance de erro na aplicação, listo aqui algumas soluções para possiveis problemas.

- Se, ao abrir o projeto, aparecer uma janela informando “Problemas no projeto”, clique em “resolver problema”. Será mostrada uma lista de bibliotecas com problemas, clique em “resolver” e procure a biblioteca correspondente na pasta “/libraries”.

- Caso o navegador não encontre a página, altere o número da porta de acordo com as suas configurações do Apache. Certifique-se de configurar o usuário e senha do TomCat.

- Caso a aplicação possua erros de conexão com o banco, abra o arquivo localizado em “/src/java/hibernate.cfg.xml” e altere as configurações do Hibernate de acordo com as propriedades do MySQL (Usuario, Senha, URL , Driver e Dialeto). Se você estiver usando outra versão do MySQL ou outro SGBD, busque pelo driver de conexão específico do seu banco.
</p>
