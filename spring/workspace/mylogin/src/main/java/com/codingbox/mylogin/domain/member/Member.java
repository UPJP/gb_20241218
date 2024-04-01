package com.codingbox.mylogin.domain.member;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class Member {
	private Long id;
	private String name;
	private String loginId;
	private String password;

}
