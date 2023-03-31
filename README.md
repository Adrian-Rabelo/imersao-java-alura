# Imersão Alura

Repositório com a semana da Imersão Java 2 da Alura

## Aulas
As aulas estão separadas em branches e listadas a seguir:
- [Aula 01](https://github.com/Adrian-Rabelo/imersao-java-alura/tree/aula-01/alura-stickers)
- [Aula 02](https://github.com/Adrian-Rabelo/imersao-java-alura/tree/aula-02/alura-stickers)
## Desafios
Os desafios serão separados em branches e estão listados a seguir:
- [Desafio 01](https://github.com/Adrian-Rabelo/imersao-java-alura/tree/desafio-01/alura-stickers)

**Este README contará com todos os links auxiliares de todas as aulas, enquanto cada branch terá seus próprios links relacionados a cada aula**
## Aula 01 - Consumindo uma API de filmes com Java
### Links, dicas e notas de aula
- Os 250 [melhores filmes de acordo com a classificação do IMDB](https://www.imdb.com/chart/top/).
- A [documentação da API do IMDB](https://imdb-api.com/api).
- Instalação do Visual Studio Code com o [Coding Pack para Java](https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java)
- Documentação da classe [HttpRequest do pacote java.net.http](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html).
- Classe pronta que utiliza Expressões Regulares para fazer [parse de um JSON](https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3).
- [Biblioteca Jackson, que faz parse de JSON](https://github.com/FasterXML/jackson).
- Site que ajuda a entender [Expressões Regulares]().
- Artigo: [Como deixar no seu GitHub com um README interessante](https://www.alura.com.br/artigos/escrever-bom-readme).
- O endpoint da API do IMDB que devolve os 250 melhores filmes: [https://imdb-api.com/en/API/Top250Movies/](https://imdb-api.com/en/API/Top250Movies/) + **SUA-API-KEY**

### Desafios desta aula
1. Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares. [Confira a resolução do desafio aqui](https://youtu.be/v4Dpul7b5bU)
2. Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais! [Confira a resolução do desafio aqui](https://youtu.be/kkom8S-mCP4)
3. Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente. [Confira a resolução do desafio aqui](https://youtu.be/uc59B0J4z1c)

### Material complementar
- Artigo na Alura [“O que é JSON?”](https://www.alura.com.br/artigos/o-que-e-json).
- Artigo na Alura sobre como [pintar o terminal, com tabelinha de cores e negrito](https://www.alura.com.br/artigos/decorando-terminal-cores-emojis).
- Artigo na Alura sobre como usar [VS Code para codar em Java](https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code).

### API do IMDb

A documentação da API do IMDb pode ser encontrada no seguinte link: https://imdb-api.com/api

Lembrando que você precisará registrar-se e criar a sua chave (API Key), conforme exemplo abaixo:

![image](https://user-images.githubusercontent.com/258331/222165383-6e26969b-5974-4c5a-8b73-1ef6c49fa969.png)

API Key do IMDb
A URL dos 250 melhores filmes no IMDb é a seguinte:

https://imdb-api.com/en/API/Top250Movies/sua-chave

Observação: troque sua-chave pela API Key obtida no IMDb.

### Instabilidade da API do IMDb
Caso a API do IMDb esteja instável ou fora do ar, você pode utilizar os seguintes endereços alternativos:

- https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json
- https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json
- https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json
- https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json

## Aula 02 - Gerando figurinhas para WhatsApp

## Links citados
- Documentação do [pacote javax.imageio](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html), que trata de leitura e escrita de imagens.

Documentação da [classe BufferedImage](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html), que representa uma imagem no Java

Documentação da classe [Graphics2D](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html), a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original.

Documentação da [abstração InputStream](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html), que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros.

### Desafios desta aula
1. Criar diretório de saída das imagens, se ainda não existir. [Confira a resolução do desafio aqui!](https://youtu.be/BaHcmw5mDRQ)
Centralizar o texto na figurinha. [Confira a resolução do desafio aqui!](https://youtu.be/_roEvlyPweg)
2. Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes. [Confira a resolução do desafio aqui!](https://youtu.be/jZf9ukVibig)
3. Colocar contorno (outline) no texto da imagem. [Confira a resolução do desafio aqui!](https://youtu.be/eBXdpUy72as)
4. Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha e fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.! [Confira a resolução do desafio aqui!](https://youtu.be/6WSHQdnJDwk)

### Material complementar
- Primeira aula do curso [“Java Polimorfismo: entenda herança e interfaces”](https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo) da Alura.
- Apêndice da apostila [“Java e Orientação a Objetos”](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io) da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream.

### API do IMDb

A documentação da API do IMDb pode ser encontrada no seguinte link: https://imdb-api.com/api

Lembrando que você precisará registrar-se e criar a sua chave (API Key), conforme exemplo abaixo:

![image](https://user-images.githubusercontent.com/258331/222165383-6e26969b-5974-4c5a-8b73-1ef6c49fa969.png)

API Key do IMDb
A URL dos 250 melhores filmes no IMDb é a seguinte:

https://imdb-api.com/en/API/Top250Movies/sua-chave

Observação: troque sua-chave pela API Key obtida no IMDb.

### Instabilidade da API do IMDb
Caso a API do IMDb esteja instável ou fora do ar, você pode utilizar os seguintes endereços alternativos:

- https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json
- https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json
- https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json
- https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json

## Aula 03 - Ligando as pontas, refatoração e orientação a objetos

### Links citados
- Documentação das [APIs da NASA](https://api.nasa.gov/).
- API da [Foto Astronômica do dia da NASA](https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY).
- Artigo na Alura [“Como não aprender Java e Orientação a Objetos: getters e setters”](https://www.alura.com.br/artigos/nao-aprender-oo-getters-e-setters).
- Livro [“Design Patterns”](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612), de 1994, que descreve soluções comuns para problemas recorrentes de como organizar seu código.
- Livro [“Refactoring”](https://www.amazon.com/Refactoring-Improving-Design-Existing-Code/dp/0201485672), de 1999, que cataloga maneiras sistemáticas de melhorar o código sem modificar o que é feito.

### Desafios
1. Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16. [Confira a resolução do desafio aqui!](https://youtu.be/PhfPATquzKM)
2. Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP. [Confira a resolução do desafio aqui!](https://youtu.be/V9wgYonMp4o)
3. Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra. [Confira a resolução do desafio aqui!](https://youtu.be/u2i02TB-Yro)
4. Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado. [Confira a resolução do desafio aqui!](https://youtu.be/5iWREd0RGzM)

### Material complementar
- Artigo na Alura [“Como não aprender Java e Orientação a Objetos: herança”](https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca).
- Podcast Hipsters.tech sobre [Práticas de Orientação a Objetos](https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453).
- Podcast Hipsters.tech sobre [Design Patterns](https://www.alura.com.br/podcast/design-patterns-hipsters-206-a345).
- Podcast Hipsters.tech sobre [SOLID](https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649).
- Livro [Desbravando SOLID](https://www.casadocodigo.com.br/products/livro-desbravando-solid) do instrutor Alexandre Aquiles

## Aula 04 - Criando nossa própria API com Spring

### Links citados
- [Documentação do Spring Framework](https://spring.io/_).
- Link para [iniciar um projeto utilizando Spring](https://start.spring.io/).
- Link para [download do Maven](https://maven.apache.org/download.cgi).
- Link para [download do Postman](https://www.postman.com/).
- Página para fazer o [registro e começar a utilizar o MongoDb Atlas](https://www.mongodb.com/cloud/atlas/register).
- GitHub com os [logos das linguagens de programação](https://github.com/abrahamcalf/programming-languages-logos).
- Artigo sobre o [pack de stickers da Alura para Whatsapp e Telegram]https://www.alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram().

### Desafios
1. Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada; [Confira a resolução do desafio aqui!](https://youtu.be/NOCPQrvd9KQ)
2. Devolver a listagem ordenada pelo ranking; [Confira a resolução do desafio aqui!](https://youtu.be/RRwX236K2tc)
3. Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST; [Confira a resolução do desafio aqui!](https://youtu.be/e8PFStGbC2k)

### Material complementar
- Primeira aula do curso [“Maven: gerenciamento de dependências e build de aplicações Java”](https://www.alura.com.br/conteudo/maven-gerenciamento-dependencias-build-aplicacoes-java) da Alura.
- Alura+ [“O que é REST?”](https://www.youtube.com/watch?v=weQ8ssA6iBU&ab_channel=AluraCursosOnline).
- Artigo da Alura [“Conceito e fundamentos sobre REST”](https://www.alura.com.br/artigos/rest-conceito-e-fundamentos).
- Podcast [Hipsters.Tech sobre MongoDB](https://www.hipsters.tech/mongodb-hipsters-ponto-tech-305/).
- Hipters.Tube [“O que é SQL e NoSQL?”](https://www.youtube.com/watch?v=aure5d3B88g&ab_channel=AluraCursosOnline).
- Artigo da Alura [“Spring: Conheça esse framework Java”](https://www.alura.com.br/artigos/spring-conheca-esse-framework-java).
- Alura+ ["Introdução ao Postman”(https://www.youtube.com/watch?v=op81bMbgZXs&ab_channel=AluraCursosOnline).

## Aula 05 - Publicando nossa API no Cloud

### Links citados
- [Dev em T: especialista x generalista](https://www.alura.com.br/dev-em-t).
- Documentação do [Docker](https://docs.docker.com/get-started/overview/), a plataforma de containers utilizada para construir a imagem cujo deploy foi feito no Fly.io.
- Site do [Docker Hub]() , repositório central de imagens que podem ser usadas para executar containers de diferentes tecnologias e ferramentas.
- Site do [Fly.io](https://fly.io/), o PaaS (plataforma como serviço) utilizado nesta segunda edição da Imersão Java. Requer cartão de crédito. É fundamental entender a precificação e as [quotas gratuitas](https://fly.io/docs/about/pricing/#free-allowances) do Fly.io.
- Site do [Heroku](https://www.heroku.com/), que foi o PaaS utilizado na primeira edição da Imersão Java. É importante entender a [precificação do Heroku](https://www.heroku.com/pricing).
- Documentação sobre a [Oracle Cloud](https://docs.oracle.com/pt-br/iaas/Content/home.htm).
- Artigo: [Como elaborar um bom arquivo Readme para os seus projetos](https://www.alura.com.br/artigos/escrever-bom-readme).

### Fazendo deploy da imagem da aula
Para que você não precise instalar o Docker, criar um Dockerfile e fazer o build de uma imagem Docker com sua aplicação na sua própria máquina, disponibilizamos a imagem gerada na aula no seguinte link: https://hub.docker.com/repositories/jacquelineoliveira

O deploy no Fly.io pode ser feito com os seguintes passos:
1. Instale o comando [flyctl](https://fly.io/docs/hands-on/install-flyctl/) na sua máquina
2. Em um Terminal, execute o comando: `flyctl launch --image jacquelineoliveira/linguagensapi:latest`
3. Configure o endereço do seu MongoDB com o comando: `flyctl secrets set "SPRING_DATA_MONGODB_URI=mongodb+srv://seuusuario:suasenha@clusterAbc.xvcnx.mongodb.net/aluraDb?retryWrites=true&w=majority"` (não deixe de definir o usuário e senha corretos)

### Material complementar
- Artigo da Alura [“Começando com Docker”](https://www.alura.com.br/artigos/comecando-com-docker).
- Artigo da Alura [“Heroku, Vercel e outras opções de Cloud como plataforma”](https://www.alura.com.br/artigos/heroku-vercel-outras-opcoes-cloud-plataforma).
- Podcast Hipters.Tech [“Integração Contínua, Deploy Contínuo e Github Actions”](https://www.alura.com.br/podcast/hipsterstech-integracao-continua-deploy-continuo-e-github-actions-hipsters-213-a335).
- Pesquisa da JetBrains, empresa que desenvolve a IDE IntelliJ, [sobre o ecossistema Java em 2021](https://www.jetbrains.com/lp/devecosystem-2021/java/).
