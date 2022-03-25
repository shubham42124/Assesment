package com.mobile.service;

import java.util.List;

import com.mobile.entity.Mobile;

public interface MobileService {
	Mobile addmobile(Mobile mobile);

	Mobile updatemobile(Mobile mobile);

	String deletemobile(int mobileId);

	Mobile getmobile(int mobileId);

	List<Mobile> getAllmobiles();
	
}
