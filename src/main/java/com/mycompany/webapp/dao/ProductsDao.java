package com.mycompany.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mycompany.webapp.dto.Pager;
import com.mycompany.webapp.dto.Products;

@Mapper
public interface ProductsDao{
	public List<Products> selectAll();
	public List<Products> selectBestProduct();
	public List<Products> selectNewProduct();
	public List<Products> selectByPage(@Param("pager") Pager pager, @Param("cno") int cno);
	public List<Products> selectByBestPage(@Param("pager") Pager pager, @Param("cno") int cno);
	public int insert(Products product);
	public List<Products> selectByPno(int productNo);
	public int update(Products product);
	public int updatePhitcount(int productNo);
	public int updatePsellcount(@Param("productNo") int productNo, @Param("amount") int amount);
	public int updateState(int productNo);
	public int deleteByPno(int productNo);
	public int count(int cno);
	public int totalCount();
	
	public Products selectByPnoDetail(int productNo);
	public List<Products> selectByPageAll(Pager pager);
	
	public int countKeyword(String keyword);
	public int countCategoryKeyword(@Param("categoryNo")int categoryNo, @Param("keyword")String keyword);
	
	public List<Products> selectBySearchPage(@Param("pager")Pager pager,@Param("keyword")String keyword);
	public List<Products> selectByCategorySearchPage(@Param("pager")Pager pager,@Param("categoryNo")int categoryNo, @Param("keyword")String keyword);
}
