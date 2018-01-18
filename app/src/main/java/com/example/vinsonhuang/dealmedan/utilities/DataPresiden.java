package com.example.vinsonhuang.dealmedan.utilities;

import android.util.Log;

import com.example.vinsonhuang.dealmedan.model.NotificationData;
import com.example.vinsonhuang.dealmedan.model.President;

import java.util.ArrayList;

public class DataPresiden {
    private static ArrayList<String> promodata;
    private static ArrayList<String> highdata;
    private static ArrayList<String> conditiondata;
    // array dari detail untuk list deal medan
    public static String[][] data = new String[][]{
            {"[Desember Promo] Main Course + Drink + Snack at Morning Glory Coffee", "88000", "gambar_1","0"},
            {"FavoriteList Deals Voucher Cellulite Treatment, Facial Treatment, Mix Massage [2 Hours] From Bandi Spa Medan", "99000", "gambar_2","1"},
            {"Tiramisu Cake Special From Hotel Emerald Garden Medan", "175000", "gambar_3","2"},
            {"Anniversarry Promo - Menu Favorit Mie ayam Jamur", "69000", "gambar_4","3"},
            {"Promo Delivery Nasi Ayam Penyet dari Ayam Penyet Kalasan", "19900", "gambar_5","4"},
            {"Dapatkan Paket Istimewa Untuk Berdua Hingga Berempat dari Caroline J'Bistro & Cafe", "39900", "gambar_6","5"},
            {"[Desember Promo] Packages For 1 & 2 Persons at Dante Coffee Shop-Centre Point", "39900", "gambar_7","6"},
            {"Best Single or Sharing Packages From Tong's Soya Milk & Beancurd", "29000", "gambar_8","7"},
            {"Deal Spesial Promotion Package For 10 Persons From FOOD TEN Resto Garden & Coffee Shop", "138000", "gambar_9","8"},
            {"Temukan Keseruan Bermain Sepuasnya di Funland Mikie Holiday", "75000", "gambar_10","9"},
            {"[Desember] Special Promo dari JPP Skin Center", "349000", "gambar_11","10"},
            {"[Non Halal] All New Packages of Korean Cuisine From Arirang Korean Food", "35000", "gambar_12","11"},
            {"Desember Special Offer Packages For 1 and 2 Persons from DeCoco Coffee Shop", "28000", "gambar_13","12"},
            {"Weekends Buffet Promotion at Swiss Cafe-Grand Swiss-Belhotel Medan", "118500", "gambar_14","13"},
            {"Celebrate Special Moment at The Edge Grand Swiss-Belhotel Medan", "250000", "gambar_15","14"},
            {"Cocktail O'Clock - Free Flow Cocktail at the View Grand Swiss-Belhotel Medan", "250000", "gambar_16","15"}
    };

    public static String[][] data_makanan = new String[][]{
            {"[Desember Promo] Main Course + Drink + Snack at Morning Glory Coffee", "88000", "gambar_1","0"},
            {"Tiramisu Cake Special From Hotel Emerald Garden Medan", "175000", "gambar_3","2"},
            {"Anniversarry Promo - Menu Favorit Mie ayam Jamur", "69000", "gambar_4","3"},
            {"Promo Delivery Nasi Ayam Penyet dari Ayam Penyet Kalasan", "19900", "gambar_5","4"},
            {"Dapatkan Paket Istimewa Untuk Berdua Hingga Berempat dari Caroline J'Bistro & Cafe", "39900", "gambar_6","5"},
            {"[Desember Promo] Packages For 1 & 2 Persons at Dante Coffee Shop-Centre Point", "39900", "gambar_7","6"},
            {"Best Single or Sharing Packages From Tong's Soya Milk & Beancurd", "29000", "gambar_8","7"},
            {"Deal Spesial Promotion Package For 10 Persons From FOOD TEN Resto Garden & Coffee Shop", "138000", "gambar_9","8"},
            {"[Non Halal] All New Packages of Korean Cuisine From Arirang Korean Food", "35000", "gambar_12","11"},
            {"Desember Special Offer Packages For 1 and 2 Persons from DeCoco Coffee Shop", "28000", "gambar_13","12"},
            {"Weekends Buffet Promotion at Swiss Cafe-Grand Swiss-Belhotel Medan", "118500", "gambar_14","13"},
            {"Celebrate Special Moment at The Edge Grand Swiss-Belhotel Medan", "250000", "gambar_15","14"},
            {"Cocktail O'Clock - Free Flow Cocktail at the View Grand Swiss-Belhotel Medan", "250000", "gambar_16","15"}
    };


    public static String[][] data_top = new String[][]{
            {"FavoriteList Deals Voucher Cellulite Treatment, Facial Treatment, Mix Massage [2 Hours] From Bandi Spa Medan", "99000", "gambar_2","1"},
            {"Dapatkan Paket Istimewa Untuk Berdua Hingga Berempat dari Caroline J'Bistro & Cafe", "39900", "gambar_6","5"},
            {"[Desember Promo] Packages For 1 & 2 Persons at Dante Coffee Shop-Centre Point", "39900", "gambar_7","6"},
            {"Deal Spesial Promotion Package For 10 Persons From FOOD TEN Resto Garden & Coffee Shop", "138000", "gambar_9","8"},
            {"[Non Halal] All New Packages of Korean Cuisine From Arirang Korean Food", "35000", "gambar_12","11"},
            {"Weekends Buffet Promotion at Swiss Cafe-Grand Swiss-Belhotel Medan", "118500", "gambar_14","13"},
            {"Celebrate Special Moment at The Edge Grand Swiss-Belhotel Medan", "250000", "gambar_15","14"},
    };

