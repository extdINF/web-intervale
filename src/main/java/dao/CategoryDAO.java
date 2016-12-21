package dao;

import dto.Category;
import java.util.Collection;
import java.util.List;

public interface CategoryDAO {

    Collection<Category> findAll();

}
