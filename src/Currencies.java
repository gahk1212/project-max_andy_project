import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;
import java.io.InputStream;

public class Currencies {

    public double usd;
    public double eur;
    public double cny;
    public double krw;


    public double usdToEur(double usd) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=USD&to=EUR&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return eur;
    }

    public double usdToCny(double usd) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=USD&to=CNY&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return cny;
    }

    public double usdToKrw(double usd) throws IOException {
        URL url = new URL("https://www.oanda.com/currency-converter/en/?from=USD&to=KRW&amount=1");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        return krw;
    }

    public double eurToUsd(double eur) {
        return usd;
    }

    public double eurToCny(double eur) {
        return cny;
    }

    public double eurToKrw(double eur) {
        return krw;
    }

    public double cnyToUsd(double cny) {
        return usd;
    }

    public double cnyToEur(double cny) {
        return eur;
    }

    public double cnyToKrw(double cny) {
        return krw;    
    }

    public double krwToUsd(double krw) {
        return krw;
    }

    public double krwToEur(double krw) {
        return eur;
    }

    public double krwToCny(double krw) {
        return cny;
    }
}
