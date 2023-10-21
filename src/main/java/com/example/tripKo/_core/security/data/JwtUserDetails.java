package com.example.tripKo._core.security.data;

import java.util.List;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;


@Data
@RequiredArgsConstructor
public class JwtUserDetails implements UserDetails {

  private final String memberId;
  private final List<String> memberJobs;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    List<SimpleGrantedAuthority> roles = new ArrayList<>();
    for (String memberJob : memberJobs) {
      roles.add(new SimpleGrantedAuthority(memberJob));
    }
    return roles;
  }

  @Override
  public String getPassword() { return ""; }

  @Override
  public String getUsername() { return memberId; }

  @Override
  public boolean isAccountNonExpired() {return true; }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }


}
