-- --------------------------------------------------------
-- Hôte :                        91.121.192.13
-- Version du serveur:           5.5.47-0ubuntu0.14.04.1 - (Ubuntu)
-- SE du serveur:                debian-linux-gnu
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Export de la structure de la base pour groupe4spring
CREATE DATABASE IF NOT EXISTS `groupe4spring` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `groupe4spring`;


-- Export de la structure de table groupe4spring. HomeContractType
CREATE TABLE IF NOT EXISTS `HomeContractType` (
  `homeContractID` int(11) NOT NULL AUTO_INCREMENT,
  `homeContractName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`homeContractID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4spring.HomeContractType : ~2 rows (environ)
/*!40000 ALTER TABLE `HomeContractType` DISABLE KEYS */;
INSERT INTO `HomeContractType` (`homeContractID`, `homeContractName`) VALUES
	(1, 'Formule 1'),
	(2, 'Formule 2');
/*!40000 ALTER TABLE `HomeContractType` ENABLE KEYS */;


-- Export de la structure de table groupe4spring. QuotationHome
CREATE TABLE IF NOT EXISTS `QuotationHome` (
  `quotHID` int(11) NOT NULL AUTO_INCREMENT,
  `quotHName` varchar(20) DEFAULT NULL,
  `homeSurface` float DEFAULT NULL,
  `homeNbRoom` int(11) DEFAULT NULL,
  `quotStep` int(1) DEFAULT NULL,
  `homeFloor` int(11) DEFAULT NULL,
  `homeNbBathroom` int(11) DEFAULT NULL,
  `homeGarage` tinyint(1) DEFAULT NULL,
  `homeGardenSurface` float DEFAULT NULL,
  `homeTerraceSurface` float DEFAULT NULL,
  `priceAssHome` float DEFAULT NULL,
  `homeContractID` int(11) DEFAULT NULL,
  `userLogin` varchar(50) DEFAULT NULL,
  `homeHeater` varchar(50) DEFAULT NULL,
  `homeNote` text,
  PRIMARY KEY (`quotHID`),
  KEY `FK_QuotationHome_homeContractID` (`homeContractID`),
  CONSTRAINT `FK_QuotationHome_homeContractID` FOREIGN KEY (`homeContractID`) REFERENCES `HomeContractType` (`homeContractID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4spring.QuotationHome : ~6 rows (environ)
/*!40000 ALTER TABLE `QuotationHome` DISABLE KEYS */;
INSERT INTO `QuotationHome` (`quotHID`, `quotHName`, `homeSurface`, `homeNbRoom`, `quotStep`, `homeFloor`, `homeNbBathroom`, `homeGarage`, `homeGardenSurface`, `homeTerraceSurface`, `priceAssHome`, `homeContractID`, `userLogin`, `homeHeater`, `homeNote`) VALUES
	(1, 'DevisH1', 90, 4, 1, NULL, 2, 1, 500, 20, 50, 1, 'user', NULL, NULL),
	(2, 'DevisH2', 50, 2, 3, 2, 1, 0, 0, 0, 32, 2, 'user2', NULL, NULL),
	(3, 'Devis1', 52, 4, 2, 2, 2, 0, 200, 20, 50, 1, '1', NULL, NULL),
	(17, '5', 0, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL),
	(18, 'sfsdfsdf', 0, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL),
	(19, 'cbcvb', 0, 1, 2, NULL, 1, 1, NULL, NULL, NULL, NULL, '1', NULL, NULL),
	(20, 'appart', 0, 1, 4, NULL, 1, 1, 1, 1, NULL, 1, '1', 'type1', 'Appart'),
	(21, 'devis0', 0, 0, 4, NULL, 0, 1, 0, 0, NULL, 1, 'user', 'type1', 'Appart');
/*!40000 ALTER TABLE `QuotationHome` ENABLE KEYS */;


-- Export de la structure de table groupe4spring. QuotationVehicle
CREATE TABLE IF NOT EXISTS `QuotationVehicle` (
  `quotVID` int(11) NOT NULL AUTO_INCREMENT,
  `quotVName` varchar(50) DEFAULT NULL,
  `datePermis` varchar(10) DEFAULT NULL,
  `quotStep` int(11) DEFAULT NULL,
  `userAddress` varchar(255) DEFAULT NULL,
  `userNbAccident` int(11) DEFAULT NULL,
  `userBonus` float DEFAULT NULL,
  `vehicleShed` tinyint(1) DEFAULT NULL,
  `vehicleFirstDriver` varchar(50) DEFAULT NULL,
  `vehicleSecondDriver` varchar(50) DEFAULT NULL,
  `vehicleContractID` int(11) DEFAULT NULL,
  `userLogin` varchar(50) DEFAULT NULL,
  `vehicleBrand` varchar(50) DEFAULT NULL,
  `vehicleModel` varchar(50) DEFAULT NULL,
  `vehicleFuel` varchar(50) DEFAULT NULL,
  `vehicleHP` int(2) DEFAULT NULL,
  PRIMARY KEY (`quotVID`),
  KEY `FK_QuotationVehicle_vehicleContractID` (`vehicleContractID`),
  CONSTRAINT `FK_QuotationVehicle_vehicleContractID` FOREIGN KEY (`vehicleContractID`) REFERENCES `VehiculeContractType` (`vehicleContractID`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4spring.QuotationVehicle : ~7 rows (environ)
/*!40000 ALTER TABLE `QuotationVehicle` DISABLE KEYS */;
INSERT INTO `QuotationVehicle` (`quotVID`, `quotVName`, `datePermis`, `quotStep`, `userAddress`, `userNbAccident`, `userBonus`, `vehicleShed`, `vehicleFirstDriver`, `vehicleSecondDriver`, `vehicleContractID`, `userLogin`, `vehicleBrand`, `vehicleModel`, `vehicleFuel`, `vehicleHP`) VALUES
	(1, 'Devis1', '0000-00-00', 2, NULL, 2, 0.32, NULL, NULL, NULL, NULL, 'user', NULL, NULL, NULL, NULL),
	(3, 'Devis2', '0000-00-00', 3, '1235AZE', 1, 0.56, 0, 'Monsieur', 'Madame', 1, 'user', NULL, NULL, NULL, NULL),
	(21, 'Le Putain de Devis de merde', '2016-02-11', 4, 'rennes', 5, 1, 1, 'llement', 'joelle', 1, '1', 'betaromeo', 'roulieta', 'Hybride', 2),
	(36, 'Devis1', NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'user', NULL, NULL, NULL, NULL),
	(37, 'DevisTest', NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'user', 'Rhino', 'casimodo', 'Pédales', 5),
	(39, 'mlkmlk', '2016-04-25', 3, 'adresse', 0, 1, 1, 'moi', 'toi', NULL, '1', 'Pijo', '404', 'Electrique', 4),
	(40, 'jujuyjyu', '2016-05-06', 3, 'yjuju juj t y', 3, 1, 0, 'hyhyhy', 'tt(t(t(', NULL, 'user', 'Volezvajen', 'Jeupolu', 'Gasoil', 10),
	(41, 'gregregre', '2016-05-06', 3, 'r"r"', 0, 1, 1, 'gr', 'r"r"', NULL, 'user', 'Rhino', 'casimodo', 'Pédales', 5),
	(42, 'test3', '2016-05-28', 4, 'hthththt', 0, 1, 1, 'gtgt', 'htht', 1, 'user', 'Pijo', '404', 'Electrique', 4),
	(43, 'devis0', '2016-04-25', 4, 'adresse', 0, 1, 1, 'moi', 'toi', 1, 'user', 'Pijo', '404', 'Electrique', 4);
/*!40000 ALTER TABLE `QuotationVehicle` ENABLE KEYS */;


-- Export de la structure de table groupe4spring. VehiculeContractType
CREATE TABLE IF NOT EXISTS `VehiculeContractType` (
  `vehicleContractID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleContract` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`vehicleContractID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4spring.VehiculeContractType : ~2 rows (environ)
/*!40000 ALTER TABLE `VehiculeContractType` DISABLE KEYS */;
INSERT INTO `VehiculeContractType` (`vehicleContractID`, `vehicleContract`) VALUES
	(1, 'Tous risques'),
	(2, 'Tier');
/*!40000 ALTER TABLE `VehiculeContractType` ENABLE KEYS */;


-- Export de la structure de la base pour groupe4vertx
CREATE DATABASE IF NOT EXISTS `groupe4vertx` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `groupe4vertx`;


-- Export de la structure de table groupe4vertx. FuelType
CREATE TABLE IF NOT EXISTS `FuelType` (
  `vehicleFuelID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleFuelName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`vehicleFuelID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4vertx.FuelType : ~6 rows (environ)
/*!40000 ALTER TABLE `FuelType` DISABLE KEYS */;
INSERT INTO `FuelType` (`vehicleFuelID`, `vehicleFuelName`) VALUES
	(1, 'SP95-98'),
	(2, 'Gasoil'),
	(3, 'Hybride'),
	(4, 'Electrique'),
	(5, 'GPL'),
	(6, 'Pédales');
/*!40000 ALTER TABLE `FuelType` ENABLE KEYS */;


-- Export de la structure de table groupe4vertx. HomeType
CREATE TABLE IF NOT EXISTS `HomeType` (
  `homeTypeID` int(11) NOT NULL AUTO_INCREMENT,
  `homeTypeName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`homeTypeID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4vertx.HomeType : ~5 rows (environ)
/*!40000 ALTER TABLE `HomeType` DISABLE KEYS */;
INSERT INTO `HomeType` (`homeTypeID`, `homeTypeName`) VALUES
	(1, 'Appart'),
	(2, 'Maison'),
	(3, 'Studio'),
	(4, 'Hangar'),
	(5, 'Bunker');
/*!40000 ALTER TABLE `HomeType` ENABLE KEYS */;


-- Export de la structure de table groupe4vertx. ModelFuel
CREATE TABLE IF NOT EXISTS `ModelFuel` (
  `vehicleModelID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleFuelID` int(11) NOT NULL,
  PRIMARY KEY (`vehicleModelID`,`vehicleFuelID`),
  KEY `FK_ModelFuel_vehicleFuelID` (`vehicleFuelID`),
  CONSTRAINT `FK_ModelFuel_vehicleFuelID` FOREIGN KEY (`vehicleFuelID`) REFERENCES `FuelType` (`vehicleFuelID`),
  CONSTRAINT `FK_ModelFuel_vehicleModelID` FOREIGN KEY (`vehicleModelID`) REFERENCES `VehicleModel` (`vehicleModelID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4vertx.ModelFuel : ~10 rows (environ)
/*!40000 ALTER TABLE `ModelFuel` DISABLE KEYS */;
INSERT INTO `ModelFuel` (`vehicleModelID`, `vehicleFuelID`) VALUES
	(7, 2),
	(9, 2),
	(1, 3),
	(5, 3),
	(4, 4),
	(6, 4),
	(8, 4),
	(5, 6),
	(8, 6),
	(10, 6);
/*!40000 ALTER TABLE `ModelFuel` ENABLE KEYS */;


-- Export de la structure de table groupe4vertx. ModelHP
CREATE TABLE IF NOT EXISTS `ModelHP` (
  `vehicleHPID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleModelID` int(11) NOT NULL,
  PRIMARY KEY (`vehicleHPID`,`vehicleModelID`),
  KEY `FK_ModelHP_vehicleModelID` (`vehicleModelID`),
  CONSTRAINT `FK_ModelHP_vehicleHPID` FOREIGN KEY (`vehicleHPID`) REFERENCES `VehicleHP` (`vehicleHPID`),
  CONSTRAINT `FK_ModelHP_vehicleModelID` FOREIGN KEY (`vehicleModelID`) REFERENCES `VehicleModel` (`vehicleModelID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4vertx.ModelHP : ~8 rows (environ)
/*!40000 ALTER TABLE `ModelHP` DISABLE KEYS */;
INSERT INTO `ModelHP` (`vehicleHPID`, `vehicleModelID`) VALUES
	(1, 1),
	(4, 4),
	(3, 5),
	(2, 6),
	(5, 7),
	(1, 8),
	(2, 8),
	(5, 9);
/*!40000 ALTER TABLE `ModelHP` ENABLE KEYS */;


-- Export de la structure de table groupe4vertx. User
CREATE TABLE IF NOT EXISTS `User` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `userLogin` varchar(20) DEFAULT NULL,
  `userPassword` varchar(20) DEFAULT NULL,
  `userFirstName` varchar(20) DEFAULT NULL,
  `userLastName` varchar(20) DEFAULT NULL,
  `userAddress` varchar(100) DEFAULT NULL,
  `userCP` int(5) DEFAULT NULL,
  `userCity` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4vertx.User : ~3 rows (environ)
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` (`userID`, `userLogin`, `userPassword`, `userFirstName`, `userLastName`, `userAddress`, `userCP`, `userCity`) VALUES
	(1, 'user', 'password', 'James', 'Patagueule', '25 rue des clos', 20165, 'Laho'),
	(2, 'user2', 'password', 'Justine', 'Tittgoute', '45', 45896, 'Laba'),
	(3, '1', '1', '1', '1', '1', 11111, '1');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;


-- Export de la structure de table groupe4vertx. VehicleBrand
CREATE TABLE IF NOT EXISTS `VehicleBrand` (
  `vehicleBrandID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleBrand` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`vehicleBrandID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4vertx.VehicleBrand : ~4 rows (environ)
/*!40000 ALTER TABLE `VehicleBrand` DISABLE KEYS */;
INSERT INTO `VehicleBrand` (`vehicleBrandID`, `vehicleBrand`) VALUES
	(1, 'Pijo'),
	(2, 'Rhino'),
	(3, 'Volezvajen'),
	(4, 'betaromeo');
/*!40000 ALTER TABLE `VehicleBrand` ENABLE KEYS */;


-- Export de la structure de table groupe4vertx. VehicleHP
CREATE TABLE IF NOT EXISTS `VehicleHP` (
  `vehicleHPID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleHPNb` int(11) DEFAULT NULL,
  PRIMARY KEY (`vehicleHPID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4vertx.VehicleHP : ~5 rows (environ)
/*!40000 ALTER TABLE `VehicleHP` DISABLE KEYS */;
INSERT INTO `VehicleHP` (`vehicleHPID`, `vehicleHPNb`) VALUES
	(1, 2),
	(2, 4),
	(3, 5),
	(4, 7),
	(5, 10);
/*!40000 ALTER TABLE `VehicleHP` ENABLE KEYS */;


-- Export de la structure de table groupe4vertx. VehicleModel
CREATE TABLE IF NOT EXISTS `VehicleModel` (
  `vehicleModelID` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleModelName` varchar(10) DEFAULT NULL,
  `vehicleBrandID` int(11) NOT NULL,
  PRIMARY KEY (`vehicleModelID`),
  KEY `FK_VehiculeModel_vehicleBrandID` (`vehicleBrandID`),
  CONSTRAINT `FK_VehiculeModel_vehicleBrandID` FOREIGN KEY (`vehicleBrandID`) REFERENCES `VehicleBrand` (`vehicleBrandID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- Export de données de la table groupe4vertx.VehicleModel : ~8 rows (environ)
/*!40000 ALTER TABLE `VehicleModel` DISABLE KEYS */;
INSERT INTO `VehicleModel` (`vehicleModelID`, `vehicleModelName`, `vehicleBrandID`) VALUES
	(1, 'roulieta', 4),
	(4, 'zen', 4),
	(5, 'casimodo', 2),
	(6, '404', 1),
	(7, '503', 1),
	(8, 'Feroce', 2),
	(9, 'Jeupolu', 3),
	(10, 'Jeupolupa', 3);
/*!40000 ALTER TABLE `VehicleModel` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
