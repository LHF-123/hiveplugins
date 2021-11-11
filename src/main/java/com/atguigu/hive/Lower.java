package com.atguigu.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * @author LHF
 * @date 2021/11/11 15:05
 */
public class Lower extends UDF {

    public String evaluate(String original){
        if (original == null)
            return null;
        return original.toLowerCase();
    }

}
