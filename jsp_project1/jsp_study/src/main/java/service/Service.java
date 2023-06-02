package service;

import java.util.List;

import domain.ProductVO;

public interface Service {

	int register(ProductVO pvo);

	List<ProductVO> list();

	ProductVO detail(int pno);

	void edit(ProductVO p2);

	void delete(int pno3);


}
