package com.freshbooks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DumpAccount {

    /**
     * @param args
     */
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Usage: dump URL API-KEY");
            return;
        }
        String url = args[0];
        String key = args[1];
        try {
            ApiConnection con = new ApiConnection(new URL(url), key);
            con.setDebug(true);
            try {
                for(Invoice invoice : con.listInvoices(10)) {
                    System.out.println("Found invoice "+invoice.getId()+" with amount "+invoice.getAmount());
                }
            } catch(Error e) {
                if(e.getCause() instanceof ApiException) {
                    throw (ApiException)e.getCause();
                }
                if(e.getCause() instanceof IOException) {
                    throw (IOException)e.getCause();
                }
            }
            
            
        } catch (MalformedURLException e) {
            System.err.println(url+" is not a valid URL ("+e.getLocalizedMessage()+")");
        } catch (ApiException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
