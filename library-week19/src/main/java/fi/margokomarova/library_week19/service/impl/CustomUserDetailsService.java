package fi.margokomarova.library_week19.service.impl;

import fi.margokomarova.library_week19.model.AppUser;
import fi.margokomarova.library_week19.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final AppUserRepository userRepository;
    @Autowired
    public CustomUserDetailsService (AppUserRepository userRepository){
        this.userRepository=userRepository;
    }

    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
        AppUser appUser=userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User not found with username: " + username));

        List<SimpleGrantedAuthority> authorities = Arrays.stream(appUser.getRoles().split(","))
                .map(String::trim)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        return new User(appUser.getUsername(), appUser.getPassword(),appUser.isEnabled(), true,true,true, authorities);
    }
}
