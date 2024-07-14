package me.sirius.WSP.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name="user")
public class User implements UserDetails {

    // 유저 ID(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false, updatable = false)
    private int id;

    // email 주소(값이 있어야함, 유니크 해야함: 중복 X)
    @Column(name="email", nullable = false, unique = true)
    private String email;

    // 비밀번호(값이 있어야함)
    @Column(name="password", nullable = false)
    private String password;

    @Builder
    public User(String email, String password, String auth){
        this.email = email;
        this.password = password;
    }

    @Override //권한목록 반환
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return List.of(new SimpleGrantedAuthority("user"));
    }

    //사용자의 id를 반환
    @Override
    public String getUsername(){
        return email;
    }

    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public boolean isAccountNonExpired(){
        // 만료 확인 로직
        return true;
    }

    @Override
    public boolean isAccountNonLocked(){
        // 계정 잠금 확인로직
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        // 패스워드 만료되었는지 확인하는 로직
        return true;
    }

    // 계정 사용 가능 여부 반환
    @Override
    public boolean isEnabled(){
        // 계정사용 가능한지 확인하는 로직
        return true;
    }


}
