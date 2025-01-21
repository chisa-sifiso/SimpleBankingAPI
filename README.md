<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
</head>
<body>
    <header>
        <h1>Simple Banking System</h1>
        <p>A simple Spring Boot application for managing customer accounts, deposits, withdrawals, and balance checking.</p>
    </header>

  <section>
        <h2>Table of Contents</h2>
        <ul>
            <li><a href="#features">Features</a></li>
            <li><a href="#setup">Setup Instructions</a></li>
            <li><a href="#api">API Endpoints</a></li>
            <li><a href="#configuration">Configuration</a></li>
            <li><a href="#testing">Testing</a></li>
        </ul>
    </section>

   <section id="features">
        <h2>Features</h2>
        <ul>
            <li>Create accounts</li>
            <li>Deposit money into accounts</li>
            <li>Withdraw money from accounts</li>
            <li>Check account balances</li>
            <li>Handles exceptions for invalid operations</li>
        </ul>
    </section>

  <section id="setup">
        <h2>Setup Instructions</h2>
        <p>Follow these steps to set up the project locally:</p>
        <ol>
            <li>Clone the repository: <code>git clone <a href="https://github.com/chisa-sifiso/simple-banking-system.git">https://github.com/your-repo/simple-banking-system.git</a></code></li>
            <li>Navigate to the project directory: <code>cd simple-banking-system</code></li>
            <li>Build and run the application using Maven: <code>./mvnw spring-boot:run</code></li>
            <li>Visit the application in your browser at: <a href="http://localhost:8080">http://localhost:8080</a></li>
        </ol>
    </section>

   <section id="api">
        <h2>API Endpoints</h2>
        <h3>Create Account</h3>
        <pre><code>POST /api/accounts/create?name=John Doe</code></pre>
        <p>Creates a new account with the provided name.</p>

  <h3>Deposit Money</h3>
        <pre><code>POST /api/accounts/{accountNumber}/deposit?amount=500</code></pre>
        <p>Deposits the specified amount into the account.</p>

  <h3>Withdraw Money</h3>
        <pre><code>POST /api/accounts/{accountNumber}/withdraw?amount=200</code></pre>
        <p>Withdraws the specified amount from the account.</p>
    <h3>Check Balance</h3>
        <pre><code>GET /api/accounts/{accountNumber}/balance</code></pre>
        <p>Checks the balance of the account.</p>
    </section>

  <section id="configuration">
        <h2>Configuration</h2>
        <p>To configure the H2 database, add the following to your <code>application.properties</code> file:</p>
        <pre><code>
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
        </code></pre>
        <p>This configuration will enable the H2 console and set up the in-memory database.</p>
    </section>

  <section id="testing">
        <h2>Testing</h2>
        <p>You can test the API using Postman or curl. Here are some examples:</p>
        <ul>
            <li>Create Account: <code>POST /api/accounts/create?name=John Doe</code></li>
            <li>Deposit Money: <code>POST /api/accounts/{accountNumber}/deposit?amount=500</code></li>
            <li>Withdraw Money: <code>POST /api/accounts/{accountNumber}/withdraw?amount=200</code></li>
            <li>Check Balance: <code>GET /api/accounts/{accountNumber}/balance</code></li>
        </ul>
        <p>For more advanced testing, you can access the H2 database at <a href="http://localhost:8080/h2-console">http://localhost:8080/h2-console</a>.</p>
    </section>
    <footer>
        <p>Created by  Sifiso vinjwa| &copy; 2024</p>
    </footer>
</body>
</html>
