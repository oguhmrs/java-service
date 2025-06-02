#Imagen base para construir la aplicacion
FROM eclipse-temurin:17-jdk AS builder

#Directorio de trabajo en el contenedor
WORKDIR /app

#Copia toda la aplicacion desde la ruta raiz al directorio de trabajo /app de contendor
COPY . .

RUN chmod +x ./mvnw

#Build la aplicacion
RUN ./mvnw clean package -DskipTests

#Crea un contenedor nuevo subir el compilado jar
FROM eclipse-temurin:17-jre

#Especificar directorio de trabajo
WORKDIR /app

#Copia el jar que se genero en contenedor builder al directorio de trabajo
COPY --from=builder /app/target/*.jar app.jar

#Exponer el puerto 8080 
EXPOSE 8080

#Ejecutamos la aplicacion
ENTRYPOINT ["java", "-jar", "app.jar"]



