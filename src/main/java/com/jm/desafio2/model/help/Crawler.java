package com.jm.desafio2.model.help;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author michel
 */
public class Crawler {

    private final DefaultHttpClient client = new DefaultHttpClient();

    private final int limitPorCategoria = 10;

    private final int limitMaxProd = 1000;

    public String getPage(String url) {
        try {
            HttpGet request = new HttpGet(url);
            if (request.isAborted()) {
                return null;
            }
            request.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:18.0) Gecko/20100101 Firefox/18.0");

            HttpResponse response = client.execute(request);

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            StringBuilder result = new StringBuilder();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            EntityUtils.consume(response.getEntity());

            return result.toString();
        } catch (UnknownHostException ex) {
            // Quando o link é invalido
        } catch (IOException ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public String fixUrl(String url, String link) {
        return link.startsWith(url) ? link : url.concat(link);
    }

    public void close() {
        client.getConnectionManager().shutdown();
    }

}
