/*
 Cwiczenie 
 Dodać do wcześniejszej utowrzonej tabeli ograniczenia 
 NULL  UNIQUE  PRIMARY KEY  FOREIGN KEY
 UWAGA!! W niektórych tabelach warto dodać klucze główne w postaci ID (INT8) czyli nie będziemy mieli pięknej 3NF !!!
*/


DROP TABLE IF EXISTS kontrola;
DROP TABLE IF EXISTS numer_stanowiska;
DROP TABLE IF EXISTS  port_lotniczy;
DROP TABLE IF EXISTS przyznane_nagrody;
DROP TABLE IF EXISTS straznik;
CREATE TABLE  straznik (
	id		    	BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	imie		    CHAR(200) NOT NULL,
	nazwisko	    CHAR(200) NOT NULL,
	stopien		    CHAR(50)  NOT NULL CHECK (stopien='Szeregowiec' OR stopien='Starszy szeregowiec' OR stopien='Kapral' OR stopien='Starszy kapral'),
	data_zatrudnienia   DATETIME  NOT NULL DEFAULT CURRENT_TIMESTAMP,
	pensja		    NUMERIC(8,2) NOT NULL CHECK(pensja>=0),
	skladka_na_ubezpieczenie NUMERIC(8,2)
);

DROP TABLE IF EXISTS straznik_archiwum;
CREATE TABLE  straznik_archiwum (
	id		    	BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,      
	imie		    CHAR(200) NOT NULL,
	nazwisko	    CHAR(200) NOT NULL,
	stopien		    CHAR(50)  NOT NULL CHECK (stopien='Szeregowiec' OR stopien='Starszy szeregowiec' OR stopien='Kapral' OR stopien='Starszy kapral'),
	data_zatrudnienia   DATETIME  NOT NULL DEFAULT CURRENT_TIMESTAMP,
	pensja		    NUMERIC(8,2) NOT NULL CHECK(pensja>=0),
	skladka_na_ubezpieczenie NUMERIC(8,2)
);

CREATE TABLE  przyznane_nagrody (
	straznik_id	    INT8  NOT NULL REFERENCES  straznik(id),
	nazwa	            CHAR(200) NOT NULL,
	data_przyznania	    DATETIME  NOT NULL,
	PRIMARY KEY (straznik_id, nazwa, data_przyznania)
);

CREATE TABLE  port_lotniczy (
	nazwa_portu	CHAR(200) PRIMARY KEY
);

CREATE TABLE  numer_stanowiska (
	id		BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	nazwa_portu	CHAR(200) NOT NULL,
	numer  		INT NOT NULL ,
    FOREIGN KEY (nazwa_portu) REFERENCES port_lotniczy(nazwa_portu)
);

DROP TABLE IF EXISTS pasazer;
CREATE TABLE  pasazer (
	id			BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	imie		CHAR(100) NOT NULL,
	nazwisko	CHAR(100) NOT NULL
);


CREATE TABLE  kontrola (
	id_straznik		INT8 NOT NULL,
	id_pasazer		INT8 NOT NULL,
	id_numer_stanowiska     INT8 NOT NULL,
	wynik_kontroli		BOOLEAN NOT NULL,
	czas_kontroli 		DATETIME  NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY  (id_straznik,id_pasazer,id_numer_stanowiska,czas_kontroli),
    
    FOREIGN KEY (id_straznik) REFERENCES straznik(id) ON DELETE CASCADE,
	FOREIGN KEY (id_pasazer) REFERENCES pasazer(id) ON DELETE CASCADE,
	FOREIGN KEY (id_numer_stanowiska) REFERENCES numer_stanowiska(id) ON DELETE CASCADE
);

-- przykładowe dane
INSERT INTO  straznik (imie, nazwisko, stopien, data_zatrudnienia, pensja,skladka_na_ubezpieczenie) 
VALUES 
	('Jan', 'Kowalski', 'Szeregowiec',                DATE_ADD(now(), INTERVAL -10 MONTH), 1500, 300),
	('Marek', 'Nowak'   , 'Starszy szeregowiec',      DATE_ADD(now(), INTERVAL -12 MONTH), 2300, 3320),
	('Franciszek', 'Kowalczyk', 'Szeregowiec',        DATE_ADD(now(), INTERVAL -50 MONTH), 1300,290),
	('Zdzisław', 'Nowak'   , 'Starszy szeregowiec',   DATE_ADD(now(), INTERVAL -11 MONTH), 2200,500),
	('Teofil', 'Kowalski', 'Szeregowiec',             DATE_ADD(now(), INTERVAL -1 MONTH), 2500,200),
	('Jan', 'Nowak'   , 'Starszy szeregowiec',        DATE_ADD(now(), INTERVAL -2 MONTH), 3000,200),
	('Jan', 'Nowakowski'   , 'Starszy szeregowiec',   DATE_ADD(now(), INTERVAL -2 MONTH), 3000,200);

