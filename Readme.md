# Version de java 17

# Comandos de Maven
mvn --version   //Valida versión
mvn clean       //Elimina carpeta target
mvn compile     //Compila el proyecto y crea carpeta taget
mvn test        //Ejecuta pruebas
mvn package     //Ejecuta test, empaqueta el proyecto y lo dejará en taget/app.jar
mvn -X -P nombre_perfil package //Empaqueta el proyecto con perfil
mvn install     //Guarda el proyecto en el repositorio
mvn -B -DskipTests clean package //Limpia target y crea nuevamente el jar omitiendo los test

# Ejecutar aplicacion
java -jar ./target/app-0.0.1-SNAPSHOT.jar

# Crear la imagen del contendor con el archivo Dockerfile
docker build -t billingapp --no-cache --build-arg JAR_FILE=target/*.jar .

# Crear el contenedor
docker run -d -p 8080:80 -p 7080:7080 --name localbillingApp billingapp

# Comandos de Docker para el control de imagenes/contenedores
docker-compose --version		//Obtener la vesión del docker compose
docker -v				        //Obtener la vesion del docker
docker images				    //Muestra la lista de todas la imagenes existente en el equipo
docker images -a				//Muestra las imagenes
docker ps				        //Muestra contenedores en ejecución
docker ps -a	                //Muestra contenedores en ejecución y detenidos
docker ps --all				    //Container que se han trabajo en la computadora 
docker start localbillingApp    //Ejecutar el contendor
docker stop localbillingApp	    //Detener el contedor
docker rm localbillingApp		//Eliminar el contendor
docker rmi localbillingApp		//Eliminar la imagen

# Mandar imagen a Dockerhub
1.- Crear un repositori en dockerhub 
2.- Crear una copia de la imagen con un nuvo nombre 
    docker tag billingapp oguhmr/oguhmr-billingapp
3.- Validar la imagen
    docker images
4.- Logearse a Dockerhub (Solicitar credenciales)
    docker login
5.- Subir la imagen al repositorio
    docker push oguhmr/oguhmr-billingapp  //Si no le indicamos la version toma por default latest
    docker push oguhmr/oguhmr-billingapp:v1
6.- Descargar la imagen del repositorio
    docker run -d -p 8080:80 -p 7080:7080 --name  billingapp oguhmr/oguhmr-billingapp:v1

# Ejecucion