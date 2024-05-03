package firstWebApp;

import java.util.List;

public class bankaccounts {
	String BankAcctNo;
	String BankName;
	String AcctTypeId;
	String BankIFSCCode;
	String BankAcctPin;
	String UserId;
	String CurrBankAcctBalance;
	public String getBankAcctNo() {
		return BankAcctNo;
	}
	public void setBankAcctNo(String bankAcctNo) {
		this.BankAcctNo= bankAcctNo;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getAcctTypeId() {
		return AcctTypeId;
	}
	public void setAcctTypeId(String acctTypeId) {
		AcctTypeId = acctTypeId;
	}
	public String getBankIFSCCode() {
		return BankIFSCCode;
	}
	public void setBankIFSCCode(String bankIFSCCode) {
		BankIFSCCode = bankIFSCCode;
	}
	public String getBankAcctPin() {
		return BankAcctPin;
	}
	public void setBankAcctPin(String bankAcctPin) {
		BankAcctPin = bankAcctPin;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getCurrBankAcctBalance() {
		return CurrBankAcctBalance;
	}
	public void setCurrBankAcctBalance(String currBankAcctBalance) {
		CurrBankAcctBalance = currBankAcctBalance;
	}
	public void add(List<bankaccounts> bankAccounts) {
		// TODO Auto-generated method stub
		
	}
	
	

}
