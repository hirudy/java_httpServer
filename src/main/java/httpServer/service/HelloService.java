package httpServer.service;

import httpServer.Request;
import httpServer.ServiceBase;
import httpServer.response.AbstractResponse;
import httpServer.response.PlainResponse;

/**
 * @author: rudy
 * @date: 2016/10/23
 */
public class HelloService extends ServiceBase {
    public AbstractResponse actionWorld(Request request){
        PlainResponse response = PlainResponse.createResponse();
        response.setText("TJHttpServer");
        return response;
    }
}
