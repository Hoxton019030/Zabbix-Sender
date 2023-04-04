package org.hoxton.util;

import com.google.gson.GsonBuilder;

/**
 * @author Hoxton
 * @version 0.1.0
 * @since 0.1.0
 **/
public class GsonUtils {

    public static com.google.gson.Gson gsonBuilder() {
        return new GsonBuilder().setPrettyPrinting().create();
    }
}
