package com.mycompany.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mycompany.webapp.dto.Pager;
import com.mycompany.webapp.dto.Users;

@Mapper
public interface UsersDao {
	public int insert(Users user); 
	public Users selectByUserid(String userId); 
	public List<Users> selectAll(); 
	public int update(String userId); 
	public void updateWithdrawal(@Param("userId") String userId, @Param("deleteReason") String deleteReason);
	public int update(Users user);
	public int updateUser(Users user);
	public String findById(@Param("userName") String userName, @Param("userPhone")String userPhone); 
	public int selectByUserCount(Users user);
	public int updatePassword(Users user);
	public int selectByOverlapId(Users user);
	public int count();
	public List<Users> selectByPage(Pager pager);
	public int delete(int uid);
	public int stateCount(@Param("deleteState")int userState);
	public List<Users> selectByStatePage(@Param("pager")Pager pager, @Param("deleteState")int userState);
	public List<Users> selectByUserPage(@Param("pager")Pager pager, @Param("userId")String idKeywordVal);
}
