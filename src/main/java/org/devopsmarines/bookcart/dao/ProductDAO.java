package org.devopsmarines.bookcart.dao;

import org.devopsmarines.bookcart.entity.Product;
import org.devopsmarines.bookcart.model.PaginationResult;
import org.devopsmarines.bookcart.model.ProductInfo;

public interface ProductDAO {



public Product findProduct(String code);

public ProductInfo findProductInfo(String code) ;


public PaginationResult<ProductInfo> queryProducts(int page,
int maxResult, int maxNavigationPage );

public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
int maxNavigationPage, String likeName);

public void save(ProductInfo productInfo);

}