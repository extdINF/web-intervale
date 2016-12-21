package controllers;

import dao.CategoryDAO;
import dto.Category;
import dto.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class RootController {

    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping("/")
    public ModelAndView index() {

        ModelAndView modelAndView = new ModelAndView();
        String indexViewName = "index";

        List<Category> categories = new ArrayList<Category>( categoryDAO.findAll() );
        List<Payment> payments = new ArrayList<Payment>();

        for ( Category category : categories ) {
            List<Payment> paymentList = category.getPayments();
            Collections.sort( paymentList );
            payments.addAll( paymentList );
        }

        Collections.sort( payments );
        Collections.sort( categories );

        modelAndView.setViewName( indexViewName );
        modelAndView.addObject( "categories", categories );
        modelAndView.addObject( "payments", payments.subList( 0, 14 ) );

        return modelAndView;
    }
}
