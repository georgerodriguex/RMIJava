# RMIJava

Simples exemplo de RMI no Java

## Como utilizar ##

`javac Server/Calculadora.java`
`javac Server/CalculadoraServer.java`
`javac Server/CalculadoraImple.java`
`rmic Server/CalculadoraImple`

`cp Server/CalculadoraImple_Stub.class Client/`
`javac Client/Calculadora.java`
`javac Client/CalculadoraClient.java`

`java Server/CalculadoraServer`
`java Client/CalculadoraClient`
