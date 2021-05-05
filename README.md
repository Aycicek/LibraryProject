# LibraryProject

# Proje Hakkında
Projede kod standartları uygulanmıştır. Birim test içermektedir. Giriş sayfası mevcuttur. Kullanıcılara göre yetkilendirme mekanizması içermektedir. Veri girişlerinde kontrol mekanizması vardır. Boş geçilemez veya eksik girildi diye uyarılar vermektedir. Veri girişlerinde Türkçe karakter kullanılmamalıdır. Author (Yazar) sınıfı için Birim testler uygulanmıştır.

# Sunum

https://github.com/batux/personal_book_library_web_project/blob/master/com.personal.book.library/AngularJS_JavaTechnologies.pdf


# Proje Kurulum Aşaması:
1.	Bilgisayarda MYSQL kurulu olmalı
2.	Veri tabanı “veritabani.sql” adlı dosyadan oluşturulması gerekiyor.
3.	Proje Eclipse üzerinden çalışmaktadır.
4.	Eclipse’de açılan projenin “application.properties” dosyasında aşağıdaki bilgileri MYSQL kullanıcı adı ve şifresi ile doldurulur.
      server.port=2324
      spring.datasource.username= “kullanıcı adı”
      spring.datasource.password= “şifre”
     
5.	LibraryAppApplication.java dosyasına “Run As > Java Application” diyerek proje çalıştırılır.




# Teknolojiler:

- Java
- JUnit
- MySQL
- Bootstrap CSS
- Spring Framework
- Spring Boot
- Spring Data
- Spring MVC
- Spring Security
- Lombok
- Maven
- Thymeleaf
- Hibernate
- JPA
- MySQL


# Uygulama Ekran Görüntüleri


![EER Diyagramı](https://user-images.githubusercontent.com/36698903/117201356-3b650100-adf5-11eb-8f97-fedd320266bb.png)

Veri Tabanına 3 adet kullanıcı verisi eklenmiştir. Şifreler Java’da “src/test/java” klasör altında “PasswordGenerator.java” adında dosya ile şifrelenip veri tabanına eklenmiştir.

![tablo](https://user-images.githubusercontent.com/36698903/117201710-a1518880-adf5-11eb-96a9-46ed36a277ea.png)



![1 - Giriş Ekranı](https://user-images.githubusercontent.com/36698903/117201208-0e185300-adf5-11eb-80e1-e971b1ccd439.png)

![2 - Anasayfa](https://user-images.githubusercontent.com/36698903/117201220-13759d80-adf5-11eb-8594-658de120647d.png)


