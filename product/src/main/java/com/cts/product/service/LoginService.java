package com.cts.product.service;

import com.cts.product.bean.Login;

public interface LoginService {

	public Login authenticate(String userName, String password);
}
