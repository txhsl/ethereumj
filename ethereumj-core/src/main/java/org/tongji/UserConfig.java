package org.tongji;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author: HuShili
 * @date: 2018/8/2
 * @description: none
 */
public class UserConfig extends Config{

    private ArrayList<String> protocols;

    public UserConfig(Map config){

        // Class Config deals other
        super(config);

        // And here deals protocols
        if(config.containsKey("protocols"))
            protocols = (ArrayList<String>) config.get("protocols");
        else {
            protocols = new ArrayList<>();
            protocols.add("eth");
            protocols.add("shh");
        }
    }

    @Override
    public void setConfig(Map<String, Object> config) {
        super.setConfig(config);

        if(config.containsKey("protocols"))
            protocols = (ArrayList<String>) config.get("protocols");
    }

    @Override
    public Map getConfig() {

        Map config = super.getConfig();
        config.put("protocols", protocols);

        return config;
    }
}
