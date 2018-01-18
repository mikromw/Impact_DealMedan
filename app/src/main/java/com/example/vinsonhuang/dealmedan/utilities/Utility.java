package com.example.vinsonhuang.dealmedan.utilities;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Created by User on 11/30/2017.
 */

public class Utility {
    private static Utility instance = null;
    public static Utility getInstance() {
        if (instance == null) {
            instance = new Utility();
        }
        return instance;
    }

    // ini fungsi untuk membuat string yang 8000 menjadi ada 8.0000, 800000 > 800.000 dsb
    public String convertPrice(String paramString)
    {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
        otherSymbols.setDecimalSeparator(',');
        otherSymbols.setGroupingSeparator(',');
        DecimalFormat dfnd = new DecimalFormat("#,###", otherSymbols);
        double jumlah =Long.parseLong(paramString);
        String a = dfnd.format(jumlah);
        return a;
    }
}
