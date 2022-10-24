package org.kosta.myproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.myproject.model.MemberDAO;

public class FindMemberListByAddressController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 아래 인증체크 로직은  Interceptor에서 처리
		// 로그인 여부를 체크해서 비로그인 상태면 index로 이동
		/*
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("mvo") == null)
			return "redirect:index.jsp";
		*/
		String address = request.getParameter("address");
		request.setAttribute("list", MemberDAO.getInstance().findMemberListByAddress(address));
		return "findbyaddress-list.jsp";
	}

}
