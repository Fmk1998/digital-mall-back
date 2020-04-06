/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : customer_db

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2020-04-06 16:55:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` int(16) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '手机');
INSERT INTO `category` VALUES ('2', '电脑');
INSERT INTO `category` VALUES ('3', '耳机');
INSERT INTO `category` VALUES ('4', '其他');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `oid` int(225) NOT NULL AUTO_INCREMENT,
  `uid` int(225) DEFAULT NULL,
  `number` int(10) DEFAULT NULL,
  `pid` int(225) DEFAULT NULL,
  `ordered` int(2) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('10', '1', '1', '202000003', '0');
INSERT INTO `orders` VALUES ('16', '1', '1', '202000007', '0');
INSERT INTO `orders` VALUES ('6', '1', '8', '202000003', '0');
INSERT INTO `orders` VALUES ('12', '1', '1', '202000002', '0');
INSERT INTO `orders` VALUES ('13', '1', '1', '202000002', '0');
INSERT INTO `orders` VALUES ('14', '1', '1', '202000002', '0');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `pid` int(255) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) DEFAULT NULL,
  `price` double(10,0) DEFAULT NULL,
  `pimg` varchar(255) DEFAULT NULL,
  `pdate` date DEFAULT NULL,
  `cid` int(255) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=MyISAM AUTO_INCREMENT=202000012 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('202000001', '小米平衡车', '1999', 'pingheng.jpg', '2020-02-01', '4');
INSERT INTO `product` VALUES ('202000002', '华为蓝牙耳机', '80', '2.jpg', '2020-03-27', '3');
INSERT INTO `product` VALUES ('202000003', '小米笔记本', '3549', 'note.jpg', '2020-03-27', '2');
INSERT INTO `product` VALUES ('202000007', '绚丽耳机', '499', '7.jpg', '2020-04-04', '3');
INSERT INTO `product` VALUES ('10009', '小米充电插板', '2499', '6.jpg', '2020-04-04', '4');
INSERT INTO `product` VALUES ('10008', 'Letv充电宝', '99', '5.jpg', '2020-04-03', '4');
INSERT INTO `product` VALUES ('202000008', 'leme耳机2', '3499', '4.jpg', '2020-04-02', '3');
INSERT INTO `product` VALUES ('202000009', 'oppo耳机', '2499', '3.jpg', '2020-01-01', '3');
INSERT INTO `product` VALUES ('10005', '小爱同学', '199', '1.jpg', '2020-02-08', '4');
INSERT INTO `product` VALUES ('202000010', '小米笔记本', '3999', 'note.jpg', '2020-04-02', '2');
INSERT INTO `product` VALUES ('202000011', '小米6', '2999', 'mi6.jpg', '2020-01-01', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(10) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin');
INSERT INTO `user` VALUES ('2', 'fmk', 'fmk');
INSERT INTO `user` VALUES ('3', '123', '123');
INSERT INTO `user` VALUES ('4', 'cy', '123');
