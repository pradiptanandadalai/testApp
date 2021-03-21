package com.arris.crudOperation.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.arris.crudOperation.dao.CrudOperationDao;
import com.arris.crudOperation.pojo.CrudOperationPojo;
import com.arris.crudOperation.utils.DBConnection;

@Component
public class CrudOperationDaoImpl implements CrudOperationDao {

	@Override
	public List<CrudOperationPojo> getUserDetails(int userId) {

		System.out.println("inside the dao::::::::::::::::");
		List<CrudOperationPojo> list = new ArrayList();

		Connection con = null;

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT name, company FROM orchestrator_test.test_arris where id="+userId;
		try {
			con = DBConnection.getInstance().getConnection();
			System.out.println("Sql :::" + sql);
			pstmt = con.prepareStatement(sql);
			 rs= pstmt.executeQuery();
			System.out.println("Inside While");
			int count = 0;
			int result = 0;
			while (rs.next()) {
				result = count++;
				CrudOperationPojo pojo = new CrudOperationPojo();
				pojo.setName(rs.getString("name"));
				pojo.setCompany(rs.getString("company"));
				list.add(pojo);
			}
			System.out.println("result::::::" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
