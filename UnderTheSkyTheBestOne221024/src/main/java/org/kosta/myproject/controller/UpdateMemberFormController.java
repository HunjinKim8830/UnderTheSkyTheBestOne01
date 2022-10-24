package org.kosta.myproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateMemberFormController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 인증체크 로직은 Interceptor에서 처리 
		/*
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null)
			return "redirect:index.jsp";
		*/
		return "redirect:update-form.jsp";
	}
}
