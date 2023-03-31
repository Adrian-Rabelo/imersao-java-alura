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
