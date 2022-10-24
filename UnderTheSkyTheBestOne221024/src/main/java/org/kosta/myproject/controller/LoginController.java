package org.kosta.myproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.myproject.model.MemberDAO;
import org.kosta.myproject.model.MemberVO;

public class LoginController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		MemberVO mvo=MemberDAO.getInstance().login(id, password);
		String viewPath=null;
		if(mvo==null) {
			viewPath="redirect:login-fail.jsp";
		}else {
			viewPath="redirect:index.jsp";
			HttpSession session=request.getSession();
			session.setAttribute("mvo", mvo);
		}
		return viewPath;
	}
}




