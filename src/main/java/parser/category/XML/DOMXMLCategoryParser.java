package parser.category.XML;

import dto.Category;
import dto.Payment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import parser.Parser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DOMXMLCategoryParser implements Parser<Category> {

    private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    public List<Category> parse(InputStream inputStream) {

        List<Category> categories = new ArrayList<Category>();

        try {

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse( inputStream );

            NodeList categoriesList = document.getElementsByTagName( "category" );
            int categoriesListLength = categoriesList.getLength();

            for ( int i = 0; i < categoriesListLength; i++ ) {

                Element categoryElem = ( Element ) categoriesList.item( i );

                String categoryName = categoryElem.getAttribute( "name" );
                String categoryTitle = categoryElem.getAttribute( "title" );
                Integer categoryRating = Integer.valueOf( categoryElem.getAttribute( "rating" ) );

                List<Payment> payments = new ArrayList<Payment>();
                NodeList paymentList = categoryElem.getElementsByTagName( "payment" );
                int paymentListLength = paymentList.getLength();

                for ( int j = 0; j < paymentListLength; j++ ) {

                    Element paymentElem = ( Element ) paymentList.item( j );

                    String paymentId = paymentElem.getAttribute( "id" );
                    String paymentTitle = paymentElem.getAttribute( "title" );
                    Integer paymentRating = Integer.valueOf( paymentElem.getAttribute( "rating" ) );

                    Payment payment = new Payment( paymentId, paymentTitle, paymentRating );
                    payments.add( payment );

                }

                Category category = new Category( categoryName, categoryTitle, categoryRating, payments );
                categories.add( category );

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return categories;

    }

}
