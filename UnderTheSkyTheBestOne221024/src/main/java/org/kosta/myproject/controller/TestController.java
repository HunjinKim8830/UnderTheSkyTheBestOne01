package org.kosta.myproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "redirect:test-result.jsp"; // redirect로 응답할때 
	//	return "test-result.jsp"; // forword로 응답할때
	}
}
