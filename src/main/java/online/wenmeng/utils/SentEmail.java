package online.wenmeng.utils;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import java.util.Properties;

/**
 * description:容易导错包，需要注意
 * @author 狼芒
 * String receiver:收件人邮箱账号
 * String activationCode：发送的激活码(或者内容)
 * String subtitle 副标题
 */

public class SentEmail {
    public static Boolean sentEmail(String receiver,String content,String subtitle) {
        //  得到session
        Properties props = new Properties();
		props.setProperty("mail.host", "smtp.163.com");
        props.setProperty("mail.host", "smtp.qq.com");
        props.setProperty("mail.smtp.auth", "true");

        props.setProperty("mail.smtp.auth", "true");//开启认证
        props.setProperty("mail.debug", "true");//启用调试
        props.setProperty("mail.smtp.timeout", "1000");//设置链接超时
        props.setProperty("mail.smtp.port", "465");//设置端口
        props.setProperty("mail.smtp.socketFactory.port", "465");//设置ssl端口
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //设置账号密码
                return new PasswordAuthentication("3319691033", "wmdqbuwglwyacjji");
            }
        };

        Session session = Session.getInstance(props, auth);
        /*
         * 2、创建MimeMessage
         */
        MimeMessage msg = new MimeMessage(session);
        try {
            //设置发件人
            msg.setFrom(new InternetAddress("wenmeng.online@qq.com","闻梦家园","utf-8"));
            //设置收件人
            msg.setRecipients(RecipientType.TO, receiver);
            //设置标题
            msg.setSubject(subtitle);
            //设置内容
            msg.setContent(content,"text/html;charset=utf-8");
            //发送邮件
            Transport.send(msg);
        } catch (Exception e) {
//            e.printStackTrace();
            //这里需要通知我，出现错误立即更正
            return false;
        }
        return true;
    }
}
