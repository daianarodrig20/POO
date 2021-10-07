# HTTP
###  ¿Qué es y cómo funciona el protocolo HTTP?
The Hypertext Transfer Protocol (HTTP) is the foundation of the World Wide Web, and is used to load web pages 
using hypertext links. HTTP is an application layer protocol designed to transfer information between networked 
devices and runs on top of other layers of the network protocol stack. A typical flow over HTTP involves a client 
machine making a request to a server, which then sends a response message.

### Mencionar los métodos o verbos de HTTP: GET, POST
#### GET
The GET method means retrieve whatever information (in the form of an entity) is identified by the Request-URI. 
If the Request-URI refers to a data-producing process, it is the produced data which shall be returned as the entity in 
the response and not the source text of the process, unless that text happens to be the output of the process.

The semantics of the GET method change to a "conditional GET" if the request message includes an 
If-Modified-Since, If-Unmodified-Since, If-Match, If-None-Match, or If-Range header field. A conditional 
GET method requests that the entity be transferred only under the circumstances described by the conditional header field(s). 
The conditional GET method is intended to reduce unnecessary network usage by allowing cached entities to be refreshed without 
requiring multiple requests or transferring data already held by the client.

The semantics of the GET method change to a "partial GET" if the request message includes a Range header field. 
A partial GET requests that only part of the entity be transferred. 
The partial GET method is intended to reduce unnecessary network usage by allowing partially-retrieved entities to be 
completed without transferring data already held by the client.

El método GET es adecuado para la personalización de páginas web: el usuario puede guardar búsquedas, configuraciones 
de filtros y ordenaciones de listas junto al URL como marcadores, de manera que en su próxima visita la página web se 
mostrará según sus preferencias.



#### POST
The POST method is used to request that the origin server accept the entity enclosed in the request as a new subordinate of the resource identified by the Request-URI in the Request-Line. POST is designed to allow a uniform method to cover the following functions:

      - Annotation of existing resources;
      - Posting a message to a bulletin board, newsgroup, mailing list,
        or similar group of articles;
      - Providing a block of data, such as the result of submitting a
        form, to a data-handling process;
      - Extending a database through an append operation.
      
The actual function performed by the POST method is determined by the server and is usually dependent on the Request-URI. 
The posted entity is subordinate to that URI in the same way that a file is subordinate to a directory containing 
it, a news article is subordinate to a newsgroup to which it is posted, or a record is subordinate to a database.

El método POST es aconsejable cuando el usuario debe enviar datos o archivos al servidor, 
como, por ejemplo, cuando se rellenan formularios o se suben fotos.

### ¿Los request de tipo POST tiene un body? ¿Y los de tipo GET?


### Códigos de estado de response HTTP: Describa los código: 200, 201, 400, 401, 403 y 500.
200
The request was fulfilled.

CREATED 201
Following a POST command, this indicates success, but the textual part of the response line indicates the URI by which 
the newly created document should be known.

Bad request 400
The request had bad syntax or 
was inherently impossible to be satisfied.

Unauthorized 401
The parameter to this message gives a specification of authorization schemes which are acceptable. The client should 
retry the request with a suitable Authorization header.

Forbidden 403
The request is for something forbidden. Authorization will not help.

Internal Error 500
The server encountered an unexpected condition which prevented it from fulfilling the request.