package com.parse.tutoo.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * User Profile
 * Class containing the profile information
 */
@ParseClassName("UserProfile")
public class UserProfile extends ParseObject {

    public String getUser() {
        return getString("user");
    }

}
