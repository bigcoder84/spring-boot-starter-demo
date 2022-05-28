package cn.bigcoder.demo.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: Jindong.Tian
 * @date: 2022-05-28
 **/
@ConfigurationProperties(prefix = "bigcoder.server")
public class HttpServerProperties {
    /**
     * 默认端口
     */
    private static final Integer DEFAULT_PORT = 8000;

    /**
     * 端口
     */
    private Integer port = DEFAULT_PORT;

    public static Integer getDefaultPort() {
        return DEFAULT_PORT;
    }

    public Integer getPort() {
        return port;
    }

    public HttpServerProperties setPort(Integer port) {
        this.port = port;
        return this;
    }

}
