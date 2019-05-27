DROP TABLE IF EXISTS historia_pobran CASCADE; 
DROP TABLE IF EXISTS rola CASCADE;
DROP TABLE IF EXISTS film CASCADE;
DROP TABLE IF EXISTS operacje_finansowe CASCADE;
DROP TABLE IF EXISTS znajomi CASCADE;
DROP TABLE IF EXISTS uzytkownik CASCADE; 
DROP TABLE IF EXISTS konto CASCADE;
DROP TABLE IF EXISTS obsada CASCADE;
DROP TABLE IF EXISTS kategoria CASCADE; 
DROP TABLE IF EXISTS typ_subskrybcji CASCADE; 


CREATE TABLE konto(
id INT AUTO_INCREMENT PRIMARY KEY,
saldo NUMERIC(8,2) NOT NULL DEFAULT 0
);

CREATE TABLE typ_subskrybcji(
id INT AUTO_INCREMENT PRIMARY KEY,
nazwa CHAR(100) NOT NULL,
opis CHAR(250)
);

CREATE TABLE kategoria(
id INT AUTO_INCREMENT PRIMARY KEY,
nazwa CHAR(200)
);

CREATE TABLE film(
id INT AUTO_INCREMENT PRIMARY KEY,
tytul CHAR(200) NOT NULL,
data_dodania DATETIME NOT NULL,
id_kategoria INT NOT NULL,
FOREIGN KEY (id_kategoria) REFERENCES kategoria(id)
);

CREATE TABLE obsada(
id INT AUTO_INCREMENT PRIMARY KEY,
imie CHAR(100) NOT NULL,
nazwisko CHAR(100) NOT NULL
);

CREATE TABLE rola(
nazwa CHAR(100) NOT NULL,
id_obsada INT NOT NULL,
id_film INT NOT NULL,
FOREIGN KEY (id_obsada) REFERENCES obsada(id),
FOREIGN KEY (id_film) REFERENCES film(id)
);

CREATE TABLE uzytkownik (
id	INT AUTO_INCREMENT PRIMARY KEY,
imie CHAR(100) NOT NULL,
nazwisko CHAR(100) NOT NULL,
data_urodzenia DATE NOT NULL,
data_dodania DATETIME NOT NULL,
id_subskrybcji INT NOT NULL,
id_konto INT NOT NULL,
FOREIGN KEY (id_subskrybcji) REFERENCES typ_subskrybcji(id),
FOREIGN KEY (id_konto) REFERENCES konto(id)
);

CREATE TABLE operacje_finansowe(
id INT AUTO_INCREMENT PRIMARY KEY,
id_uzytkownika INT NOT NULL,
typ_operacji CHAR(100) NOT NULL,
kwota_operacji CHAR(100) NOT NULL,
data_operacji DATETIME NOT NULL,
FOREIGN KEY (id_uzytkownika) REFERENCES uzytkownik(id)
);

CREATE TABLE historia_pobran(
id INT AUTO_INCREMENT PRIMARY KEY,
id_uzytkownika INT NOT NULL,
id_film INT NOT NULL,
FOREIGN KEY (id_uzytkownika) REFERENCES uzytkownik(id),
FOREIGN KEY (id_film) REFERENCES film(id)
);

CREATE TABLE znajomi(
id_uzytkownik1 INT NOT NULL,
id_uzytkownik2 INT NOT NULL,
status_znajomosci CHAR(50),
FOREIGN KEY (id_uzytkownik1) REFERENCES uzytkownik(id),
FOREIGN KEY (id_uzytkownik2) REFERENCES uzytkownik(id)
);