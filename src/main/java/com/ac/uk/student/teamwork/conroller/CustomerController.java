package com.ac.uk.student.teamwork.conroller;

import com.ac.uk.student.teamwork.info.ResultInfo;
import com.ac.uk.student.teamwork.pojo.Customer;
import com.ac.uk.student.teamwork.pojo.User;
import com.ac.uk.student.teamwork.service.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@ResponseBody
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @PostMapping(value = "/login")
    public void login(Customer customer, HttpServletRequest request, HttpServletResponse response) throws IOException, LoginException {
        Customer customer1 = customerServiceImpl.loginCustomer(customer);
        if(customer1 != null){

            request.getSession().setAttribute("customer",customer1);
            response.sendRedirect("/HTML/OrderPage.html");
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("message","error");
            response.sendRedirect("/HTML/sign-in.html");
        }
    }

    @PostMapping(value = "/register")
    public void register(Customer customer, HttpServletRequest request, HttpServletResponse response) throws IOException, LoginException {
        if(customer != null){
            customerServiceImpl.registerCustomer(customer);
            response.sendRedirect("/HTML/sign-in.html");
        }else{
            response.sendRedirect("/HTML/sign-up.html");
        }
    }

  

}
