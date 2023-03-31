# Imersão Alura

Repositório com a semana da Imersão Java 2 da Alura

## Desafios
Os desafios serão separados em branches e estão listados a seguir:
- [Desafio 01](https://github.com/Adrian-Rabelo/imersao-java-alura/tree/desafio-01/alura-stickers)

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