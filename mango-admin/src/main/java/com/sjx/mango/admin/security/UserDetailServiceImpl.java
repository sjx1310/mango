package com.sjx.mango.admin.security;

import com.sjx.mango.admin.model.SysUser;
import com.sjx.mango.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author sjx
 */
public class UserDetailServiceImpl implements UserDetailsService{
    @Autowired
    private SysUserService userService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = userService.findByName(s);
        if (user == null) {
            throw new UsernameNotFoundException("该用户不存在！");
        }
        Set<String> permissions = userService.findPermissions(user.getName());
        List<GrantedAuthority> grantedAuthorities = permissions.stream()
                .map(GrantedAuthorityImpl::new).collect(Collectors.toList());
        return new JwtUserDetails(user.getName(),user.getPassword(),user.getSalt(),grantedAuthorities);
    }
}
