package space.lvyang.ac.util;

import java.util.HashMap;

public class TestMain {

    public static void main(String args[]) throws Exception {
        /**
         * 对应jar包
         *
          <dependency>
         <groupId>org.apache.httpcomponents</groupId>
         <artifactId>httpclient</artifactId>
          <version>4.5.5</version>
         </dependency>
         *
         *
         *  对应类
            HttpClientResult
            HttpClientUtils
            TestMain
         * */


        //get 请求
        HttpClientResult gethttpClientResult = HttpClientUtils.doGet("https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=18511042684");
        System.out.println("get 请求："+gethttpClientResult);
        //post 请求

         HashMap<String,String> map = new HashMap<>();
        map.put("vcode","1");
        HttpClientResult posthttpClientResult = HttpClientUtils.doPost("http://reg.shikee.com/check/base/",map);
        System.out.println("post 请求："+posthttpClientResult.toString());
    }
}
