package com.tugas.frontendapp.data

import com.tugas.frontendapp.R
import com.tugas.frontendapp.model.Anime
import com.tugas.frontendapp.model.Manga
import com.tugas.frontendapp.model.Movie

object DummyData {
    val Animes = listOf(
        Anime(
            id = 1,
            name = "Sousou no Frieren",
            score = 9.37F,
            ranked = 1,
            studio = "Madhouse",
            synopsis = "Selama pencarian mereka selama satu dekade untuk mengalahkan Raja Iblis, para anggota kelompok pahlawan Himmel sendiri, pendeta Heiter, prajurit kurcaci Eisen, dan penyihir elf Frieren—menjalin ikatan melalui petualangan dan pertempuran, menciptakan kenangan berharga yang tak terlupakan bagi sebagian besar orang. dari mereka.\n" +
                    "\n" +
                    "Namun, waktu yang dihabiskan Frieren bersama rekan-rekannya hanya setara dengan sebagian kecil dari hidupnya, yang telah berlangsung lebih dari seribu tahun. Ketika partainya bubar setelah kemenangan mereka, Frieren dengan santai kembali ke rutinitas \"biasa\" mengumpulkan mantra di seluruh benua. Karena perasaannya terhadap waktu yang berbeda, dia tampaknya tidak memiliki perasaan yang kuat terhadap pengalaman yang dia lalui.\n" +
                    "\n" +
                    "Seiring berlalunya waktu, Frieren perlahan-lahan menyadari bagaimana hari-harinya di pesta pahlawan benar-benar memengaruhi dirinya. Menyaksikan kematian dua mantan temannya, Frieren mulai menyesal telah menganggap remeh kehadiran mereka; dia bersumpah untuk lebih memahami manusia dan menciptakan hubungan pribadi yang nyata. Meskipun kisah perjalanan yang penuh kenangan itu telah lama berakhir, sebuah kisah baru akan segera dimulai.",
            photo = R.drawable.frieren
        ),
        Anime(
            id = 2,
            name = "Fullmetal Alchemist",
            score = 9.09f,
            ranked = 2,
            studio = "TBones",
            synopsis = "Dua bersaudara mencari Batu Bertuah setelah upaya untuk menghidupkan kembali mendiang ibu mereka menjadi kacau dan meninggalkan mereka dalam bentuk fisik yang rusak.\n" +
                    "\n" +
                    "Dua bersaudara kehilangan ibu mereka karena penyakit yang tidak dapat disembuhkan. Dengan kekuatan alkimia, mereka menggunakan pengetahuan tabu untuk membangkitkannya kembali. Prosesnya gagal, dan sebagai akibat dari penggunaan alkimia jenis ini, sang kakak, Edward Elric kehilangan kaki kirinya sementara sang adik, Alphonse Elric kehilangan seluruh tubuhnya. Untuk menyelamatkan saudaranya, Edward mengorbankan lengan kanannya dan mampu membubuhkan jiwa saudaranya ke baju zirah. Dengan bantuan seorang teman keluarga, Edward menerima anggota badan logam - automail - untuk menggantikan yang hilang. Dengan itu, Edward bersumpah untuk mencari Batu Bertuah untuk mengembalikan saudara-saudaranya ke tubuh aslinya, meskipun itu berarti menjadi Alkemis Negara, seseorang yang menggunakan alkimianya untuk militer.\n" +
                    "\n" +
                    "Ketika dua saudara laki-laki gagal membangkitkan ibu mereka yang telah meninggal, mengakibatkan yang termuda kehilangan tubuhnya dan yang tertua kehilangan lengan dan kakinya, mereka akhirnya bergabung dengan militer dengan harapan menemukan Batu Bertuah, yang dapat mengembalikan tubuh mereka yang hilang.\n" +
                    "\n" +
                    "Ditinggalkan oleh ayah mereka saat masih kecil, dua adik laki-laki, Edward dan Alphonse Elric tinggal bersama ibu mereka di sebuah kota kecil bernama Resembool. Setelah kehilangan ibu mereka karena penyakit mematikan, mereka mencoba menghidupkannya kembali menggunakan alkimia - ilmu yang memungkinkan Anda mengubah materi fisik dari satu bentuk ke bentuk lainnya. Namun transmutasi manusia dilarang keras karena tidak dapat dilakukan dengan sukses. Kebangkitan ibu mereka gagal menyebabkan Edward kehilangan kaki kirinya dan Alphonse seluruh tubuhnya. Edward berhasil menyelamatkan jiwa Alphonse dengan mengikatnya ke baju zirah dengan mengorbankan lengan kanannya. Bertekad untuk memulihkan tubuh mereka, Edward bergabung dengan militer sebagai alkemis negara dan saudara-saudara mulai mencari batu bertuah. Selama perjalanan mereka, mereka menemukan kebenaran tentang sejarah negara tersebut, dan konspirasi di tingkat militer yang lebih tinggi dan mengambil tindakan untuk menyelamatkan masa depan negara.\n" +
                    "\n" +
                    "Setelah seorang ibu meninggal dan kedua putranya berusaha menghidupkannya kembali menggunakan teknik Alkimia terlarang, saudara laki-laki Edward dan Alphonse Elric harus menanggung akibatnya - yang satu kehilangan seluruh tubuhnya, dan yang lainnya kehilangan lengan dan kaki. Sekarang, keduanya harus berusaha keras dan memulai petualangan yang luar biasa dan berbahaya untuk mendapatkan kembali seluruh tubuh mereka - bahkan jika itu berarti menggunakan lebih banyak Alkimia dan membuat beberapa musuh di jalan.",
            photo = R.drawable.fullmetal
        ),
        Anime(
            id = 3,
            name = "Steins;Gate",
            score = 9.07F,
            ranked = 3,
            studio = "White Fox",
            synopsis = "Ilmuwan eksentrik Rintarou Okabe memiliki rasa haus yang tiada habisnya akan eksplorasi ilmiah. Bersama temannya yang bodoh namun bermaksud baik, Mayuri Shiina, dan teman sekamarnya Itaru Hashida, Okabe mendirikan Laboratorium Gadget Masa Depan dengan harapan dapat menciptakan inovasi teknologi yang membingungkan jiwa manusia. Terlepas dari klaim keagungannya, satu-satunya \"gadget\" penting yang diciptakan ketiganya adalah microwave yang memiliki kekuatan menakjubkan untuk mengubah pisang menjadi cairan hijau.\n" +
                    "\n" +
                    "Namun, ketika Okabe menghadiri konferensi tentang perjalanan waktu, dia mengalami serangkaian kejadian aneh yang membuatnya percaya bahwa ada lebih banyak hal di gadget \"Phone Microwave\" daripada yang terlihat. Rupanya mampu mengirim pesan teks ke masa lalu menggunakan microwave, Okabe mencoba lebih jauh dengan \"mesin waktu\", yang menarik kemarahan dan perhatian organisasi misterius SERN.\n" +
                    "\n" +
                    "Karena penemuan baru ini, Okabe dan teman-temannya berada dalam bahaya yang selalu ada. Saat ia berupaya mengurangi kerusakan yang disebabkan oleh penemuannya terhadap garis waktu, Okabe berjuang tidak hanya untuk menyelamatkan orang-orang yang dicintainya tetapi juga untuk menjaga kewarasannya yang merosot.",
            photo = R.drawable.steinsgate
        ),
        Anime(
            id = 4,
            name = "Gintama°",
            score = 9.06F,
            ranked = 4,
            studio = "Bandai Namco Pictures",
            synopsis = "Gintoki, Shinpachi, dan Kagura kembali sebagai anggota tim Yorozuya yang suka bersenang-senang namun gagal! Hidup di realitas alternatif Edo, di mana pedang dilarang dan penguasa asing telah menaklukkan Jepang, mereka berusaha untuk melakukan pekerjaan apa pun yang bisa mereka lakukan. Namun, Shinpachi dan Kagura masih belum dibayar... Apakah Gin-chan benar-benar menghabiskan semua uang itu untuk bermain pachinko?\n" +
                    "\n" +
                    "Sementara itu, ketika Gintoki dalam keadaan mabuk terhuyung-huyung pulang ke rumah pada suatu malam, sebuah pesawat luar angkasa asing jatuh di dekatnya. Seorang anggota kru yang terluka parah muncul dari kapal dan memberi Gintoki perangkat aneh berbentuk jam, memperingatkannya bahwa perangkat itu sangat kuat dan harus dijaga. Karena salah mengira itu sebagai jam alarmnya, Gintoki mulai menghancurkan perangkat itu keesokan paginya dan tiba-tiba menemukan bahwa dunia di luar apartemennya terhenti. Dengan Kagura dan Shinpachi di sisinya, dia berangkat untuk memperbaiki perangkatnya; namun, seperti biasa, tidak ada yang sesederhana itu bagi tim Yorozuya.\n" +
                    "\n" +
                    "Dipenuhi dengan humor yang menggugah selera dan momen-momen emosi yang menyentuh hati, musim keempat Gintama menampilkan Gintoki dan teman-temannya menghadapi kesialan paling lucu dan krisis paling berbahaya yang pernah ada.",
            photo = R.drawable.gintama
        ),
        Anime(
            id = 5,
            name = "Shingeki no Kyojin",
            score = 9.05F,
            ranked = 5,
            studio = "Wit Studio",
            synopsis = "Berusaha memulihkan harapan umat manusia yang semakin berkurang, Korps Survei memulai misi untuk merebut kembali Tembok Maria, tempat pertempuran melawan \"Titan\" yang kejam kembali terjadi.\n" +
                    "\n" +
                    "Kembali ke Distrik Shiganshina yang compang-camping yang dulunya adalah rumahnya, Eren Yeager dan Korps menemukan kota itu anehnya tidak dihuni oleh para Titan. Bahkan setelah gerbang luar ditutup, anehnya mereka tidak menemui perlawanan. Misi tersebut berjalan lancar sampai Armin Arlert, yang sangat curiga terhadap ketidakhadiran musuh, menemukan tanda-tanda buruk dari rencana potensial melawan mereka.\n" +
                    "\n" +
                    "Shingeki no Kyojin Musim 3 Bagian 2 mengikuti Eren saat dia bersumpah untuk mengambil kembali semua yang pernah menjadi miliknya. Di sampingnya, Survey Corps berusaha—melalui pengorbanan yang tak terhitung jumlahnya—untuk mengukir jalan menuju kemenangan dan mengungkap rahasia yang terkunci di ruang bawah tanah keluarga Yeager.",
            photo = R.drawable.shingeki
        ),
        Anime(
            id = 6,
            name = "Gintama: The Final",
            score = 9.04F,
            ranked = 6,
            studio = "Bandai Namco Pictures",
            synopsis = "Dua tahun telah berlalu setelah invasi Tendoshuu ke Terminal Pusat O-Edo. Sejak itu, Yorozuya berpisah. Meramalkan kembalinya Utsuro, Gintoki Sakata mulai mengamati garis ley Bumi untuk mencari jejak Altana milik orang lain. Setelah bertemu dengan sisa-sisa Tendoshuu—yang terus mencari keabadian—Gintoki kembali ke Edo.\n" +
                    "\n" +
                    "Kemudian, Shinsengumi dan Yorozuya yang berkumpul kembali memulai serangan terhadap Terminal Pusat yang diduduki. Saat Altana tertimbun puing-puing kapal Tendoshuu yang terancam meledak, Yorozuya dan sekutunya melawan musuh-musuhnya sementara keselamatan Edo—dan seluruh dunia—dipertaruhkan. Memenuhi keinginan guru mereka, mantan murid Shouyou Yoshida bersatu dan menghidupkan kembali masa lalu mereka untuk terakhir kalinya dalam upaya menyelamatkan masa depan mereka.",
            photo = R.drawable.gintamafinal
        ),
        Anime(
            id = 7,
            name = "Hunter x Hunter",
            score = 9.04f,
            ranked = 7,
            studio = "Madhouse",
            synopsis = "Pemburu mengabdikan diri untuk menyelesaikan tugas-tugas berbahaya, mulai dari melintasi wilayah yang belum dipetakan di dunia hingga menemukan barang langka dan monster. Sebelum menjadi Hunter, seseorang harus lulus Ujian Hunter—sebuah proses seleksi berisiko tinggi di mana sebagian besar pelamar berakhir dengan cacat atau lebih buruk lagi, meninggal.\n" +
                    "\n" +
                    "Peserta ambisius yang menantang ujian terkenal ini memiliki alasannya sendiri. Apa yang mendorong Gon Freecss yang berusia 12 tahun adalah menemukan Ging, ayahnya, dan seorang Hunter sendiri. Percaya bahwa dia akan bertemu ayahnya dengan menjadi seorang Hunter, Gon mengambil langkah pertama untuk menempuh jalan yang sama.\n" +
                    "\n" +
                    "Selama Ujian Hunter, Gon berteman dengan mahasiswa kedokteran Leorio Paladiknight, Kurapika yang pendendam, dan mantan pembunuh Killua Zoldyck. Meskipun motif mereka sangat berbeda satu sama lain, mereka bersatu demi tujuan yang sama dan mulai menjelajah ke dunia yang penuh bahaya.",
            photo = R.drawable.hunter
        ),
        Anime(
            id = 8,
            name = "Gintama Season 2",
            score = 9.03F,
            ranked = 8,
            studio = "Sunrise",
            synopsis = "Setelah jeda satu tahun, Shinpachi Shimura kembali ke Edo, hanya untuk menemukan kejutan yang mengejutkan: Gintoki dan Kagura, sesama anggota Yorozuya, telah menjadi karakter yang sangat berbeda! Kabur dari markas Yorozuya dalam kebingungan, Shinpachi menemukan bahwa semua penghuni Edo telah mengalami perubahan ekstrem yang luar biasa, baik dalam penampilan maupun kepribadian. Yang paling luar biasa, saudara perempuannya, Otae, telah menikah dengan kepala Shinsengumi dan penguntit yang tidak tahu malu, Isao Kondou, dan sedang mengandung anak pertama mereka.\n" +
                    "\n" +
                    "Bingung, Shinpachi setuju untuk bergabung dengan Shinsengumi atas permintaan Otae dan Kondou dan menemukan transformasi yang lebih mengejutkan terjadi baik di dalam maupun di luar jajaran organisasi. Namun, mengetahui bahwa Wakil Kepala Toushirou Hijikata tetap tidak berubah, Shinpachi dan sekutunya yang tidak terduga, Shinsengumi, berangkat untuk mengembalikan kota Edo seperti yang mereka ingat.\n" +
                    "\n" +
                    "Dengan lebih banyak lelucon kotor, parodi yang tidak masuk akal, dan referensi yang tidak tahu malu, Gintama' mengikuti tim Yorozuya melalui lebih banyak kesialan mereka di dunia Edo yang penuh semangat dan penuh alien.",
            photo = R.drawable.gintama2
        ),
        Anime(
            id = 9,
            name = "Bleach",
            score = 9.02F,
            ranked = 9,
            studio = "Pierrot",
            synopsis = "Penuai Jiwa Pengganti Ichigo Kurosaki menghabiskan hari-harinya melawan Hollow, roh jahat berbahaya yang mengancam Kota Karakura. Ichigo menjalankan misinya bersama sekutu terdekatnya: Orihime Inoue, teman masa kecilnya yang memiliki bakat penyembuhan; Yasutora Sado, teman sekelas SMA-nya yang memiliki kekuatan super; dan Uryuu Ishida, saingan Quincy Ichigo.\n" +
                    "\n" +
                    "Rutinitas main hakim sendiri Ichigo terganggu oleh kemunculan tiba-tiba Asguiaro Ebern, seorang Arrancar berbahaya yang menandakan kembalinya Yhwach, raja Quincy kuno. Yhwach berupaya menyalakan kembali perseteruan berdarah bersejarah antara Soul Reaper dan Quincy, dan dia bertekad untuk menghapus dunia manusia dan Soul Society selamanya.\n" +
                    "\n" +
                    "Yhwach melancarkan invasi dua arah ke Soul Society dan Hueco Mundo, rumah Hollows dan Arrancar. Sebagai pembalasan, Ichigo dan teman-temannya harus bertarung bersama sekutu lama dan musuh untuk mengakhiri kampanye pembantaian Yhwach sebelum dunia berakhir.",
            photo = R.drawable.bleach
        ),
        Anime(
            id = 10,
            name = "Ginga Eiyuu",
            score = 9.02F,
            ranked = 10,
            studio = "Kitty Film Mitaka Studio",
            synopsis = "Kebuntuan selama 150 tahun antara dua negara adidaya antarbintang, Galactic Empire dan Free Planets Alliance, berakhir ketika generasi pemimpin baru muncul: jenius militer idealis Reinhard von Lohengramm, dan sejarawan pendiam FPA, Yang Wenli .\n" +
                    "\n" +
                    "Saat Reinhard naik pangkat di Kekaisaran dengan bantuan teman masa kecilnya, Siegfried Kircheis, dia tidak hanya harus berperang, tetapi juga sisa-sisa Dinasti Goldenbaum yang runtuh untuk membebaskan saudara perempuannya dari Kaiser dan menyatukan umat manusia di bawah satu kesatuan. penguasa sejati. Sementara itu, di sisi lain galaksi, Yang—yang merupakan pendukung kuat cita-cita demokrasi—harus tetap teguh pada keyakinannya, meski menghadapi kesulitan di FPA, dan menunjukkan kepada muridnya, Julian Mintz, bahwa otokrasi bukanlah solusi.\n" +
                    "\n" +
                    "Ketika ideologi-ideologi berbenturan di tengah banyaknya korban perang, kedua dalang strategis ini harus bertanya pada diri sendiri apa alasan sebenarnya di balik pertempuran mereka.",
            photo = R.drawable.ginga
        )
    )

