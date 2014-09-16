CREATE TABLE `booktype` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '书籍类型编号',
  `title` varchar(100) NOT NULL DEFAULT '' COMMENT '书籍类型名称',
  `detail` varchar(150) NOT NULL DEFAULT '' COMMENT '书籍类型描述',
  PRIMARY KEY (`id`) COMMENT '主键'
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='书籍类型';
