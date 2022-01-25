package com.mjc.util;

import com.kjdevelopmentdotwest.stringutils.StringUtils;

public class Utils {
    public boolean isAllPositiveNumbers(String... str){

        StringUtils stringUtils = new StringUtils();
        try {
            for (String string: str){
                if (!stringUtils.isPositiveNumber(string)){
                    return false;
                }
            }
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}