    val Mangas = listOf(
        Manga(
            id = 1,
            name = "Berserk",
            photo = R.drawable.berserk,
            score = 9.47F,
            ranked = 1,
            published = "25 Agustus 1989",
            synopsis = "Guts, mantan tentara bayaran yang sekarang dikenal sebagai \"Pendekar Pedang Hitam\", ingin membalas dendam. Setelah masa kecil yang penuh gejolak, dia akhirnya menemukan seseorang yang dia hormati dan yakini dapat dia percayai, namun semuanya berantakan ketika orang tersebut mengambil segala sesuatu yang penting bagi Guts demi memenuhi keinginannya sendiri. Sekarang ditandai dengan kematian, Guts dijatuhi hukuman nasib di mana dia tanpa henti dikejar oleh makhluk iblis.\n" +
                    "\n" +
                    "Memulai pencarian mengerikan yang penuh dengan kemalangan, Guts, dipersenjatai dengan pedang besar dan kekuatan mengerikan, tidak akan membiarkan apa pun menghentikannya, bahkan kematian itu sendiri, sampai dia akhirnya mampu memenggal kepala orang yang menelanjanginya—dan miliknya. orang yang dicintai—tentang kemanusiaan mereka."

        ),
        Manga(
            id = 2,
            name = "JoJo no Kimyou",
            photo = R.drawable.jojo,
            score = 9.31F,
            ranked = 2,
            published = "19 Januari 2024",
            synopsis = "Di Amerika Old West, perlombaan terbesar di dunia akan segera dimulai. Ribuan orang mengantri di San Diego untuk melakukan perjalanan lebih dari enam ribu kilometer untuk mendapatkan kesempatan memenangkan hadiah utama lima puluh juta dolar. Dengan berakhirnya era kuda, kontestan diperbolehkan menggunakan kendaraan apa pun yang mereka inginkan. Para pesaing harus menanggung kondisi yang sangat melelahkan, melakukan perjalanan hingga seratus kilometer setiap hari melalui daerah terlantar yang belum dipetakan. Steel Ball Run benar-benar acara yang unik.\n" +
                    "\n" +
                    "Johnny Joestar yang masih muda, mantan pembalap kuda yang cacat, datang ke San Diego untuk menyaksikan dimulainya perlombaan. Di sana ia bertemu Gyro Zeppeli, seorang pembalap dengan dua bola baja di pinggangnya, bukan pistol. Johnny menyaksikan Gyro menggunakan salah satu bola bajanya untuk melepaskan kekuatan luar biasa, memaksa seorang pria menembakkan senjatanya ke dirinya sendiri selama duel. Di tengah aksinya, Johnny kebetulan menyentuh bola baja dan merasakan kekuatan mengalir di kakinya, sehingga dia bisa berdiri untuk pertama kalinya dalam dua tahun. Bersumpah untuk menemukan rahasia bola baja, Johnny memutuskan untuk berkompetisi dalam perlombaan, dan memulai petualangan anehnya melintasi Amerika di Steel Ball Run."
        ),
        Manga(
            id = 3,
            name = "Vegabond",
            photo = R.drawable.vegabond,
            score = 9.26F,
            ranked = 3,
            published = "03 September 1998",
            synopsis = "Di Jepang abad ke-16, Shinmen Takezou adalah seorang pemuda yang liar dan kasar, baik dalam penampilan maupun tindakannya. Sifat agresifnya telah membuatnya mendapat celaan dan ketakutan kolektif dari desanya, menyebabkan dia dan sahabatnya, Matahachi Honiden, melarikan diri untuk mencari sesuatu yang lebih megah daripada kehidupan provinsial. Pasangan ini mendaftar di tentara Toyotomi, mendambakan kejayaan—tetapi ketika Toyotomi menderita kekalahan telak di tangan Klan Tokugawa pada Pertempuran Sekigahara, teman-temannya nyaris tidak bisa bertahan hidup.\n" +
                    "\n" +
                    "Setelah keduanya berpisah, Shinmen kembali ke rumah dengan misi yang ditunjuk sendiri untuk memberi tahu keluarga Hon'iden tentang kelangsungan hidup Matahachi. Dia malah menemukan dirinya seorang penjahat yang dicari, dijebak atas dugaan pembunuhan temannya berdasarkan sejarah kekerasannya. Setelah ditangkap, dia digantung di pohon dan dibiarkan mati. Seorang biksu pengembara, Takuan Soho yang terhormat, merasa kasihan pada \"anak iblis\", diam-diam membebaskan Shinmen dan membaptisnya dengan nama baru untuk menghindari pengejaran pihak berwenang: Musashi Miyamoto.\n" +
                    "\n" +
                    "Vagabond adalah kisah fiktif yang menceritakan kembali kehidupan salah satu pendekar pedang paling terkenal di Jepang, \"Pedang Suci\" Musashi Miyamoto—kebangkitannya dari seorang pendekar pedang yang tidak memiliki keinginan selain menjadi \"Tak Terkalahkan di Bawah Langit\" menjadi seorang pejuang tercerahkan yang perlahan-lahan mempelajarinya. pentingnya teman dekat, refleksi diri, dan kehidupan itu sendiri."
        ),
        Manga(
            id = 4,
            name = "One Piece",
            photo = R.drawable.onepiece,
            score = 9.22F,
            ranked = 4,
            published = "22 July 1997",
            synopsis = "Gol D. Roger, seorang pria yang disebut sebagai \"Raja Bajak Laut\", akan dieksekusi oleh Pemerintah Dunia. Namun sebelum kematiannya, dia mengkonfirmasi keberadaan harta karun besar, One Piece, yang terletak di suatu tempat di lautan luas yang dikenal sebagai Grand Line. Mengumumkan bahwa One Piece dapat diklaim oleh siapa pun yang cukup layak untuk mencapainya, Raja Bajak Laut dieksekusi dan Zaman Bajak Laut Hebat dimulai.\n" +
                    "\n" +
                    "Dua puluh dua tahun kemudian, seorang pemuda bernama Monkey D. Luffy siap memulai petualangannya sendiri, mencari One Piece dan berusaha menjadi Raja Bajak Laut yang baru. Hanya berbekal topi jerami, perahu kecil, dan tubuh elastis, ia memulai perjalanan fantastis untuk mengumpulkan krunya sendiri dan kapal yang layak yang akan membawa mereka melintasi Grand Line untuk mengklaim status terhebat di laut lepas."
        ),
        Manga(
            id = 5,
            name = "Monster",
            photo = R.drawable.monster,
            score = 9.16F,
            ranked = 5,
            published = "05 Desember 1994",
            synopsis = "Kenzou Tenma, seorang ahli bedah saraf terkenal Jepang yang bekerja di Jerman pascaperang, menghadapi pilihan sulit: mengoperasi Johan Liebert, seorang anak yatim piatu yang berada di ambang kematian, atau pada walikota Düsseldorf. Pada akhirnya, Tenma memutuskan untuk mempertaruhkan reputasinya dengan menyelamatkan Johan, yang secara efektif membiarkan walikota mati.\n" +
                    "\n" +
                    "Sebagai konsekuensi dari tindakannya, direktur rumah sakit Heinemann mencopot Tenma dari posisinya, dan putri Heinemann, Eva, memutuskan pertunangan mereka. Dipermalukan dan dijauhi oleh rekan-rekannya, Tenma kehilangan semua harapan untuk karier yang sukses—sampai pembunuhan misterius Heinemann memberinya kesempatan lagi.\n" +
                    "\n" +
                    "Sembilan tahun kemudian, Tenma menjadi kepala departemen bedah dan hampir menjadi direkturnya sendiri. Meskipun pada awalnya semuanya tampak baik-baik saja, dia segera terjerat dalam rantai pembunuhan mengerikan yang terjadi di seluruh Jerman. Pelakunya adalah monster—monster yang sama yang diselamatkan Tenma pada hari naas itu sembilan tahun lalu."
        ),
        Manga(
            id = 6,
            name = "Slam Dunk",
            photo = R.drawable.slamdunk,
            score = 9.09F,
            ranked = 6,
            published = "18 September 1990",
            synopsis = "Hanamichi Sakuragi, seorang remaja jangkung dan riuh dengan rambut merah menyala dan kekuatan fisik melebihi usianya, sangat ingin mengakhiri rentetan penolakannya selama 50 tahun dan akhirnya mendapatkan pacar saat ia memulai tahun pertamanya di SMA Shohoku. Namun, reputasi kenakalan dan sifat destruktifnya mendahuluinya, dan sebagian besar teman-temannya kemudian menghindarinya seperti wabah. Saat hari pertama sekolahnya berakhir, dia mempunyai dua pemikiran yang kuat: \"Aku benci bola basket\" dan \"Aku butuh pacar.\"\n" +
                    "\n" +
                    "Haruko Akagi, yang tidak mengetahui sejarah kelakuan buruk Hanamichi, menyadari tinggi badannya yang sangat besar dan tanpa sadar mendekatinya, menanyakan apakah dia suka bola basket atau tidak. Diatasi oleh kenyataan bahwa seorang gadis sedang berbicara kepadanya, raksasa berambut merah itu mengatakan ya meskipun perasaannya sebenarnya. Di gym, Haruko bertanya apakah dia bisa melakukan slam dunk. Meskipun seorang pemula, Hanamachi menguasai bola dan melakukan lompatan...tetapi melakukan overshoot, membenturkan kepalanya ke papan belakang. Kagum dengan kemampuan fisiknya yang nyaris tidak manusiawi, Haruko dengan cepat memberi tahu kapten bola basket sekolah tentang prestasinya. Dengan ini, Hanamichi tiba-tiba didorong ke dalam dunia persaingan untuk mendapatkan seorang gadis yang hampir tidak dikenalnya, tetapi dia segera menemukan bahwa mungkin ada lebih banyak hal dalam bola basket daripada yang pernah dia pikirkan."
        ),

        Manga(
            id = 7,
            name = "Vinland Saga",
            photo = R.drawable.vinlandm,
            score = 9.07F,
            ranked = 7,
            published = "13 April 2005",
            synopsis = "Thorfinn, putra salah satu pejuang terhebat Viking, adalah salah satu pejuang terbaik dalam kelompok tentara bayaran yang dipimpin oleh Askeladd yang licik, suatu prestasi yang mengesankan bagi orang seusianya. Namun, Thorfinn bukan bagian dari kelompok yang melakukan penjarahan—sebaliknya, karena telah menyebabkan tragedi besar bagi keluarganya, bocah itu bersumpah untuk membunuh Askeladd dalam duel yang adil. Belum cukup terampil untuk mengalahkannya, namun tidak mampu meninggalkan balas dendamnya, Thorfinn menghabiskan masa kecilnya dengan kru tentara bayaran, mengasah keterampilannya di medan perang di antara orang-orang Denmark yang suka perang, di mana membunuh hanyalah kesenangan hidup lainnya.\n" +
                    "\n" +
                    "Suatu hari, ketika Askeladd menerima kabar bahwa pangeran Denmark, Canute, telah disandera, dia menyusun rencana ambisius—rencana yang akan menentukan Raja Inggris berikutnya dan secara drastis mengubah kehidupan Thorfinn, Canute, dan dirinya sendiri. Bertempat di Eropa abad ke-11, Vinland Saga menceritakan sebuah epik berdarah di era di mana kekerasan, kegilaan, dan ketidakadilan tidak dapat dihindari, memberikan surga bagi orang-orang yang gila pertempuran dan neraka bagi orang-orang yang tinggal di dalamnya."
        ),
        Manga(
            id = 8,
            name = "Fullmetal Alchemist",
            photo = R.drawable.fullmetal,
            score = 9.04F,
            ranked = 8,
            published = "12 July 2001",
            synopsis = "Alkemis adalah individu berpengetahuan dan berbakat alami yang dapat memanipulasi dan memodifikasi materi berkat seni mereka. Namun meskipun terdapat banyak kemungkinan, alkimia tidaklah sekuat yang diyakini kebanyakan orang. Transmutasi manusia dilarang keras, dan siapa pun yang mencobanya berisiko mendapatkan konsekuensi yang parah. Meski begitu, kakak beradik Edward dan Alphonse Elric memutuskan untuk mengabaikan tabu besar ini dan menghidupkan kembali ibu mereka. Sayangnya, mereka tidak hanya gagal dalam membangkitkannya, mereka juga membayar harga yang sangat mahal atas kesombongan mereka: Edward kehilangan kaki kirinya dan Alphonse seluruh tubuhnya. Selanjutnya, Edward juga menyerahkan lengan kanannya untuk menyegel jiwa saudaranya ke dalam baju zirah.\n" +
                    "\n" +
                    "Bertahun-tahun kemudian, para alkemis muda melakukan perjalanan ke seluruh negeri untuk mencari Batu Bertuah, dengan harapan dapat memulihkan tubuh lama mereka dengan kekuatannya. Namun, pencarian mereka terhadap batu takdir juga membawa mereka pada mengungkap rahasia yang jauh lebih gelap dari yang pernah mereka bayangkan."
        ),
        Manga(
            id = 9,
            name = "Grand Blue",
            photo = R.drawable.grandblue,
            score = 9.03F,
            ranked = 9,
            published = "07 April 2014",
            synopsis = "Di tengah ombak laut dan sinar matahari yang bersinar di kota tepi laut Izu, Iori Kitahara baru saja memulai tahun pertamanya di Universitas Izu. Saat dia pindah ke toko selam scuba milik pamannya, Grand Blue, dia dengan penuh semangat menantikan kehidupan kampus impiannya, yang penuh dengan gadis-gadis cantik dan teman baik.\n" +
                    "\n" +
                    "Namun segala sesuatunya tidak berjalan sesuai rencana. Saat memasuki toko, dia bertemu dengan sekelompok kakak kelas yang gaduh dan telanjang, yang segera memaksanya untuk berpartisipasi dalam aktivitas alkohol mereka. Meski awalnya enggan, Iori dengan cepat menyerah dan menjadi jantung dan jiwa pesta. Sayangnya, hal ini membuatnya dicemooh oleh sepupunya, Chisa Kotegawa, yang masuk pada waktu yang salah. Tidak terpengaruh, Iori masih bersumpah untuk mewujudkan kehidupan kampus idealnya, tapi akankah semuanya berjalan sesuai rencana kali ini, atau akankah situasinya semakin memburuk?"
        ),
        Manga(
            id = 10,
            name = "Oyasumi Punpun",
            photo = R.drawable.oyasumi,
            score = 9.01F,
            ranked = 10,
            published = "15 mei 2007",
            synopsis = "Punpun Onodera adalah anak laki-laki normal berusia 11 tahun yang tinggal di Jepang. Sangat idealis dan romantis, Punpun mulai melihat hidupnya berubah secara halus—walaupun mengejutkan—berubah menjadi orang dewasa ketika dia bertemu dengan gadis baru di kelasnya, Aiko Tanaka. Saat itulah anak laki-laki pendiam belajar betapa berubah-ubahnya mempertahankan suatu hubungan, dan mengatasi kesulitan dalam transisi dari masa kanak-kanak yang naif ke masa dewasa yang berbelit-belit. Saat ayahnya menyerang ibunya pada suatu malam, Punpun menyadari hal lain: orang-orang yang dia hormati ternyata tidak semenarik yang dia bayangkan.\n" +
                    "\n" +
                    "Ketika masalahnya bertambah, sikap Punpun yang tadinya pemalu berubah menjadi penyendiri. Alih-alih menyembuhkan masalah dan konflik emosinya, hal ini justru memperburuk masalah dan mengirimnya ke jalan gelap kedewasaan dalam kisah masa depan yang suram ini."
        )
    )

