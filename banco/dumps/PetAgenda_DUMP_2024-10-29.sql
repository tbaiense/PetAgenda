-- MariaDB dump 10.19  Distrib 10.11.6-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: 10.0.0.107    Database: pet_agenda
-- ------------------------------------------------------
-- Server version	10.11.6-MariaDB-0+deb12u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agendamento`
--

DROP TABLE IF EXISTS `agendamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agendamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_servico` int(11) NOT NULL,
  `id_tipo_servico` int(11) NOT NULL,
  `dt_hr_marcada` datetime NOT NULL,
  `id_pet` int(11) NOT NULL,
  `endereco_pet` varchar(255) NOT NULL COMMENT 'Endereço de onde o Pet deverá ser buscado. Conterá o endereço de forma concatenada e separado por vírgulas.',
  `id_funcionario_agend` int(11) NOT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `id_pacote_agendamento` int(11) DEFAULT NULL,
  `pet_buscar_com` varchar(64) DEFAULT NULL,
  `pet_devolver_para` varchar(64) DEFAULT NULL,
  `qnt_passeios` int(11) NOT NULL DEFAULT 0,
  `local_cuidado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_servico` (`id_servico`),
  KEY `id_pet` (`id_pet`),
  KEY `id_funcionario_agend` (`id_funcionario_agend`),
  KEY `id_pacote_agendamento` (`id_pacote_agendamento`),
  KEY `id_tipo_servico` (`id_tipo_servico`),
  CONSTRAINT `agendamento_ibfk_1` FOREIGN KEY (`id_servico`) REFERENCES `servico_disponivel` (`id`),
  CONSTRAINT `agendamento_ibfk_2` FOREIGN KEY (`id_pet`) REFERENCES `pet` (`id`),
  CONSTRAINT `agendamento_ibfk_3` FOREIGN KEY (`id_funcionario_agend`) REFERENCES `usuario` (`id`),
  CONSTRAINT `agendamento_ibfk_4` FOREIGN KEY (`id_pacote_agendamento`) REFERENCES `pacote_agendamento` (`id`),
  CONSTRAINT `agendamento_ibfk_5` FOREIGN KEY (`id_tipo_servico`) REFERENCES `tipo_servico` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendamento`
--