INSERT INTO  straznik_archiwum (imie, nazwisko, stopien, data_zatrudnienia, pensja,skladka_na_ubezpieczenie) 
VALUES 
	('Stefan', 'Jeziorański', 'Szeregowiec',        DATE_ADD(now(), INTERVAL -32 MONTH), 1500, 300);

INSERT INTO  przyznane_nagrody (straznik_id,nazwa, data_przyznania) VALUES 
	(1, 'Przepracowane 10 lat pracy',   DATE_ADD(now(), INTERVAL -20 MONTH)) , 
	(2, 'Nagroda generała',             DATE_ADD(now(), INTERVAL -11 MONTH)),
	(3, 'Przepracowane 15 lat pracy',   DATE_ADD(now(), INTERVAL -23 MONTH)) , 
	(4, 'Nagroda pułkownika',           DATE_ADD(now(), INTERVAL -43 MONTH)),
	(5, 'Przepracowane 20 lat pracy',   DATE_ADD(now(), INTERVAL -23 MONTH)) , 
	(6, 'Nagroda generała',             DATE_ADD(now(), INTERVAL -5 MONTH));

INSERT INTO  port_lotniczy (nazwa_portu) VALUES ('Gdańsk'), ('Warszawa'), ('Szczecin');

INSERT INTO  numer_stanowiska (nazwa_portu, numer) VALUES
	('Gdańsk', 1), ('Gdańsk',2), ('Gdańsk',3),
	('Warszawa',1), ('Warszawa',2), ('Warszawa',3), ('Warszawa',4),
	('Szczecin',1), ('Szczecin',2), ('Szczecin',3)	
	;

INSERT INTO  pasazer (imie, nazwisko) 
VALUES 
	('Jan', 'Brzechwa'), 
	('Stanisław', 'Wyspański'), 
	('Henryk','Sienkiewicz'),
	('Władysław', 'Bartoszewski'),
	('Stefan', 'Żeromski'),
	('Maria', 'Konopnicka'),
	('Maria', 'Kownacka');

INSERT INTO  kontrola (id_straznik, id_pasazer, id_numer_stanowiska, wynik_kontroli, czas_kontroli) VALUES 
 (1, 1, 1, true, DATE_ADD(now(), INTERVAL -5 MONTH)),
 (1, 2, 1, false, now()),
 (2, 2, 4, true, DATE_ADD(now(), INTERVAL -5 MONTH)),
 (2, 2, 5, true, DATE_ADD(now(), INTERVAL -15 MONTH)),
 (3, 1, 1, true, DATE_ADD(now(), INTERVAL -2 MONTH)),
 (3, 2, 1, false, DATE_ADD(now(), INTERVAL -25 MONTH)),
 (4, 2, 4, true, now()),
 (5, 2, 5, true, DATE_ADD(now(), INTERVAL -5 MONTH)),
 (6, 1, 1, true, DATE_ADD(now(), INTERVAL -25 MONTH)),
 (3, 2, 1, false, DATE_ADD(now(), INTERVAL -45 MONTH)),
 (4, 2, 4, true, DATE_ADD(now(), INTERVAL -1 MONTH)),
 (5, 2, 5, true, DATE_ADD(now(), INTERVAL -15 MONTH));


-- ===========================================================

Podstawowe zapytania
1) Wyświetlenie wszystkich strażników z tym, że zamiast kolumna 'imie' 
 chciałbym żeby była kolumna imie_strażnika


SELECT imie AS imie_straznika, nazwisko, stopien, data_zatrudnienia,pensja,
skladka_na_ubezpieczenie 
FROM  straznik


2) Wyświetlić strażników którzy mają pensje  większe niż 1500zł

SELECT * FROM  straznik WHERE pensja>1500

3) Wyświetlić strażników z pensją większą od 1500zł ale mniejszą niż 2500zł

SELECT * FROM  straznik WHERE pensja>1500 AND pensja<2500   


4) Wyświetlić strażników ale bez strażników o nazwisku Nowak i Kowalczyk

