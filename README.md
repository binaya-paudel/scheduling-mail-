 ## **Email Scheduling Project (Spring Boot)**

## **Overview**
A **simple Spring Boot project** that sends emails **automatically every 10 minutes** using **Mailtrap** for testing. 



## **Features**
- **Automatic email sending** every 10 minutes 
- Uses Spring Boot **`@Scheduled`** for scheduling  
- **Mailtrap** captures emails safely for testing 


## **Setup**

1. **Add Mailtrap credentials** in `application.properties`:

```properties
spring.mail.host=smtp.mailtrap.io
spring.mail.port=2525
spring.mail.username=YOUR_USERNAME
spring.mail.password=YOUR_PASSWORD
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
