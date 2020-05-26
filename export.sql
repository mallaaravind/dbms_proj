--------------------------------------------------------
--  File created - Wednesday-August-08-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table COMPANY
--------------------------------------------------------

  CREATE TABLE "LOCAL"."COMPANY" 
   (	"C_ID" NUMBER(2,0), 
	"C_NAME" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CUSTOMER
--------------------------------------------------------

  CREATE TABLE "LOCAL"."CUSTOMER" 
   (	"CUST_ID" NUMBER(4,0), 
	"CUST_NAME" VARCHAR2(30 BYTE), 
	"PHONE_NO" NUMBER(10,0), 
	"BALANCE" NUMBER(5,0), 
	"C_ID" NUMBER(2,0), 
	"PASSWORD" VARCHAR2(15 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PLAN
--------------------------------------------------------

  CREATE TABLE "LOCAL"."PLAN" 
   (	"PLAN_NO" NUMBER(2,0), 
	"PLAN_NAME" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TABLE2G
--------------------------------------------------------

  CREATE TABLE "LOCAL"."TABLE2G" 
   (	"C_ID" NUMBER(2,0), 
	"PLAN_ID" VARCHAR2(6 BYTE), 
	"DATA" NUMBER(4,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TABLE3G
--------------------------------------------------------

  CREATE TABLE "LOCAL"."TABLE3G" 
   (	"C_ID" NUMBER(2,0), 
	"PLAN_ID" VARCHAR2(6 BYTE), 
	"DATA" NUMBER(4,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TABLEDTH
--------------------------------------------------------

  CREATE TABLE "LOCAL"."TABLEDTH" 
   (	"C_ID" NUMBER(2,0), 
	"PLAN_ID" VARCHAR2(6 BYTE), 
	"DATA" NUMBER(4,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TABLETT
--------------------------------------------------------

  CREATE TABLE "LOCAL"."TABLETT" 
   (	"C_ID" NUMBER(2,0), 
	"PLAN_ID" VARCHAR2(6 BYTE), 
	"DATA" NUMBER(4,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into LOCAL.COMPANY
SET DEFINE OFF;
Insert into LOCAL.COMPANY (C_ID,C_NAME) values (1,'Aircel');
Insert into LOCAL.COMPANY (C_ID,C_NAME) values (2,'BSNL');
Insert into LOCAL.COMPANY (C_ID,C_NAME) values (3,'Airtel');
Insert into LOCAL.COMPANY (C_ID,C_NAME) values (4,'Uninor');
Insert into LOCAL.COMPANY (C_ID,C_NAME) values (5,'Reliance');
REM INSERTING into LOCAL.CUSTOMER
SET DEFINE OFF;
Insert into LOCAL.CUSTOMER (CUST_ID,CUST_NAME,PHONE_NO,BALANCE,C_ID,PASSWORD) values (4003,'ara',1234567890,0,1,'ara');
Insert into LOCAL.CUSTOMER (CUST_ID,CUST_NAME,PHONE_NO,BALANCE,C_ID,PASSWORD) values (1000,'venkatesh',9490174399,1200,1,'Venkatesh');
Insert into LOCAL.CUSTOMER (CUST_ID,CUST_NAME,PHONE_NO,BALANCE,C_ID,PASSWORD) values (2000,'pvkb',8335647898,1000,2,'Pvkb');
Insert into LOCAL.CUSTOMER (CUST_ID,CUST_NAME,PHONE_NO,BALANCE,C_ID,PASSWORD) values (3001,'santhosh',9042158496,500,3,'santhosh');
Insert into LOCAL.CUSTOMER (CUST_ID,CUST_NAME,PHONE_NO,BALANCE,C_ID,PASSWORD) values (3000,'meghana',9790738207,8000,3,'meghana');
Insert into LOCAL.CUSTOMER (CUST_ID,CUST_NAME,PHONE_NO,BALANCE,C_ID,PASSWORD) values (4001,'sahithi',9632587410,600,4,'sahithi');
Insert into LOCAL.CUSTOMER (CUST_ID,CUST_NAME,PHONE_NO,BALANCE,C_ID,PASSWORD) values (4002,'ara',123,0,3,'ara');
REM INSERTING into LOCAL.PLAN
SET DEFINE OFF;
Insert into LOCAL.PLAN (PLAN_NO,PLAN_NAME) values (1,'3G');
Insert into LOCAL.PLAN (PLAN_NO,PLAN_NAME) values (2,'2G');
Insert into LOCAL.PLAN (PLAN_NO,PLAN_NAME) values (3,'DTH');
Insert into LOCAL.PLAN (PLAN_NO,PLAN_NAME) values (4,'TalkTime');
REM INSERTING into LOCAL.TABLE2G
SET DEFINE OFF;
Insert into LOCAL.TABLE2G (C_ID,PLAN_ID,DATA) values (3,'AT115',400);
Insert into LOCAL.TABLE2G (C_ID,PLAN_ID,DATA) values (3,'AT200',600);
Insert into LOCAL.TABLE2G (C_ID,PLAN_ID,DATA) values (1,'AC100',250);
Insert into LOCAL.TABLE2G (C_ID,PLAN_ID,DATA) values (1,'AC250',500);
Insert into LOCAL.TABLE2G (C_ID,PLAN_ID,DATA) values (5,'RI500',750);
Insert into LOCAL.TABLE2G (C_ID,PLAN_ID,DATA) values (4,'UN300',600);
Insert into LOCAL.TABLE2G (C_ID,PLAN_ID,DATA) values (2,'BS1000',1500);
REM INSERTING into LOCAL.TABLE3G
SET DEFINE OFF;
Insert into LOCAL.TABLE3G (C_ID,PLAN_ID,DATA) values (3,'AT100',250);
Insert into LOCAL.TABLE3G (C_ID,PLAN_ID,DATA) values (3,'AT200',750);
Insert into LOCAL.TABLE3G (C_ID,PLAN_ID,DATA) values (1,'AC100',350);
Insert into LOCAL.TABLE3G (C_ID,PLAN_ID,DATA) values (1,'AC250',899);
Insert into LOCAL.TABLE3G (C_ID,PLAN_ID,DATA) values (5,'RI500',500);
Insert into LOCAL.TABLE3G (C_ID,PLAN_ID,DATA) values (4,'UN300',301);
Insert into LOCAL.TABLE3G (C_ID,PLAN_ID,DATA) values (2,'BS1000',1500);
REM INSERTING into LOCAL.TABLEDTH
SET DEFINE OFF;
Insert into LOCAL.TABLEDTH (C_ID,PLAN_ID,DATA) values (3,'AT1000',3000);
Insert into LOCAL.TABLEDTH (C_ID,PLAN_ID,DATA) values (3,'AT200',750);
Insert into LOCAL.TABLEDTH (C_ID,PLAN_ID,DATA) values (1,'AC100',350);
Insert into LOCAL.TABLEDTH (C_ID,PLAN_ID,DATA) values (1,'AC250',899);
Insert into LOCAL.TABLEDTH (C_ID,PLAN_ID,DATA) values (5,'RI500',500);
Insert into LOCAL.TABLEDTH (C_ID,PLAN_ID,DATA) values (4,'UN300',301);
Insert into LOCAL.TABLEDTH (C_ID,PLAN_ID,DATA) values (2,'BS1000',1500);
REM INSERTING into LOCAL.TABLETT
SET DEFINE OFF;
Insert into LOCAL.TABLETT (C_ID,PLAN_ID,DATA) values (3,'AT100',100);
Insert into LOCAL.TABLETT (C_ID,PLAN_ID,DATA) values (3,'AT200',200);
Insert into LOCAL.TABLETT (C_ID,PLAN_ID,DATA) values (1,'AC100',90);
Insert into LOCAL.TABLETT (C_ID,PLAN_ID,DATA) values (1,'AC250',230);
Insert into LOCAL.TABLETT (C_ID,PLAN_ID,DATA) values (5,'RI500',490);
Insert into LOCAL.TABLETT (C_ID,PLAN_ID,DATA) values (4,'UN300',320);
Insert into LOCAL.TABLETT (C_ID,PLAN_ID,DATA) values (2,'BS1000',1200);
