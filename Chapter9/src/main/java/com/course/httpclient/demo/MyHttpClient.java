package com.course.httpclient.demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.io.IOException;

public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        HttpClient hc = new DefaultHttpClient();
        HttpResponse response = hc.execute(get);
        result=EntityUtils. toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }
}
