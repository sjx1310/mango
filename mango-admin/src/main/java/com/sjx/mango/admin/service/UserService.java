package sjx.demo.service;

import sjx.demo.bean.User;

import java.util.List;

/**
 * @author sjx
 */
public interface UserService{
    /** select all users
     * @return a list of users
     */
    List<User> findAll();
}
