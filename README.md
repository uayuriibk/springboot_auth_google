# springboot_auth_google
Spring Boot, Auth2.0 (Google Authorization), gradle etc

1.Create application (type: web) whithin google developers console and generate client_id with client_secret
https://console.developers.google.com/apis/credentials

![Google auth configuration screenshot ](https://github.com/uayuriibk/springboot_auth_google/raw/master/auth_google_conf.png)

2.Put client_id and client_secret into application.properties configuration file

3.Run application 
localhost:8080/notrestricted - accessible is available
localhost:8080/restricted - acessible after Google authorization passing (using the account linked to the crated application in the 1st step)
