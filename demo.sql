use jb;
drop table if exists jb_userinfo;
create table jb_userinfo(
    username varchar(200),
    password varchar(200),
    islogin int(2),
    head_picture varchar(3000),
    uid int(11) primary key AUTO_INCREMENT,
    email varchar(200)
);
insert into  jb_userinfo values(
    "556","cyx123321","0",null,1,"3195752112@qq.com"
);