    // aray detil untuk notification
    public static String[][] notifdata = new String[][]{
            //id cuma ada dari 0 - 15 sesuai dgn index string diatas
            {"Morning Glory Coffee", "[Desember Promo] Main Course + Drink + Snack at Morning Glory Coffee", "gambar_1", "07 Desember 2017","0"},
            {"Cocktail O'Clock", "Cocktail O'Clock - Free Flow Cocktail at the View Grand Swiss-Belhotel Medan", "gambar_16", "11 Desember 2017","15"},
            {"Deal Spesial Promotion", "Deal Spesial Promotion Package For 10 Persons From FOOD TEN Resto Garden & Coffee Shop", "gambar_9", "15 Desember 2017","8"},

    };
    // array data untuk promo setiap detil
    public static ArrayList<String> getPromodata(){
        promodata = new ArrayList<String>();
        promodata.add("•  Voucher seharga Rp 88.000,- net untuk November Promo - For 2 Persons\n" +
                "Harga Normal: Rp 195,000,-\n" +
                "Paket terdiri dari :\n" +
                "•\tSpaghetti creamy meatball chicken\n" +
                "•\tRoasted chicken with mashed potatoes and gravy sauce\n" +
                "•\tBruschetta toast (mix paprika and mayonaise)\n" +
                "•\tHot/Iced tea\n");
        promodata.add("•  Voucher seharga Rp 99.000,- net untuk Massage Treatment (Massage 2 Hours + Steam + Lulur + Masker).\n" +
                "Harga Normal: Rp 200,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 150.000,- net untuk Facial Treatment.\n" +
                "Harga Normal: Rp 250,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 150.000,- net untuk Cellulite Treatment.\n" +
                "Harga Normal: Rp 300,000,-\n");
        promodata.add("Voucher seharga Rp 175.000,- net untuk Tiramisu Cake 16 Cm\n" +
                "Harga Normal: Rp 250,000,-\n" +
                "Note :\n" +
                "•\tDiwajibkan untuk melakukan reservasi terlebih dahulu ke Hotel Emerald Garden minimal 2 hari sebelum pengambilan di nomor 061 - 661 1888 ext 8081\n");
        promodata.add("Voucher seharga Rp 69.000,- net untuk 4 Pilihan Menu Favorit\n" +
                "Harga Normal: Rp 127,000,-\n" +
                "Pilihan : \n" +
                "•\tMie Ayam Jamur Spesial\n" +
                "•\tBakso Mewah \n" +
                "•\tNasi Goreng XO Seafood\n" +
                "•\tMie Pangsit Jamur Goreng\n" +
                "•\tMie Tiaw Ayam Lada Hitam\n" +
                "•\tNasi + Ayam Becek\n" +
                "•\tNasi + Nila Becek\nNote :\n" +
                "•\tBerlaku makan di tempat atau delivery by kurir online dan takeaway.\n");
        promodata.add("•  Voucher seharga Rp 19.900,- net untuk 1 Pax Ayam Penyet Kalasan Komplit.\n" +
                "Harga Normal: Rp 30,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 35.000,- net untuk 2 Pax Ayam Penyet Kalasan Komplit.\n" +
                "Harga Normal: Rp 60,000,- \n" +
                "Note :\n" +
                "•\tUntuk pemesanan diwajibkan reservasi 2 hari sebelum pengantaran.\n" +
                "•\tUntuk Delivery harap melakukan konfirmasi alamat terlebih dahulu dan pertanyaan lebih lanjut boleh langsung menghubungi pihak via LINE : sellinathan // BB : 573CE30C.\n" +
                "•\tFree Delivery untuk Medan Kota (Min 2 Pax).\n");
        promodata.add("•  Voucher seharga Rp 39.900,- net untuk Paket Berdua A (2 Main Courses + 2 Ice/Hot tea)\n" +
                "Harga Normal: Rp 72,000,-\n" +
                "\n" +
                "Pilihan Main Course Berdua A :\n" +
                "•\tNasi Goreng Seafood\n" +
                "•\tMie Goreng Seafood\n" +
                "•\tKwetiau Goreng Seafood\n" +
                "•\tIfu Mie Goreng Seafood\n" +
                " \n" +
                "•  Voucher seharga Rp 49.900,- net untuk Paket Berdua B (2 Main Courses + 2 Ice/Hot tea)\n" +
                "Harga Normal: Rp 84,000,-\n" +
                "Pilihan Main Course Berdua B :\n" +
                "•\tNasi Ayam Kremes\n" +
                "•\tNasi Ayam Lada Hitam\n" +
                "•\tNasi Ayam Capcay\n" +
                "•\tNasi Cumi Capcay\n" +
                "•\tNasi Cumi Lada Hitam\n" +
                "•\tNasi Cumi Asam Manis\n" +
                " \n" +
                "•  Voucher seharga Rp 99.000,- net untuk Paket Berempat A\n" +
                "Harga Normal: Rp 143,000,- \n" +
                "Note :.\n" +
                "•\tDemi kenyamanan customer, disarankan reservasi terlebih dahulu sebelum kedatangan di nomor 061 - 8881 6550 // 0823 0425 3969.\n" +
                "•\tTanggal 28 November 2017 dan 12 Desember 2017 Tidak Buka.\n");
        promodata.add("•  Voucher seharga Rp 39.900,- net untuk [Desember Promo] Paket 1 Orang + Ice/Hot tea\n" +
                "Harga Normal: Rp 69,900,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 65.000,- net untuk [Desember Promo] Paket 2 Orang + Ice/Hot tea\n" +
                "Harga Normal: Rp 138,800,-\n" +
                "Pilihan Menu :\n" +
                "•\tChicken Parmigiana Steak\n" +
                "•\tDante Special Chicken \n" +
                "•\tRendang Fried Rice\n" +
                "•\tTuna Fried Rice\n" +
                "•\tDante Spicy Chicken Rica-Rica atau Dante Spicy Dory Rica-Rica.\n" +
                "•\tSpaghetti Tilapia Black Pepper Sauce\n" +
                "•\tSpaghetti Dory Rica-Rica Creamy\nNote :\n" +
                "•\tDiwajibkan untuk melakukan reservasi ke pihak Dante Coffee Shop sebelum kedatangan, untuk kenyamanan customer di nomor +6261 8050 1433 (untuk penukaran lebih dari 10 voucher).\n" +
                "•\tVoucher tidak berlaku di tanggal 25 & 31 Desember 2017 & 01 Januari 2018.\n");
        promodata.add("• Voucher seharga Rp. 29.000,- nett untuk 1 Dessert + 1 Soya Milk\n" +
                "Harga Normal: Rp. 62.000,-\n" +
                "\n" +
                "Pilihan Dessert:\n" +
                "•\tMegastar\n" +
                "•\tSuperstar\n" +
                "• Voucher seharga Rp. 32.000,- nett untuk 1 Indonesian Food + 1 Soya Milk\n" +
                "Harga Normal: Rp. 65.000,-\n" +
                "\n" +
                "Pilihan Indonesian Food:\n" +
                "•\tNasi Goreng Serai Ayam\n" +
                "•\tAyam Kecap\n" +
                "•\tIkan Asam Manis\n" +
                "•\tMie Sop Ayam\n" +
                "•\tSapi Lada Hitam\n" +
                "• Voucher seharga Rp. 42.000,- nett untuk 1 Steak + 1 Soya Milk\n" +
                "Harga Normal: Rp. 99.000,-\n" +
                "\n" +
                "Pilihan Steak:\n" +
                "•\tSpicy Tartare Dory\n" +
                "•\tBBQ Chicken Chop\n" +
                "•\tGrilled Chicken Steak\n" +
                "•\tCrispy Plum Chicken\n" +
                "•\tFish & Chips\n" +
                "\n" +
                "NOTE:\n" +
                "Soya Milk Ukuran 300 ml / Boleh Pilih Ice Tea.\n");
        promodata.add("•  Voucher seharga Rp 138.000,- net untuk Paket Makan Berempat.\n" +
                "Harga Normal: Rp 240,000,-\n" +
                "Paket Berempat A :\n" +
                "•\tDaging Ikan Asam Manis\n" +
                "•\tAyam Bawang Putih\n" +
                "•\tSop Chichai Daging Ayam\n" +
                "•\tTauge Ikan Asin\n" +
                "•\t4 Nasi Putih\n" +
                "•\t4 Teh Pahit\n" +
                "Paket Berempat B :\n" +
                "•\tAyam Goreng Kering\n" +
                "•\tDaging Ikan Cabe Hijau\n" +
                "•\tSop Poileng Telur Asin\n" +
                "•\tFuyunghai\n" +
                "•\t4 Nasi Putih\n" +
                "•\t4 Teh Pahit\n" +
                " \n" +
                "•  Voucher seharga Rp 288.000,- net untuk Paket Makan Berenam.\n" +
                "Harga Normal: Rp 576,000,-\n" +
                "Paket Berenam A :\n" +
                "•\tIkan Siakap/Grapu\n" +
                "•\tAyam Bawang Putih\n" +
                "•\tTahu Siram Jamur\n" +
                "•\tSop Chichai Daging Ayam\n" +
                "•\tTauge Ikan Asin\n" +
                "•\t6 Nasi Putih\n" +
                "•\t6 Teh Pahit\n" +
                "Paket Berenam B :\n" +
                "•\tIkan Siakap/Grapu\n" +
                "•\tAyam Goreng Kering\n" +
                "•\tFuyunghai\n" +
                "•\tSop Poilieng Telur Asin\n" +
                "•\tTahu ala Hongkong\n" +
                "•\t6 Nasi Putih\n" +
                "•\t6 Teh Pahit\n" +
                " \n" +
                "•  Voucher seharga Rp 388.000,- net untuk Paket Makan Bersepuluh.\n" +
                "Harga Normal: Rp 776,000,-\n" +
                "Paket Bersepuluh A :\n" +
                "•\tIkan Siakap/Grapu\n" +
                "•\tAyam Bawang Putih\n" +
                "•\tUdang Nestum\n" +
                "•\tTahu Siram Jamur\n" +
                "•\tSop Chichai Daging Ayam\n" +
                "•\tTauge Ikan Asin\n" +
                "•\t10 Nasi Putih\n" +
                "•\t10 Teh Pahit\n" +
                "Paket Bersempuluh B :\n" +
                "•\tIkan Siakap/Grapu\n" +
                "•\tAyam Goreng Kering\n" +
                "•\tUdang Sambel Pete\n" +
                "•\tFuyunghai\n" +
                "•\tSop Chichai Telur Asin\n" +
                "•\tTahu ala Hongkong\n" +
                "•\t10 Nasi Putih\n" +
                "•\t10 Teh Pahit\n" +
                " \n" +
                "Pilihan Masakan Ikan Siakap/Grapu :\n" +
                "•\tGoreng Mangga\n" +
                "•\tGoreng Asam Manis\n" +
                "•\tSteam Chaipo\n" +
                "•\tSteam Tauco Thailand\n" +
                "•\tSteam Hongkong \n" +
                "Note :\n" +
                "•\tVoucher tidak berlaku pada tanggal 28 November 2017.\n" +
                "•\tVoucher tidak berlaku untuk ruang VIP.\n" +
                "•\tDisarankan untuk melakukan reservasi terlebih dahulu di FOOD TEN Resto Garden & Coffee Shop 3 jam sebelum kedatangan di Nomor: 061 - 8881 3849 // 0822 7706 1184.\n");
        promodata.add("• Voucher seharga Rp. 75.000,- nett untuk 1 Ticket ( Tiket Open Play for 1 Person ).\n" +
                "Harga Normal: Rp. 110.000,-\n" +
                " \n" +
                "Note:\n" +
                "Voucher tidak berlaku di tanggal 25 Desember 2017 & 31 Desember 2017.\n");
        promodata.add("•  Voucher seharga Rp 349.000,- net untuk Paket Perawatan Laser & Light Untuk Under Arm.\n" +
                "Harga Normal: Rp 1,200,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 399.000,- net untuk Paket Perawatan Hydrofacial/Deep Clean.\n" +
                "Harga Normal: Rp 800,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 1.800.000,- net untuk Paket 3x Perawatan Laser & Light untuk Wajah.\n" +
                "Harga Normal: Rp 3,600,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 2.000.000,- net untuk Paket 3x Perawatan Laser & Light untuk Wajah + 2x Lips.\n" +
                "Harga Normal: Rp 4,000,000,-\n" +
                "Note :\n" +
                "•\tVoucher hanya berlaku untuk Customer Baru (Customer yang tidak pernah melakukan treatment di JPP Skin Center).\n" +
                "•\tPemakaian Voucher hanya berlaku untuk Satu Orang per Voucher/Tidak Berlaku Kelipatan.\n" +
                "•\tDiwajibkan untuk melakukan reservasi terlebih dahulu ke JPP Skin 1 Hari sebelum kedatangan di nomor 061 450 1113 (Sun Plaza) // 061 8051 0206 (Centre Point).\n");
        promodata.add("•  Voucher seharga Rp 35.000,- net untuk Paket A\n" +
                "Harga Normal: Rp 55,000,-\n" +
                "\n" +
                "Paket A terdiri dari :\n" +
                "•\tHemul Ramyeon\n" +
                "•\t1 Korean Ice tea\n" +
                " \n" +
                "•  Voucher seharga Rp 125.000,- net untuk Paket B\n" +
                "Harga Normal: Rp 180,000,-\n" +
                "Paket B terdiri dari :\n" +
                "•\tSamgyeopsal\n" +
                "•\tBulgogi\n" +
                "•\t2 Nasi Putih\n" +
                "•\t2 Korean Ice tea\n" +
                " \n" +
                "•  Voucher seharga Rp 170.000,- net untuk Paket C \n" +
                "Harga Normal: Rp 250,000,-\n" +
                "Paket C terdiri dari :\n" +
                "•\tJamur Enoki\n" +
                "•\tShitake\n" +
                "•\tChampigno\n" +
                "•\tSup Jamur Bulgogi\n" +
                "•\t3 Nasi Puitih\n" +
                "•\t3 Korean Ice tea\n" +
                " \n" +
                "•  Voucher seharga Rp 225.000,- net untuk Paket D (Dakgalbi - Ayam + Udang + Babi)\n" +
                "Harga Normal: Rp 450,000,-\n" +
                "Paket D terdiri dari :\n" +
                "•\tDakgalbi Combo\n" +
                "•\tGaelanjjim\n" +
                "•\t4 Nasi Putih\n" +
                "•\t4 Korean Ice tea\n");
        promodata.add("•  Voucher seharga Rp 28.000,- net untuk Paket Single 1 Main Course + 1 Drink\n" +
                "Harga Normal: Rp 52.800,-\n" +
                "PIlihan Main Course Paket Single :\n" +
                "•\tNasi Ayam Goreng Coco\n" +
                "•\tSpaghetti Picata\n" +
                "Pilihan Drinks Paket Single :\n" +
                "•\tCoconut Berry\n" +
                "•\tJuice Timun\n" +
                " \n" +
                "•  Voucher seharga Rp 55.000,- net untuk Paket Couple 2 Main Courses + 2 Drinks + Dessert\n" +
                "Harga Normal: Rp 135.300,-\n" +
                "PIlihan Main Course Paket Couple :\n" +
                "•\tNasi Ayam Kung Pao\n" +
                "•\tSpesial Nasi Komplit\n" +
                "•\tNasi Ayam Goreng Coco\n" +
                "•\tMie Ayam Lada Hitam\n" +
                "•\tMie Kari\n" +
                "•\tSpaghetti Picata\n" +
                "Pilihan Drinks Paket Couple :\n" +
                "•\tCoconut Berry\n" +
                "•\tHot Cappucino\n" +
                "•\tJuice Timun\n" +
                "•\tIced Coco Coffee\n" +
                "•\tBlueberry Smothies\n");
        promodata.add("•  Voucher seharga Rp 118.500,- net untuk Voucher All You Can Eat Buffet di Swiss Cafe (Lunch Saturday - Sunday).\n" +
                "Harga Normal: Rp 158,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 118.500,- net untuk Voucher All You Can Eat Buffet di Swiss Cafe (Sunday Brunch).\n" +
                "Harga Normal: Rp 158,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 118.500,- net untuk Voucher All You Can Eat Buffet di Swiss Cafe (Dinner Friday - Sunday).\n" +
                "Harga Normal: Rp 158,000,-\n" +
                " \n" +
                "Note:\n" +
                "•\tSudah termasuk free flow air putih.\n" +
                "•\tVoucher harus digunakan sesuai dengan Hari Pemakaian yang dipilih.\n" +
                "•\tDiwajibkan untuk melakukan reservasi terlebih dahulu ke Swiss Cafe sebelum kedatangan di nomor 061- 457 6999.\n" +
                "•\tKhusus tanggal 24 & 25 Desember 2017 voucher tidak berlaku.\n");
        promodata.add("•  Voucher seharga Rp 250.000,- net untuk Deal Weekday Packages for 1 Person (Sunday - Thursday).\n" +
                "Harga Normal: Rp 423,500,-\n" +
                "Romantic Deal Weekday Packages :\n" +
                "Package A\n" +
                "•\tNorwegian Salmon\n" +
                "•\tAmerican Keylime Tart\n" +
                "•\tOne Glass of Specialty Mocktail\n" +
                "Package B\n" +
                "•\tThe Edge Crabmeat Soup\n" +
                "•\tHalf Spring Chicken with Mashed Potatoes Vegetables Of the Day\n" +
                "•\tOne Glass of Specialty Mocktail\n" +
                "\n" +
                "•  Voucher seharga Rp 350.000,- net untuk Deal Weekend Packages for 1 Person (Friday - Saturday).\n" +
                "Harga Normal: Rp 544,500,-\n" +
                "Romantic Deal Weekend Packages :\n" +
                "\n" +
                "Package A\n" +
                "•\tGreen Salad with Herb and Crouton\n" +
                "•\tNorwegian Salmon with Vegetables and Potatoes\n" +
                "•\tAmerican Keylime Tart\n" +
                "•\tOne Glass of Specialty Mocktail\n" +
                "Package B\n" +
                "•\tThe Edge Crabmeat Soup\n" +
                "•\tHalf Spring Chicken with Mashed Potatoes Vegetables Of the Day\n" +
                "•\tAmerican Keylime Tart\n" +
                "•\tOne Glass of Specialty Mocktail\n" +
                " \n" +
                "\n" +
                "\n" +
                "Note :\n" +
                "•\tDiwajibkan menghubungi pihak The Edge terlebih dahulu sebelum melakukan transaksi untuk mengetahui status ketersediaan reservasi pada tanggal yang diinginkan.\n" +
                "•\tDiwajibkan untuk melakukan reservasi terlebih dahulu ke The Edge di nomor 061 457 6999.\n" +
                "•\tPromo tidak berlaku di tanggal 24 Desember 2017.\n");
        promodata.add("•  Voucher seharga Rp 250.000,- net untuk Free Flow Cocktail - Per Pax\n" +
                "Harga Normal: Rp 600,000,-\n" +
                " \n" +
                "Note :\n" +
                "•\tPromo Hanya berlaku di Senin - Kamis.\n");
        return promodata;
    }
    //array data higlihts untuk semua detil
    public static ArrayList<String> getHighdata(){
        highdata = new ArrayList<String>();
        highdata.add("Morning Glory Coffee adalah tempat hangout yang wajib dikunjungi dengan suasana tempat yang berkonsep klasik sehingga cocok dijadikan tempat berkumpul bersama teman. Dan tidak itu saja, menu diolah oleh chef profesional dengan bahan-bahan berkualitas dan fresh setiap harinya.\n" +
                "•\tPelayanan yang ramah.\n" +
                "•\tTersedia lokasi indoor dan outdoor yang dilengkapi dengan taman.\n");
        highdata.add("Bondi Spa Medan merupakan tempat spa yang sudah terkenal di kota Medan dan kini hadir kembali di dealmedan.com untuk memberikan promo treatment khusus untuk kamu semua.\n" +
                "•\tLokasi strategis dengan tempat yang bersih dan nyaman.\n" +
                "•\tPelayanan ramah dan didukung oleh therapist yang berpengalaman.\n" +
                "•\tTersedia paket untuk perawatan wajah, cellulite dan juga spa.\n" +
                "•\tTreatment Khusus untuk Wanita.\n");
        highdata.add("Diolah dengan menggunakan bahan-bahan berkualitas oleh Chef Pastry Hotel yang sudah berpengalaman di bidangnya. Cake lembut dengan rasa lezat dan di-garnish indah mengelilingi cake.\n" +
                "•\tCake dengan citarasa terbaik.\n" +
                "•\tCocok untuk dinikmati bersama keluarga dan sahabat sebagai hadiah perayaan momen-momen penting.\n");
        highdata.add("Mie Ayam Jamur H. Mahmud S. merupakan tempat makan yang mengandalkan menu mie ayam jamur yang membuat kamu ketagihan untuk mencobanya, karena kini menghadirkan paket pilihan 4 menu favorit dari mie ayam H. Mahmud.\n" +
                "•\tMakanan yang disajikan HALAL.\n" +
                "•\tDapat dinikmati oleh semua kalangan, anak-anak maupun dewasa.\n" +
                "•\tPaket makan berempat yang dapat dinikmati bersama teman, maupun keluarga.\n" +
                "•\tLokasi strategis dan mudah ditemukan dengan suasana yang nyaman dan bersih.\n");
        highdata.add("•\tDiolah secara bersih dan higienis.\n" +
                "•\tMenu makan yang disajikan fresh dan dibuat oleh Chef Profesional.\n" +
                "•\tFree Delivery untuk Medan Kota (konfirmasi untuk daerah Anda).\n" +
                "•\tUntuk Delivery harap melakukan konfirmasi alamat terlebih dahulu dan pertanyaan lebih lanjut boleh langsung menghubungi pihak via LINE : sellinathan // BB : 573CE30C.\n");
        highdata.add("Caroline J'Bistro & Cafe merupakan tempat nongkrong terbaru di Jl Ayahanda, View Cafe terbagi dua yakni indoor dan outdoor.\n" +
                "•\tUntuk Indoor Caroline J'Bistro & Cafe menyediakan nuansa hello kitty.\n" +
                "•\tRuangan Indoor Ber-AC.\n" +
                "•\tUntuk Outdoor Caroline J'Bistro & Cafe menyediakan meja payung dan tenda sehingga anda nyaman dan senang.\n");
        highdata.add("Dante Coffee Shop merupakan lokasi yang terletak di Ruko Centre Point Blok G No. II Medan ini hadir kembali di dealmedan.com untuk memberikan promo paket makan hemat 2 orang.\n" +
                "•\tMenu nusantara yang lezat dengan interior klasik yang menawan.\n" +
                "•\tTempat yang nyaman dan strategis.\n" +
                "•\tCocok disantap bersama keluarga dan sahabat.\n" +
                "•\tFree WIFI.\n");
        highdata.add("Tong's Soya Milk & Beancurd merupakan salah satu restoran yang sudah cukup lama berdiri di kota Medan dan salah satu tempat yang digemari untuk berkumpul bersama keluarga maupun teman.\n" +
                "Tong's Soya Milk & Beancurd terkenal dengan Soya Milknya, disini soya milk dibuat fresh tanpa bahan pengawet dan pewarna setiap harinya. \n" +
                "•\tTempat yang nyaman & cozy dengan suasana santai yang sangat cocok dijadikan tempat Hangout bersama teman.\n" +
                "•\tRestoran yang memang terkenal dengan speciality di Soya Milk.\n" +
                "•\tVoucher dapat dipakai setiap hari.\n" +
                "Jangan sampai terlewatkan deal istimewa yang satu ini.\n");
        highdata.add("FOOD TEN Resto Garden & Coffee Shop tempat tongkrongan baru dikota Medan, tepatnya di Jalan Tapanuli No 109. Memberikan pelayanan yang memuaskan dan tidak kalah dengan menu-menu spesial untuk paket berempat, berenam dan bersepuluh.");
        highdata.add("Nikmati Promo Entertainment ini yang cocok untuk anak-anak muda yang suka seru-seruan, rasakan sensasi yang memicu adrenalin ini bersama teman-teman, kolega dan orang terdekat kamu. \n" +
                "•\tTicket All You Can Play berlaku untuk Tiket Masuk ke Funland, dan Bermain Sepuasnya di Lebih 35 Jenis Wahana & Video Games.\n" +
                "•\tTiket Tidak termasuk Coin Games, Redemptions, Carnival Games & Paint Ball.\n" +
                "•\tAnak- anak Tinggi Badan di Bawah 90 Cm dan Lansia ( Usia Minimal 61 Tahun ). Di Bebaskan dari Tiket Masuk ke Funland.\n" +
                "•\tTaatilah Setiap Aturan - aturan di Setiap Permainan Demi Keselamatan.\n" +
                "•\tManajemen di Lepaskan dari Tuntutan Akibat Kondisi Cuaca yang Tidak Mengijinkan untuk Mengoperasian Beberapa Permainan.\n" +
                "•\tManajemen Berhak Menutup Pemainan Sewaktu-waktu dengan Alasan Keamanan tanpa Adanya Pemberitahuan Sebelumnya.\n" +
                "•\tManajemen di Lepaskan dari Segala Tuntutan dan Tanggung Jawab Akibat Kerugian yang di Timbulkan dari Insiden yang terjadi, tidak dikecualikan terhadap Kehilangan Barang-barang Bawaan.\n" +
                "•\tTempat Bermain Terbesar di Kota Medan.\n" +
                "•\t1 Tiket berlaku untuk 1 Orang.\n");
        highdata.add("JPP Skin Center menerapkan teknik terkini dari Singapura dengan menggabungkan teknologi laser & sinar terbaru dari Amerika dan Jepang yang akan membersihkan pori-pori dan merangsang produksi kolagen sehingga dapat meremajakan kulit kamu sehingga kulit terlihat kencang, cerah dan lebih sehat. Tidak hanya meremajakan kulit, tetapi juga terbukti untuk mengatasi masalah kulit seperti jerawat, pori-pori dan pigmentasi.\n" +
                "JPP Skin Center menerapkan teknologi terkini dan memiliki dokter yang sudah berakreditasi di bidangnya dan sudah memiliki 11 cabang di Indonesia, dan di Medan berada di Sun Plaza Level 1 No B22.\n" +
                "Laser and light tretament untuk Underarm :\n" +
                "Perawatan Hair Removal digunakan untuk mengatasi rambut yang tidak diinginkan. Dimana laser akan menghancurkan pigmen yang terdapat pada rambut tersebut, mematikan akar rambutnya dan mencerahkan warna kulitnya. Sehingga, selain mendapatkan warna kulit yang lebih cerah, rambut yang tidak diinginkan tersebut akan tumbuh lebih lama dan lebih halus. Selain itu perawatan laser juga dapat digunakan untuk mengatasi masalah kulit wajah seperti jerawat, pori-pori & pigmentasi dalam 1x perawatan. Perawatan hair removal dilakukan dalam 1 kali perawatan dimana perawatan ini membantu membunuh bakteri, membersihkan pori-pori, kotoran dengan durasi 10-15 menit tanpa meninggalkan luka, bekas merah berkelanjutan, ataupun pengelupasan.\n" +
                "\n" +
                "\n" +
                "Hydrofacial (Deep Clean) :\n" +
                "Perawatan terbaru dari JPP adalah Deep Clean Facial (Hydro Facial) untuk wajah. Deep Clean facial merupakan perawatan facial dengan menggunakan teknologi terkini dengan 3 cairan khusus untuk menutrisi kulit wajah Anda. Hasil maksimal dengan kombinasi dengan Laser & Sinar Wajah. Treatment menggunakan bahan yang sangat aman dan dilakukan oleh dokter profesional yang berpengalaman. \n");
        highdata.add("Arirang Korean Food adalah cafe yang menyediakan berbagai makanan korean, mulai dari paket ber-dua hingga ber-empat yang pastinya sangat cocok di nikmati bersama teman maupun keluarga.\n" +
                "•\tSuasana tempat yang nyaman.\n" +
                "•\tMenggunakan bahan berkualitas.\n" +
                "•\tLokasi di Jalan Cemara Asri (Ruko Shopie Square No. 28 B/Dekat Bundaran).\n" +
                "•\tPromo Non-Halal.\n");
        highdata.add("Decoco Coffee Shop merupakan Restaurant & Cafe yang menyediakan menu-menu speciality yang menarik\n" +
                "•\tPaket Promosi menarik yang di siapkan oleh Koki Profesional.\n" +
                "•\tWIfi Area.\n" +
                "•\tBerlokasi di Jalan Candi Prambanan No.16, Petisah Tengah, Medan Petisah, Kota Medan, Sumatera Utara 20236.\n");
        highdata.add("Menu makanan yang bervariasi dari mancanegara, sudah termasuk main course, drink dan dessert, dan selalu disajikan fresh oleh chef profesional hotel bintang 5 dan untuk rasa sudah tidak diragukan lagi akan kelezatannya.\n" +
                "•\tMenggunakan bahan berkualitas.\n" +
                "•\tLokasi strategis dengan desain yang mewah, pastinya membuat moment lunch atau dinner Anda berkesan.\n" +
                "•\tCocok sebagai tempat arisan, reuni, ulang tahun ataupun event-event berharga lainnya.\n");
        highdata.add("•\tRestaurant tertinggi di kota Medan, The Edge berada di lantai 27 Grand Swiss-Belhotel.\n" +
                "•\tTersedia ruangan indoor dan outdoor pada rooftop sehingga memiliki view yang indah saat malam hari.\n" +
                "•\tCocok disantap bersama sahabat dan pasangan sambil memperingati momen spesial seperti ulang tahun, anniversary, dan reuni.\n" +
                "•\tBerlaku setiap hari mulai dari 19.00 - 22.00 WIB.\n");
        highdata.add("Free flow cocktail\n" +
                "Here’s to all the ladies and gentlemen who enjoy spirits cocktails, head over to The View every Monday to Thursday for a happy escape with IDR 250,000 net per person free flow cocktails on offer until 22:00 pm.\n" +
                "•\tThe View berada di lantai 26 Grand Swiss-belhotel.\n" +
                "•\tMenikmati matahari terbenam atau cahaya lampu malam.\n" +
                "•\tInterior modern dengan konsep lounge dan bar serta tersedia live music.\n" +
                "•\tCocok untuk Anda yang penat dengan pekerjaan sambil berkumpul bersama teman-teman.\n");

        return highdata;
    }
    //array  condition data untuk semua detil
    public static ArrayList<String> getConditiondata(){
        conditiondata = new ArrayList<String>();
        conditiondata.add("•\tVoucher berlaku Setiap hari.\n" +
                "•\tVoucher tidak berlaku untuk hari libur nasional. \n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours: \n" +
                "o\tSenin - Jumat    : 11.00 - 21.00 WIB.\n" +
                "o\tSabtu & Minggu : 11.00 - 15.00 WIB.\n" +
                "•\tVoucher hanya berlaku untuk makan ditempat.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada Morning Glory Coffee untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 22 November 2017 s/d 28 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n");
        conditiondata.add("•\tVoucher berlaku Setiap hari.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours \n" +
                "o\t09:00 - 18:00 WIB (last booking).\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada Bondi Spa Medan untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 22 November 2017 s/d 31 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tTreatment Khusus untuk Wanita.\n" +
                "•\tDiwajibkan untuk melakukan reservasi terlebih dahulu sebelum kedatangan di nomor 0822 9428 8138 // 061 8001 5540.\n" +
                "•\tVoucher tidak berlaku pada tanggal 25 Desember 2017.\n" +
                "•\tKhusus untuk pemakaian tanggal 31 Desember 2017 : 17:00 WIB (last booking).\n");
        conditiondata.add("•\tVoucher berlaku Setiap hari.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours \n" +
                "o\t10:00 - 19:00 WIB.\n" +
                "•\tVoucher hanya berlaku untuk takeaway.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada Hotel Emerald Garden Medan untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 24 November 2017 s/d 30 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tDiwajibkan untuk melakukan reservasi terlebih dahulu ke Hotel Emerald Garden minimal 2 hari sebelum pengambilan di nomor 061 - 661 1888 ext 8081.\n");
        conditiondata.add("•\tVoucher berlaku Setiap hari.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours \n" +
                "o\t11:00 - 21:00 WIB.\n" +
                "•\tVoucher berlaku untuk makan ditempat/takeaway.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada Mie Ayam Jamur H. Mahmud S. untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 22 November 2017 s/d 29 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tBerlaku makan di tempat atau delivery by kurir online dan takeaway.\n");
        conditiondata.add("•\tVoucher berlaku untuk hari Senin - Sabtu.\n" +
                "•\tVoucher tidak berlaku untuk hari libur nasional.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours \n" +
                "o\t10:00 - 14:00 WIB.\n" +
                "•\tVoucher hanya berlaku untuk delivery.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada Ayam Penyet Kalasan untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 25 November 2017 s/d 15 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tUntuk pemesanan diwajibkan reservasi 2 hari sebelum pengantaran.\n" +
                "•\tUntuk Delivery harap melakukan konfirmasi alamat terlebih dahulu dan pertanyaan lebih lanjut boleh langsung menghubungi pihak via LINE : sellinathan // BB : 573CE30C.\n" +
                "•\tFree Delivery untuk Medan Kota (Min 2 Pax).\n");
        conditiondata.add("•\tVoucher berlaku Setiap hari.\n" +
                "•\tVoucher tidak berlaku untuk hari libur nasional.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours \n" +
                "o\t11.00 - 22.00 WIB\n" +
                "•\tVoucher hanya berlaku untuk makan ditempat.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada Caroline J'Bistro & Cafe untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 23 November 2017 s/d 23 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tDemi kenyamanan customer, di sarankan reservasi terlebih dahulu sebelum kedatangan di nomor 061 - 8881 6550 // 0823 0425 3969.\n" +
                "•\tTanggal 28 November 2017 dan 12 Desember 2017 Tidak Buka.\n");
        conditiondata.add("•\tVoucher berlaku Setiap hari.\n" +
                "•\tVoucher tidak berlaku di tanggal 25 & 31 Desember 2017 & 01 Januari 2018.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours \n" +
                "o\t10:00 - 22:00 WIB.\n" +
                "•\tVoucher hanya berlaku untuk makan ditempat.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada Dante Coffee Shop untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 28 November 2017 s/d 05 Januari 2018.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tDiwajibkan untuk melakukan reservasi ke pihak Dante Coffee Shop sebelum kedatangan, untuk kenyamanan customer di nomor +6261 8050 1433 (untuk penukaran lebih dari 10 voucher).\n");
        conditiondata.add("•\tVoucher berlaku untuk Setiap Hari.\n" +
                "•\tVoucher tidak berlaku pada Hari Libur Nasional.\n" +
                "•\tOperational Hours: 12.00 - 21.00 WIB.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tVoucher dapat ditunjukkan via Gadget Anda atau diprint dan diberikan kepada pihak Tong's Soya Milk & Beancurd untuk penggunaan.\n" +
                "•\tVoucher hanya berlaku untuk makan ditempat.\n" +
                "•\tVoucher berlaku mulai dari tanggal 02 November s/d 15 Desember 2015. \n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat di refund, diextend masa berlakunya, ditukar ataupun diuangkan.\n");
        conditiondata.add("•\tVoucher berlaku untuk hari Senin - Sabtu.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours: \n" +
                "o\t11:00 - 15:00 WIB (Lunch). \n" +
                "o\t18:00 - 21:15 WIB (Dinner).\n" +
                "•\tVoucher hanya berlaku untuk makan ditempat.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada FOOD TEN Resto Garden & Coffee Shop untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 14 November 2017 s/d 19 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tVoucher tidak berlaku pada tanggal 28 November 2017.\n" +
                "•\tVoucher tidak berlaku untuk ruang VIP.\n" +
                "•\tDisarankan untuk melakukan reservasi terlebih dahulu di FOOD TEN Resto Garden & Coffee Shop 3 jam sebelum kedatangan di Nomor: 061 - 8881 3849 // 0822 7706 1184.\n");
        conditiondata.add("•\tVoucher berlaku Setiap Hari Jumat, Sabtu, Minggu.\n" +
                "•\tVoucher tidak berlaku pada Hari Libur Nasional ( 09 Maret 2016 & 25 Maret 2016 ).\n" +
                "•\tOperational Hours Jumat : 11.00 - 17.00 WIB.\n" +
                "•\tVoucher sudah termasuk Pajak Hiburan.\n" +
                "•\tVoucher bisa ditunjukan via Gagdet Anda atau diprint dan diberikan kepada pihak Mikie Holiday untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 26 Februari s/d 30 April 2016.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat di refund, diextend masa berlakunya, ditukar ataupun diuangkan.\n");
        conditiondata.add("•\tVoucher berlaku Setiap hari.\n" +
                "•\tVoucher tidak berlaku untuk hari libur nasional.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours \n" +
                "o\t11:00 - 21:30 WIB.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada JPP Skin Center untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 18 November 2017 s/d 30 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tVoucher hanya berlaku untuk Customer Baru (Customer yang tidak pernah melakukan treatment di JPP Skin Center).\n" +
                "•\tPemakaian Voucher hanya berlaku untuk Satu Orang per Voucher/Tidak Berlaku Kelipatan.\n" +
                "•\tDiwajibkan untuk melakukan reservasi terlebih dahulu ke JPP Skin 1 Hari sebelum kedatangan di nomor 061 450 1113 (Sun Plaza) // 061 8051 0206 (Centre Point).\n");
        conditiondata.add("•\tVoucher berlaku Setiap hari.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours \n" +
                "o\t11:00 - 22:00 WIB.\n" +
                "•\tVoucher hanya berlaku untuk makan ditempat.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada Arirang Korean Food untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 18 November 2017 s/d 18 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n");
        conditiondata.add("•\tVoucher berlaku Setiap hari.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational hours: \n" +
                "o\tSenin - Jumat : 17:00 - 21:00 WIB.\n" +
                "o\tSabtu - Minggu : 07:00 - 21:00 WIB.\n" +
                "•\tVoucher hanya berlaku untuk makan ditempat.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada DeCoco Coffee Shop untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 18 November 2017 s/d 18 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n");
        conditiondata.add("•\tVoucher hanya berlaku di hari Jumat, Sabtu & Minggu sesuai dengan voucher yang dibeli.\n" +
                "•\tVoucher tidak berlaku untuk Hari Libur Nasional.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours: \n" +
                "o\tLunch: 12.00 - 14.00 WIB.\n" +
                "o\tDinner: 19.00 - 21.00 WIB.\n" +
                "•\tVoucher hanya berlaku untuk makan ditempat.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada Grand Swiss-Belhotel Medan untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 17 November 2017 s/d 30 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tVoucher harus digunakan sesuai dengan Hari Pemakaian yang dipilih.\n" +
                "•\tDiwajibkan untuk melakukan reservasi terlebih dahulu ke Swiss Cafe sebelum kedatangan di nomor 061- 457 6999.\n" +
                "•\tKhusus tanggal 24 & 25 Desember 2017 voucher tidak berlaku.\n");
        conditiondata.add("•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n" +
                "•\tVoucher harus digunakan sesuai dengan Hari Pemakaian yang dipilih.\n" +
                "•\tDiwajibkan untuk melakukan reservasi terlebih dahulu ke Swiss Cafe sebelum kedatangan di nomor 061- 457 6999.\n" +
                "•\tKhusus tanggal 24 & 25 Desember 2017 voucher tidak berlaku.\n");
        conditiondata.add("•\tPromo berlaku untuk hari Senin - Kamis.\n" +
                "•\tVoucher tidak berlaku untuk hari libur nasional.\n" +
                "•\tVoucher sudah termasuk tax dan service.\n" +
                "•\tOperational Hours \n" +
                "o\t18:00 - 22:00 WIB.\n" +
                "•\tVoucher hanya berlaku untuk makan ditempat.\n" +
                "•\tVoucher bisa diprint atau ditunjukkan via gadget kepada The View untuk penggunaan.\n" +
                "•\tVoucher berlaku mulai dari tanggal 13 November 2017 s/d 28 Desember 2017.\n" +
                "•\tVoucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.\n" +
                "•\tVoucher tidak dapat digabungkan dengan promo lainnya dan tidak dapat diuangkan.\n");
        return conditiondata;
    }

