/*
    Target Server Type  : MySQL
    Date                : 2020-05-17
 */

-- ----------------------------
-- Create database travel_advisor
-- ----------------------------
CREATE DATABASE IF NOT EXISTS travel_advisor
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE travel_advisor;
-- ----------------------------
-- Table structure for sys_partner
-- ----------------------------
DROP TABLE IF EXISTS `sys_partner`;
CREATE TABLE `sys_partner`  (
  `id` int NOT NULL auto_increment,
  `name` varchar(100) NOT NULL COMMENT '业务名称',
  `code` varchar(255) NOT NULL COMMENT '业务编码 appId',
  `rsa_public_key` varchar(4000) NOT NULL COMMENT 'RSA Public Key',
  `rsa_private_key` varchar(4000) NOT NULL COMMENT 'RSA Private Key',
  `create_by` varchar(64) NOT NULL COMMENT '创建者',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `last_modified_by` varchar(64) NOT NULL COMMENT '修改者',
  `last_modified_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `is_deleted` char(1) NOT NULL COMMENT '数据状态: 0：正常 1：删除',
  `remarks` varchar(255) NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `sys_partner_uindex`(`id`) USING BTREE,
  INDEX `sys_partner_name_index`(`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '系统权限配置表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_partner
-- ----------------------------
INSERT INTO `sys_partner` (name, code, rsa_public_key, rsa_private_key, is_deleted, create_by, last_modified_by)
VALUES ('system', 'sys', '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', '0', 'admin', 'admin');
INSERT INTO `sys_partner` (name, code, rsa_public_key, rsa_private_key, is_deleted, create_by, last_modified_by)
VALUES ('demo partner', 'demo', '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', '0', 'admin', 'admin');
