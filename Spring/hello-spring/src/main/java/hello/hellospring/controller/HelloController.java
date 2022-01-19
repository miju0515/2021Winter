package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "hello!");
		//model.addAttribute(attributeName:"data", attributeValue:"hello!!");
		return "hello";
		//��Ʈ�ѷ����� ���� ������ ���ڸ� ��ȯ�ϸ� �� ������('viewResolver')�� ȭ���� ã�Ƽ� ó���Ѵ�.
		//��������Ʈ ���ø����� �⺻ viewName ����
		//'resource:templates/'+(ViewName)+'.html'
	}
}
