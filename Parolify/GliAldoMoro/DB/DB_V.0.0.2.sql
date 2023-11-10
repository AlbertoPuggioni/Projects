CREATE TABLE testo (
    id_testo INT AUTO_INCREMENT PRIMARY KEY,
    contenuto LONGTEXT NOT NULL
);

CREATE TABLE paragrafo (
    id_paragrafo  INT AUTO_INCREMENT PRIMARY KEY,
    id_testo INT NOT NULL,
    contenuto LONGTEXT NOT NULL,
    FOREIGN KEY (id_testo) REFERENCES testo(id_testo)
);

CREATE TABLE frase (
    id_frase INT AUTO_INCREMENT PRIMARY KEY,
    id_paragrafo INT NOT NULL,
    contenuto LONGTEXT NOT NULL,
    FOREIGN KEY (id_paragrafo) REFERENCES paragrafo (id_paragrafo)
);

CREATE TABLE parola (
    id_parola INT AUTO_INCREMENT PRIMARY KEY,
    id_frase INT NOT NULL,
    contenuto LONGTEXT NOT NULL,
    FOREIGN KEY (id_frase) REFERENCES frase (id_frase)
);

CREATE TABLE blacklist (
    id_blacklist INT AUTO_INCREMENT PRIMARY KEY,
    id_parola INT NOT NULL,
    contenuto TEXT NOT NULL,
    FOREIGN KEY (id_parola) REFERENCES parola(id_parola)
);



INSERT INTO testo (contenuto)
VALUES ('Aldo Romeo Luigi Moro (Maglie, 23 settembre 1916 – Roma, 9 maggio 1978) è stato un politico e giurista italiano.

Tra i fondatori della Democrazia Cristiana e suo rappresentante nella Costituente, ne divenne dapprima Segretario dal 1959 al 1964 e in seguito Presidente nel 1976; all\'interno del partito aderí inizialmente alla corrente dorotea, ma negli anni 1960 assunse una posizione più indipendente formando la corrente morotea. Fu Ministro della giustizia (1955-1957), della Pubblica istruzione (1957-1959) e per quattro volte Ministro degli esteri (1969-1972 e 1973-1974) nei governi presieduti da Mariano Rumor ed Emilio Colombo. Cinque volte Presidente del Consiglio dei ministri, guidò governi di centro-sinistra \'organico\' tra il 1963 e il 1968 e tra il 1974 e il 1976 promuovendo la cosiddetta strategia dell\'attenzione verso il Partito Comunista Italiano attraverso il compromesso storico[1] e determinò la nascita del Governo Andreotti III (definito il governo della non-sfiducia) in cui il PCI garantiva l\'astensione.');

INSERT INTO testo (contenuto)
VALUES ('Questo è un testo di esempio.');

INSERT INTO paragrafo (id_testo, contenuto)
VALUES (1, 'Questo è il primo paragrafo del testo.');

INSERT INTO paragrafo (id_testo, contenuto)
VALUES (1, 'Questo è il secondo paragrafo del testo.');

INSERT INTO frase (id_paragrafo, contenuto)
VALUES (1, 'Questa è la prima frase del primo paragrafo.');

INSERT INTO frase (id_paragrafo, contenuto)
VALUES (1, 'Questa è la seconda frase del primo paragrafo.');

INSERT INTO frase (id_paragrafo, contenuto)
VALUES (2, 'Questa è la prima frase del secondo paragrafo.');

INSERT INTO parola (id_frase, contenuto)
VALUES (1, 'Questa');

INSERT INTO parola (id_frase, contenuto)
VALUES (1, 'è');

INSERT INTO parola (id_frase, contenuto)
VALUES (1, 'la');

INSERT INTO parola (id_frase, contenuto)
VALUES (1, 'prima');

INSERT INTO parola (id_frase, contenuto)
VALUES (1, 'frase');

INSERT INTO blacklist (parola,data_,contenuto)
VALUES ('parola_da_blacklistare','offesa');

/* ------------------------------------------------ */

/* Query di prova (parola piu' corta)

SELECT 
    contenuto as parola_piu_corta
FROM 
    parola
ORDER BY 
    CHAR_LENGTH(contenuto) ASC
LIMIT 1;




Query di prova (parola piu' lunga)

SELECT 
    contenuto as parola_piu_lunga
FROM 
    parola
ORDER BY 
    CHAR_LENGTH(contenuto) DESC
LIMIT 1;




Query di prova (lunghezza media del contenuto nella tabella frase)

SELECT 
    AVG(CHAR_LENGTH(contenuto)) as media_contenuto
FROM 
    frase;


Query di prova (selezionare la parola che inizia per 'Q')

SELECT DISTINCT 
    contenuto as q_word
FROM 
    parola
WHERE 
    contenuto LIKE 'Q%';

/* ------------------------------------------------ */