//table create
create table jdbcoperation(userid varchar(200), password varchar(200), name varchar(200), incorrectattempts number(2), lockstatus number(2), usertype varchar(200));
//insertion into table
insert into JDBCOPERATION (userid, password, name, incorrectattempts, lockstatus, usertype) values('AB1001','AB1001','Hari',0,0,'Admin');
insert into JDBCOPERATION (userid, password, name, incorrectattempts, lockstatus, usertype) values('TA1002','TA1002','Prasath',0,0,'Employee');
insert into JDBCOPERATION (userid, password, name, incorrectattempts, lockstatus, usertype) values('RS1003','RS1003','Ganesh',0,0,'Employee');
