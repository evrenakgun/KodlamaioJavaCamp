package oopWithNLayeredKodlamaio.dataAccess;

import oopWithNLayeredKodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi.\n"
				+ "Kategori ID: " + category.getId() + "\n"
				+ "Kategori Adı: " + category.getCategoryName());
	}

}
