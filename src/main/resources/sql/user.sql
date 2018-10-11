drop table if exists user;
create table user(
	id INT NOT NULL AUTO_INCREMENT COMMENT '用户主键',
	name VARCHAR(30) NOT NULL COMMENT '用户名称',
	account VARCHAR(30) NOT NULL COMMENT '登陆账号',
	password VARCHAR(30) NOT NULL COMMENT '登陆密码',
	gender INT COMMENT '性别1-男，2-女',
	mobile VARCHAR(11) COMMENT '手机号码',
	idno VARCHAR(30) COMMENT '身份证',
	cardno VARCHAR(30) COMMENT '银行卡号',
	role_code VARCHAR(11) NOT NULL COMMENT '角色代码',
	create_time DATE not NULL COMMENT '创建时间',
	create_user VARCHAR(30) NOT NULL COMMENT '创建人',
	update_time DATE not NULL COMMENT '修改时间',
	update_user VARCHAR(30) NOT NULL COMMENT '修改人',
	PRIMARY KEY (id)
);
insert into user values('admin','admin','admin',1,'15555555555');