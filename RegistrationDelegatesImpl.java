package com.nacre.demo.DelegatesImpl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.nacre.demo.delegatesI.IRegistrationDelegates;
import com.nacre.demo.dto.RegistrationDTO;
import com.nacre.demo.serviceImpl.RegistrationServiceImpl;
import com.nacre.demo.vo.RegistrationVO;

public class RegistrationDelegatesImpl implements IRegistrationDelegates{

	@Override
	public boolean parse(RegistrationVO registrationVO) {
		String fname=null;
		String lname=null;
		String gender=null;		
		//parsing logic
		int age=0;
		double perc=0.0;
		DateFormat dateFormat;
		Date utilDate;
		java.sql.Date sqlDate = null;
		RegistrationDTO registrationDTO;
		RegistrationServiceImpl registrationServiceImpl;
		
		//getting values on variable
		fname=registrationVO.getFname();
		lname=registrationVO.getLname();
		age=Integer.parseInt(registrationVO.getAge());
		perc=Double.parseDouble(registrationVO.getPer());
		gender=registrationVO.getGender();
		//converting java date into sql date
		dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		try {
			utilDate=dateFormat.parse(registrationVO.getDob());
			sqlDate=new java.sql.Date(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//creating RegistrationDTO object
		registrationDTO=new RegistrationDTO();
		//getting values on registrationDTO variables
		registrationDTO.setFname(registrationVO.getFname());
		registrationDTO.setLname(registrationVO.getLname());
		registrationDTO.setGender(gender);
		registrationDTO.setAge(age);
		registrationDTO.setPer(perc);
		registrationDTO.setDob(sqlDate);
		registrationServiceImpl=new RegistrationServiceImpl();
		
		//returning register method of registrationServiceImpl
		return registrationServiceImpl.register(registrationDTO);
	}

}
