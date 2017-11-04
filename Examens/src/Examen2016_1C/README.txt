
EXAM 1: Rastreator
----------------------

Se trata de implementar en Java un buscador de habitaciones de hotel.
El buscador tiene una lista de hoteles en cartera, donde cada hotel tiene un nombre unico, ciudad, estrellas (de una a 5) y una
lista de habitaciones. Cada habitación tiene un coste en euros de 1 a 100.

Rastreator ofrece un sistema extensible de consultas basado en la interfaz java.util.function.Predicate. Podemos ejecutar una consulta pasandole un Predicate por parámetro
y retorna una lista de hoteles que cumplen el predicado.


Implementar lo siguiente:

1) Ejecuta la consulta CityFilter: Obtener los hoteles situados en Tarragona. (4)

2) Ejecuta la consulta QueryFilter: Obtener los hoteles donde alguna habitacion tenga un coste máximo establecido  y el hotel tenga un minimo de estrellas establecido. El filtro aceptará esos dos parámetros (minStars, maxCost). (1)
Ejemplo: Buscar las habitaciones de como mucho 60 euros de coste.

3) Utilizar el patrón Observer para que sea posible añadir Observers a Rastreator. (3)
El método addObserver aceptará un Observer y  un predicado de manera que solo sea notificado si el hotel cumple dicho predicado.
El sujeto es Rasteator y el estado a notificar es añadir un nuevo Hotel.


4. Basandonos en el patrón Proxy, crear un LogRastreatorProxy. (2)
El LogRastreator guardará en una lista todas las consultas que se han ejecutado (Predicate).
Comprobad que el LogRastreatorProxy guarda el número correcto de consultas.
Haced que LogRastreatorProxy sea iterable. Mostrad que podemos recorrer con un for la lista de predicados.

Demostrar todas las funcionalidades en una clase denominada Test.java



EXAM 2: Mailer
-----------------------------
Se trata de implementar un sistema de gestión de correo.
El sistema de correo tiene una lista de Sucursales (Site) donde cada sucursal tienen un nombre y un buzon de mensajes.
Cada mensaje tiene un remitente, nombre de la sucursal de origen, nombre de la sucursal de destino y texto del mensaje.
El sistema de Correos tiene un método enviar (send) que acepta un mensaje como parámetro y lo situa en el buzon correcto de la sucursal.
Lanzad una excepción si el buzón no existe en el sistema.

1. Cread tres sucursales (tarragona,barcelona,madrid) y enviar 5 mensajes. Comprobad que cada sucursal recibe el número de mensajes correcto. (4)

2. Ejecutar la siguiente consulta:
        Obtener los la lista de remitentes que provengan de una sucursal. Ej. Lista de remitentes de mensajes provenientes de Reus. (1)

3. Crear un decorador del sistema de Correos que permita crear los siguientes decoradores de mensajes: (3)
     a) NSADecorator: Cada vez que se envie un mensaje que contenga "bomba" o "isis" en el texto  guardará el mensaje en una lista de sospechosos.
     b) StampDecorator:  Añade un mensaje al texto al final diciendo "checked by NSA for your own security"
     Demostrar que podemos encadenar a y b y todo se aplica.


4. Mostrar la lista de mensajes sospechosos del decorador NSA. Mostrarlos ordenados primero por  remitente y despues por destino.
   Hacer que el NSADecorator sea Iterable y demostrarlo. (2)

￼