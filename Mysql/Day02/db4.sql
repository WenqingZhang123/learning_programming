/*
 Navicat Premium Data Transfer

 Source Server         : mysql_mac
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : db4

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 14/11/2021 07:23:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int NOT NULL,
  `dname` varchar(50) DEFAULT NULL,
  `loc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of dept
-- ----------------------------
BEGIN;
INSERT INTO `dept` VALUES (10, '教研部', '北京');
INSERT INTO `dept` VALUES (20, '学工部', '上海');
INSERT INTO `dept` VALUES (30, '销售部', '广州');
INSERT INTO `dept` VALUES (40, '财务部', '深圳');
COMMIT;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int NOT NULL,
  `ename` varchar(50) DEFAULT NULL,
  `job_id` int DEFAULT NULL,
  `mgr` int DEFAULT NULL,
  `joindate` date DEFAULT NULL,
  `salary` decimal(7,2) DEFAULT NULL,
  `bonus` decimal(7,2) DEFAULT NULL,
  `dept_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `emp_jobid_ref_job_id_fk` (`job_id`),
  KEY `emp_deptid_ref_dept_id_fk` (`dept_id`),
  CONSTRAINT `emp_deptid_ref_dept_id_fk` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`id`),
  CONSTRAINT `emp_jobid_ref_job_id_fk` FOREIGN KEY (`job_id`) REFERENCES `job` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of emp
-- ----------------------------
BEGIN;
INSERT INTO `emp` VALUES (1001, '孙悟空', 4, 1004, '2000-12-17', 8000.00, NULL, 20);
INSERT INTO `emp` VALUES (1002, '卢俊义', 3, 1006, '2001-02-20', 16000.00, 3000.00, 30);
INSERT INTO `emp` VALUES (1003, '林冲', 3, 1006, '2001-02-22', 12500.00, 5000.00, 30);
INSERT INTO `emp` VALUES (1004, '唐僧', 2, 1009, '2001-04-02', 29750.00, NULL, 20);
INSERT INTO `emp` VALUES (1005, '李逵', 4, 1006, '2001-09-28', 12500.00, 14000.00, 30);
INSERT INTO `emp` VALUES (1006, '宋江', 2, 1009, '2001-05-01', 28500.00, NULL, 30);
INSERT INTO `emp` VALUES (1007, '刘备', 2, 1009, '2001-09-01', 24500.00, NULL, 10);
INSERT INTO `emp` VALUES (1008, '猪八戒', 4, 1004, '2007-04-19', 30000.00, NULL, 20);
INSERT INTO `emp` VALUES (1009, '罗贯中', 1, NULL, '2001-11-17', 50000.00, NULL, 10);
INSERT INTO `emp` VALUES (1010, '吴用', 3, 1006, '2001-09-08', 15000.00, 0.00, 30);
INSERT INTO `emp` VALUES (1011, '沙僧', 4, 1004, '2007-05-23', 11000.00, NULL, 20);
INSERT INTO `emp` VALUES (1012, '李逵', 4, 1006, '2001-12-03', 9500.00, NULL, 30);
INSERT INTO `emp` VALUES (1013, '小白龙', 4, 1004, '2001-12-03', 30000.00, NULL, 20);
INSERT INTO `emp` VALUES (1014, '关羽', 4, 1007, '2002-01-23', 13000.00, NULL, 10);
COMMIT;

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `id` int NOT NULL,
  `jname` varchar(20) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of job
-- ----------------------------
BEGIN;
INSERT INTO `job` VALUES (1, '董事长', '管理整个公司，接单');
INSERT INTO `job` VALUES (2, '经理', '管理部门员工');
INSERT INTO `job` VALUES (3, '销售员', '向客人推销产品');
INSERT INTO `job` VALUES (4, '文员', '使用办公软件');
COMMIT;

-- ----------------------------
-- Table structure for salarygrade
-- ----------------------------
DROP TABLE IF EXISTS `salarygrade`;
CREATE TABLE `salarygrade` (
  `grade` int NOT NULL,
  `losalary` int DEFAULT NULL,
  `hisalary` int DEFAULT NULL,
  PRIMARY KEY (`grade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of salarygrade
-- ----------------------------
BEGIN;
INSERT INTO `salarygrade` VALUES (1, 7000, 12000);
INSERT INTO `salarygrade` VALUES (2, 12010, 14000);
INSERT INTO `salarygrade` VALUES (3, 14010, 20000);
INSERT INTO `salarygrade` VALUES (4, 20010, 30000);
INSERT INTO `salarygrade` VALUES (5, 30010, 99990);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
