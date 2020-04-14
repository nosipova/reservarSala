# Microservicio de reserva de salas con Spring Boot + Swagger + Spring Security + H2


## Introducción

Se han desarrollado las API's que permiten listar y añadir salas y reservas relacionadas con ellas. 
Para ello se ha utilizado el framework de Spring, en concreto, Spring Boot, con todos los straters
que se ha considerado oportuno para generar esta implementación.

## Notas aclaratorias
No se ha podido implementar las API's con el CRUD completo debido a falta de tiempo junto con el interés de implementar la seguridad, documentación de las API's, base de datos embebida y monitorización del estado de la aplicación. 
Si se han incluido ejemplos de pruebas de ejecución de las API's en un fichero JSON denominado reservarSalas.postman_collection.

## Planteamiento y ejecución del código

1. Se ha implementado la securización para invocaciones de las API's y funcionalidades adicionales con Spring Security. La configuración del mismo está definida en application.properties dentro de /resources.Usuario: admin, contraseña: admin.

2. Se ha implementado Swagger para documentar las API's desarrolladas, para poder ver dicha documentación, una vez arrancada la app, se accede a la URL: http://localhost:8080/swagger-ui.html .

3. Para poder trabajar con información "real" que permita probar el funcionamiendo de la app, se ha implementado una base de datos embebida H2 con Hibernate y JPA. Los ficheros data.sql y dozer-mapping.xml dentro de /resources corresponden a datos de prueba y mapeo de los mismos. En el fichero de application.properties dentro de /resources aparece la configuracion de H2.

4. Para poder monitorizar el estado de la app, se ha implementado Spring Actuator que está disponible en las siguientes URL's: http://localhost:8080/actuator/health , http://localhost:8080/actuator/info

5. Para la compilación del código se recomienda utilizar Maven(versión 3.6) y JDK8. Para poder compilar el proyecto, desde la raíz del mismo, se ejecuta siguiente comando: mvn clean package .

6. Para arrancar la app  desde la raíz del proyecto se ejecuta siguiente comando: mvn spring-boot:run

                                       