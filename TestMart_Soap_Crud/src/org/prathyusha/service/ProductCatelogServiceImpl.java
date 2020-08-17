package org.prathyusha.service;

import java.util.List;

import javax.jws.WebService;

import org.prathyusha.dao.ProductCatelogDao;
import org.prathyusha.dao.ProductCatelogDaoImpl;
import org.prathyusha.model.Product;

@WebService(endpointInterface = "org.prathyusha.service.ProductCatelogService")
public class ProductCatelogServiceImpl implements ProductCatelogService {
    
	ProductCatelogDao productCatlogDao = new ProductCatelogDaoImpl();
	
	@Override
	public List<Product> getAllProducts() {
		return  productCatlogDao.getAllProducts();
		
	}

	@Override
	public Product getProduct(int pid) {
		return productCatlogDao.getProduct(pid);
		
	}

	@Override
	public boolean addProduct(Product product) {
		productCatlogDao.addProduct(product);
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		productCatlogDao.updateProduct(product);
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		productCatlogDao.deleteProduct(id);
		return false;
	}
     

}
