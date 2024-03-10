package com.JH.Blog.config.auth;

import com.JH.Blog.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
//스프링 시큐리티가 로그인 요청을 가로채고 로그인이 완료되면 userdetails 타입의 오브젝트를 고유한 세선저장소에 저장함
public class PrincipalDetail implements UserDetails {
    private User user;//콤포지션(객체를 품고있음

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override//계정만료 여부
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override//계정 감짐 여부:true 안잠김
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override//비밀번호 만료여부
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override//계정활성화
    public boolean isEnabled() {
        return true;
    }

    @Override//계정권한
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collectors = new ArrayList<>();
        collectors.add(()->{return "ROLE_"+user.getRole();});

        return collectors;
    }
}
