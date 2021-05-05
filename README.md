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

**EER Diyagramı**

![EER Diyagramı](https://user-images.githubusercontent.com/36698903/117201356-3b650100-adf5-11eb-8f97-fedd320266bb.png)


**Veri Tabanına 3 adet kullanıcı verisi eklenmiştir. Şifreler Java’da “src/test/java” klasör altında “PasswordGenerator.java” adında dosya ile şifrelenip veri tabanına eklenmiştir.**

![tablo](https://user-images.githubusercontent.com/36698903/117201710-a1518880-adf5-11eb-96a9-46ed36a277ea.png)


**Kullanıcı giriş ekranı**

![1 - Giriş Ekranı](https://user-images.githubusercontent.com/36698903/117201208-0e185300-adf5-11eb-80e1-e971b1ccd439.png)


**admin kullanıcısı ile giriş yapalım
[ADMIN] yazısı kullanıcının sahip olduğu yetkilerini gösterir.**

![2 - Anasayfa](https://user-images.githubusercontent.com/36698903/117201220-13759d80-adf5-11eb-8594-658de120647d.png)


**Yazar ekleme sayfası**

![3 - Yazar Ekleme](https://user-images.githubusercontent.com/36698903/117202699-cb577a80-adf6-11eb-89b8-5c56731c1b00.png)


**Yazar ekledim ve yazar listesi sayfası** 

![4 - Yazar Listesi](https://user-images.githubusercontent.com/36698903/117202760-df9b7780-adf6-11eb-8cbb-0bcf5f9dc361.png)


**Yayın evi ekleme sayfası**

![5 - Yayınevi Ekleme](https://user-images.githubusercontent.com/36698903/117202796-eb873980-adf6-11eb-856e-a94187e13977.png)

