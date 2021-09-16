## Ejercicio 2
Un Pool de Impresoras es un objeto que administra un conjunto de impresoras. Este
pool es único en cada aplicación y debe asegurarse que no se pueda crear más de una
instancia del mismo. Siempre que se solicite el pool de impresoras debe responderse
enviando el mismo objeto.
El Pool de impresoras sabe responder a los siguientes métodos:
public Impresora obtenerImpresora(String nombre) que retorna un objeto Impresora.
public void liberarImpresora(Impresora impresora) que libera la impresora antes
solicitada.
a. Realice un modelo de clases que permita representar estos requerimientos adecuadamente. Piense patrones de diseño que puedan ayudar y describa por qué.
b. Escriba en Java el código de los métodos para instanciar el Pool de Impresoras y el código de los métodos obtenerImpresora(String nombre) y
liberarImpresora(Impresora impresora).
c. ¿A qué clase o instancia debe enviarse el mensaje para obtener el Pool de Impresoras?
