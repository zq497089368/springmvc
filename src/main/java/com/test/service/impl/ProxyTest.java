package com.test.service.impl;

import com.sun.net.httpserver.BasicAuthenticator;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.URL;
import java.net.URLConnection;

public class ProxyTest {
    private static String proxyHost = "192.168.2.21";
    private static int proxyPort = 2222;
    private static String proxyUser = "user";
    private static String proxyPass = "pass";
    public static void main(String[] args) {
        String url = "https://www.google.com/";
        String content = doProxy(url);
        System.out.println("Result :===================\n " + content);
    }
    /**
     * 通过系统变量方式实现代理
     *
     * @param url
     * @return
     */
    public static String doProxy(String url) {
        // 设置系统变量

        System.setProperty("http.proxySet", "true");
        System.setProperty("http.proxyHost", proxyHost);
        System.setProperty("http.proxyPort", "" + proxyPort);
        // 针对https也开启代理
        System.setProperty("https.proxyHost", proxyHost);
        System.setProperty("https.proxyPort", "" + proxyPort);
        // 设置默认校验器
//        setDefaultAuthentication();

        //开始请求
        try {
            URL u = new URL(url);
            URLConnection conn = u.openConnection();
            HttpsURLConnection httpsCon = (HttpsURLConnection) conn;
            httpsCon.setFollowRedirects(true);

            String encoding = conn.getContentEncoding();
            if (StringUtils.isEmpty(encoding)) {
                encoding = "UTF-8";
            }
            InputStream is = conn.getInputStream();
            String content = IOUtils.toString(is, encoding);
            return content;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

//    /**
//     * 设置全局校验器对象
//     */
//    public static void setDefaultAuthentication() {
//        BasicAuthenticator auth = new BasicAuthenticator(proxyUser, proxyPass);
//        Authenticator.setDefault(auth);
//    }
}
