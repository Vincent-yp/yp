/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `browser` */

DROP TABLE IF EXISTS `browser`;

CREATE TABLE `browser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL,
  `rate` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `browser` */

insert  into `browser`(`id`,`NAME`,`rate`) values (1,'Opera',6.2),(2,'Safari',8.5),(3,'Chrome',12.8),(4,'IE',26.8),(5,'Firefox',45),(6,'其他',0.7),(7,'360',0.1);

/*Table structure for table `climate` */

DROP TABLE IF EXISTS `climate`;

CREATE TABLE `climate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL,
  `degree` double DEFAULT NULL,
  `month` varchar(10) DEFAULT NULL,
  `niudegree` double DEFAULT NULL,
  `bodegree` double DEFAULT NULL,
  `lundegree` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `climate` */

insert  into `climate`(`id`,`NAME`,`degree`,`month`,`niudegree`,`bodegree`,`lundegree`) values (1,'东京',7,'一月',1,-0.9,3.9),(2,'纽约',6.9,'二月',0.8,0.6,4.2),(3,'柏林',9.5,'三月',2,3.5,5.7),(4,'北京',14.5,'四月',6,8.4,8.5),(5,'伦敦',18.2,'五月',7,13.5,11.9),(6,'a',21.5,'六月',18,17,15.2),(7,'a',25.5,'七月',22,18.6,17),(8,'a',26,'八月',20,17.9,16.6),(9,'a',36,'九月',30,14.3,14.2),(10,'a',26,'十月',20,9,10.3),(11,'a',13.9,'十一月',10,3.9,6.6),(12,'a',10,'十二月',5,1,4.8);

/*Table structure for table `milkpowder` */

DROP TABLE IF EXISTS `milkpowder`;

CREATE TABLE `milkpowder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `milkpowder` */

insert  into `milkpowder`(`id`,`name`,`price`) values (1,'friso荷兰原装进口美素奶粉2段800克',8000),(3,'friso荷兰原装进口美素奶粉3段800克',3000),(4,'friso荷兰原装进口美素奶粉4段 1-2岁 700g',2500),(5,'新西兰原装进口诗幼乐奶粉1段900g',2000),(7,'新西兰原装进口诗幼乐奶粉3段900g',1600),(11,'德国原装进口爱他美奶粉3段800g',1000),(13,'爱怡乐（Aiyumye）金装系列1段，0-3个月宝宝 900g ',600),(16,'friso荷兰原装进口美素奶粉2段 6-10个月 800克',500);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
