package com.mycompany.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mycompany.webapp.dto.Products;
import com.mycompany.webapp.dto.ProductsImg;

@Mapper
public interface ProductsImgDao {
	public List<ProductsImg> selectAll();
	public Products selectByImgno(int imgNo);
	public int insert(Products product);
	public int update(Products product);
	public int deleteByImgno(int imgNo);
	public int count();
	public List<ProductsImg> selectByPnoImg(int pid);
}
