package controllers;

import dao.CategoryDAO;
import dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Collection;

@Controller
public class RootController {

    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping("/")
    public ModelAndView getHomePage() {

        ModelAndView modelAndView = new ModelAndView();
        String indexViewName = "index";

        Collection<Category> categories = categoryDAO.findAll();

        modelAndView.setViewName( indexViewName );
        modelAndView.addObject( "categories", categories );

        return modelAndView;
    }
}
