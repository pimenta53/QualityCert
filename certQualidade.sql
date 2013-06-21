-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 16, 2012 at 03:49 AM
-- Server version: 5.1.44
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `certQualidade`
--

-- --------------------------------------------------------

--
-- Table structure for table `BomProgramas`
--

CREATE TABLE IF NOT EXISTS `BomProgramas` (
  `programaTiger` int(11) NOT NULL,
  PRIMARY KEY (`programaTiger`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `BomProgramas`
--


-- --------------------------------------------------------

--
-- Table structure for table `CaracProgramaPesoMetrica`
--

CREATE TABLE IF NOT EXISTS `CaracProgramaPesoMetrica` (
  `caracPrograma` int(11) NOT NULL,
  `pesoMetrica` int(11) NOT NULL,
  PRIMARY KEY (`caracPrograma`,`pesoMetrica`),
  KEY `pesoMetrica` (`pesoMetrica`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `CaracProgramaPesoMetrica`
--


-- --------------------------------------------------------

--
-- Table structure for table `CaracProgramas`
--

CREATE TABLE IF NOT EXISTS `CaracProgramas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nComentarios` int(11) NOT NULL,
  `nLinhas` int(11) NOT NULL,
  `nFuncoes` int(11) NOT NULL,
  `nErros` int(11) NOT NULL,
  `tempo` int(11) NOT NULL,
  `nCCMcCabe` int(11) NOT NULL,
  `nHalstead` int(11) NOT NULL,
  `programaTiger` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `programaTiger` (`programaTiger`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=65 ;

--
-- Dumping data for table `CaracProgramas`
--


-- --------------------------------------------------------

--
-- Table structure for table `Grupos`
--

CREATE TABLE IF NOT EXISTS `Grupos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeGrupo` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nomeGrupo` (`nomeGrupo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `Grupos`
--

INSERT INTO `Grupos` (`id`, `nomeGrupo`) VALUES
(1, 'Administrador'),
(2, 'Utilizador');

-- --------------------------------------------------------

--
-- Table structure for table `MauProgramas`
--

CREATE TABLE IF NOT EXISTS `MauProgramas` (
  `programaTiger` int(11) NOT NULL,
  PRIMARY KEY (`programaTiger`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `MauProgramas`
--


-- --------------------------------------------------------

--
-- Table structure for table `PesoMetricas`
--

CREATE TABLE IF NOT EXISTS `PesoMetricas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pesoComentarios` float NOT NULL,
  `pesoLinhas` float NOT NULL,
  `pesoFuncoes` float NOT NULL,
  `pesoErros` float NOT NULL,
  `pesoTempo` float NOT NULL,
  `pesoCCMcCabe` float NOT NULL,
  `pesoHalstead` float NOT NULL,
  `data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `PesoMetricas`
--


-- --------------------------------------------------------

--
-- Table structure for table `ProgramaTigers`
--

CREATE TABLE IF NOT EXISTS `ProgramaTigers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `nomeFicheiro` varchar(30) NOT NULL,
  `avaliacao` int(11) NOT NULL DEFAULT '-1',
  `utilizador` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nome` (`nome`),
  KEY `utilizador` (`utilizador`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=69 ;

--
-- Dumping data for table `ProgramaTigers`
--


-- --------------------------------------------------------

--
-- Table structure for table `RepositorioBase`
--

CREATE TABLE IF NOT EXISTS `RepositorioBase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeFicheiro` varchar(30) NOT NULL,
  `data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `caracPrograma` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `caracPrograma` (`caracPrograma`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Dumping data for table `RepositorioBase`
--


-- --------------------------------------------------------

--
-- Table structure for table `Utilizadores`
--

CREATE TABLE IF NOT EXISTS `Utilizadores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `grupo` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userName` (`userName`),
  UNIQUE KEY `email` (`email`),
  KEY `grupo` (`grupo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `Utilizadores`
--

INSERT INTO `Utilizadores` (`id`, `userName`, `password`, `email`, `grupo`) VALUES
(1, 'admin', 'admin', 'admin', 1),
(2, 'cedric', 'cedric', 'cedric', 2),
(3, 'edp', 'edp', 'edp', 2),
(4, 'pimz', 'pimz', 'pimz', 2);

-- --------------------------------------------------------

--
-- Table structure for table `valorespadrao`
--

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `certqualidade`.`valorespadrao` AS select avg(`certqualidade`.`caracprogramas`.`nComentarios`) AS `nComentariosM`,avg(`certqualidade`.`caracprogramas`.`nLinhas`) AS `nLinhasM`,avg(`certqualidade`.`caracprogramas`.`nFuncoes`) AS `nFuncoesM`,avg(`certqualidade`.`caracprogramas`.`nErros`) AS `nErrosM`,avg(`certqualidade`.`caracprogramas`.`tempo`) AS `tempoM`,avg(`certqualidade`.`caracprogramas`.`nCCMcCabe`) AS `nCCMcCabeM`,avg(`certqualidade`.`caracprogramas`.`nHalstead`) AS `nHalsteadM` from (`certqualidade`.`caracprogramas` join `certqualidade`.`repositoriobase` on((`certqualidade`.`caracprogramas`.`id` = `certqualidade`.`repositoriobase`.`caracPrograma`)));

--
-- Dumping data for table `valorespadrao`
--

INSERT INTO `valorespadrao` (`nComentariosM`, `nLinhasM`, `nFuncoesM`, `nErrosM`, `tempoM`, `nCCMcCabeM`, `nHalsteadM`) VALUES
(NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `BomProgramas`
--
ALTER TABLE `BomProgramas`
  ADD CONSTRAINT `bomprogramas_ibfk_1` FOREIGN KEY (`programaTiger`) REFERENCES `programatigers` (`id`);

--
-- Constraints for table `CaracProgramaPesoMetrica`
--
ALTER TABLE `CaracProgramaPesoMetrica`
  ADD CONSTRAINT `caracprogramapesometrica_ibfk_1` FOREIGN KEY (`caracPrograma`) REFERENCES `caracprogramas` (`id`),
  ADD CONSTRAINT `caracprogramapesometrica_ibfk_2` FOREIGN KEY (`pesoMetrica`) REFERENCES `pesometricas` (`id`);

--
-- Constraints for table `CaracProgramas`
--
ALTER TABLE `CaracProgramas`
  ADD CONSTRAINT `caracprogramas_ibfk_1` FOREIGN KEY (`programaTiger`) REFERENCES `programatigers` (`id`);

--
-- Constraints for table `MauProgramas`
--
ALTER TABLE `MauProgramas`
  ADD CONSTRAINT `mauprogramas_ibfk_1` FOREIGN KEY (`programaTiger`) REFERENCES `programatigers` (`id`);

--
-- Constraints for table `ProgramaTigers`
--
ALTER TABLE `ProgramaTigers`
  ADD CONSTRAINT `programatigers_ibfk_1` FOREIGN KEY (`utilizador`) REFERENCES `utilizadores` (`id`);

--
-- Constraints for table `RepositorioBase`
--
ALTER TABLE `RepositorioBase`
  ADD CONSTRAINT `repositoriobase_ibfk_1` FOREIGN KEY (`caracPrograma`) REFERENCES `caracprogramas` (`id`);

--
-- Constraints for table `Utilizadores`
--
ALTER TABLE `Utilizadores`
  ADD CONSTRAINT `utilizadores_ibfk_1` FOREIGN KEY (`grupo`) REFERENCES `grupos` (`id`);
