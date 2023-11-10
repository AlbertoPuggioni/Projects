-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
-- NECESSARIO CREATE UN DATABASE CON PORTA 3306 E NOME testdblbp
-- Host: 127.0.0.1
-- Creato il: Mag 05, 2023 alle 12:34
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
-- Database: `testdblbp`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `testo`
--

CREATE TABLE `testo` (
  `id` int(11) NOT NULL,
  `txt` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `testo`
--

INSERT INTO `testo` (`id`, `txt`) VALUES
(1, 'The play opens with two bedraggled acquaintances, Vladimir and Estragon, meeting by a leafless tree. Estragon notifies Vladimir of his most recent troubles: he spent the previous night lying in a ditch and received a beating from a number of anonymous ass');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `testo`
--
ALTER TABLE `testo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `testo`
--
ALTER TABLE `testo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
