package com.virtualpairprogrammers.services;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.domain.Customer;

public interface AccountsService {
	 void raiseInvoice(Book requiredBook);
	
	 Customer findCustomer(String id) throws CustomerNotFoundException;
}
