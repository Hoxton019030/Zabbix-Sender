package org.hoxton.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hoxton
 * @since 1.0.0
 **/
public class ZbxListUtils {
    public ZbxListUtils() {
    }

    public static <R> List<R> add(List<R> list, R e) {
        if (list == null) {
            list = new ArrayList<R>();
        }

        list.add(e);

        return list;
    }



}
