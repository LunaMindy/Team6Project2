package com.mycompany.webapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.dao.UsersDao;
import com.mycompany.webapp.dto.Pager;
import com.mycompany.webapp.dto.Products;
import com.mycompany.webapp.dto.Users;

@Service
public class UsersService {
	private static final Logger logger =
			LoggerFactory.getLogger(UsersService.class);
	
	@Autowired
	private UsersDao usersDao;

	public int join(Users user) {
		int result = usersDao.insert(user);
		return result;
	}

	public Users getUserDetail(String userId) {
		Users user = usersDao.selectByUserid(userId);
		return user;
	}
	
	public void updateWithdrawal(String userId, String deleteReason) {
		usersDao.updateWithdrawal(userId ,deleteReason);
	}

	public int changeInfo(Users user) {
		int result = usersDao.update(user);
		return result;
	}

	public String findById(String userName, String userPhone) {
		String id = usersDao.findById(userName, userPhone);
		return id;
	}
	
	public int checkUser(Users user) {
		int result = usersDao.selectByUserCount(user);
		return result;
	}

	public int changePassword(Users user) {
		int result = usersDao.updatePassword(user);
		return result;
	}

	public int overlapUserId(Users user) {
		int result = usersDao.selectByOverlapId(user);
		return result;
	}

	public int getTotalCount() {
		int result = usersDao.count();
		return result;
	}

	public int getTotalStateCount(int userState) {
		int result = usersDao.stateCount(userState);
		return result;
	}

	public List<Users> getUsersList(Pager pager) {
		List<Users> list = usersDao.selectByPage(pager);
		return list;
	}
	
	public List<Users> getUser(Pager pager, String idKeywordVal) {
		List<Users> list = usersDao.selectByUserPage(pager, idKeywordVal);
		return list;
	}
	
	public List<Users> getUsersStateList(Pager pager, int userState) {
		List<Users> list = usersDao.selectByStatePage(pager, userState);
		return list;
	}

	public int insert(Users user) {
		int result = usersDao.insert(user);
		return result;
		
	}

	public int updateUser(Users user) {
		int result = usersDao.updateUser(user);
		return result;
		
	}

	public int delete(int uid) {
		int result = usersDao.delete(uid);
		return result;
	}



	

}
