## Ejercicio 4
Se quiere modelar la forma de pago de una venta de productos a través de una
aplicación web.
La forma de pago puede ser transferencia bancaria, pago por Internet (PayPal) o con
tarjeta de crédito. Para cada caso se dispone de un procedimiento diferente:
transferencia bancaria requiere de CBU, pago por Internet requiere nombre de usuario
de Paypal y para tarjeta de crédito se requiere los datos de nombre, número y los 3
dígitos de seguridad de la tarjeta.
Para ello existe en el modelo la siguiente funcionalidad:
● Banco.transferir(cbuorigen, importe)
● Tarjeta.cobrar(nombreTarjeta, numero, digitos, importe)
● PayPal.cobrar(usuario,importe)
a. Realice un modelo de clases que permita representar estos requerimientos
adecuadamente. Piense qué patrón de diseño puede ayudarle y describa por qué.
b. Escriba el método pagar() de la venta y haga un bosquejo en pseudocódigo de
cómo se resolvería en cada caso.
c. Realice ahora una adaptación al modelo de objetos considerando la posibilidad
de que la venta puede incluir más de una forma de pago.
