O repositório <b>AulasIniciais</b> foi criado para gerenciamento e atualização do meu progresso ao aprender Java.

<h2> Aula 01: HelloWorld</h2>
A estrutura de um código é composta de:

- Declaração da Classe;
- Nome da Classe;
- Método.

Dentro do nosso método _public static void main(String[] args)_:

- **public static:** modificadores de acesso do método.
- **void:** tipo de retorno do método.
- **main:** nome do método.
- **String[] args:** parâmetros e argumentos do método.
- **System.out.println("Hello World");:** código.

Obs.: cada "{}" em um código é chamado de **bloco.**

Os nomes de classes são sempre iniciados em letra maiúscula e seguem o padrão _camel case_ para palavras compostas.
Por exemplo: AulaInicial, MediaEscolar, entre outros.

Dica: você pode usar o comando "psvm" no IntelliJ para criar o método <code>public static void main(String[] args)</code>.

<h2> Aula 02: TiposPrimitivos</h2>

Existem oito tipos primitivos no Java. São eles:
<code>int, double, float, long, char, short, byte e boolean</code>.

Diferente da criação de classes, as variáveis devem ser iniciadas SEMPRE com letra minúscula, mas ainda seguem o padrão _camel case_.
Por exemplo: idade, salarioAnual, somaMedia, entre outros.

Cada tipo primitivo tem sua respectiva função, sendo elas:

- **int e long:** armazenam números **inteiros não decimais.**
- **float e double:** armazenam números **decimais.**
- **byte e short:** armazenam valores números.
- **char:** armazena um caractere da tabela ASCII.

Cada variável aloca possui um tamanho em memória e um 'range' de valores que podem ser armazenados.
![img.png](img.png)

No mundo atual, os tamanhos de cada tipo primitivo acaba não importando muito, porém os valores que podem ser armazenados sim.

Por exemplo: Digamos que você declare a variável <code>short salario</code>, pode funcionar para uma certa porcentagem de pessoa, mas e para quem receber mais de R$32767? O programa irá emitir um erro. Então é muito importante pensar no futuro ao se escolher o tipo de uma variável.

Algo interessante de se notar é que o tipo primitivo <code>char</code> possui tamanho de 2 bytes, e isso acontece porque os caracteres asiáticos maiores possuem um peso maior que uma letra romana.

<h3>Casting</h3>
O casting é uma forma de você armazenar um variável de um tipo primitivo em outro tipo - não é uma prática boa a se fazer.
Exemplo: <code>int casting = (int) 12345678910L;</code>.

Neste caso, eu forcei um tipo <code>long</code> virar um tipo <code>int</code>.

<h3>String</h3>

No Java, uma string não é considerada um tipo primitivo e sim uma classe. Para declarar um valor à uma string, é necessário utilizar aspas duplas. Por exemplo: <code>String nome = "Gabriel";</code>

<h2>Aula03: ExercicioTiposPrimitivos</h3>

Crie variáveis para os campos descritos abaixo entre "<>" e imprima a seguinte mensagem:

Eu, \<nome>, morando no endereço \<endereço>,<br>confirmo que recebi o salário de \<salario>, na data \<data>. 

