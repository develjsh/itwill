--sys�� system �������� �α����ؼ� ����� ����, ���̺����̽� �����ϱ�
--sqlplus / as sysdba  ==>�ý���dba����

--���̺� �����̽� ����
create tablespace javatest
datafile 'C:\oraclexe\mydata\javatest.dbf' size 48m
autoextend on next 10m;

/*
--���̺� �����̽� ����
drop tablespace javatest including contents and datafiles;
*/

--����� ���� ����
create user javauser
identified by javauser123
default tablespace javatest;

--����� ���Ѻο�
grant connect,resource to javauser;

--�� ���� ���� �ο��ϱ�
grant create view to javauser;