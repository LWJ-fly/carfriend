package online.wenmeng.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 狼芒
 * @Date: 2021/1/18 0:00
 * @Descrintion: String的后置处理器，处理编码问题，继承BeanPostProcessor 实现Bean的编码转换，解决返回String对象时乱码问题
 * @version: 1.0
 */
public class StringBeanPostProcessor implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    //bean实例化后进行处理，判断bean是否属于StringHttpMessageConverter，如果是的话就配置字符编码
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof StringHttpMessageConverter){
            MediaType mediaType = new MediaType("text", "plain", Charset.forName("UTF-8"));
            List<MediaType> types = new ArrayList<MediaType>();
            types.add(mediaType);
            ((StringHttpMessageConverter) bean).setSupportedMediaTypes(types);
        }
        return bean;
    }
}