    val Movies = listOf(
        Movie(
            id = 1,
            name = "Gintama: The Final",
            photo = R.drawable.gintamafinal,
            score = 9.04F,
            ranked = 1,
            studio = "Bandai Namco Pictures",
            synopsis = "Dua tahun telah berlalu setelah invasi Tendoshuu ke Terminal Pusat O-Edo. Sejak itu, Yorozuya berpisah. Meramalkan kembalinya Utsuro, Gintoki Sakata mulai mengamati garis ley Bumi untuk mencari jejak Altana milik orang lain. Setelah bertemu dengan sisa-sisa Tendoshuu—yang terus mencari keabadian—Gintoki kembali ke Edo.\n" +
                    "\n" +
                    "Kemudian, Shinsengumi dan Yorozuya yang berkumpul kembali memulai serangan terhadap Terminal Pusat yang diduduki. Saat Altana tertimbun puing-puing kapal Tendoshuu yang terancam meledak, Yorozuya dan sekutunya melawan musuh-musuhnya sementara keselamatan Edo—dan seluruh dunia—dipertaruhkan. Memenuhi keinginan guru mereka, mantan murid Shouyou Yoshida bersatu dan menghidupkan kembali masa lalu mereka untuk terakhir kalinya dalam upaya menyelamatkan masa depan mereka."
        ),
        Movie(
            id = 2,
            name = "Koe No Katachi",
            photo = R.drawable.koe,
            score = 8.93F,
            ranked = 2,
            studio = "Kyoto Animation",
            synopsis = "Sebagai pemuda yang liar, siswa sekolah dasar Shouya Ishida berusaha mengalahkan kebosanan dengan cara yang paling kejam. Ketika Shouko Nishimiya yang tunarungu pindah ke kelasnya, Shouya dan seluruh kelasnya tanpa berpikir mengganggunya untuk bersenang-senang. Namun, ketika ibunya memberi tahu sekolah, dia dikucilkan dan disalahkan atas semua yang dilakukan padanya. Dengan pindahnya Shouko dari sekolah, Shouya bergantung pada belas kasihan teman-teman sekelasnya. Dia dikucilkan tanpa perasaan selama masa sekolah dasar dan menengah, sementara para guru menutup mata.\n" +
                    "\n" +
                    "Kini di tahun ketiga sekolah menengahnya, Shouya masih diganggu oleh kesalahannya saat masih kecil. Dengan tulus menyesali perbuatannya di masa lalu, dia memulai perjalanan penebusan: bertemu Shouko sekali lagi dan menebus kesalahannya.\n" +
                    "\n" +
                    "Koe no Katachi menceritakan kisah mengharukan tentang reuni Shouya dengan Shouko dan upaya jujurnya untuk menebus dirinya sendiri, sambil terus dihantui oleh bayang-bayang masa lalunya."
        ),
        Movie(
            id = 3,
            name = "Gintama Movie 2",
            photo = R.drawable.gintama2,
            score = 8.91F,
            ranked = 3,
            studio = "Sunrise",
            synopsis = "Ketika Gintoki menangkap seorang pembajak film di pemutaran perdana, dia memeriksa rekaman kamera dan menemukan dirinya dipindahkan ke Edo versi pasca-apokaliptik yang suram, di mana epidemi misterius yang disebut \"Wabah Putih\" telah melanda populasi dunia. Ternyata film bajak laut itu bukanlah bajak laut—dia adalah mesin waktu android, dan Gintoki telah terlempar lima tahun ke depan! Shinpachi dan Kagura, kelompok Yorozuya-nya, pernah berselisih dan sekarang menjadi prajurit solo yang tangguh dalam pertempuran dan dia sendiri telah hilang selama bertahun-tahun, menghilang tanpa jejak setelah menulis pesan aneh di jurnalnya.\n" +
                    "\n" +
                    "Berangkat dalam penyamaran yang diberikan kepadanya oleh mesin waktu android, Gintoki dengan sembarangan menyatukan kembali tim Yorozuya untuk menyelidiki Wabah Putih, dan segera menemukan bahwa kunci untuk menyelamatkan masa depan terletak pada kegelapan masa lalunya sendiri. Bertekad untuk menghadapi musuh yang kuat, dia membuat penemuan penting—dengan sekelompok teman dan sekutu di sisinya, dia tidak harus bertarung sendirian."
        ),
        Movie(
            id = 4,
            name = "Violet Evergarden Movie",
            photo = R.drawable.violet,
            score = 8.87F,
            ranked = 4,
            studio = "Kyoto Animation",
            synopsis = "Beberapa tahun telah berlalu sejak berakhirnya Perang Besar. Ketika menara radio di Leidenschaftlich terus dibangun, telepon akan segera menjadi lebih relevan, yang menyebabkan penurunan permintaan akan \"Boneka Memori Otomatis\". Meski begitu, ketenaran Violet Evergarden terus meningkat setelah kesuksesannya yang terus-menerus dalam menulis surat. Namun, terkadang satu hal yang Anda rindukan justru satu hal yang tak kunjung muncul.\n" +
                    "\n" +
                    "Film Violet Evergarden mengikuti Violet yang terus memahami konsep emosi dan arti cinta. Pada saat yang sama, dia mengejar secercah harapan bahwa pria yang pernah mengatakan kepadanya, \"Aku mencintaimu,\" mungkin masih hidup bahkan setelah bertahun-tahun berlalu."
        ),
        Movie(
            id = 5,
            name = "Kimi No Nawa",
            photo = R.drawable.kimino,
            score = 8.84F,
            ranked = 5,
            studio = "CoMix Wave Films",
            synopsis = "Mitsuha Miyamizu, seorang gadis SMA, ingin menjalani kehidupan sebagai anak laki-laki di kota Tokyo yang ramai—sebuah mimpi yang sangat kontras dengan kehidupannya saat ini di pedesaan. Sementara itu di kota, Taki Tachibana menjalani kehidupan yang sibuk sebagai siswa sekolah menengah sambil melakukan pekerjaan paruh waktunya dan berharap untuk masa depan di bidang arsitektur.\n" +
                    "\n" +
                    "Suatu hari, Mitsuha terbangun di sebuah ruangan yang bukan miliknya dan tiba-tiba mendapati dirinya menjalani kehidupan impian di Tokyo—tetapi di dalam tubuh Taki! Di tempat lain, Taki mendapati dirinya menjalani kehidupan Mitsuha di pedesaan yang sederhana. Untuk mencari jawaban atas fenomena aneh ini, mereka mulai mencari satu sama lain.\n" +
                    "\n" +
                    "Kimi no Na wa. berkisah tentang tindakan Mitsuha dan Taki, yang mulai memberikan dampak dramatis pada kehidupan masing-masing, menjalinnya menjadi sebuah jalinan yang disatukan oleh takdir dan keadaan."
        ),
        Movie(
            id = 6,
            name = "The First Slam Dunk",
            photo = R.drawable.firstslam,
            score = 8.80F,
            ranked = 6,
            studio = "Toei Animation",
            synopsis = "\"Speedster\" dan point guard Shohoku, Ryouta Miyagi, selalu bermain dengan otak dan kecepatan kilat, berlari mengelilingi lawannya sambil berpura-pura tenang. Lahir dan besar di Okinawa, Ryouta memiliki saudara laki-laki yang tiga tahun lebih tua. Mengikuti jejak kakak laki-lakinya yang merupakan pemain lokal terkenal sejak kecil, Ryouta pun menjadi kecanduan bola basket.\n" +
                    "\n" +
                    "Di tahun kedua sekolah menengahnya, Ryouta bermain dengan tim bola basket SMA Shohoku bersama dengan Sakuragi, Rukawa, Akagi, dan Mitsui saat mereka naik panggung di Kejuaraan Nasional Antar Sekolah Menengah Atas. Dan kini, mereka berada di ambang menantang sang juara bertahan, SMA Sannoh Kogyo."
        ),
        Movie(
            id = 7,
            name = "Kaguya-sama",
            photo = R.drawable.kaguya,
            score = 8.78F,
            ranked = 7,
            studio = "A-1 Pictures",
            synopsis = "Setelah ciuman pertama mereka, Kaguya Shinomiya dan Miyuki Shirogane tidak yakin akan posisi hubungan mereka. Ketidakpastian yang meresahkan mengenai apakah mereka dapat dianggap sebagai pasangan resmi menimbulkan masalah baru saat Kaguya dan Shirogane berjuang untuk memilah perasaan mereka.\n" +
                    "\n" +
                    "Sementara para pengurus OSIS yang sedang jatuh cinta resah, musim Natal tiba, dan romansa pun mulai terasa. Menghadapi kelembutan yang meluas, Kaguya dan Shirogane harus menanggung pertarungan kecerdasan mereka sekali lagi. Jika mereka mendamaikan perasaan satu sama lain, mereka mungkin akan menemukan diri mereka dalam jangkauan apa yang sudah lama mereka rindukan: cinta sejati."
        ),
        Movie(
            id = 8,
            name = "Kizumonogatari III",
            photo = R.drawable.kizumo,
            score = 8.78F,
            ranked = 8,
            studio = "Shaft",
            synopsis = "Setelah membantu menghidupkan kembali vampir legendaris Kiss-shot Acerola-orion Heart-under-blade, Koyomi Araragi telah menjadi vampir sendiri dan pelayannya. Ciuman-shot yakin dia bisa mengubahnya kembali menjadi manusia, tapi hanya sekali mendapatkan kembali kekuatan penuhnya.\n" +
                    "\n" +
                    "Araragi telah memburu tiga pemburu vampir yang mengalahkan Kiss-shot dan mengambil kembali anggota tubuhnya untuk mengembalikannya ke kekuatan penuh. Namun, kini Araragi hampir mencapai apa yang telah dia perjuangkan selama ini, dia harus mempertimbangkan apakah ini yang benar-benar dia inginkan. Begitu dia menghidupkan kembali vampir abadi yang kuat ini, tidak ada yang tahu apa yang akan dia lakukan, dan tidak akan ada cara untuk menghentikannya.\n" +
                    "\n" +
                    "Tapi ada cerita lain yang Araragi tidak mengerti. Jika vampir yang baru lahir seperti dia bisa mengalahkan para pemburu, bagaimana mereka bisa mengalahkan Kiss-shot? Bisakah dia mempercayainya untuk mengubahnya kembali menjadi manusia? Dan bagaimana hal itu mungkin terjadi?\n" +
                    "\n" +
                    "Araragi berada pada batas kemampuannya tetapi dia harus mengambil keputusan, dan situasi ini mungkin tidak dapat diselesaikan tanpa melakukan sesuatu yang akan dia sesali…"
        ),
        Movie(
            id = 9,
            name = "Sen to Chihiro",
            photo = R.drawable.sento,
            score = 8.77F,
            ranked = 9,
            studio = "Studio Ghibli",
            synopsis = "Keras kepala, manja, dan naif, Chihiro Ogino yang berusia 10 tahun kurang senang ketika dia dan orang tuanya menemukan taman hiburan yang ditinggalkan dalam perjalanan ke rumah baru mereka. Dengan hati-hati menjelajah ke dalam, dia menyadari bahwa ada lebih banyak hal di tempat ini daripada yang terlihat, karena hal-hal aneh mulai terjadi saat senja tiba. Penampakan hantu dan makanan yang mengubah orang tuanya menjadi babi hanyalah permulaan—tanpa disadari Chihiro telah menyeberang ke dunia roh. Sekarang terjebak, dia harus mengumpulkan keberanian untuk hidup dan bekerja di antara roh, dengan bantuan Haku yang penuh teka-teki dan karakter unik yang dia temui di sepanjang jalan.\n" +
                    "\n" +
                    "Jelas dan menarik, Sen to Chihiro no Kamikakushi menceritakan kisah perjalanan Chihiro melalui dunia asing saat dia berusaha menyelamatkan orang tuanya dan kembali ke rumah."
        ),
        Movie(
            id = 10,
            name = "Fate/stay night Movie",
            photo = R.drawable.fate,
            score = 8.66F,
            ranked = 10,
            studio = "ufotable",
            synopsis = "Perang Cawan Suci Kelima di Kota Fuyuki telah mencapai titik balik di mana nyawa semua peserta terancam ketika musuh tersembunyi akhirnya menampakkan dirinya. Saat Shirou Emiya, Rin Toosaka, dan Illyasviel von Einzbern menemukan sifat sebenarnya dan merusak dari bayangan yang telah mengamuk di seluruh kota, mereka menyadari betapa mengerikan situasinya. Untuk melindungi orang-orang yang mereka cintai, kelompok tersebut harus bertahan melawan kekuatan musuh yang tampaknya tidak dapat diatasi—bahkan jika beberapa dari musuh tersebut pernah menjadi sekutu mereka, atau mungkin, musuh yang lebih dekat.\n" +
                    "\n" +
                    "Saat babak terakhir dari perang yang kacau ini dimulai, cita-cita yang diyakini Shirou akan segera ditantang oleh dilema yang sangat menyiksa: apakah mungkin untuk menyelamatkan dunia yang segala sesuatunya tampak tidak beres?"
        ),
    )
}