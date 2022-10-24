package org.kosta.myproject.test;

import java.sql.SQLException;

import org.kosta.myproject.model.MemberDAO;
import org.kosta.myproject.model.MemberVO;

public class TestCaseUpdateMember {
	public static void main(String[] args) {
		MemberVO memberVO=new MemberVO("java","a","아이유","오리");
		int result;
		try {
			result = MemberDAO.getInstance().updateMember(memberVO);
			System.out.println("update member:"+result+" "
			+MemberDAO.getInstance().findMemberById(memberVO.getId()));			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
