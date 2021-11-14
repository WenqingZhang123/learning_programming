/*
 Navicat Premium Data Transfer

 Source Server         : mysql_mac
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : db3

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 14/11/2021 07:23:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of dept
-- ----------------------------
BEGIN;
INSERT INTO `dept` VALUES (1, '开发部');
INSERT INTO `dept` VALUES (2, '市场部');
INSERT INTO `dept` VALUES (3, '财务部');
INSERT INTO `dept` VALUES (4, '售后部');
COMMIT;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `dept_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dept_id` (`dept_id`),
  CONSTRAINT `emp_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of emp
-- ----------------------------
BEGIN;
INSERT INTO `emp` VALUES (1, '孙悟空', '男', 7200, '2013-02-24', 1);
INSERT INTO `emp` VALUES (2, '猪八戒', '男', 3600, '2010-12-02', 2);
INSERT INTO `emp` VALUES (3, '唐僧', '男', 9000, '2008-08-08', 2);
INSERT INTO `emp` VALUES (4, '白骨精', '女', 5000, '2015-10-07', 3);
INSERT INTO `emp` VALUES (5, '蜘蛛精', '女', 4500, '2011-03-14', 1);
INSERT INTO `emp` VALUES (6, '白龙马', '男', 2800, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
