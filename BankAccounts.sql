create database userbankacc;
use userbankacc;
create table BankAccounts(
 BankAcctNo VARCHAR(16) NOT NULL,
    BankName VARCHAR(50),
    AcctTypeId INT,
    BankIFSCCode VARCHAR(10),
    BankAcctPin INT,
    UserId INT,
    CurrBankAcctBalance DECIMAL(12,2),
   
    PRIMARY KEY (BankAcctNo)
);
select * from BankAccounts;
truncate table BankAccounts;
drop table BankAccounts;