package com.httpclientdemo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.jar.JarEntry;

/**
 * Created by Administrator on 2020/2/4 0004.
 */
public class MyCookieForGetAndPost {
    private String geturl;
    private String getwithurl;
    private ResourceBundle bundle;
    private  CookieStore store;
    @BeforeTest
    public void beforeTest() {
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        geturl = bundle.getString("test.url") + bundle.getString("getcookies.uri");
        getwithurl = bundle.getString("test.url") + bundle.getString("getwithcookies.uri");

        System.out.println(getwithurl);
    }

    //返回cookies的get请求
    @Test
    public void testGetCookies() throws IOException {
        HttpGet get = new HttpGet(this.geturl);
        String result;
         store = new BasicCookieStore();
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultCookieStore(store).build();
        HttpResponse response = httpClient.execute(get);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
        List<Cookie> CookieList = store.getCookies();
        String name;
        String value;
        System.out.println(CookieList.size());
        for (Cookie cookie : CookieList) {
            name = cookie.getName();
            value = cookie.getValue();
            System.out.println("name=" + name + ",value=" + value);
        }
    }

    //带cookie的get请求
    @Test(dependsOnMethods = {"testGetCookies"},alwaysRun= true)
    public void testGetWithCookies() throws IOException {
        HttpGet getwith = new HttpGet(this.getwithurl);
        String result;
        CloseableHttpClient httpClientwith = HttpClients.custom().setDefaultCookieStore(this.store).build();
        HttpResponse response = httpClientwith.execute(getwith);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }

    //带cookie的post请求
    @Test(dependsOnMethods = {"testGetCookies"},alwaysRun= true)
    public void testPostWithCookies() throws IOException {
        ResourceBundle bundle1;
        String postwithurl;
        String result1;
        bundle1 = ResourceBundle.getBundle("application", Locale.CHINA);
        postwithurl = bundle1.getString("test.url") + bundle.getString("postcookies.uri");
        HttpPost post=new HttpPost(postwithurl);
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultCookieStore(store).build();

        //添加参数
        JSONObject para=new JSONObject();
        para.put("name","huhansan");
        para.put("age","18");
        //将参数放在方法中
        StringEntity entity=new StringEntity(para.toString());

        post.setEntity(entity);
        post.setHeader("Content-Type","text/html;charset=gbk");
        HttpResponse response = httpClient.execute(post);
        result1 = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result1);
        //将返回结果转换为json对象
        JSONObject resultJson=new JSONObject(result1);
        //获取返回的结果
        String success =(String) resultJson.get("huhansan");
        //比较
        Assert.assertEquals(success,"success");


    }

}