SELECT * FROM  straznik WHERE nazwisko<>'Nowak' AND nazwisko<>'Kowalczyk';
SELECT * FROM  straznik WHERE nazwisko NOT IN ('Nowak','Kowalczyk');

jest Nowak            0 AND 1 = 0
jest Kowalczyk        1 AND 0 = 0
pozsotale             1 AND 1 = 1 


5) Wyświetlić strażników ale bez strażników o id 1,6,5 (z użyciem IN)

SELECT * FROM  straznik WHERE id NOT IN(1,6,5)

6) Wyświetlić strazników i pensje które są większe od 1500 ale po odjęciu 
 "skladka_na_ubezpieczenie"

SELECT *, (pensja-skladka_na_ubezpieczenie) AS po_odjeciu 
FROM  straznik WHERE (pensja-skladka_na_ubezpieczenie)>1500

7) Wyświetlić pasażerów posortowanych po nazwisku i imieniu (kolejnosci rosnaca)

SELECT * FROM  pasazer ORDER BY nazwisko ASC, imie ASC


8) Wyświetlić strażników którzy mają nazwisko rozpoczynające się od "Kowal"

SELECT * FROM  straznik WHERE nazwisko LIKE 'Kowal%'

9) Wyświetlić strażników o nazwisku Nowak i którzy zostali zatrudnieni od 
początku poprzedniego roku

SELECT * FROM  straznik WHERE nazwisko='Nowak' AND 
data_zatrudnienia>='2017-01-01';

SELECT DATE_FORMAT(DATE_ADD(now(), INTERVAL -12 MONTH),'%Y-01-01') ;

SELECT * FROM  straznik WHERE nazwisko='Nowak' AND 
data_zatrudnienia>DATE_FORMAT(DATE_ADD(now(), INTERVAL -12 MONTH),'%Y-01-01') 


10) Wyświetlić nazwisko+pensje strażników 
pomniejszone skladka_na_ubezpieczenie,  kolumna ma się nazywać pensja_do_wyplaty
 
SELECT imie,nazwisko, (pensja-skladka_na_ubezpieczenie)   AS pensja_do_wyplaty 
FROM  straznik

11) Wyświetlić wszystkich strażników aktualnych i archiwalnych ( straznik_archiwum) 
w jednej tabeli

SELECT * FROM  straznik UNION SELECT * FROM  straznik_archiwum;  

SELECT * FROM 
(SELECT * FROM  straznik UNION SELECT * FROM  straznik_archiwum) wynikowa
 ORDER BY nazwisko; 

12) Wyświetlić strażnika który nie ma ustawionego pola skladka_na_ubezpieczenie 
(jest to NULL)

SELECT * FROM  straznik WHERE skladka_na_ubezpieczenie IS NULL

Używanie agregatów - Proszę 
---------------------------
1) Napisać zapytania które poda sumę  pensji (pola pensja) dla wszystkich strażników

SELECT sum(pensja) FROM  straznik

2) Podać średnią pensję strażników 

SELECT avg(pensja) FROM  straznik

3) Wyświetlić największą pensje

SELECT max(pensja) FROM  straznik

4) Podac liczbę  pasażerów w systemie

SELECT  count(*) FROM  pasazer 


5) Podać liczbę strażników ale tych którzy mają uzupełnione 
pole skladka_na_ubezpieczenie

SELECT  count(*) FROM  straznik  WHERE skladka_na_ubezpieczenie IS NOT NULL;

UPDATE  straznik SET  skladka_na_ubezpieczenie=NULL WHERE id=7;


Zapytania z JOIN
-------------------
1) Wyświetlić wszystkie kontrole przeprowadzone na  lotnisku Gdańsk

SELECT * FROM  numer_stanowiska;

SELECT * FROM  kontrola k JOIN  numer_stanowiska ns ON k.id_numer_stanowiska=ns.id
 WHERE ns.nazwa_portu='Gdańsk';

albo

SELECT * FROM  kontrola k JOIN  numer_stanowiska ns ON k.id_numer_stanowiska=ns.id
JOIN  port_lotniczy pl ON ns.nazwa_portu=pl.nazwa_portu
 WHERE pl.nazwa_portu='Gdańsk';

2) Wyświetlić wszystkie kontrole przeprowadzone dla lotnisku Gdańsk przez strażnika/ów który ma nazwisko 
'Nowak'

SELECT * FROM  straznik s JOIN  kontrola k ON s.id=k.id_straznik 
JOIN  numer_stanowiska ns ON  ns.id=k.id_numer_stanowiska 
WHERE  ns.nazwa_portu='Gdańsk' AND s.nazwisko='Nowak';


