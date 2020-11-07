package sjx.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjx.demo.bean.User;
import sjx.demo.dao.UserMapper;

import java.util.List;

/**
 * @author sjx
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll() ;
    }
}
