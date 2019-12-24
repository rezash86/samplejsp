package johnabbott.session7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import johnabbott.session7.model.Customer;
import johnabbott.session7.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@RequestMapping("/customer")
	public ModelAndView getCustomers() {
		ModelAndView mav = new ModelAndView("list-customer");
		List<Customer> customers = service.getCustomers();
		mav.addObject("customers", customers);
		return mav;
	}
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("list-customer");
		List<Customer> customers = service.getCustomers();
		mav.addObject("customers", customers);
		return mav;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editCustomerForm(@RequestParam int id) {
		System.out.println("I am editing id= " + id);
		ModelAndView mav = new ModelAndView("edit-customer");
		Customer customer = service.getCustomer(id);
		mav.addObject("customer", customer);
		return mav;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		System.out.println("I am saving id= " + customer.getId());
		return "redirect:/customer";
	}
	
}
