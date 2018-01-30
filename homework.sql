-- 创建mysql数据库
CREATE SCHEMA `homework` DEFAULT CHARACTER SET utf8 ;
-- 创建用户点赞表
CREATE TABLE `homework`.`praise` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
  `username` VARCHAR(45) NOT NULL COMMENT '用户名',
  `praise_num` INT NOT NULL DEFAULT 0 COMMENT '点赞次数',
  `create_time` DATETIME NOT NULL COMMENT '创建时间',
  `update_time` DATETIME NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
DEFAULT CHARACTER SET = utf8
COMMENT = '点赞数据表';