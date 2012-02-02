package com.kakao.test;

import com.ning.http.client.*;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Client 
{
    public static void main( String[] args ) throws IOException, InterruptedException, ExecutionException
    {
        String url = "http://bms.kakao.com:9000/status";
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        Future<Response> f = asyncHttpClient.prepareGet(url).execute();
        Response r = f.get();
        System.out.println(r.getResponseBody());
    }
}
