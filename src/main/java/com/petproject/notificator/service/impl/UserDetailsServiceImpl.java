package com.petproject.notificator.service.impl;


import java.util.HashSet;
import java.util.Set;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.petproject.notificator.entity.User;
import com.petproject.notificator.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

   
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(),
                getAuthorities(user.getRole()));
    }

    private Set<GrantedAuthority> getAuthorities(String roles) {
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority(roles));
        return authorities;
    }
}
