package httpServer.handler;

import httpServer.Request;
import httpServer.response.AbstractResponse;
import httpServer.response.PlainResponse;

/**
 * @author: rudy
 * @date: 2016/10/22
 *
 * 默认处理handler
 */
public class DefaultHandler extends AbstractHandler {
    @Override
    public AbstractResponse execute(Request request) throws Exception {
        PlainResponse response = PlainResponse.createResponse();
        response.httpCodeSet(404);
        return response;
    }
}
