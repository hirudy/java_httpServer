import httpServer.HttpExtendServer;

/**
 * @author: rudy
 * @date: 2016/10/24
 * 入口
 */
public class App extends HttpExtendServer {

    public void initOptional() throws Exception {

    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.initService();
        app.start();
    }
}