LOCK TABLES `agendamento` WRITE;
/*!40000 ALTER TABLE `agendamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `agendamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `anexo_historico`
--

DROP TABLE IF EXISTS `anexo_historico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anexo_historico` (
  `id_historico_servico` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(64) NOT NULL,
  `caminho_anexo` varchar(255) NOT NULL,
  PRIMARY KEY (`id_historico_servico`,`caminho_anexo`),
  CONSTRAINT `anexo_historico_ibfk_1` FOREIGN KEY (`id_historico_servico`) REFERENCES `historico_servico` (`id_historico_servico`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anexo_historico`
--

LOCK TABLES `anexo_historico` WRITE;
/*!40000 ALTER TABLE `anexo_historico` DISABLE KEYS */;
/*!40000 ALTER TABLE `anexo_historico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_endereco` int(11) NOT NULL,
  `nome` varchar(64) NOT NULL,
  `cpf` char(11) DEFAULT NULL COMMENT 'CPF do cliente no formato numérico, exemplo: 12345678912',
  `telefone` varchar(12) NOT NULL COMMENT 'Número de telefone do cliente no formato numérico, exemplo: 27123456789',
  `id_servico_solicita` int(11) NOT NULL,
  `buscar_com` varchar(64) DEFAULT NULL,
  `devolver_para` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_endereco` (`id_endereco`),
  KEY `id_servico_solicita` (`id_servico_solicita`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`),
  CONSTRAINT `cliente_ibfk_2` FOREIGN KEY (`id_servico_solicita`) REFERENCES `servico_disponivel` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rua` varchar(45) NOT NULL,
  `numero` varchar(16) NOT NULL,
  `bairro` varchar(32) NOT NULL,
  `cidade` varchar(32) NOT NULL,
  `cep` char(8) NOT NULL COMMENT 'CEP no formato numérico (12345678).',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES
(4,'Rua tal','numero 5','Bairro legal','Cidade bacana','12345678'),
(7,'Rua tal','numero 5','Bairro legal','Cidade bacana','12345678'),
(8,'Rua Linda','50','Itaquara','Itapina','21343278'),
(9,'Rua Majestade','231','Cariacica','Carne seca','33343278'),
(10,'Rua Majestade','231','Cariacica','Carne seca','33343278');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historico_servico`
--

DROP TABLE IF EXISTS `historico_servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historico_servico` (
  `id_historico_servico` int(11) NOT NULL AUTO_INCREMENT,
  `id_agendamento` int(11) NOT NULL,
  `descricao` text DEFAULT NULL,
  `dt_hr_finalizado` datetime NOT NULL,
  `duracao` int(11) NOT NULL COMMENT 'Tempo, em minutos, que levou para o serviço ser concluído.',
  `observacao` varchar(255) DEFAULT NULL,
  `comportamento_pet` varchar(120) DEFAULT NULL,
  `id_incidente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_historico_servico`,`id_agendamento`),
  KEY `id_agendamento` (`id_agendamento`),
  KEY `id_incidente` (`id_incidente`),
  CONSTRAINT `historico_servico_ibfk_1` FOREIGN KEY (`id_agendamento`) REFERENCES `agendamento` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `historico_servico_ibfk_2` FOREIGN KEY (`id_incidente`) REFERENCES `incidente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico_servico`
--

LOCK TABLES `historico_servico` WRITE;
/*!40000 ALTER TABLE `historico_servico` DISABLE KEYS */;
/*!40000 ALTER TABLE `historico_servico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hr_alim_agend`
--

DROP TABLE IF EXISTS `hr_alim_agend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hr_alim_agend` (
  `id_agendamento` int(11) NOT NULL AUTO_INCREMENT,
  `hr_alimentacao` time NOT NULL,
  PRIMARY KEY (`id_agendamento`,`hr_alimentacao`),
  CONSTRAINT `hr_alim_agend_ibfk_1` FOREIGN KEY (`id_agendamento`) REFERENCES `agendamento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hr_alim_agend`
--

LOCK TABLES `hr_alim_agend` WRITE;
/*!40000 ALTER TABLE `hr_alim_agend` DISABLE KEYS */;
/*!40000 ALTER TABLE `hr_alim_agend` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `incidente`
--

DROP TABLE IF EXISTS `incidente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `incidente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data_hora` datetime NOT NULL,
  `e_emergencia` bit(1) NOT NULL DEFAULT b'0',
  `id_pet` int(11) NOT NULL,
  `id_servico_contratado` int(11) NOT NULL,
  `descricao` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pet` (`id_pet`),
  KEY `id_servico_contratado` (`id_servico_contratado`),
  CONSTRAINT `incidente_ibfk_1` FOREIGN KEY (`id_pet`) REFERENCES `pet` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `incidente_ibfk_2` FOREIGN KEY (`id_servico_contratado`) REFERENCES `servico_disponivel` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `incidente`
--

LOCK TABLES `incidente` WRITE;
/*!40000 ALTER TABLE `incidente` DISABLE KEYS */;
/*!40000 ALTER TABLE `incidente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `local_atuacao`
--

DROP TABLE IF EXISTS `local_atuacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `local_atuacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bairro` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local_atuacao`
--

LOCK TABLES `local_atuacao` WRITE;
/*!40000 ALTER TABLE `local_atuacao` DISABLE KEYS */;
INSERT INTO `local_atuacao` VALUES
(5,'Tucum','Vitória'),
(6,'Praia do Canto','Vitória'),
(7,'Jardim da Penha','Vitória'),
(8,'Aeroporto','Guarapari'),
(9,'Centro','Guarapari');
/*!40000 ALTER TABLE `local_atuacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pacote_agendamento`
--

DROP TABLE IF EXISTS `pacote_agendamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pacote_agendamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacote_agendamento`
--

LOCK TABLES `pacote_agendamento` WRITE;
/*!40000 ALTER TABLE `pacote_agendamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `pacote_agendamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permissao`
--

DROP TABLE IF EXISTS `permissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permissao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permissao`
--

LOCK TABLES `permissao` WRITE;
/*!40000 ALTER TABLE `permissao` DISABLE KEYS */;
INSERT INTO `permissao` VALUES
(1,'ADMINISTRADOR'),
(2,'FUNCIONARIO');
/*!40000 ALTER TABLE `permissao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pet`
--

DROP TABLE IF EXISTS `pet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_cliente_dono` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `cor` varchar(16) DEFAULT NULL,
  `raca` varchar(45) NOT NULL,
  `sexo` enum('M','F') NOT NULL,
  `porte` ENUM("Pequeno", "Médio", "Grande") NOT NULL,
  `comportamento` varchar(80) DEFAULT NULL,
  `e_castrado` bit(1) NOT NULL,
  `caminho_cartao_vacinacao` varchar(255) DEFAULT NULL,
  `estado_saude` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente_dono` (`id_cliente_dono`),
  CONSTRAINT `pet_ibfk_1` FOREIGN KEY (`id_cliente_dono`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pet`
--

LOCK TABLES `pet` WRITE;
/*!40000 ALTER TABLE `pet` DISABLE KEYS */;
/*!40000 ALTER TABLE `pet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `remedio_agend`
--

DROP TABLE IF EXISTS `remedio_agend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `remedio_agend` (
  `id_agendamento` int(11) NOT NULL AUTO_INCREMENT,
  `remedio` varchar(64) NOT NULL,
  `hr_administrar` time NOT NULL,
  `instrucoes` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id_agendamento`,`remedio`),
  CONSTRAINT `remedio_agend_ibfk_1` FOREIGN KEY (`id_agendamento`) REFERENCES `agendamento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `remedio_agend`
--

LOCK TABLES `remedio_agend` WRITE;
/*!40000 ALTER TABLE `remedio_agend` DISABLE KEYS */;
/*!40000 ALTER TABLE `remedio_agend` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servico_disponivel`
--

DROP TABLE IF EXISTS `servico_disponivel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servico_disponivel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `id_tipo_servico` int(11) NOT NULL,
  `duracao` int(11) NOT NULL COMMENT 'Duração em minutos necessária para realização do serviço',
  `preco` decimal(8,2) NOT NULL DEFAULT 0.00,
  `descricao` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_tipo_servico` (`id_tipo_servico`),
  CONSTRAINT `servico_disponivel_ibfk_1` FOREIGN KEY (`id_tipo_servico`) REFERENCES `tipo_servico` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servico_disponivel`
--

LOCK TABLES `servico_disponivel` WRITE;
/*!40000 ALTER TABLE `servico_disponivel` DISABLE KEYS */;
INSERT INTO `servico_disponivel` VALUES
(1,'Pet sitting',1,120,100.00,'Serviço de atendimento doméstico onde os Pets recebem um cuidado pessoal e personalizado.'),
(2,'Vacinação',2,30,90.00,'Serviço de cuidado especial para aplicação de vacinas.'),
(3,'Consulta',2,60,120.00,'Servico de cuidado especial para consultas veterinárias não supervisionadas pelo dono do Pet.'),
(4,'Dog Walking',3,60,60.00,'Serviço de passeio de Pets.');
/*!40000 ALTER TABLE `servico_disponivel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_servico`
--

DROP TABLE IF EXISTS `tipo_servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_servico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_servico`
--

LOCK TABLES `tipo_servico` WRITE;
/*!40000 ALTER TABLE `tipo_servico` DISABLE KEYS */;
INSERT INTO `tipo_servico` VALUES
(1,'Atendimento doméstico'),
(2,'Cuidado especial'),
(3,'Passeio');
/*!40000 ALTER TABLE `tipo_servico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(64) NOT NULL,
  `id_endereco` int(11) NOT NULL,
  `cpf` char(11) NOT NULL,
  `telefone` varchar(12) NOT NULL COMMENT 'Número de telefone do usuário no formato numérico, exemplo: 27123456789',
  `senha` varchar(32) DEFAULT NULL,
  `id_servico_presta` int(11) NOT NULL,
  `id_permissao` int(11) DEFAULT NULL COMMENT 'Grupo de permissão do usuário dentro do sistema.',
  `id_local_atuacao` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_endereco` (`id_endereco`),
  KEY `id_servico_presta` (`id_servico_presta`),
  KEY `id_permissao` (`id_permissao`),
  KEY `id_local_atuacao` (`id_local_atuacao`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`),
  CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`id_servico_presta`) REFERENCES `servico_disponivel` (`id`),
  CONSTRAINT `usuario_ibfk_3` FOREIGN KEY (`id_permissao`) REFERENCES `permissao` (`id`),
  CONSTRAINT `usuario_ibfk_4` FOREIGN KEY (`id_local_atuacao`) REFERENCES `local_atuacao` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES
(4,'MarquinhosV2',4,'88784449012','40028922',NULL,4,NULL,5),
(7,'Marcos',7,'88784449012','40028922',NULL,2,NULL,5),
(8,'Silvana',8,'88784449012','40028922',NULL,2,NULL,6),
(9,'Rosemary',9,'88784449012','33365759',NULL,1,NULL,9),
(10,'Antônio',10,'88784449012','33365759',NULL,1,NULL,8);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-29 16:28:30
