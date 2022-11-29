1. Update Server

Pertama-pertama, yang perlu Anda lakukan adalah memperbarui repository pada Ubuntu dengan menggunakan perintah berikut:

~# sudo apt-get update && apt-get upgrade

2. Install JRE

Selanjutnya, install Java Runtime Environment (JRE). JRE adalah perangkat lunak yang digunakan untuk menjalankan program/aplikasi yang berbasis Java. Untuk install JRE pada Ubuntu, masukkan perintah berikut: 

~# sudo apt-get install default-jre

3. Install JDK

Kemudian, install Java Development Kit (JDK). JDK adalah perangkat lunak yang digunakan untuk mengumpulkan  kompilasi kode-kode Java yang dibuat oleh pengembang aplikasi lalu menerjemahkannya ke dalam bytecode untuk dijalankan oleh JRE. Masukkan perintah berikut untuk install JDK.

~# sudo apt-get install default-jdk

4. Cek Versi Java

 Terakhir, untuk memastikan instalasi Java berhasil, Anda bisa mengeceknya menggunakan perintah berikut.

~# java -version~# javac -version


 $ sudo apt-get update
 $ sudo apt-get install postgresql postgresql-contrib
 $ sudo -i -u postgres


postgres=# GRANT ALL ON SCHEMA test TO xxx;
postgres=# GRANT ALL ON ALL TABLES IN SCHEMA test TO xxx;
postgres=# \q


postgres@server:-$ createdb user
$ sudo -u postgres createdb user
postgres=# \password
Enter new password:
Enter it again:
postgres=#

cara kill potr vps
kill -9 $(lsof -t -i:8080)
sudo netstat -tunlp
