/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50722
Source Host           : 127.0.0.1:3306
Source Database       : excise

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2020-09-25 20:18:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_downloadlist
-- ----------------------------
DROP TABLE IF EXISTS `t_downloadlist`;
CREATE TABLE `t_downloadlist` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `path` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `size` mediumtext CHARACTER SET utf8,
  `star` int(255) DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_downloadlist
-- ----------------------------
INSERT INTO `t_downloadlist` VALUES ('1', '宠物医院工作报告PPT模板1.0', 'download/宠物医院工作报告模板1.0.pptx', '宠物医院工作报告PPT模板中设计了多达二十多张的模板素材，非常的清晰以多种的从无的形象在其中，相关的从业人员直接在这里进行添加相关工作报告的内容就可以完成报告了。操作非常方便简单。', '1677721.6', '4', 'img/dlppt.png');
INSERT INTO `t_downloadlist` VALUES ('2', '创意日历情人节PPT模板1.0', 'download/创意日历情人节模板1.0.pptx', '创意日历情人节ppt模板软件设计非常的现代化，也是非常的条理性。你可以使用它直接编辑或者添加你的文字，大大缩短了制作的时间和精力，模板中包含了情人节的起源，历史、礼物。', '971100.16', '4', 'img/dlppt.png');
INSERT INTO `t_downloadlist` VALUES ('3', '皮皮迷你软件工具箱2.8', 'download/皮皮迷你软件.png', '皮皮迷你软件工具箱各种文件你需要的工具都在这里，不论你是想文件应用程序方面的处理，批量的处理，还是注册表文件方面的处理，在这里你都可以打开相应的文件夹进行使用。操作便捷。', '11114905.6', '4', 'img/dlppm.png');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userName` varchar(255) CHARACTER SET utf8 NOT NULL,
  `passWord` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `chiName` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `role` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('admin', '123', '管理员', '超级管理员');
INSERT INTO `t_user` VALUES ('yupan', '123456', '小余', '管理员');
