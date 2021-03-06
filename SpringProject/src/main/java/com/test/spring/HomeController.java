package com.test.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/h", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//2logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		System.out.println("A");
		
		model.addAttribute("serverTime", formattedDate );
		
		System.out.println("�뀒�뒪�듃 �엯�땲�떎.");
		
		return "home";
	}
	
}
