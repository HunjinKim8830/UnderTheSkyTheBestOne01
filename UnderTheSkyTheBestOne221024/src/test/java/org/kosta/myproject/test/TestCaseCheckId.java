package org.kosta.myproject.test;

import org.kosta.myproject.model.MemberDAO;

public class TestCaseCheckId {
	public static void main(String[] args) {
		MemberDAO dao=MemberDAO.getInstance();
		String id="java"; //존재하면 true 
		id="mybatis";//존재하지 않으면 false
		try {
		boolean result=dao.checkId(id);
		System.out.println("result:"+result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}