3) Wyświetlić strażników i przeprowadzone przez nich kontrole jeśli strażnik 
nie ma kontroli to wyświetlamy informację o strażniku a w części kontrolu 
wyświetlamy nulle 

SELECT  *
FROM  straznik s  LEFT JOIN  kontrola k ON k.id_straznik=s.id; 


4) Wyświetlić wszystkie lotniska odwiedzone przez pasażera imie="Jan"  
AND nazwisko="Brzechwa"  

SELECT  DISTINCT s.nazwa_portu FROM  pasazer p  JOIN  kontrola k 
ON k.id_pasazer=p.id  
JOIN  numer_stanowiska s ON k.id_numer_stanowiska=s.id
WHERE p.imie='Jan' AND p.nazwisko='Brzechwa';

SELECT  * FROM  pasazer p  JOIN  kontrola k ON k.id_pasazer=p.id  
JOIN  numer_stanowiska s ON k.id_numer_stanowiska=s.id
WHERE p.imie='Jan' AND p.nazwisko='Brzechwa';
  

PODZAPYTANIA
1) Wyświetlić wszystkie kontrole przeprowadzone dla lotniksa Gdańsk przez strażnika
 który ma największe zarobki

SELECT * FROM  kontrola k  
JOIN  numer_stanowiska ns ON  ns.id=k.id_numer_stanowiska 
JOIN  straznik s ON s.id=k.id_straznik 
WHERE s.pensja= (SELECT max(pensja) FROM  straznik) AND ns.nazwa_portu='Gdańsk';

2) Wyświetlić z użyciem podzapytania wszystkich pasażerów skontrolowanych 
przez strażników o nazwisku "Nowak"

SELECT  DISTINCT p.imie, p.nazwisko FROM  kontrola k JOIN 
pasazer p ON k.id_pasazer=p.id
WHERE id_straznik IN (SELECT id FROM  straznik WHERE nazwisko='Nowak');

3) Wyświetlić strażników a w ostatniej kolumnie kwotę najwyższej pensji strażnika

SELECT *,(SELECT max(pensja)FROM  straznik) AS max_pensja  FROM  straznik

4) Wyświetlić strażników a w ostatniej kolumnie informację o ile mniej/więcej zarabia dany strażnik od średniej  
SELECT *, pensja -(SELECT avg(pensja) FROM  straznik) AS wiecej_mniej  
FROM  straznik;

Zlozone
1) Wyświetlić pasażera który  nigdy nie był kontrolowany. 

SELECT * FROM  pasazer p LEFT JOIN  kontrola k ON p.id=k.id_pasazer
 WHERE k.id_pasazer IS NULL

2) Znaleźć pasażera który odwiedził największą ilość lotnisk (użyć LIMIT), 
wyświetlić jaką liczbę lotnisk odwiedzili (jeśli pasażer odwiedził dwa razy to samo lotnisko
to zliczamy to jako jedno odwiedzenie)
SELECT id, imie,nazwisko, count(*) AS ilosc_lotnisk FROM (
  SELECT DISTINCT  p.id,p.imie, p.nazwisko, ns.nazwa_portu FROM  pasazer p 
  JOIN  kontrola k ON (k.id_pasazer=p.id) 
  JOIN  numer_stanowiska ns ON (k.id_numer_stanowiska=ns.id)
) T
GROUP BY id, imie,nazwisko
  ORDER BY  ilosc_lotnisk DESC LIMIT 1

SELECT DISTINCT p.id,p.imie, p.nazwisko, ns.nazwa_portu FROM  pasazer p 
  JOIN  kontrola k ON (k.id_pasazer=p.id) 
  JOIN  numer_stanowiska ns ON (k.id_numer_stanowiska=ns.id)

3) Znaleźć 2 strażników którzy skontrolowali największą ilość pasażerów
(ponowna kontrola pasażera zliczana jest jako dodatkowa kontrola)

SELECT count(*) AS ilosc,id_straznik, imie, nazwisko  FROM  kontrola  k JOIN  straznik s 
ON k.id_straznik=s.id
group BY id_straznik,imie, nazwisko
ORDER BY 1 DESC 
LIMIT 2

4) Znaleźć lotnisko na którym była najmniejsza ilość kontroli (ale większa od 0)

SELECT ns.nazwa_portu, count(*) FROM  kontrola k 
 JOIN  numer_stanowiska ns ON ns.id=k.id_numer_stanowiska  
 GROUP BY ns.nazwa_portu ORDER BY count(*) ASC LIMIT 1


