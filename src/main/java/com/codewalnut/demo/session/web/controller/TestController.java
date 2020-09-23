package com.codewalnut.demo.session.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * 测试入口
 *
 * @author KelvinZ
 */
@RestController
public class TestController {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/setSession")
	public String setSession(HttpSession session) {
		log.info(session.getId());
		session.setAttribute("kelvin", "test ok");
		return session.getId();
	}

	@RequestMapping("/getSession")
	public Object getSession(HttpSession session) {
		log.info(session.getId());
		Enumeration<String> attrNames = session.getAttributeNames();
		while (attrNames.hasMoreElements()) {
			String name = attrNames.nextElement();
			log.info("{} = {}", name, session.getAttribute(name));
		}
		return session;
	}

}
