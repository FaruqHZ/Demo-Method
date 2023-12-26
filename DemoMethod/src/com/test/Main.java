package com.test;

import static com.test.Buku.daftarBuku;

public class Main{

    public static void main(String[] args) {

        Buku bukulautbercerita = new Buku("Laut Bercerita", "Leila S. Chudori", new String[] {"Drama", "Fiksi"}, "/img/img-lautbercerita.jpg",
                "Laut Bercerita, novel terbaru Leila S. Chudori, bertutur tentang kisah keluarga yang kehilangan, sekumpulan sahabat yang merasakan kekosongan di dada, sekelompok orang yang gemar menyiksa dan lancar berkhianat, sejumlah keluarga yang mencari kejelasan makam anaknya, dan tentang cinta yang tak akan luntur.");

        Buku harrypotterG = new Buku("Harry Potter and The Prisoner of Azkaban – Gryffindor", "J. K. Rowling", new String[] {"Fantasi", "Petualangan"}, "/img/img-harrypotterG.jpg",
                "Dalam edisi spesial \"Harry Potter and The Prisoner of Azkaban – Gryffindor,\" para pembaca diajak kembali merasakan keajaiban dunia sihir dengan karakter-karakter mulia dari Rumah Gryffindor di Hogwarts. Perayaan ulang tahun ke-20 dari publikasi pertama membawa kembali tahun ketiga Harry di Hogwarts yang penuh momen-momen mendebarkan, dengan tampilan warna khas rumah Gryffindor dan karya seni sampul yang memukau. Pengantar menarik mengungkap sejarah rumah ini, sementara wawasan eksklusif tentang Mantra Patronus dan gambar-gambar spektakuler oleh Levi Pinfold menambah daya tarik. Edisi ini tidak hanya memberikan pengalaman membaca yang mengesankan, tetapi juga dirancang untuk dikoleksi, merayakan keunikan Rumah Gryffindor dan menghidupkan kembali nostalgia magis di Hogwarts bagi para penggemar setia. Bagi mereka yang bermimpi menjadi Gryffindor, buku ini adalah must-have, membawa kembali kenangan duduk di bawah Topi Seleksi dengan harapan mendengar kata-kata ajaib, \"Lebih baik menjadi Gryffindor!\"");

        Buku harrypotterS1 = new Buku("Harry Potter and The Prisoner of Azkaban – Slytherin", "J. K. Rowling", new String[] {"Fantasi", "Petualangan"}, "/img/img-harrypotterS1.jpg",
                "Edisi Rumah Slytherin dari \"Harry Potter and The Prisoner of Azkaban\" merayakan ulang tahun ke-20 dengan kebanggaan, ambisi, dan kelicikan karakter Slytherin di Hogwarts, menggambarkan momen-momen mendebarkan tahun ketiga Harry, termasuk upaya licik Draco Malfoy untuk menyabotase Gryffindor. Dengan tampilan warna Slytherin yang khas, karya seni sampul yang indah, pengantar yang menarik, dan wawasan eksklusif, buku ini mempersembahkan gambar spektakuler oleh Levi Pinfold dari Severus Snape dengan patronusnya. Sebagai bagian dari House Editions, buku ini dirancang untuk dikoleksi, merayakan keunikan Rumah Slytherin, dan menjadi must-have bagi penggemar yang bermimpi menjadi anggota Slytherin di Hogwarts.");

        Buku harrypotterS2 = new Buku("Harry Potter And The Order Of The Phoenix - Slytherin", "J. K. Rowling", new String[] {"Fantasi", "Petualangan"}, "/img/img-harrypotterS2.jpg",
                "Edisi Rumah Slytherin dari \"Harry Potter and The Order of the Phoenix\" merayakan ulang tahun ke-20, menggambarkan karakter Slytherin dengan kebanggaan, ambisi, dan kelicikan di Hogwarts. Dengan tampilan warna khas Slytherin, karya seni sampul yang indah, serta pengantar dan wawasan eksklusif, buku ini menampilkan gambar spektakuler oleh Levi Pinfold dan dirancang khusus untuk dikoleksi, merayakan keunikan Rumah Slytherin di Hogwarts.");

        Buku bukucelts = new Buku("Celts: Sejarah dan Warisan Salah Satu Kebudayaan Tertua di Eropa", "Martin J. Dougherty", new String[] {"Sejarah"}, "/img/img-celtssejarahdanwarisansalahsatukebudayaantertuadieropa.jpg",
                "Sejak lama, orang-orang Celt menjadi subjek yang mendapatkan ketertarikan luar biasa, spekulasi, dan kesalahpahaman. Sebelum orang-orang Viking. Anglo-Saxons, dan Kerajaan Roma, para Celt mendominasi bagian pusat dan barat Eropa, tetapi siapakah sebenarnya orang-orang Celts ini, dan bagaimana persepsi kita tentang mereka terus berubah sepanjang sejarah");

//        harrypotterS1.cekPenulis(daftarBuku);
        harrypotterS1.cekGenre(daftarBuku);
        harrypotterS1.cekPenulisDFS(daftarBuku);
        harrypotterS1.rekomendasi(daftarBuku);




    }
}