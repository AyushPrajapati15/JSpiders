package com.jsp.Service;

import com.jsp.Model.UserAccountDetails;

public interface BankService {
	UserAccountDetails  bankAccountDetails(int userId);
	void forDebit(int userid);

}
