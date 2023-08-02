package com.handsmade.datn.Service.Impl;

import org.springframework.stereotype.Service;

import com.handsmade.datn.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    // @Override
    // public String registerUser(String fullname, String address, String email,
    //                             String phone, String username, String password) {
    //     UserModel user = new UserModel(fullname, address, email, phone, username, password);
    //     String status = registerUser(user);
    //     return status;
    // }

    // @Override
    // public String registerUser(UserModel user) {
    //     String status = "Email đã tồn tại!";
    //     boolean isRegtd = isRegistered(user.getEmail());
    //     if (isRegtd) {
	// 		status = "Email chưa được đăng kí!";
	// 		return status;
	// 	}
    //     Connection conn = DBUtil.provideConnection();
	// 	PreparedStatement ps = null;

	// 	try {
	// 		ps = conn.prepareStatement("insert into " + "user" + " values(?,?,?,?,?,?)");

	// 		ps.setString(1, user.getFullname());
	// 		ps.setString(2, user.getAddress());
	// 		ps.setString(3, user.getEmail());
	// 		ps.setString(4, user.getPhone());
	// 		ps.setString(5, user.getUsername());
	// 		ps.setString(6, user.getPassword());

	// 		int k = ps.executeUpdate();

	// 		if (k > 0) {
	// 			status = "Đăng kí thành công!";
	// 			//MailMessage.registrationSuccess(user.getEmail(), user.getName().split(" ")[0]);
	// 		}

	// 	} catch (SQLException e) {
	// 		status = "Error: " + e.getMessage();
	// 		e.printStackTrace();
	// 	}

	// 	DBUtil.closeConnection(ps);
	// 	DBUtil.closeConnection(ps);

	// 	return status;
    // }

    // @Override
    // public boolean isRegistered(String email) {
    //     boolean flag = false;

	// 	Connection con = DBUtil.provideConnection();

	// 	PreparedStatement ps = null;
	// 	ResultSet rs = null;

	// 	try {
	// 		ps = con.prepareStatement("select * from user where email=?");

	// 		ps.setString(1, email);

	// 		rs = ps.executeQuery();

	// 		if (rs.next())
	// 			flag = true;

	// 	} catch (SQLException e) {
	// 		e.printStackTrace();
	// 	}

	// 	DBUtil.closeConnection(con);
	// 	DBUtil.closeConnection(ps);
	// 	DBUtil.closeConnection(rs);

	// 	return flag;
    // }

    // @Override
    // public boolean isValidCredential(String email, String password) {
    //     //"Thông tin đăng nhập chưa đúng!"
    //     boolean status = false;

	// 	Connection con = DBUtil.provideConnection();

	// 	PreparedStatement ps = null;
	// 	ResultSet rs = null;

	// 	try {

	// 		ps = con.prepareStatement("select * from user where email=? and password=?");

	// 		ps.setString(1, email);
	// 		ps.setString(2, password);

	// 		rs = ps.executeQuery();

	// 		if (rs.next())
	// 			status = true;

	// 	} catch (SQLException e) {
	// 		status = false;
    //         System.out.println("Error: " + e.getMessage());
	// 		e.printStackTrace();
	// 	}

	// 	DBUtil.closeConnection(con);
	// 	DBUtil.closeConnection(ps);
	// 	DBUtil.closeConnection(rs);
	// 	return status;
    // }

    // @Override
    // public UserModel getUserDetails(String email, String password) {
    //     UserModel user = new UserModel();
    //     return user;
    // }

    // @Override
    // public String getFName(String email) {
    //     String fullname = new String();
    //     return fullname;
    // }

    // @Override
    // public String getUserAddr(String username) {
    //     String address = new String();
    //     return address;
    // }   

}
