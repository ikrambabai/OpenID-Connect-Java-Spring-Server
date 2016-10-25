package org.mitre.openid.connect.web;

import java.util.List;

import org.mitre.openid.connect.model.DefaultUserInfo;
import org.mitre.openid.connect.model.ResponseMeta;
import org.mitre.openid.connect.model.ResponseStatusEnum;
import org.mitre.openid.connect.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@RestController
@JsonSerialize 
public class AllUsersEndpoint {
 
	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping(value="/allUsers", method=RequestMethod.GET)	
	public  ResponseMeta<List<DefaultUserInfo>> show(Model model) {
		return new ResponseMeta(ResponseStatusEnum.OK, "sucess", userInfoService.getAllUsersInfo());
	} 
}