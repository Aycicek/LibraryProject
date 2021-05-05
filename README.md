# LibraryProject

# Proje Hakkında
Projede kod standartları uygulanmıştır. Birim test içermektedir. Giriş sayfası mevcuttur. Kullanıcılara göre yetkilendirme mekanizması içermektedir. Veri girişlerinde kontrol mekanizması vardır. Boş geçilemez veya eksik girildi diye uyarılar vermektedir. Veri girişlerinde Türkçe karakter kullanılmamalıdır. Author (Yazar) sınıfı için Birim testler uygulanmıştır.

# Sunum

https://github.com/Aycicek/LibraryProject/blob/main/LibraryApp/Proje%20Sunumu.pdf


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


**Veri Tabanına 3 adet kullanıcı verisi eklenmiştir. Şifreler Java’da “src/test/java” klasör altında “PasswordGenerator.java” adında dosya ile şifrelenip veri tabanına eklenmiştir.**

![tablo](https://user-images.githubusercontent.com/36698903/117201710-a1518880-adf5-11eb-96a9-46ed36a277ea.png)


![1 - Giriş Ekranı](https://user-images.githubusercontent.com/36698903/117201208-0e185300-adf5-11eb-80e1-e971b1ccd439.png)


![2 - Anasayfa](https://user-images.githubusercontent.com/36698903/117201220-13759d80-adf5-11eb-8594-658de120647d.png)


![3 - Yazar Ekleme](https://user-images.githubusercontent.com/36698903/117202699-cb577a80-adf6-11eb-89b8-5c56731c1b00.png)


![4 - Yazar Listesi](https://user-images.githubusercontent.com/36698903/117202760-df9b7780-adf6-11eb-8cbb-0bcf5f9dc361.png)


![5 - Yayınevi Ekleme](https://user-images.githubusercontent.com/36698903/117202796-eb873980-adf6-11eb-856e-a94187e13977.png)


![6 - Yayınevi Listesi](https://user-images.githubusercontent.com/36698903/117202953-22f5e600-adf7-11eb-9302-620c481835c4.png)


![7 - Kitap Ekleme](https://user-images.githubusercontent.com/36698903/117202977-27ba9a00-adf7-11eb-9f57-b6d9aec4eaab.png)


![8 - Kitap Listesi](https://user-images.githubusercontent.com/36698903/117202980-2a1cf400-adf7-11eb-9104-85c16e5576fd.png)


![9 - Kitap Düzenleme](https://user-images.githubusercontent.com/36698903/117202989-2be6b780-adf7-11eb-9799-172c3adbd058.png)


![10 - User Kullanıcısı](https://user-images.githubusercontent.com/36698903/117202994-2db07b00-adf7-11eb-8baf-0c76000aa35a.png)


![11 - User Kullanıcı Yetkisi](https://user-images.githubusercontent.com/36698903/117203000-2f7a3e80-adf7-11eb-82c8-de71f60623b3.png)


![12 - Aranan Kitap](https://user-images.githubusercontent.com/36698903/117203006-31440200-adf7-11eb-8923-72b0d25afc79.png)





