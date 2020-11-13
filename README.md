# connectMongoDB

Basado en Spring Boot se realizo un servicio REST para CRUD de usuarios y mensajes.

Java Version 1.8

Maven Version 3.6.0

Running service on cmd:
java -jar ~/user-backup/user-backup-0.0.1-SNAPSHOT.jar

Running service on IDE:
open del project y 'RUN' UserBackupApplication

# EXAMPLE MESSAGES ENDPOINTS #
# POST
@params title, body

http://localhost:8080/message/add?title=Titulo&body=Mensaje

# GET
http://localhost:8080/message/all

# PUT 
@params title, body, id

http://localhost:8080/message/update?title=Borrar&body=Segundo mensaje cambiado again&id=5facac2b626d612f45a18a6e

# DELETE
@Params id

http://localhost:8080/message/delete?id=5fad82511027974543275de7

# EXAMPLE USER ENDPOINTS

# POST
http://localhost:8080/user/add?firstName=Conrado5&lastName=Chiesa&email=c@c.com

# GET
http://localhost:8080/user/all

# PUT
@params firstName, lastName, phoneNumber, email, id

http://localhost:8080/user/update?firstName=Conry&lastName=Chiesa&phoneNumber=1546&email=c@c.com&id=5fad9c711964221d43897c69

# DELETE
@params id

- Borrar Usuario por id

http://localhost:8080/user/delete?id=5fada7113899620110d8dd0b

- Borrar todos los usuarios

http://localhost:8080/user/deleteAllUsers
