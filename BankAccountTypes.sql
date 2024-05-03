use userbankacc;
create table BankAccountTypes(
	BankAcctTypeId int,
    BankAcctTypeCode varchar(3),
    BankAcctTypeDesc varchar(50),
    primary key(BankAcctTypeId));
    insert into BankAccountTypes values(1,'SA','SAVINGS ACCOUNT');
insert into BankAccountTypes values(2,'CA','CURRENT ACCOUNT');
select * from BankAccountTypes;
