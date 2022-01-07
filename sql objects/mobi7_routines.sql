-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mobi7
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `tempo_permanencia`
--

DROP TABLE IF EXISTS `tempo_permanencia`;
/*!50001 DROP VIEW IF EXISTS `tempo_permanencia`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `tempo_permanencia` AS SELECT 
 1 AS `posicao_id`,
 1 AS `placa_veiculo`,
 1 AS `tempo_permanencia`,
 1 AS `nome`,
 1 AS `dia`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `tempo_permanencia`
--

/*!50001 DROP VIEW IF EXISTS `tempo_permanencia`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `tempo_permanencia` AS select `p`.`id` AS `posicao_id`,`p`.`placa_veiculo` AS `placa_veiculo`,timediff(max(`p`.`data_posicao`),min(`p`.`data_posicao`)) AS `tempo_permanencia`,`poi`.`NOME` AS `nome`,cast(`p`.`data_posicao` as date) AS `dia` from (`posicao` `p` join `points_of_interest` `poi` on((((6371000 * 2) * asin(sqrt((pow(sin(((radians(`poi`.`LATITUDE`) - radians(`p`.`latitude`)) / 2)),2) + ((cos(radians(`poi`.`LATITUDE`)) * cos(radians(`p`.`latitude`))) * pow(sin(((radians(`poi`.`LONGITUDE`) - radians(`p`.`longitude`)) / 2)),2)))))) <= `poi`.`RAIO`))) group by `p`.`placa_veiculo`,`dia`,`poi`.`NOME` order by `p`.`placa_veiculo`,cast(`p`.`data_posicao` as date) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-07 13:36:39
