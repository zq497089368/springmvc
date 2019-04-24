package com.test.service.impl;


import org.apache.commons.io.FileUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class HttpClientTest{
    public static void main(String[] args) throws Exception{
        List<String> list = Arrays.asList(new String[]{"aa", "bb", "cc", "dd"});
        list.forEach(it -> System.out.println(it));
//        testRestTemplate();
    }

    private static void testRestTemplate(){



        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getForObject("https://www.google.com/search?q=java", String.class);

        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.2.21", 2222));

        requestFactory.setProxy(proxy);

        restTemplate.setRequestFactory(requestFactory);

        String s = restTemplate.getForObject("https://www.google.com", String.class);

        System.out.println(s);

        System.out.println("aa");
    }

    private static void doPost() throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://www.oschina.net/");
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36");
        CloseableHttpResponse response = httpClient.execute(httpPost);
        if(response.getStatusLine().getStatusCode() == 200){
            String content = EntityUtils.toString(response.getEntity(),
                    "UTF-8");
            FileUtils.writeStringToFile(new File("d:\\baidu3.html"),
                    content, "UTF-8");
            // 服务端返回数据的长度
            System.out.println("内容长度：" + content.length());
        }
    }

    private static void doGetWithParam() throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URI uri = new URIBuilder("http://101.201.211.208:48080/v1/queryRankList").setParameter("bjdcVersionControl",
                "true").setParameter("groupVersionControl","true").build();
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode() == 200){
            String content = EntityUtils.toString(response.getEntity(),
                    "UTF-8");
            FileUtils.writeStringToFile(new File("d:\\baidu2.html"),
                    content, "UTF-8");
            // 服务端返回数据的长度
            System.out.println("内容长度：" + content.length());
        }
    }

    private static void doGet() throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://101.201.211.208:48080/v1/queryRankList?bjdcVersionControl=true&groupVersionControl=true");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode() == 200){
            String content = EntityUtils.toString(response.getEntity(),
                    "UTF-8");
            FileUtils.writeStringToFile(new File("d:\\baidu.html"),
                    content, "UTF-8");
            // 服务端返回数据的长度
            System.out.println("内容长度：" + content.length());
        }
    }
}
