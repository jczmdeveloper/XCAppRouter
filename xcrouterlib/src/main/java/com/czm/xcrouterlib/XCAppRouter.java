package com.czm.xcrouterlib;

import com.czm.xcrouterlib.service.IService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caizhiming on 2017/3/17.
 */

public class XCAppRouter {
    private static XCAppRouter sRouter = null;
    private Map<String,IService> mServiceMap = new HashMap<>();
    private XCAppRouter() {
    }
    public static XCAppRouter getInstance(){
        if(sRouter == null) {
            sRouter = new XCAppRouter();
        }
        return sRouter;
    }

    public synchronized void register(String uri,IService service){
        if(mServiceMap.containsKey(uri)) {
            try {
                throw new Exception("Url or Uri is exist,please use a new uri key");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        mServiceMap.put(uri,service);
    }
    public synchronized void unregister(String uri){
        mServiceMap.remove(uri);
    }
    public IService route(String uri) {
        return mServiceMap.get(uri);
    }
}
