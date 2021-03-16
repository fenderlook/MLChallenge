# Challenge Técnico - Carlos Vargas
# Instrucciones para ejecutar la aplicación dentro de un contenedor Docker:
# 1. Construir la imagen del proyecto Spring boot con el comando: docker build -t redisapp-server:v1 .
# 2. Como en el archivo docker-compose.yml se configura la imagen de redis (de docker hub) y la imagen del proyecto, queda solamente correr el contenedor con el comando: docker-compose up --build
# 3. Finalmente, en postman, en un ambiente local, podrá ejecutar el servicio para obtener la información asociado dada la Ip, y el servicio para consultar las estadísticas:
# http://localhost:8080/country/findCountry/?ipLocation=
# http://localhost:8080/country/statistics