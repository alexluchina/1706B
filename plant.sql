drop database if exists plant;
create database plant character set utf8;
use plant;
drop table if exists t_plant;
create table t_plant(
id int not null primary key auto_increment comment '主键ID',
name varchar(30) not null comment '植物名称',
description varchar(100) not null comment '描述',
category int not null comment '类别ID',
create_time date not null comment '创建时间'
)engine innodb character set utf8 comment '植物表';

drop table if exists t_category;
create table t_category(
id int primary key not null comment '主键ID',
name varchar(20) not null comment '类别名称',
create_time date not null comment '创建时间'
)engine innodb character set utf8 comment '类别表';


insert into t_plant values ('1','牡丹','落叶灌木','1',now());
insert into t_plant values ('2','荷花','多年生水生草本花卉','2',now());
insert into t_plant values ('3','水仙','多年生草本植物','3',now());
insert into t_plant values ('4','龙葵','一年生草本植物','4',now());
insert into t_plant values ('5','莲花','多年生水生草本花卉','2',now());
insert into t_plant values ('6','绿萝','多年生草本植物','3',now());
insert into t_plant values ('7','葵花','一年生草本植物','4',now());
insert into t_plant values ('8','梅花','落叶灌木','1',now());

insert into t_category values ('1','芍药科',now());
insert into t_category values ('2','莲科',now());
insert into t_category values ('3','石蒜科',now());
insert into t_category values ('4','茄科',now());
