### The-Cat-API
## Resolução do case SRE 

## Descrição

Para solução optei por construir a aplicação com o Framework SpringBoot e Linguagem de programação Java

Busquei simplificar o código.
Utilizando injeção de dependências pelo dump fazendo backup do MYSQL, rodando dois containers no DOCKER, um para o banco e outro para o SpringBoot.

### Fatos interessantes

* Os endpoints estão completos, apesar de ser apenas solicitado os métodos GET.
# Na URI temos três parâmetros:
- '/breeds': acessa informações de todas as raças de gatos, contendo origin(origem), temperament(temperamento),name(nome da raça), description(descrição).  
- '/glasses':acessa informações de 3 imagens de gatos de óculos, contendo a url. 
- '/hat': acessa informações de 3 imagens de gatos de chapéu, contendo a url.

## O que será necessário?

- Docker para buildar os container
- Postman ou de sua prefêrencia para consumir as API
 -Git para clonar o projeto

### Como rodar as aplicações?
1.  Clone o meu repositório em seu diretório local.
- Através do comando: git clone https://github.com/gssouza10/The-Cat-API.git
<br><br>
2. Abra o Docker Desktop para iniciar
3. Na pasta do projeto navegue até o diretório contendo o docker-compose.yml
- Na pasta do projeto navegue até \The-Cat-API\src e copie
<a href="https://imgur.com/zwGths1"><img src="https://i.imgur.com/zwGths1.png" title="source: imgur.com" /></a>
4. abra o cmd  <br><br>
<a href="https://imgur.com/mx2VW22"><img src="https://i.imgur.com/mx2VW22.png" title="source: imgur.com" /></a>
5.  digite cd e cole o caminho copiado <br><br>
<a href="https://imgur.com/8I4JPkf"><img src="https://i.imgur.com/8I4JPkf.png" title="source: imgur.com" /></a>
6.  Com o Docker ligado execute o seguinte comando: docker-compose up -d --build <br><br>
<a href="https://imgur.com/tHMmCNc"><img src="https://i.imgur.com/tHMmCNc.png" title="source: imgur.com" /></a>
7. Logo após execute o comando: docker ps <br><br>
<a href="https://imgur.com/t7i7rVh"><img src="https://i.imgur.com/t7i7rVh.png" title="source: imgur.com" /></a>
8. Depois copie o primeiro id do container e digite o comando: docker logs -f id_copiado <br><br>
<a href="https://imgur.com/rN8i1ba"><img src="https://i.imgur.com/rN8i1ba.png" title="source: imgur.com" /></a>
9. espere rodar até aparecer a mensagem JVN running e logo após aperte ctrl+C e digite o seguinte comando: docker exec -i src_db_1 mysql -uroot -p"Admin357/" db_thecatapi < db.sql <br><br>
<a href="https://imgur.com/JNXfTyX"><img src="https://i.imgur.com/JNXfTyX.png" title="source: imgur.com" /></a>


