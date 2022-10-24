package org.kosta.myproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.myproject.model.MemberDAO;
import org.kosta.myproject.model.MemberVO;

public class UpdateMemberController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 아래 인증체크 로직은  Interceptor에서 처리
		/*
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null)
			return "redirect:index.jsp";
		*/
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		MemberVO mvo=new MemberVO(id,password,name,address);
		MemberDAO.getInstance().updateMember(mvo);	
		HttpSession session=request.getSession(false);
		session.setAttribute("mvo", mvo);
		return "redirect:update-result.jsp";
	}
}







