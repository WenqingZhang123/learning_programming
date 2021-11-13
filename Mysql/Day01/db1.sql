/*
 Navicat Premium Data Transfer

 Source Server         : mysql_mac
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : db1

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 13/11/2021 06:21:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dep_name` varchar(20) DEFAULT NULL,
  `dep_location` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of department
-- ----------------------------
BEGIN;
INSERT INTO `department` VALUES (5, '研发部', '广州');
COMMIT;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `dep_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `emp_dep` (`dep_id`),
  CONSTRAINT `emp_dep` FOREIGN KEY (`dep_id`) REFERENCES `department` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of employee
-- ----------------------------
BEGIN;
INSERT INTO `employee` VALUES (1, '张三', 20, 5);
INSERT INTO `employee` VALUES (2, '李四', 21, 5);
INSERT INTO `employee` VALUES (3, '王五', 20, 5);
COMMIT;

-- ----------------------------
-- Table structure for love
-- ----------------------------
DROP TABLE IF EXISTS `love`;
CREATE TABLE `love` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of love
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `id` int DEFAULT NULL,
  `NAME` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of stu
-- ----------------------------
BEGIN;
INSERT INTO `stu` VALUES (1, 'zwq');
INSERT INTO `stu` VALUES (2, 'qqq');
COMMIT;

-- ----------------------------
-- Table structure for student1
-- ----------------------------
DROP TABLE IF EXISTS `student1`;
CREATE TABLE `student1` (
  `id` int DEFAULT NULL,
  `phone_number` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student1
-- ----------------------------
BEGIN;
INSERT INTO `student1` VALUES (1, 111);
INSERT INTO `student1` VALUES (1, 111);
COMMIT;

-- ----------------------------
-- Table structure for student2
-- ----------------------------
DROP TABLE IF EXISTS `student2`;
CREATE TABLE `student2` (
  `id` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student2
-- ----------------------------
BEGIN;
INSERT INTO `student2` VALUES (1, 'zwq');
INSERT INTO `student2` VALUES (2, NULL);
INSERT INTO `student2` VALUES (3, 'zzz');
INSERT INTO `student2` VALUES (4, 'zwq');
INSERT INTO `student2` VALUES (5, 'zwq');
COMMIT;

-- ----------------------------
-- Table structure for student3
-- ----------------------------
DROP TABLE IF EXISTS `student3`;
CREATE TABLE `student3` (
  `id` int DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `math` int DEFAULT NULL,
  `english` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student3
-- ----------------------------
BEGIN;
INSERT INTO `student3` VALUES (1, '马云', 55, '男', ' 杭州', 66, 78);
INSERT INTO `student3` VALUES (2, '马化腾', 45, '女', '深圳', 98, 87);
INSERT INTO `student3` VALUES (3, '马景涛', 55, '男', '香港', 56, 77);
INSERT INTO `student3` VALUES (4, '柳岩 ', 20, '女', '湖南', 76, 65);
INSERT INTO `student3` VALUES (5, '柳青', 20, '男', '湖南', 86, NULL);
INSERT INTO `student3` VALUES (6, '刘德华', 57, '男', '香港', 99, 99);
INSERT INTO `student3` VALUES (7, '马德', 22, '女', '香港', 99, 99);
INSERT INTO `student3` VALUES (8, '德玛西亚', 18, '男', '南京', 56, 65);
COMMIT;

-- ----------------------------
-- Table structure for tab_category
-- ----------------------------
DROP TABLE IF EXISTS `tab_category`;
CREATE TABLE `tab_category` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `cname` varchar(100) NOT NULL,
  PRIMARY KEY (`cid`),
  UNIQUE KEY `cname` (`cname`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tab_category
-- ----------------------------
BEGIN;
INSERT INTO `tab_category` VALUES (2, '出境游');
INSERT INTO `tab_category` VALUES (1, '周边游');
INSERT INTO `tab_category` VALUES (3, '国内游');
INSERT INTO `tab_category` VALUES (4, '港澳游');
COMMIT;

-- ----------------------------
-- Table structure for tab_favorite
-- ----------------------------
DROP TABLE IF EXISTS `tab_favorite`;
CREATE TABLE `tab_favorite` (
  `rid` int NOT NULL,
  `date` datetime DEFAULT NULL,
  `uid` int NOT NULL,
  PRIMARY KEY (`rid`,`uid`),
  KEY `uid` (`uid`),
  CONSTRAINT `tab_favorite_ibfk_1` FOREIGN KEY (`rid`) REFERENCES `tab_route` (`rid`),
  CONSTRAINT `tab_favorite_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `tab_user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tab_favorite
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for tab_route
-- ----------------------------
DROP TABLE IF EXISTS `tab_route`;
CREATE TABLE `tab_route` (
  `rid` int NOT NULL AUTO_INCREMENT,
  `rname` varchar(100) NOT NULL,
  `price` double DEFAULT NULL,
  `rdate` date DEFAULT NULL,
  `cid` int DEFAULT NULL,
  PRIMARY KEY (`rid`),
  UNIQUE KEY `rname` (`rname`),
  KEY `cid` (`cid`),
  CONSTRAINT `tab_route_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `tab_category` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tab_route
-- ----------------------------
BEGIN;
INSERT INTO `tab_route` VALUES (1, '【厦门+鼓浪屿+南普陀寺+曾厝垵 高铁 3 天 惠贵团】尝味友鸭面线 住 1 晚鼓浪屿', 1499, '2018-01-27', 1);
INSERT INTO `tab_route` VALUES (2, '【浪漫桂林 阳朔西街高铁 3 天纯玩 高级团】城徽象鼻山 兴坪漓江 西山公园', 699, '2018-02-22', 3);
INSERT INTO `tab_route` VALUES (3, '【爆款¥1699 秒杀】泰国 曼谷 芭堤雅 金沙岛 杜拉拉水上市场 双飞六天【含送签费 泰风情 广州 往返 特价团】', 1699, '2018-01-27', 2);
INSERT INTO `tab_route` VALUES (4, '【经典•狮航 ¥2399 秒杀】巴厘岛双飞五天 抵玩【广州往返 特价团】', 2399, '2017-12-23', 2);
INSERT INTO `tab_route` VALUES (5, '香港迪士尼乐园自由行2天【永东跨境巴士广东至迪士尼去程交通+迪士尼一日门票+香港如心海景酒店 暨会议中心标准房1晚住宿】', 799, '2018-04-10', 4);
COMMIT;

-- ----------------------------
-- Table structure for tab_user
-- ----------------------------
DROP TABLE IF EXISTS `tab_user`;
CREATE TABLE `tab_user` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(30) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `sex` char(1) DEFAULT '男',
  `telephone` varchar(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tab_user
-- ----------------------------
BEGIN;
INSERT INTO `tab_user` VALUES (1, 'cz110', '123456', '老王', '1977-07-07', '男', '13888888888', '66666@qq.com');
INSERT INTO `tab_user` VALUES (2, 'cz119', '654321', '小王', '1999-09-09', '男', '13999999999', '99999@qq.com');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
