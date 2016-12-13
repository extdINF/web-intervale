package dao.xml;

import dao.CategoryDAO;
import dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import parser.Parser;
import java.io.IOException;
import java.util.Collection;

public class XMLCategoryDAO implements CategoryDAO {

    @Value("classpath:payments.xml")
    private Resource paymentsXml;

    @Autowired
    private Parser<Category> categoryParser;

    public Collection<Category> findAll() {

        try {
            return categoryParser.parse( paymentsXml.getInputStream() );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
