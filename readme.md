<h2>Start Keycloak</h2>
From a terminal, enter the following command to start Keycloak:<br/>
<b>docker run -p 8181:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:21.1.1 start-dev</b>
<br/>
<h2>Start Docker Zipkin</h2><br/>
<b>docker run -d -p 9411:9411 openzipkin/zipkin</b><br/>
Browse to http://localhost:9411 to find traces!<br/>
<h2>Start the applications</h2><br/>
<b>docker-compose up -d</b> <br/>

