package co.com.samtel.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.samtel.security.dto.LoginRequest;
import co.com.samtel.service.ITokenService;

@RestController
public class LoginController {

	@Autowired
	ITokenService tokenService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody LoginRequest loginDto) {
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ADMIN_ROLE,USER_ROLE");

		return new ResponseEntity<>(
				tokenService.generateToken(loginDto.getEmail(), grantedAuthorities),
			 	HttpStatus.OK);
	}
}