    // disini saya melakukan looping untuk memasukan array notifdata ke model notificationdata
    public static ArrayList<NotificationData> getNotifData(){
        NotificationData a = new NotificationData();
        ArrayList<NotificationData> list = new ArrayList<>();

        for (int i = 0; i <notifdata.length; i++){
            a = new NotificationData();
            a.setName(notifdata[i][0]);
            a.setDesk(notifdata[i][1]);
            a.setPhoto(notifdata[i][2]);
            a.setTgl(notifdata[i][3]);
            a.setId(notifdata[i][4]);
            list.add(a);
        }
        return list;
    }

    // disini saya melakukan looping untuk mengambar data detil index ke berapa dari id yg akan diminta
    public static President getListDataDetail(String id){
        for (int i = 0; i <data.length; i++) {
            if(data[i][3].equals(id)){
                return insertData(data,i);
            }
        }
        return insertData(data,0);
    }
    //disini saya melakukan looping untuk memasukan seluruh data item deal medan ke model president, dan disini saya
    //meminta param keyword yg berguna untuk pencarian jika keyword tidak kosong makan pada saat looping saya melakun cek strin array
    //dengan string keyword jika sama baru saya masukan arrayny ke model
    public static ArrayList<President> getListData(String keyword,String tipe){
        String[][] data_arr = data;
        if(tipe.equals("makanan")){
            data_arr=data_makanan;
        }else if(tipe.equals("top")){
            data_arr=data_top;
        }

        President president = new President();
        ArrayList<President> list = new ArrayList<>();
        for (int i = 0; i <data_arr.length; i++) {
            if(keyword.equals("")){
                president = insertData(data_arr,i);
                list.add(president);
            }else{
                Log.d("=============",data_arr[i][0]);
                Log.d("=============",keyword);
                if((data_arr[i][0].toLowerCase().contains(keyword.toLowerCase()))){
                    president = insertData(data_arr,i);
                    list.add(president);
                    Log.d("=======s======",data_arr[i][0]);
                }
            }


        }

        return list;
    }


    //disini saya mengambik array ke berapa saja dari id save favorite yang saya simpan dicache
    public static ArrayList<President> getFavData(String[] id){
        President president = new President();
        ArrayList<President> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {

            for(int j=0;j<id.length;j++){
                if(id[j].equals(String.valueOf(i))){
                    president = insertData(data,i);
                    list.add(president);
                }
            }


        }

        return list;
    }

    public static President insertData(String[][] data, int i){
        President president = new President();
        president.setName(data[i][0]);
        president.setRemarks(data[i][1]);
        president.setPhoto(data[i][2]);
        president.setId(data[i][3]);
        return president;
    }
}