5) Znaleźć miesiac (w przeciagu całego okresu)  w którym był największy ruch na 
wszystkich lotniskach. Użyć	date_format()

SELECT DATE_FORMAT(czas_kontroli,'%Y-%m-01'),czas_kontroli FROM kontrola

SELECT DATE_FORMAT(czas_kontroli,'%Y-%m-01'),count(*)  
FROM  kontrola GROUP BY DATE_FORMAT(czas_kontroli,'%Y-%m-01') 
ORDER BY 2 DESC LIMIT 1 ;

SELECT *,DATE_FORMAT(czas_kontroli,'%Y-%m-01')   FROM  kontrola ;

	
6) Wyświetlić  ilość pasażerów w kolejnych latach dla każdego lotniska  
(lotnisko sortujemy według nazwy rosnąco a póxniej według roku)
  Lotnisko ABC   2000   300
  Lotnisko ABC   2001   400
  Lotnisko BCD   2000   333
  Lotnisko CDE   2000   323
  Lotnisko CDE   2001   332

SELECT count(*), ns.nazwa_portu,DATE_FORMAT(k.czas_kontroli,'%Y-01-01') AS rok
  FROM  kontrola  k 
 JOIN  numer_stanowiska ns ON ns.id=k.id_numer_stanowiska
GROUP BY ns.nazwa_portu,DATE_FORMAT(k.czas_kontroli,'%Y-01-01')
ORDER BY ns.nazwa_portu,rok;

// to jesli bylaby mowa o unikalnych pasazerach
SELECT count(*),nazwa_portu,rok FROM (
SELECT DISTINCT ns.nazwa_portu,p.imie, p.nazwisko, DATE_FORMAT(k.czas_kontroli,'%Y-01-01') AS rok  FROM  kontrola  k JOIN  pasazer p ON k.id_straznik=p.id
 JOIN  numer_stanowiska ns ON ns.id=k.id_numer_stanowiska
) T  GROUP BY nazwa_portu,rok ORDER BY nazwa_portu,rok;

MODYFIKACJA DANYCH
1) Umieścić wiersz z swoimi danymi w tablicy pasażera i dodać 
kontrole na lotnisku Gdańsk przez strażnika id=1 w dniu dzisiejszym

   INSERT INTO  pasazer(imie, nazwisko) VALUES ('Michal','Szymanski')
   INSERT INTO  kontrola(id_pasazer,id_straznik, id_numer_stanowiska,  
     wynik_kontroli, czas_kontroli) VALUES 
     ( (SELECT id FROM pasazer WHERE imie='Michal' AND nazwisko='Szymanski'),
        1, (SELECT id FROM numer_stanowiska WHERE nazwa_portu='Gdańsk' LIMIT 1), 
        true, now())
   
   select * from kontrola order by czas_kontroli
    
2) Zmienić nazwisko strażników z 'Nowak' na 'Nowakowski' przy okazji 
zwiększając im pensje o 10%

   UPDATE  straznik SET nazwisko='Nowakowski', pensja=pensja+pensja*0.1 
   WHERE nazwisko='Nowak'

3) Skasować wiersz  z swoim wpisem w tablicy pasażer.

    DELETE FROM  pasazer WHERE imie='Michal' AND nazwisko='Szymanski'

4) Skasować strażnika który skontrolował największa liczbę pasażerów.

DELETE FROM straznik WHERE id=(
SELECT najlepszy_id FROM (
SELECT count(*),s.id AS najlepszy_id FROM  straznik s JOIN 
 kontrola k ON s.id=k.id_straznik 
GROUP BY s.id ORDER BY 1 DESC LIMIT 1) T)

SELECT najlepszy_id FROM (
SELECT count(*),s.id AS najlepszy_id FROM  straznik s JOIN 
 kontrola k ON s.id=k.id_straznik 
GROUP BY s.id ORDER BY 1 DESC LIMIT 1) T;

// sprawdzam
SELECT * FROM  kontrola WHERE id_straznik=3


DELETE FROM  przyznane_nagrody WHERE straznik_id=3;
DELETE FROM  kontrola wHERE id_straznik=3;


DELETE FROM  straznik WHERE id=(SELECT najlepszy_id FROM (
SELECT count(*),s.id AS najlepszy_id FROM  straznik s JOIN  kontrola k ON s.id=k.id_straznik 
GROUP BY s.id ORDER BY 1 DESC LIMIT 1) T)
