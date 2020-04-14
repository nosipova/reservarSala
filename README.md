# Microservicio de reserva de salas con Spring Boot + Swagger + Spring Security + H2


## Introducci�n

Se han desarrollado las API's que permiten listar y a�adir salas y reservas relacionadas con ellas. 
Para ello se ha utilizado el framework de Spring, en concreto, Spring Boot, con todos los straters
que se ha considerado oportuno para generar esta implementaci�n.

## Notas aclaratorias
No se ha podido implementar las API's con el CRUD completo debido a falta de tiempo junto con el inter�s de implementar la seguridad, documentaci�n de las API's, base de datos embebida y monitorizaci�n del estado de la aplicaci�n. 
Si se han incluido ejemplos de pruebas de ejecuci�n de las API's en un fichero JSON denominado reservarSalas.postman_collection.

## Planteamiento y ejecuci�n del c�digo

1. Se ha implementado la securizaci�n para invocaciones de las API's y funcionalidades adicionales con Spring Security. La configuraci�n del mismo est� definida en application.properties dentro de /resources.Usuario: admin, contrase�a: admin.

2. Se ha implementado Swagger para documentar las API's desarrolladas, para poder ver dicha documentaci�n, una vez arrancada la app, se accede a la URL: http://localhost:8080/swagger-ui.html .

3. Para poder trabajar con informaci�n "real" que permita probar el funcionamiendo de la app, se ha implementado una base de datos embebida H2 con Hibernate y JPA. Los ficheros data.sql y dozer-mapping.xml dentro de /resources corresponden a datos de prueba y mapeo de los mismos. En el fichero de application.properties dentro de /resources aparece la configuracion de H2.

4. Para poder monitorizar el estado de la app, se ha implementado Spring Actuator que est� disponible en las siguientes URL's: http://localhost:8080/actuator/health , http://localhost:8080/actuator/info

5. Para la compilaci�n del c�digo se recomienda utilizar Maven(versi�n 3.6) y JDK8. Para poder compilar el proyecto, desde la ra�z del mismo, se ejecuta siguiente comando: mvn clean package .

6. Para arrancar la app  desde la ra�z del proyecto se ejecuta siguiente comando: mvn spring-boot:run

                                       