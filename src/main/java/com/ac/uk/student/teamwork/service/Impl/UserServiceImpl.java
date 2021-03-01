package com.ac.uk.student.teamwork.service.Impl;


import com.ac.uk.student.teamwork.info.ResultInfo;
import com.ac.uk.student.teamwork.mapper.UserMapper;
import com.ac.uk.student.teamwork.pojo.User;
import com.ac.uk.student.teamwork.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserServiceImpl implements UsersService {
    @Autowired
    private UserMapper userMapper;
    private ResultInfo resultInfo = new ResultInfo<>();


    @Override
    public ResultInfo loginUser(User user) {
        try {
            User userExist = userMapper.loginUser(user);
            if (userExist == null) {
                resultInfo.setMsg("用户名或密码错误，请重新核对");
            } else {
                resultInfo.setMsg("登录成功。");
                user.setUserId(user.getUserId());
                resultInfo.setSuccess(true);
                user = userMapper.findByUserName(user.getUserName());
                resultInfo.setDetail(user);
            }
        } catch (Exception e) {
            resultInfo.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return resultInfo;
    }
}
