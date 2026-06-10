# 💳 Spring Boot Fintech Accounts Service

Microservicio backend desarrollado con Java 17 y Spring Boot para la gestión de cuentas bancarias tipo fintech.
🚧 Work in Progress
---

# 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Spring Security
- SQL Server / Azure SQL
- Maven
- Hibernate
- REST API

---

# 📦 Arquitectura

```text
src/main/java/com/juangutierrez/fintech/accounts
│
├── config
├── controller
├── entity
├── repository
├── service
└── AccountsServiceApplication
```

---

# ⚙️ Configuración

## Variables de entorno

Configurar las siguientes variables:

```bash
DB_URL=jdbc:sqlserver://SERVER:1433;databaseName=fintech_accounts;encrypt=true;trustServerCertificate=true
DB_USER=sa
DB_PASSWORD=YourPassword
```

---

# ▶️ Ejecutar proyecto

## Clonar repositorio

```bash
git clone https://github.com/TU_USER/springboot-fintech-accounts.git
```

## Entrar al proyecto

```bash
cd springboot-fintech-accounts
```

## Ejecutar aplicación

### Git Bash

```bash
./mvnw spring-boot:run
```

### CMD / PowerShell

```cmd
mvnw.cmd spring-boot:run
```

---

# 🌐 Base URL

```text
http://localhost:8080
```

---

# 📌 Endpoints

## Obtener todas las cuentas

```http
GET /accounts
```

---

## Obtener cuenta por ID

```http
GET /accounts/{id}
```

---

## Crear cuenta

```http
POST /accounts
```

### Body

```json
{
  "accountNumber": "ACC-001",
  "ownerName": "Juan Gutierrez",
  "balance": 1000
}
```

---

## Depositar saldo

```http
PUT /accounts/{id}/deposit?amount=500
```

---

## Eliminar cuenta

```http
DELETE /accounts/{id}
```

---

# 🗄️ Base de datos

La aplicación utiliza SQL Server / Azure SQL.

Hibernate genera automáticamente las tablas mediante:

```properties
spring.jpa.hibernate.ddl-auto=update
```

---

# 🔒 Seguridad

Actualmente la seguridad está deshabilitada para facilitar pruebas locales.

Próximamente:
- JWT Authentication
- Roles y permisos
- OAuth2

---

# 🧪 Testing

Ejecutar tests:

```bash
./mvnw test
```

---

# 📈 Próximas mejoras

- DTOs
- Validaciones
- Exception Handling
- JWT Authentication
- Transferencias bancarias
- Docker
- Swagger/OpenAPI
- CI/CD

---

# 👨‍💻 Autor

Juan Gutierrez

- Backend Developer
- .NET & Java Developer
- Cloud & Fintech Enthusiast
