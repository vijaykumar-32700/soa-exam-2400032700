# SOA Exam — 2400032700

Student: UMMADI VIJAY KUMAR  
Assigned entity: CommunityEvent

## Projects
- `CrudServiceProject`: PostgreSQL CRUD service, Swagger UI, Eureka Client.
- `EurekaService`: Eureka Server on port 8761.

## Before running
1. Create the PostgreSQL database:
   ```sql
   CREATE DATABASE exam_2400032700;
   ```
2. Edit `CrudServiceProject/src/main/resources/application.properties` and replace `CHANGE_ME` with your local PostgreSQL password.
3. Import both folders as existing Maven projects in Eclipse/STS and allow Maven to download dependencies.
4. Start `EurekaService` first.
5. Start `CrudServiceProject` with program argument `--server.port=8081`.
6. Duplicate the CRUD run configuration and run with `--server.port=8082`, then `--server.port=8083`.

## URLs
- Eureka dashboard: http://localhost:8761
- Swagger instance 8081: http://localhost:8081/swagger-ui/index.html
- Swagger instance 8082: http://localhost:8082/swagger-ui/index.html
- Swagger instance 8083: http://localhost:8083/swagger-ui/index.html

## Required endpoint tests
- `GET /`
- `POST /Add`
- `GET /DisplayAll`
- `DELETE /Delete/{id}`

Example POST body (do not include `id`):
```json
{
  "eventName": "Tech Fest",
  "venue": "KL University",
  "attendeeCount": 150,
  "completed": false
}
```

## GitHub submission
Create a public repository named `soa-exam-2400032700`, then push the contents of `examworkspace`.

Note: The archive contains source code and Maven configuration; it does not contain a prebuilt executable or screenshots. PostgreSQL and the Java/Maven toolchain must be installed locally.
