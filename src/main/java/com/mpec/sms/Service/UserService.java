package com.mpec.sms.Service;

import com.mpec.sms.Model.User;
import com.mpec.sms.Model.UserDto;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}