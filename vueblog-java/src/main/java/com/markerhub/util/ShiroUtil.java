package com.markerhub.util;

import com.markerhub.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {

    public static AccountProfile getProfile() {
        System.out.println("Shiro.getProfile()");

        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
