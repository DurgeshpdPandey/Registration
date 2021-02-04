package com.nacre.demo.serviceImpl;

import com.nacre.demo.bo.RegistrationBO;
import com.nacre.demo.daoImpl.RegistrationDAOImpl;
import com.nacre.demo.dto.RegistrationDTO;
import com.nacre.demo.serviceI.IRegistrationService;

public class RegistrationServiceImpl implements IRegistrationService {

	@Override
	public boolean register(RegistrationDTO registrationDTO) {
		//local variables
		RegistrationBO registrationBO;
		RegistrationDAOImpl registrationDAOImpl;
		int count=0;
		boolean flag = false;
		
		//valid only 18 and more years candidate only
		if(registrationDTO.getAge()>=18){
			registrationBO=new RegistrationBO();
			registrationBO.setFname(registrationDTO.getFname());
			registrationBO.setLname(registrationDTO.getLname());
			registrationBO.setGender(registrationDTO.getGender());
			registrationBO.setDob(registrationDTO.getDob());
			registrationBO.setAge(registrationDTO.getAge());
			registrationBO.setPer(registrationDTO.getPer());
			
			//creating registrationDAOImpl object 
			registrationDAOImpl=new RegistrationDAOImpl();
			//storing on count
			count=registrationDAOImpl.insert(registrationBO);
			if(count>0)
				flag=true;
		}else{
			System.out.println("<h1>enter valid age</h1>");
		}
		return flag;
	}

	

}
