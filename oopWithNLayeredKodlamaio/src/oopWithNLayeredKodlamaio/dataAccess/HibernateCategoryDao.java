package oopWithNLayeredKodlamaio.dataAccess;

import oopWithNLayeredKodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi.\n"
				+ "Kategori ID: " + category.getId() + "\n"
				+ "Kategori Adı: " + category.getCategoryName());
	}
	
}
