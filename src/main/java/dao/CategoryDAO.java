package dao;

import dto.Category;
import java.util.Collection;

public interface CategoryDAO {

    Collection<Category> findAll();

}
