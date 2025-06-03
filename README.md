
**Explicación ejercicios** 

Para la implementción de las pilas y colas, se propusieron dos ejercicios de cada tema.

**Ejercicios COLAS:**

Siguiendo el principio característico de las colas FIFO (First In, First Out) donde el primer elemento al ingresar a la cola es el primero en salir, se realizaron los sigueintes dos ejemplos: 

*Primer ejercicio:*
-Se implementó un gestor de libros utilizando una estructura de datos tipo cola, lo que significa que los libros se atienden en el orden en que fueron registrados.

El código principal se encuentra en la clase main, dentro del paquete Colas.Ejercicio1Colas El programa utiliza las siguientes clases auxiliares:
- Libro: contiene los datos de cada libro (nombre, autor, fecha de publicación).
- ColaImplementacion: encapsula una cola de libros, usando LinkedList como estructura interna.

Funcionalidades del Menú

1. Encolar un libro  
   Permite ingresar el nombre, autor y fecha de publicación del libro. El libro se agrega al final de la cola.
2. Desencolar (atender)  
   Elimina de la cola el primer libro en haber sido ingresado (el que está al frente).
3. Ver primer libro en la cola
   Muestra los datos del libro que está en primer lugar, sin eliminarlo.
4. Ver cantidad de libros**  
   Muestra cuántos libros hay actualmente en la cola.
5. **Mostrar todos los libros
   Lista todos los libros en orden, sin alterar la cola original.
6. Salir
   Finaliza la ejecución del programa.

Observaciones
- El menú es interactivo y se repite hasta que el usuario seleccione la opción de salir.
- Se usa una cola temporal para mostrar los elementos sin perder el orden original.

*Segundo ejercicio:*
-Como segundo ejemplo, se realizó un sistema de fila de clientes. En este sistema, el primer cliente al ser registrado es, por lógica, el primero en ser atendido. 
Entonces se pueden realizar operaciones como agregar clientes (el último en ser agregado será el último en ser atendido), eliminar o atender clientes, ver la fila, ver la cantidad de clientes en fila y ver el siguiente cliente.
El menú se puede ejecutar hasta que el usuario elija la opción de salir 

**Ejercicios PILAS:**

Obedeciendo el principio LIFO (Last In, First Out)  que indica que el último elemento al entrar a la pila, es el primero en salir, se propusieron los siguientes ejerccios que cdemuestran la utilidad de las estructuras de las pilas en contextos reales.

*Primer ejercicio:*
-Como primer ejemplo se hizo la simulación sencilla de un navegador web, el cual guarda elementos llamados PaginaWeb con un atributo Url. En ese sentido, el último elemento guardado, que sería la última página visitada, es el primero en salir cuando se accede a la pila. 
De ese modo, se pueden hacer diferentes operaciones como agregar un sitio web, visitar el último sitio añadido, ver el historial de sitios, etc.

*Segundo ejercicio:*
-Como segundo ejemplo se hizo una bandeja entrada de mensajes la cual guarda elementos de la clase Mensaje con atributos co0mo hora (que se genera automáticamente), autor y contenido. 
Por ende, la aplicación de la pila permite aladir un nuevo mensaje, leer el último mensaje recibido, filtrar los mensajes por autor y ver todos los mensajes guardados.