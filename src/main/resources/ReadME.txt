create table stock(stockid number,name varchar2(100),price number,quantity number,primary key(stockid));
create sequence stockapp_sequence;
create table stocktrader(stockid number,name varchar2(100),FOREIGN  key(stockid) REFERENCES stock(stockid));
alter table stocktrader add  traderid number;
alter table stocktrader add stockname varchar2(100);
alter table stocktrader add quantity number;


http://localhost:8696/v1/api/stocks - All Stocks - 

[{"id":4,"name":"Aditya-Birla","quantity":10,"price":110.25},{"id":5,"name":"Dmart","quantity":100,"price":120.45},{"id":1,"name":"JP","quantity":10,"price":5.0},{"id":2,"name":"ABD","quantity":256,"price":99.0},{"id":3,"name":"DEF","quantity":65,"price":25.0}]



http://localhost:8696/v1/api/buystock - POST - 

{
  "name": "karthik",
  "quantity": 10,
  "stockid": 4,
  "stockname": "Aditya-Birla",
  "traderid": 1234
}

http://localhost:8696/v1/api/sellstock - PUT - 

{
  "name": "karthik",
  "quantity": 10,
  "stockid": 4,
  "stockname": "Aditya-Birla",
  "traderid": 1234
}