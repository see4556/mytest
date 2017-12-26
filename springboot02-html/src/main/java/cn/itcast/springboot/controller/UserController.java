package cn.itcast.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * UserController
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年12月22日 上午11:06:14
 * @version 1.0
 */
@Controller
public class UserController {
	
	/** 返回静态的html页面 */
	@GetMapping("/show")
	public String show(){
		
		return "/user.html";
	}
}
