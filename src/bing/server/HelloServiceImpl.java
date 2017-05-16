package bing.server;

import javax.jws.WebService;

/**
 * <p>
 * WebService实现类
 * </p>
 * 
 * @author IceWee
 * @date 2012-7-6
 * @version 1.0
 */
@WebService(endpointInterface = "bing.server.IHelloService", serviceName = "loginfoService")
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String username) {
        return "hello, " + username;
    }

}
