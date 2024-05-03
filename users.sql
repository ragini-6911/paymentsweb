use userbankacc;
create table users(
UserId INT NOT NULL AUTO_INCREMENT,
    FirstName VARCHAR(25),
    LastName VARCHAR(25),
    phnno VARCHAR(15),
    DateOfBirth DATE,
    Address VARCHAR(100),
    PassWord VARCHAR(25),
    CurrWalletBal DECIMAL(7,2),
    PRIMARY KEY (UserId),
    unique key(phnno)
);
select * from users;
