package org.hoxton.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Hoxton
 * @version 0.1.0
 * @since 0.1.0
 **/
public class JacksonUtils {

    public static ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
