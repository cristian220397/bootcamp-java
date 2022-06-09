-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: LOCALHOST    Database: banco_protalento
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.24-MariaDB

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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_cliente` varchar(15) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `calle` varchar(100) NOT NULL,
  `cuidad` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`,`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'1.127.050.945','Cristian','Carrera 9  No. 7 - 34','Cucuta'),(2,'1.114.058.124','Robert','Calle 28 No. 8-69 CENTRO','Cucuta'),(3,'1.020.141.201','Luis','Calle 33B  No. 38-42  Barrio Barzal','Cucuta'),(4,'1.454.302.125','Duvan','Calle 20 No. 3-22','Cucuta'),(5,'1.349.926.525','Alex','Calle 7 No. 5-25  Edificio Segunda','Cucuta'),(6,'1.241.331.440','Emma','Carrera 56A No. 51-81','Bogota'),(7,'1.123.070.241','Saul','Carrera 12  No. 3-20','Bogota'),(8,'1.329.401.115','Joel','Calle 56 No. 17-30','Medellin'),(9,'1.219.024.987','Oscar','Calle 40A  No. 14-35','Cali'),(10,'1.246.948.463','Norma','Calle 56C  No. 26-90','Cali'),(11,'1.578.478.291','Hector','Carrera 12 No. 46-72','Medellin'),(12,'1.786.371.936','Gabriel','Carrera 6 No. 12-25','Cali'),(13,'1.783.294.673','Felipe','Carrera 37 No. 37-90','Bogota'),(14,'1.946.573.102','Stiven','Calle 68 No. 11-34','Bogota'),(15,'1.684.743.039','Federico','Calle 32 No. 19-31','Medellin'),(16,'1.235.775.912','Octavio','Calle 56 No. 34-77','Medellin'),(17,'1.865.846.732','Raul','Calle 43 No. 60-89','Bogota'),(18,'1.758.823.125','Jhon','Calle 87 No. 55-78','Cali'),(19,'1.748.926.946','Santiago','Calle 42 No. 25-52','Cali'),(20,'1.945.981.346','Ingrid','Calle 24 No. 19-35','Medellin');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuentas` (
  `idincrement` int(11) NOT NULL AUTO_INCREMENT,
  `idc` int(11) DEFAULT NULL,
  `idCliente` varchar(15) NOT NULL,
  `id_cuenta` varchar(15) NOT NULL,
  `tipoCuenta` varchar(10) NOT NULL,
  `prestamo` varchar(15) NOT NULL,
  `ide` int(11) DEFAULT NULL,
  `idEmpleado` varchar(15) NOT NULL,
  `id_sucursal` int(11) DEFAULT NULL,
  `nombreSucursal` varchar(100) NOT NULL,
  PRIMARY KEY (`idincrement`),
  KEY `id_sucursal` (`id_sucursal`,`nombreSucursal`),
  KEY `idc` (`idc`,`idCliente`),
  KEY `ide` (`ide`,`idEmpleado`),
  CONSTRAINT `cuentas_ibfk_1` FOREIGN KEY (`id_sucursal`, `nombreSucursal`) REFERENCES `sucursales` (`id`, `nombre_sucursal`),
  CONSTRAINT `cuentas_ibfk_2` FOREIGN KEY (`idc`, `idCliente`) REFERENCES `clientes` (`id`, `id_cliente`),
  CONSTRAINT `cuentas_ibfk_3` FOREIGN KEY (`ide`, `idEmpleado`) REFERENCES `empleados` (`id`, `id_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas`
--

LOCK TABLES `cuentas` WRITE;
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
INSERT INTO `cuentas` VALUES (1,1,'1.127.050.945','10001000','Corriente','5.000.000',1,'1.259.514.845',1,'Sucursal-01'),(2,4,'1.454.302.125','10002000','Corriente','2.500.000',4,'1.246.312.567',1,'Sucursal-01'),(3,8,'1.329.401.115','10003000','Corriente','1.500.000',3,'1.235.566.678',2,'Sucursal-02'),(4,20,'1.945.981.346','10004000','Ahorro','3.000.000',9,'1.431.111.568',2,'Sucursal-02'),(5,14,'1.946.573.102','10005000','Ahorro','1.000.000',5,'1.347.132.035',3,'Sucursal-03'),(6,6,'1.241.331.440','10006000','Corriente','8.000.000',6,'1.890.564.456',3,'Sucursal-03'),(7,19,'1.748.926.946','10007000','Ahorro','2.300.000',7,'1.467.222.039',4,'Sucursal-04'),(8,18,'1.758.823.125','10008000','Corriente','4.000.000',8,'1.327.574.479',4,'Sucursal-04');
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_empleado` varchar(15) NOT NULL,
  `nombre_empleado` varchar(100) NOT NULL,
  `fecha_incorporacion` date DEFAULT NULL,
  `numero_telefono` varchar(15) NOT NULL,
  `id_jefe` varchar(15) NOT NULL,
  `nombre_jefe` varchar(100) NOT NULL,
  PRIMARY KEY (`id`,`id_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'1.259.514.845','Laura','2022-03-04','350-508-6505','1.114.300.132','Pedro'),(2,'1.137.567.907','Andrea','2020-11-16','350-457-5467','1.114.300.132','Pedro'),(3,'1.235.566.678','Diego','2022-03-25','350-345-4578','1.378.278.176','Edgar'),(4,'1.246.312.567','Pablo','2021-01-20','350-236-3463','1.114.300.132','Pedro'),(5,'1.347.132.035','Camilo','2018-06-05','350-432-4512','1.456.675.489','Faber'),(6,'1.890.564.456','Gustavo','2015-04-10','350-789-5561','1.456.675.489','Faber'),(7,'1.467.222.039','Nubia','2022-02-09','350-986-4512','1.512.240.871','Angel'),(8,'1.327.574.479','Dario','2021-08-04','350-112-5687','1.512.240.871','Angel'),(9,'1.431.111.568','Angelica','2019-05-13','350-751-5678','1.378.278.176','Edgar'),(10,'1.125.172.678','Arley','2017-07-24','350-235-5480','1.456.675.489','Faber');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursales`
--

DROP TABLE IF EXISTS `sucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sucursales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_sucursal` varchar(100) NOT NULL,
  `cuidad` varchar(100) NOT NULL,
  PRIMARY KEY (`id`,`nombre_sucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursales`
--

LOCK TABLES `sucursales` WRITE;
/*!40000 ALTER TABLE `sucursales` DISABLE KEYS */;
INSERT INTO `sucursales` VALUES (1,'Sucursal-01','Cucuta'),(2,'Sucursal-02','Medellin'),(3,'Sucursal-03','Bogota'),(4,'Sucursal-04','Cali');
/*!40000 ALTER TABLE `sucursales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'banco_protalento'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-09  1:53:20
