package com.jsp.DAO;

import com.jsp.Model.Statement;
import com.jsp.Model.UserAccountDetails;

public interface BankDAO {
	int insertBankAccountDetails(UserAccountDetails userAccountDetails);

	boolean selectUserDetailsByUsingUserId(int userId);

	UserAccountDetails selectUserBankDetailsByUsingAccountNumber(Long accountnumber, int userid);

	int updateAmountByAccountNumber(long accountnumber, double amount);
	int insertStatementDetails(Statement statement);

}
