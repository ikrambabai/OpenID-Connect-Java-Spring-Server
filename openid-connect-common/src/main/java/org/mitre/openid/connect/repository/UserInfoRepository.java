/*******************************************************************************
 * Copyright 2016 The MITRE Corporation
 *   and the MIT Internet Trust Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.mitre.openid.connect.repository;

import java.util.List;

import org.mitre.openid.connect.model.DefaultUserInfo;
import org.mitre.openid.connect.model.UserInfo;

/**
 * UserInfo repository interface
 * 
 * @author Michael Joseph Walsh
 *
 */
public interface UserInfoRepository {

	/**
	 * Get a UserInfo object by its preferred_username field
	 * @param username
	 * @return
	 */
	public UserInfo getByUsername(String username);

	/**
	 * 
	 * Get the UserInfo object by its email field
	 * 
	 * @param email
	 * @return
	 */
	public UserInfo getByEmailAddress(String email);
	
	
	/**
	 * 
	 * Get list of all users info 
	 * @return list of all users info
	 */
	public List<DefaultUserInfo> getAllUsersInfo();
}
