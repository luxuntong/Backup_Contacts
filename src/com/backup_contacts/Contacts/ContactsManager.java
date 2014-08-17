package com.backup_contacts.Contacts;

import java.util.ArrayList;

import android.R.bool;
import android.R.integer;
import android.R.string;


enum PhoneNumberType{
	PhoneNumber_mobile,
	PhoneNumber_home,
	PhoneNumber_fax
};
public class ContactsManager {
	
	public static ContactsManager getInstance() {
		return m_instance;
	}
	private ContactsManager(){
		
	}

	
//members	
	private static ContactsManager m_instance = new ContactsManager();
	private ArrayList<ContactItem> m_contacts;
}

class ContactItem {	
	/*
	public boolean addPhoneNumber(PhoneItem number, int index){
		if(number == null || number.number == null){
			return false;
		}
		m_friendPhoneNum.add(object)
		return true;
	}*/
	public static final int MaxPhoneNumber = 5;
	String m_firstName;
	String m_lastName;
	int m_groupID;
	int m_userNumSyncBits;
	ArrayList<PhoneItem> m_friendPhoneNum;
	// headMap
	bool m_syncFlag;

}
class PhoneItem{
	String number;
	PhoneNumberType numberType;//0 mobile
}
