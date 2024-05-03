<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/WebApplication/dashboardservlet" method="post">
        <label for="BankAcctNo">Bank Account Number:</label><br>
        <input type="text" id="BankAcctNo" name="BankAcctNo" required maxlength="16"><br><br>
        
        <label for="BankName">Bank Name:</label><br>
        <input type="text" id="BankName" name="BankName" required maxlength="50"><br><br>
        
        <label for="AcctTypeId">Account Type ID:</label><br>
        <input type="number" id="AcctTypeId" name="AcctTypeId" required><br><br>
        
        <label for="BankIFSCCode">Bank IFSC Code:</label><br>
        <input type="text" id="BankIFSCCode" name="BankIFSCCode" required maxlength="10"><br><br>
        
        <label for="BankAcctPin">Bank Account PIN:</label><br>
        <input type="password" id="BankAcctPin" name="BankAcctPin" required maxlength="4"><br><br>
        
        <label for="UserId">User ID:</label><br>
        <input type="number" id="UserId" name="UserId" required><br><br>
        
        <label for="CurrBankAcctBalance">Current BankAcct Balance :</label><br>
        <input type="number" id="UserId" name="CurrBankAcctBalance" required><br><br>
        
        <button type="submit">Add Bank Account</button>
        </form>
</body>
</html>