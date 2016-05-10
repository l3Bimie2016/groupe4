-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.5.47-0ubuntu0.14.04.1 - (Ubuntu)
-- SE du serveur:                debian-linux-gnu
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Export de la structure de la base pour groupe4Spring
DROP DATABASE IF EXISTS `groupe4Spring`;
CREATE DATABASE IF NOT EXISTS `groupe4Spring` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `groupe4Spring`;


-- Export de la structure de table groupe4Spring. HomeContractType
DROP TABLE IF EXISTS `HomeContractType`;
CREATE TABLE IF NOT EXISTS `HomeContractType` (
  `homeContractID` int(11) NOT NULL AUTO_INCREMENT,
  `homeContractName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`homeContractID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4Spring.HomeContractType : ~2 rows (environ)
DELETE FROM `HomeContractType`;
/*!40000 ALTER TABLE `HomeContractType` DISABLE KEYS */;
INSERT INTO `HomeContractType` (`homeContractID`, `homeContractName`) VALUES
	(1, 'Formule 1'),
	(2, 'Formule 2');
/*!40000 ALTER TABLE `HomeContractType` ENABLE KEYS */;


-- Export de la structure de table groupe4Spring. QuotationHome
DROP TABLE IF EXISTS `QuotationHome`;
CREATE TABLE IF NOT EXISTS `QuotationHome` (
  `quotHID` int(11) NOT NULL AUTO_INCREMENT,
  `quotHName` varchar(20) DEFAULT NULL,
  `homeSurface` float DEFAULT NULL,
  `homeNbRoom` int(11) DEFAULT NULL,
  `homeFloor` int(11) DEFAULT NULL,
  `homeNbBathroom` int(11) DEFAULT NULL,
  `homeGarage` tinyint(1) DEFAULT NULL,
  `homeGardenSurface` float DEFAULT NULL,
  `homeTerraceSurface` float DEFAULT NULL,
  `priceAssHome` float DEFAULT NULL,
  `homeContractID` int(11) NOT NULL,
  `userLogin` varchar(50) NOT NULL,
  PRIMARY KEY (`quotHID`),
  KEY `FK_QuotationHome_homeContractID` (`homeContractID`),
  CONSTRAINT `FK_QuotationHome_homeContractID` FOREIGN KEY (`homeContractID`) REFERENCES `HomeContractType` (`homeContractID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4Spring.QuotationHome : ~2 rows (environ)
DELETE FROM `QuotationHome`;
/*!40000 ALTER TABLE `QuotationHome` DISABLE KEYS */;
INSERT INTO `QuotationHome` (`quotHID`, `quotHName`, `homeSurface`, `homeNbRoom`, `homeFloor`, `homeNbBathroom`, `homeGarage`, `homeGardenSurface`, `homeTerraceSurface`, `priceAssHome`, `homeContractID`, `userLogin`) VALUES
	(1, 'DevisH1', 90, 4, NULL, 2, 1, 500, 20, 50, 1, 'user'),
	(2, 'DevisH2', 50, 2, 2, 1, 0, 0, 0, 32, 2, 'user2');
/*!40000 ALTER TABLE `QuotationHome` ENABLE KEYS */;


-- Export de la structure de table groupe4Spring. QuotationVehicle
DROP TABLE IF EXISTS `QuotationVehicle`;
CREATE TABLE IF NOT EXISTS `QuotationVehicle` (
  `quotVID` int(11) NOT NULL AUTO_INCREMENT,
  `quotVName` varchar(50) DEFAULT NULL,
  `datePermis` float DEFAULT NULL,
  `quotStep` int(11) DEFAULT NULL,
  `userAddress` varchar(10) DEFAULT NULL,
  `userNbAccident` int(11) DEFAULT NULL,
  `userBonus` float DEFAULT NULL,
  `vehicleShed` tinyint(1) DEFAULT NULL,
  `vehicleFirstDriver` varchar(50) DEFAULT NULL,
  `vehiculeSecondDriver` varchar(50) DEFAULT NULL,
  `vehicleContractID` int(11) NOT NULL,
  `userLogin` varchar(50) NOT NULL,
  PRIMARY KEY (`quotVID`),
  KEY `FK_QuotationVehicle_vehicleContractID` (`vehicleContractID`),
  CONSTRAINT `FK_QuotationVehicle_vehicleContractID` FOREIGN KEY (`vehicleContractID`) REFERENCES `VehiculeContractType` (`vehicleContractID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4Spring.QuotationVehicle : ~2 rows (environ)
DELETE FROM `QuotationVehicle`;
/*!40000 ALTER TABLE `QuotationVehicle` DISABLE KEYS */;
INSERT INTO `QuotationVehicle` (`quotVID`, `quotVName`, `datePermis`, `quotStep`, `userAddress`, `userNbAccident`, `userBonus`, `vehicleShed`, `vehicleFirstDriver`, `vehiculeSecondDriver`, `vehicleContractID`, `userLogin`) VALUES
	(1, 'Devis1', 250, 2, '1234569A', 2, 0.32, 1, 'Madame', 'Monsieur', 2, 'user'),
	(3, 'Devis2', 350, 3, '1235AZE', 1, 0.56, 0, 'Monsieur', 'Madame', 1, 'user2');
/*!40000 ALTER TABLE `QuotationVehicle` ENABLE KEYS */;


-- Export de la structure de table groupe4Spring. VehiculeContractType
DROP TABLE IF EXISTS `VehiculeContractType`;
CREATE TABLE IF NOT EXISTS `VehiculeContractType` (
  `vehicleContractID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleContract` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`vehicleContractID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4Spring.VehiculeContractType : ~2 rows (environ)
DELETE FROM `VehiculeContractType`;
/*!40000 ALTER TABLE `VehiculeContractType` DISABLE KEYS */;
INSERT INTO `VehiculeContractType` (`vehicleContractID`, `vehicleContract`) VALUES
	(1, 'Tous risques'),
	(2, 'Tier');
/*!40000 ALTER TABLE `VehiculeContractType` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
