package org.kosta.myproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.myproject.model.MemberDAO;
import org.kosta.myproject.model.MemberVO;

public class FindMemberByIdController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 아래 인증체크 로직은  Interceptor에서 처리 
		//로그인 여부를 체크해서 비로그인 상태면 index로 이동 
		/*
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null)
			return "redirect:index.jsp";
		*/
		
		String viewPath=null;
		String id=request.getParameter("id");
		MemberVO vo=MemberDAO.getInstance().findMemberById(id);
		if(vo==null) {
			viewPath="findbyid-fail.jsp";
		}else {
			request.setAttribute("memberVO", vo);
			viewPath="findbyid-ok.jsp";
		}
		return viewPath;
	}

}
