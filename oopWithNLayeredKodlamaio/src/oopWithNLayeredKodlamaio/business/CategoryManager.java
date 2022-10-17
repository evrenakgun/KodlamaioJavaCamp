package oopWithNLayeredKodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredKodlamaio.core.logging.BaseLogger;
import oopWithNLayeredKodlamaio.dataAccess.CategoryDao;
import oopWithNLayeredKodlamaio.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private BaseLogger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	List<String> categoryNames = new ArrayList<String>();
	
	public void add(Category category) throws Exception {
		for (String categoryName : categoryNames) {
			if (categoryName == category.getCategoryName()) {
				throw new Exception("Bu kategori zaten mevcut.");
			}
		}
		
		categoryNames.add(category.getCategoryName());
		categoryDao.add(category);
		
		for (BaseLogger logger : loggers) {
			logger.add(category.getCategoryName());
		}
	}
}
