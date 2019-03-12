package com.cts.product.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
@Transactional(propagation=Propagation.SUPPORTS)
public class ProductServiceImpl implements ProductService {

}
