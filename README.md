# VehicleMetricsBackend

Este sistema foi construído usando [Java 8](https://www.oracle.com/java/technologies/downloads/) como linguagem e [Spring](https://start.spring.io/) como framework. Além disso, como base de dados, foi usado o 
[MySQL Server](https://dev.mysql.com/downloads/installer/). Abaixo será comentadocomo deve ser feita a instalação e utilização de todas as ferramentas necessárias.

## Servidor

Ao fazer o clone deste repositório, tudo relacionado ao código e ao framework será baixado junto com os arquivos. Porém a instalação do gerenciador de pacotes Maven
e da base de dados deverá ser feita separadamente.

## Maven

A instalação do Maven pode ser feita de maneira independente seguindo esse [passo-a-passo](https://mkyong.com/maven/how-to-install-maven-in-windows/). A outra alternativa é usar
uma IDE, IntelliJ ou Eclipse, por exemplo, que já tenham o gerenciador integrado ou possível de instalar usando plug-ins.

Ao terminar de instalar, basta usar o comando `mvn spring-boot:run`no terminal da IDE ou diretamente na pasta do projeto (certifique-se de ter o Maven adicionado à Path).

## SQL Server

Este é o link para o instalador da versão mais recente do [MySQL Server Community](https://dev.mysql.com/downloads/installer/). Com esse instalador, é possível escolher instalar
também a ferramenta MySQL Workbench. Com a interface visual dela, é bem mais simples configurar a base de dados.

O usuário utilizado na aplicação é o root. As propriedades da conexão com a base estão listadas no arquivo `properties.yml`, como usuário e senha do banco de dados.

Além disso, dentro da pasta SQL Objects deste repositório, existem 3 scripts sql que precisam ser executados para contruir as tabelas e views utilizadas e inserir os dados.
É importante lembrar de deixar o script da view por último, já que ela fará referências à tabelas que precisam existir antes de serem usadas.

## O cálculo do tempo de permanência

O cálculo do tempo de permanência foi feito diretamente no banco de dados, por praticidade. Ele está localizado na view `tempo_permanencia`. Além disso, o cálculo
das distâncias também foi feito diretamente na montagem da view e é o critério para a junção das duas tabelas fornecidas: `posicao` e `point_of_interest`. A fórmula usada para o cálculo
é a fórmula de Haversine. Apenas funções nativas do MySQL foram utilizadas nessa query.
