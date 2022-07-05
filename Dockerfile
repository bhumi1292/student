
FROM tomcat
ADD target/student.war /usr/local/tomcat/webapps/
EXPOSE 8080