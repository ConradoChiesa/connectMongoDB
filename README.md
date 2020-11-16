# connectMongoDB

Basado en Spring Boot se realizo un servicio REST para CRUD de usuarios y mensajes.

Java Version 1.8

Maven Version 3.6.0

Running service on IDE:
open del project y 'RUN' UserBackupApplication

# EXAMPLE MESSAGES ENDPOINTS #
# POST

@RequestBody Json
http://localhost:8080/message/

example:
    {
        "title": "Titulo",
        "body": "Mensaje nuevo"
    }

# GET
http://localhost:8080/message/

# PUT 
@RequestBody JSON
http://localhost:8080/message/

example:
    {
        "id": "5fac8e3869f24f5aca44eb95",
        "title": "Title",
        "body": "Message"
    }
    
# DELETE
@Params id
http://localhost:8080/message/{id} //Replace {id} with id of the message that you want to delete

# EXAMPLE USER ENDPOINTS

# POST
@RequestBody JSON
http://localhost:8080/user/

Example:
    {
       "firstName": "Nombre",
        "lastName": "Apellido",
        "email": "a@a.com",
        "phoneNumber": "7450"
    }

# GET
http://localhost:8080/user/

# PUT
@RequestBody JSON
http://localhost:8080/user/

Example:
    {
        "firstName": "Nombre",
        "lastName": "Apellido",
        "phoneNumber": "7450",
        "email": "a@a.com",
        "id": "5fb28fb316420d1b6a0d95c1"
    }
    
# DELETE
@params id

- Borrar Usuario por id

http://localhost:8080/user/{id} // Replace {id} with the id of the user that you want to delete

