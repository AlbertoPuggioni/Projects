-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 30, 2023 alle 11:45
-- Versione del server: 10.4.25-MariaDB
-- Versione PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test_db_learning`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `frase`
--

CREATE TABLE `frase` (
  `id_frase` int(11) NOT NULL,
  `id_testo` int(11) NOT NULL,
  `contenuto` longtext NOT NULL,
  `numero_parole_frase` int(11) DEFAULT NULL,
  `parola_piu_usata_frase` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `frase`
--

INSERT INTO `frase` (`id_frase`, `id_testo`, `contenuto`, `numero_parole_frase`, `parola_piu_usata_frase`) VALUES
(4, 3, 'Questa è la prima frase del primo paragrafo.', 0, '0'),
(5, 3, 'Questa è la seconda frase del primo paragrafo.', 0, '0');

-- --------------------------------------------------------

--
-- Struttura della tabella `parola`
--

CREATE TABLE `parola` (
  `id_parola` int(11) NOT NULL,
  `id_testo` int(11) NOT NULL,
  `contenuto` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `parola`
--

INSERT INTO `parola` (`id_parola`, `id_testo`, `contenuto`) VALUES
(1, 3, 'Questa'),
(2, 3, 'è'),
(3, 3, 'la'),
(4, 3, 'prima'),
(5, 3, 'frase');

-- --------------------------------------------------------

--
-- Struttura della tabella `testo`
--

CREATE TABLE `testo` (
  `id_testo` int(11) NOT NULL,
  `contenuto` longtext NOT NULL,
  `numero_parole_testo` int(11) DEFAULT NULL,
  `parola_piu_lunga` varchar(255) DEFAULT NULL,
  `parola_piu_usata_testo` varchar(255) DEFAULT NULL,
  `numero_frasi` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `testo`
--

INSERT INTO `testo` (`id_testo`, `contenuto`, `numero_parole_testo`, `parola_piu_lunga`, `parola_piu_usata_testo`, `numero_frasi`) VALUES
(3, 'Aldo Romeo Luigi Moro (Maglie, 23 settembre 1916 – Roma, 9 maggio 1978) è stato un politico e giurista italiano.\r\nTra i fondatori della Democrazia Cristiana e suo rappresentante nella Costituente, ne divenne dapprima Segretario dal 1959 al 1964 e in seguito Presidente nel 1976; all\'interno del partito aderí inizialmente alla corrente dorotea, ma negli anni 1960 assunse una posizione più indipendente formando la corrente morotea. Fu Ministro della giustizia (1955-1957), della Pubblica istruzione (1957-1959) e per quattro volte Ministro degli esteri (1969-1972 e 1973-1974) nei governi presieduti da Mariano Rumor ed Emilio Colombo. Cinque volte Presidente del Consiglio dei ministri, guidò governi di centro-sinistra \'organico\' tra il 1963 e il 1968 e tra il 1974 e il 1976 promuovendo la cosiddetta strategia dell\'attenzione verso il Partito Comunista Italiano attraverso il compromesso storico[1] e determinò la nascita del Governo Andreotti III (definito il governo della non-sfiducia) in cui il PCI garantiva l\'astensione.', 0, '0', '0', 0),
(4, 'Questo è un secondo testo di esempio.', 0, '0', '0', 0),
(5, 'Questo è un terzo testo di esempio.', 0, '0', '0', 0),
(6, 'Questo è un quarto testo di esempio.', 0, '0', '0', 0),
(7, 'Questo è un quinto testo di esempio.', 0, '0', '0', 0),
(8, 'Questo è un sesto testo di esempio.', 0, '0', '0', 0);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `frase`
--
ALTER TABLE `frase`
  ADD PRIMARY KEY (`id_frase`),
  ADD KEY `id_testo` (`id_testo`);

--
-- Indici per le tabelle `parola`
--
ALTER TABLE `parola`
  ADD PRIMARY KEY (`id_parola`),
  ADD KEY `id_testo` (`id_testo`);

--
-- Indici per le tabelle `testo`
--
ALTER TABLE `testo`
  ADD PRIMARY KEY (`id_testo`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `frase`
--
ALTER TABLE `frase`
  MODIFY `id_frase` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT per la tabella `parola`
--
ALTER TABLE `parola`
  MODIFY `id_parola` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT per la tabella `testo`
--
ALTER TABLE `testo`
  MODIFY `id_testo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `frase`
--
ALTER TABLE `frase`
  ADD CONSTRAINT `frase_ibfk_1` FOREIGN KEY (`id_testo`) REFERENCES `testo` (`id_testo`);

--
-- Limiti per la tabella `parola`
--
ALTER TABLE `parola`
  ADD CONSTRAINT `parola_ibfk_1` FOREIGN KEY (`id_testo`) REFERENCES `testo` (`id_testo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
