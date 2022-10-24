package org.kosta.myproject.test;

import java.sql.SQLException;

import org.kosta.myproject.model.MemberDAO;
import org.kosta.myproject.model.MemberVO;

public class TestCaseRegisterMember {
	public static void main(String[] args) {
		try {
			MemberDAO.getInstance().registerMember(new MemberVO("web2","a","이승우","수원"));
			System.out.println("register ok");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
