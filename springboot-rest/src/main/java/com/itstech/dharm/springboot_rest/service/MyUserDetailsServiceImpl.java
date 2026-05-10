package com.itstech.dharm.springboot_rest.service;

import com.itstech.dharm.springboot_rest.dao.UserRepo;
import com.itstech.dharm.springboot_rest.model.User;
import com.itstech.dharm.springboot_rest.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServiceImpl implements UserDetailsService, MyUserDetailsService {

    private UserRepo repo;

    @Autowired
    public MyUserDetailsServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User Not Found with: " + username);
        }
        return new UserPrincipal(user);
    }
}
