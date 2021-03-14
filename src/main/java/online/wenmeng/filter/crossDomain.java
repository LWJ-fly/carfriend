package online.wenmeng.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/17 20:23
 * @Descrintion: 解决跨域问题的过滤器
 * @version: 1.0
 */
public class crossDomain implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        // 将ServletResponse转换为HttpServletResponse
        HttpServletResponse httpResponse = (HttpServletResponse) res;
        // 如果不是80端口,需要将端口加上,如果是集群,则用Nginx的地址,同理不是80端口要加上端口
        String originHeader=((HttpServletRequest) req).getHeader("Origin");
        httpResponse.setHeader("Access-Control-Allow-Origin", originHeader);
        httpResponse.setHeader("Access-Control-Allow-Origin", originHeader);
        httpResponse.setContentType("application/json;charset=UTF-8");
        httpResponse.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, OPTIONS, PATCH");
        httpResponse.setHeader("Access-Control-Max-Age", "3600");
        httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type,Access-Token");
        // 如果要把Cookie发到服务器，需要指定Access-Control-Allow-Credentials字段为true
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.setHeader("Access-Control-Expose-Headers", "*");
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {

    }
}
