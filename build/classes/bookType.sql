CREATE TABLE `booktype` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '�鼮���ͱ��',
  `title` varchar(100) NOT NULL DEFAULT '' COMMENT '�鼮��������',
  `detail` varchar(150) NOT NULL DEFAULT '' COMMENT '�鼮��������',
  PRIMARY KEY (`id`) COMMENT '����'
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='�鼮����';
