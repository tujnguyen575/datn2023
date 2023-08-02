package com.handsmade.datn.Service;

public interface UserService {

	/**
	 * @param fullname
	 * @param address
	 * @param email
	 * @param phone
	 * @param username
	 * @param password
	 * @return trạng thái insert vào DB
	 */
	// public String registerUser( String fullname, String address, String email,
    //                             String phone, String username, String password);

    /**
     * @param user
     * @return trạng thái insert vào DB
     */
    // public String registerUser(UserModel user);

	/**
     * Kiểm tra email đã được đăng kí chưa
	 * @param email     * 
	 * @return true nếu đã tồn tại
	 */
	// public boolean isRegistered(String email);

	/**
     * Kiểm tra thông tin đăng nhập đã đúng chưa
	 * @param email
	 * @param password
	 * @return kết quả kiểm tra thông tin
	 */
	// public boolean isValidCredential(String email, String password);

	/**
    //  * Lấy ra đối tượng người dùng
	//  * @param email
	//  * @param password
	//  * @return UserModel
	//  */
	// public UserModel getUserDetails(String email, String password);

	// /**
    //  * Lấy họ tên theo email
	//  * @param email
	//  * @return fullname
	//  */
	// public String getFName(String email);

	// /**
    //  * Lấy địa chỉ theo username
	//  * @param username
	//  * @return address
	//  */
	// public String getUserAddr(String username);
}
