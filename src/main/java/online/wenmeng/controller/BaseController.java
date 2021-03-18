package online.wenmeng.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseController{

    @InitBinder
    public void initBinder(final WebDataBinder webdataBinder) {
        webdataBinder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                String[] patterns = {
                        "yyyy-MM-dd HH:mm:ss"
                        ,"yyyy-MM-dd"
                        ,"yyyy/MM/dd HH:mm:ss"
                        ,"yyyy/MM/dd"
                        ,"yyyyMMdd HHmmss"
                        ,"HH:mm:ss"
                        ,"yyyy年MM月dd日 HH时mm分ss秒"
                        ,"yyyy年MM月dd日"
                };
                for (String pattern:patterns){
                    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
                    try {
                        setValue(dateFormat.parse(text));
                        return;
                    } catch (ParseException e) {}
                }
                setValue(new Date(Long.parseLong(text)));
            }
        });
    }
}
