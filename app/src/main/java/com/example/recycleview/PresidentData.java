package com.example.recycleview;

import com.example.recycleview.President;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][]{
            {"Dewa Wisnu", "Penguasa Arah Utara", "http://1.bp.blogspot.com/-deH0glsyx5I/UGe7hr0d94I/AAAAAAAAB8A/qkmb3o5GugA/s1600/6+wisnu.jpg","Dewa Wisnu merupakan penguasa arah utara (Uttara), bersenjata Chakra Sudarshana, warna Hitam, wahananya (kendaraan) Garuda, shaktinya Dewi Sri, aksara sucinya \"A\", di Bali dia dipuja di Pura Batur. Dalam ajaran agama Hindu, Wisnu (Dewanagari: विष्णु ; Viṣṇu) (disebut juga Sri Wisnu atau Nārāyana) adalah Dewa yang bergelar sebagai shtiti (pemelihara) yang bertugas memelihara dan melindungi segala ciptaan Brahman (Tuhan Yang Maha Esa). Dalam filsafat Hindu Waisnawa, Ia dipandang sebagai roh suci sekaligus dewa yang tertinggi. Namun dalam legenda lain, Dewa Brahma adalah Dewa Tertinggi. Dalam filsafat Adwaita Wedanta dan tradisi Hindu umumnya, Dewa Wisnu dipandang sebagai salah satu manifestasi Brahman dan enggan untuk dipuja sebagai Tuhan tersendiri yang menyaingi atau sederajat dengan Brahman."},
            {"Dewa Sambhu", "Penguasa Arah Timur Laut", "http://3.bp.blogspot.com/-WPz5UdENA_Y/UGe5hdfWCWI/AAAAAAAAB7Y/zJGVRgkzalA/s1600/7+sambhu.jpg","Dewa Sambhu merupakan penguasa arah timur laut (Ersanya), bersenjata Trisula, warna Biru, wahananya (kendaraan) Wilmana, shaktinya Dewi Mahadewi, aksara sucinya \"Wa\", di Bali dia dipuja di Pura Besakih."},
            {"Dewa Iswara", "Penguasa Arah Timur", "http://1.bp.blogspot.com/-URx_ZDXSHSA/UGe7cnJ-UiI/AAAAAAAAB74/KQQwVNV3L8g/s1600/5+sangkara.jpg","Dewa Iswara merupakan penguasa arah timur (Purwa), bersenjata Bajra, warna Putih, wahananya (kendaraan) gajah, shaktinya Dewi Uma, aksara sucinya \"Sa\", di Bali dia dipuja di Pura Lempuyang. Iswara (Dewanagari: ईश्वर; IAST: Īśvara) adalah sebuah konsep filosofis agama Hindu yang berarti \"pengendali/penguasa\" atau \"dewa\" menurut tradisi-tradisi Hindu teistik. Dalam bahasa Sanskerta, Iswara berarti \"Penguasa\". Contohnya Lokeswara (Loka + iswara) berarti penguasa dunia. Dalam tradisi Saiwa, penggunaan istilah \"Maheswara\" yang berarti penguasa agung, merujuk pada Dewa Siwa. Sedangkan dalam agama Buddha Mahayana, istilah ini terdapat pada nama salah satu Bodhisatwa yang terkenal dengan sifat cinta kasihnya yaitu \"Awalokiteswara\"."},
            {"Dewa Maheswara", "Penguasa Arah Tenggara", "http://4.bp.blogspot.com/-zuPJ4Da2AB4/UGe5TKLFZiI/AAAAAAAAB7Q/Yg8XJwWxj98/s1600/1+dupa.jpg","Dewa Maheswara merupakan penguasa arah tenggara (Gneyan), bersenjata Dupa, warna Dadu, wahananya (kendaraan) merak, shaktinya Dewi Lakshmi, aksara sucinya \"Na\", di Bali dia dipuja di Pura Goa Lawah."},
            {"Dewa Brahma", "Penguasa Arah Selatan", "http://3.bp.blogspot.com/-jayKstRaSBA/UGe63AVaf2I/AAAAAAAAB7g/gI6NR3oxlVE/s1600/2+brahma.jpg","Dewa Brahma merupakan penguasa arah selatan (Daksina), bersenjata Gada, warna Merah, wahananya (kendaraan) angsa, shaktinya Dewi Saraswati, aksara sucinya \"Ba\", di Bali dia dipuja di Pura Andakasa. Menurut ajaran agama Hindu, Brahma (Dewanagari: ब्रह्मा; IAST: Brahmā) adalah Dewa pencipta. Dalam filsafat Adwaita, ia dipandang sebagai salah satu manifestasi dari Brahman (sebutan Tuhan dalam konsep Hinduisme) yang bergelar sebagai Dewa pencipta. Dewa Brahma sering disebut-sebut dalam kitab Upanishad dan Bhagawadgita. Kata Brahma memiliki arti : yang tumbuh, berkembang, berevolusi, yang bertambah besar , yang meluap dari dirinya. Dalam beberapa sumber, Nama Dewa Brahma diidentikan dengan nama Agni (api)."},
            {"Dewa Rudra", "Penguasa Arah Barat Daya", "http://4.bp.blogspot.com/-9myn7GFuYuY/UGe7Rd6gdgI/AAAAAAAAB7o/-m-LZCFXlrw/s1600/3+moksala.jpg","Dewa Rudra merupakan penguasa arah barat daya (Nairiti), bersenjata Moksala, warna Jingga, wahananya (kendaraan) kerbau, shaktinya Dewi Samodhi/Santani, aksara sucinya \"Ma\", di Bali dia dipuja di Pura Uluwatu."},
            {"Dewa Mahadewa", "Penguasa Arah Barat", "http://4.bp.blogspot.com/-dBC0T9CZxRM/UGe7Wjw5X9I/AAAAAAAAB7w/fTptQPd061I/s1600/4+mahadewa.jpg","Dewa Mahadewa merupakan penguasa arah barat (Pascima), bersenjata Nagapasa, warna Kuning, wahananya (kendaraan) Naga, shaktinya Dewi Sanci, aksara sucinya \"Ta\", di Bali dia dipuja di Pura Batukaru."},
            {"Dewa Sangkara", "Penguasa Arah Barat Laut", "http://4.bp.blogspot.com/-zuPJ4Da2AB4/UGe5TKLFZiI/AAAAAAAAB7Q/Yg8XJwWxj98/s1600/1+dupa.jpg","Dewa Sangkara merupakan penguasa arah barat laut (Wayabhya), bersenjata Angkus/Duaja, warna Hijau, wahananya (kendaraan) singa, shaktinya Dewi Rodri, aksara sucinya \"Si\", di Bali dia dipuja di Pura Puncak Mangu."},
            {"Dewa Siwa", "Penguasa Arah Tengah", "http://3.bp.blogspot.com/-lfUuuFAY85g/UGe7mRfVXzI/AAAAAAAAB8I/aW5oglRJKnU/s1600/bhatara+guru1.jpg","Dewa Siwa merupakan penguasa arah tengah (Madhya), bersenjata Padma, warna Pancawarna, wahananya (kendaraan) Lembu Nandini,senjata Padma shaktinya Dewi Durga (Parwati), aksara sucinya \"I\" dan \"Ya\", di Bali dia dipuja di Pura Pusering Jagat. Siwa (Dewanagari: शिव; IAST: Śiva) adalah salah satu dari tiga dewa utama (Trimurti) dalam agama Hindu. Kedua dewa lainnya adalah Brahma dan Wisnu. Dalam ajaran agama Hindu, Dewa Siwa adalah dewa pelebur, bertugas melebur segala sesuatu yang sudah usang dan tidak layak berada di dunia fana lagi sehingga harus dikembalikan kepada asalnya."}
    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (String[] aData : data) {
            president = new President();
            president.setName(aData[0]);
            president.setRemarks(aData[1]);
            president.setPhoto(aData[2]);
            president.setDescription(aData[3]);

            list.add(president);
        }

        return list;
    }
}