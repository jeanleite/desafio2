package com.jm.desafio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author michel
 */
public class Teste {

    private final DefaultHttpClient client = new DefaultHttpClient();

    public HttpResponse getParalametares(String url) {
        try {
            // Pegar o requestcode
            HttpGet get = new HttpGet(url);
            HttpResponse response = client.execute(get);

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            StringBuilder result = new StringBuilder();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            // input[name='__RequestVerificationToken'] 
            Document doc = Jsoup.parse(result.toString());

            EntityUtils.consume(response.getEntity());
            // Codição necessária para o post
            Element token = doc.selectFirst("input[name='__RequestVerificationToken']");
            // metodo POST
            HttpPost post = new HttpPost(url.concat("/Parliamentarians/List"));
            final List<BasicNameValuePair> nameValuePairs
                    = new ArrayList<BasicNameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("CurrentPage", "2"));
            nameValuePairs.add(new BasicNameValuePair("PageSize", "1"));
            nameValuePairs.add(new BasicNameValuePair("Year", "0"));
            nameValuePairs.add(new BasicNameValuePair("__RequestVerificationToken", token.attr("value")));
            
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs, Consts.UTF_8));
            response = client.execute(post);
            return response;
        } catch (UnknownHostException ex) {
            // Quando o link é invalido
        } catch (IOException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void close() {
        client.getConnectionManager().shutdown();
    }

    private void saveHTLM(final HttpResponse response) throws IOException {
        final BufferedReader rd = new BufferedReader(new InputStreamReader(
                response.getEntity().getContent()));
        String line;
        System.out.println(EntityUtils.toString(response.getEntity()));
        File arquivo = new File("/home/michel/arquivo.html");
        PrintWriter writer = new PrintWriter(arquivo);
        while ((line = rd.readLine()) != null) {
            System.out.println(line);
            writer.println(line);;
        }
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) {
        String url = "http://www.politicos.org.br";
        Teste navegador = new Teste();
        HttpResponse response = navegador.getParalametares(url);
        navegador.close();
        try {
            navegador.saveHTLM(response);
        } catch (IOException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
