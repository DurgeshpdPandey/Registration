package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bo.RegistrationBO;
import com.daoI.IRegistrationDAO;
import com.util.DBConnection;
import com.util.QueryConstants;

public class RegistrationDAOImpl implements IRegistrationDAO {

	@Override
	public int insert(RegistrationBO registrationBO) {
		//local variable definition
		Connection con=null;
		PreparedStatement pst=null;
		int count=0;
		//getting db connection getConnection method of DBConnection class
		con=DBConnection.getConnection();
		try {
			//setting values on PreparedSStatement
			pst=con.prepareStatement(QueryConstants.REG_INSERT_QUERY);
			pst.setString(1,registrationBO.getFname());
			pst.setString(2,registrationBO.getLname());
			pst.setString(3,registrationBO.getGender() );
			pst.setDate(4,registrationBO.getDob());
			pst.setInt(5,registrationBO.getAge());
			pst.setDouble(6,registrationBO.getPer());
			
			//execute query
			count=pst.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

}
