-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (i386)
--
-- Host: localhost    Database: coba
-- ------------------------------------------------------
-- Server version	5.6.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `album`
--

DROP TABLE IF EXISTS `album`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `album` (
  `id` varchar(128) NOT NULL,
  `idMoment` varchar(128) DEFAULT NULL,
  `photo` varchar(128) DEFAULT NULL,
  `extension` varchar(45) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `album`
--

LOCK TABLES `album` WRITE;
/*!40000 ALTER TABLE `album` DISABLE KEYS */;
/*!40000 ALTER TABLE `album` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comments`
--

DROP TABLE IF EXISTS `comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comments` (
  `idComment` char(64) NOT NULL,
  `idNews` char(64) NOT NULL,
  `comment` text NOT NULL,
  `userComment` char(64) NOT NULL,
  `dateComment` datetime NOT NULL,
  `ipComment` varchar(11) NOT NULL,
  PRIMARY KEY (`idComment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comments`
--

LOCK TABLES `comments` WRITE;
/*!40000 ALTER TABLE `comments` DISABLE KEYS */;
/*!40000 ALTER TABLE `comments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `family`
--

DROP TABLE IF EXISTS `family`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `family` (
  `id` char(64) NOT NULL,
  `parent_id` char(64) NOT NULL,
  `name` varchar(120) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `family`
--

LOCK TABLES `family` WRITE;
/*!40000 ALTER TABLE `family` DISABLE KEYS */;
INSERT INTO `family` VALUES ('best','ortu','best'),('ortu','0','ortu');
/*!40000 ALTER TABLE `family` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `following`
--

DROP TABLE IF EXISTS `following`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `following` (
  `id` varchar(64) NOT NULL,
  `userid` varchar(64) DEFAULT NULL,
  `followby` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `following`
--

LOCK TABLES `following` WRITE;
/*!40000 ALTER TABLE `following` DISABLE KEYS */;
INSERT INTO `following` VALUES ('123','jhon','jhon1');
/*!40000 ALTER TABLE `following` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mst_moment`
--

DROP TABLE IF EXISTS `mst_moment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mst_moment` (
  `id_moment` char(64) NOT NULL,
  `username` varchar(45) NOT NULL,
  `moment` longtext,
  `idAlbum` varchar(64) DEFAULT NULL,
  `friendlist` varchar(45) DEFAULT NULL,
  `place` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `ip_create` varchar(45) DEFAULT NULL,
  `ip_update` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_moment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mst_moment`
--

LOCK TABLES `mst_moment` WRITE;
/*!40000 ALTER TABLE `mst_moment` DISABLE KEYS */;
/*!40000 ALTER TABLE `mst_moment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `idNews` char(32) NOT NULL,
  `title` varchar(200) NOT NULL,
  `author` varchar(200) NOT NULL,
  `cat` varchar(200) NOT NULL,
  `news` text NOT NULL,
  `source` varchar(200) NOT NULL,
  `images` varchar(200) NOT NULL,
  `createDate` date NOT NULL,
  `updateDate` date NOT NULL,
  `fileAttach` varchar(200) NOT NULL,
  `ipCreate` varchar(299) NOT NULL,
  `ipUpdate` varchar(200) NOT NULL,
  PRIMARY KEY (`idNews`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES ('08c941fa-5737-4826-954d-713ea710','Horas Bangso Batak','Jhon boy Sibuea','hot','tudia nama luluan','http://horas','images.jpg','2015-02-25','2015-02-25','FILE.DOC','127.0.0.0','127.0.0.1'),('967f0fe0-bd0a-11e4-a7cb-506313df','Mulak tu Bona Pasogit','Jhon boy Sibuea','hot',' Mari kita ke Samosir, ada konser musik ‚ÄúMulak tu Bona Pasogit‚Äù di Kampung Halaman (Bona Pasogit). Harian Boho (30/12) di kampung sastrawan Sitor Situmorang dilahirkan ada konser musik Mulak tu Bona Pasogit, acara yang diselenggarakan Rumah Karya Indonesia ini cukup meraih karena turut hadir para musisi, perorangan maupun komunitas cuma berasal dari Medan atau Sumatera Utara, tetapi juga dari Jakarta, Yogyakarta, bahkan Rumania.Seperti pemain seruling Martogi Sitohang yang sangat terkenal. Hardoni Sitohang & Team, KOtantra USu, Black Canel USU, Komunal Primitif USU, Incidental Music, T n F Brass Band, Hendra Ginting, Forum Generasi Muda Batak, Anak-anak Harian Boho, Jendela, Toba, Seribu Sajak Tao Toba, dan RKI. Dari Jakarta; Horjabius, Gorame Band, dan Paulus Simangunsong. Dari Yogyakarta NOS, Dari Rumania; Mihai.Ojax Manalu sebagai manejer Rumah Karya Indonesia, pemain gondang (alat musik gendang tradisional Batak) Martahan Sitohang lah yang merupakan penggagas konser Mulak Tu Bona Pasogit ini.','http://horas','images.jpg','2015-02-25','2015-03-25','FILaE.DOC','127.0.0.0','127.0.0.1');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `ID` int(11) NOT NULL,
  `FIRSTNAME` varchar(60) NOT NULL,
  `LASTNAME` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (13,'asdads','asdfasdf'),(13,'asdads','asdfasdf'),(13,'salahku','salahku'),(13,'asdgasdg','asdgas'),(13,'asdg','asdg'),(13,'asdg','asdg'),(13,'asdgasdg','asdgasdg'),(13,'adsga','adghasdg'),(13,'asdg','adsg'),(13,'asdgds','adsgsadg'),(13,'asdg','asdg'),(13,'asdgasdf','asdgasdg'),(13,'asdgasdf','asdgasdg'),(13,'xdfasd','asdfsd'),(13,'asdg','asdg'),(13,'asdg','asdg'),(13,'asdg','asdg'),(13,'asdg','asdg'),(13,'asdg','asdg'),(13,'adsg','adsg'),(13,'asdgasdg','asdg'),(13,'lssslls','lalallalal'),(13,'lssslls','lalallalal'),(13,'dalam','asdg'),(13,'tasety','asdgasdg'),(13,'tasety','asdgasdg'),(13,'tasety','asdgasdg'),(13,'whyw','always');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post` (
  `ID` int(11) NOT NULL,
  `NEWS` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (12,'saef'),(12,'saefa'),(12,'asdggadg'),(12,'asdgadsg'),(12,'asdgasdg'),(12,''),(12,'adsg'),(12,'adsg'),(12,'adsg'),(12,'adsg'),(12,'adsg'),(12,'asdgasdg'),(12,'1'),(12,'asdg');
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `username` varchar(120) NOT NULL,
  `role` varchar(120) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES ('adsgasg','ROLE_USER'),('asdgfaasdg','ROLE_USER'),('jhon','ROLE_ADMIN'),('jhon1','ROLE_USER'),('jhoss','ROLE_USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unit`
--

DROP TABLE IF EXISTS `unit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unit` (
  `id` varchar(16) NOT NULL,
  `name` varchar(100) NOT NULL,
  `detail` varchar(100) NOT NULL,
  `amount` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unit`
--

LOCK TABLES `unit` WRITE;
/*!40000 ALTER TABLE `unit` DISABLE KEYS */;
INSERT INTO `unit` VALUES ('1','INNOVA','SUPER LUZ','1000','10000');
/*!40000 ALTER TABLE `unit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdetails`
--

DROP TABLE IF EXISTS `userdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdetails` (
  `username` varchar(100) NOT NULL,
  `firstname` varchar(100) DEFAULT NULL,
  `middlename` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `marga` varchar(45) NOT NULL,
  `alamat` varchar(45) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdetails`
--

LOCK TABLES `userdetails` WRITE;
/*!40000 ALTER TABLE `userdetails` DISABLE KEYS */;
INSERT INTO `userdetails` VALUES ('adsgasg',NULL,NULL,NULL,'asdgasgd',NULL,'\0','\0'),('asdgfaasdg',NULL,NULL,NULL,'asdgf',NULL,'\0','\0'),('jhon','jhon','boy','sibuea','jhon',NULL,'\0','\0'),('jhon1',NULL,NULL,NULL,'sibuea',NULL,'\0','\0'),('jhoss',NULL,NULL,NULL,'sibuea',NULL,'\0','\0');
/*!40000 ALTER TABLE `userdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(120) NOT NULL,
  `password` varchar(120) NOT NULL,
  `enabled` varchar(11) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('adsgasg','asdg','1','ag@asdg'),('asdgfaasdg','asdg','1','asdg@sadg.vom'),('jhon','jhon','true',NULL),('jhon1','jhon','1',NULL),('jhoss','7buea','1','if10046@students.del.ac.id');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-07 11:19:03
