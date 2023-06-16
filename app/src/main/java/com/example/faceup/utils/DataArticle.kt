package com.example.faceup.utils

import com.example.faceup.R

object DataArticle {

    private var database = arrayOf(
        arrayOf(
            "BlackHeads",
            "Blackhead umumnya tidak menyebabkan nyeri layaknya jerawat dan mudah sekali terlihat di permukaan kulit karena warnanya yang gelap. Oleh sebab itu, jika tumbuh pada wajah, blackhead mungkin bisa mengganggu penampilan." +
                    "Blackhead terbentuk karena adanya penumpukan atau penyumbatan sel-sel kulit mati dan minyak di folikel rambut pada permukaan kulit. Penumpukan ini kemudian menonjol ke luar pori-pori dan membentuk blackhead setelah teroksidasi oleh udara." +
                    "Sebelum mengatasi blackhead, hal pertama yang harus Anda ingat adalah jangan sekali-sekali memencet atau mengeluarkannya secara paksa.\n" +
                    "\n" +
                    "Alih-alih menyembuhkan, memencet blackhead justru bisa menambah peradangan dan bahkan memperparah kondisi kulit. Pasalnya, ada banyak sekali bakteri dan kotoran di tangan yang bisa berpindah saat Anda memencet atau mengeluarkan blackhead secara paksa.",
        R.drawable.blackhead
        ),
        arrayOf(
        "WhiteHeads",
        "Komedo putih (whiteheads) alias komedo tertutup adalah salah satu jenis jerawat ringan. Komedo ini terbentuk dari pori-pori yang tersumbat oleh kelebihan sebum (minyak), bakteri, dan sel-sel kulit mati.\n" +
                "\n" +
                "Penyumbatan ini cenderung menutupi seluruh permukaan teratas pori sehingga penampilan jerawatnya akan seperti benjolan putih kecil. Oleh sebab itu, komedo putih juga disebut sebagai komedo tertutup." +
                "Jerawat ini sangat umum dan dapat dialami siapa saja, terlepas dari jenis kelamin dan usia. Namun, masalah kulit ini lebih sering dialami oleh anak remaja yang sedang puber atau wanita yang terutama sedang dalam masa menstruasi, hamil, dan menopause karena pengaruh hormon." +
                "Penyebab utama dari whiteheads sama seperti penyebab jerawat lain seperti blackheads, yaitu penyumbatan di pori-pori.\n" +
                "\n" +
                "Kulit secara alami mempunyai kelenjar sebaceous yang bertugas menghasilkan sebum agar kulit tetap lembap. Namun, kelenjar ini terkadang terlalu aktif bekerja, sehingga menghasilkan sebum lebih banyak dari yang dibutuhkan.",
        R.drawable.whiteheads
    ),
        arrayOf(
        "Pustules",
        "Jerawat pustula adalah jenis jerawat yang disertai nanah. Jenis jerawat ini biasanya terlihat meradang, kemerahan, dan berwarna putih di tengahnya. Jerawat pustula dapat terjadi di mana saja, namun umumnya muncul di area kelenjar minyak seperti wajah, bahu, punggung, dan dada.\n" +
                "\n" +
                "Jerawat pustula yang berada di permukaan sebenarnya bisa sembuh dengan sendirinya. Namun, apabila kondisinya cukup parah atau berada di lapisan kulit yang lebih dalam, akan lebih baik apabila mendapatkan pengobatan dari dokter untuk membantu mempercepat pemulihannya." +
                "Jerawat pustula adalah benjolan kecil berisi nanah yang tumbuh di lapisan kulit, sehingga kondisi ini dikenal juga dengan jerawat nanah. Jerawat ini ditandai dengan warna putih di tengah-tengah dan kemerahan di kulit sekitarnya.\n" +
                "\n" +
                "Jerawat ini sering kali muncul di area wajah. Namun, tak menutup kemungkinan bahwa jerawat pustula juga tumbuh di bagian tubuh lain yang cenderung berminyak, seperti dada dan punggung. Kondisi ini kerap dialami oleh remaja yang memasuki masa pubertas.",
        R.drawable.pustulas
        ),
        arrayOf(
            "Papules",
            "Jerawat papula adalah jerawat yang menonjol, kecil, padat, tampak kemerahan, dan tidak mengandung nanah. Meski bukanlah kondisi yang serius, jerawat ini dapat mengganggu penampilan. Namun, Anda tidak perlu khawatir, karena ada berbagai cara untuk mengatasinya.  \n" +
                    "\n" +
                    "Sama seperti jerawat pada umumnya, jerawat papula muncul karena penyumbatan dan peradangan di pori-pori wajah. Jerawat ini ditandai dengan munculnya benjolan padat dengan ukuran kurang dari 1 cm. Tak hanya di wajah, jerawat ini juga bisa muncul di dada dan punggung menyerupai jerawat pasir.",
            R.drawable.papulas
        ),
        arrayOf(
            "Nodules",
            "Jerawat nodul adalah jenis jerawat meradang yang terbentuk di lapisan bawah kulit. Jerawat ini umumnya lebih besar, lebih menyakitkan, dan lebih sulit dihilangkan daripada jenis jerawat lainnya. Penanganan langsung oleh dokter dapat membantu mengurangi risiko terjadinya bekas jerawat di kemudian hari.\n" +
                    "\n" +
                    "Jerawat nodul muncul sebagai benjolan keras yang terbentuk di bawah kulit dan terasa nyeri. Berbeda dengan jerawat pustula, jerawat nodul tidak memiliki puncak berwarna putih yang berisi nanah.",
            R.drawable.nodula
        )
    )

    val listArtikel : ArrayList<Article>
        get() {
            val list = ArrayList<Article>()
            for(i in database){
                val dataArt = Article()
                dataArt.tittle = i[0] as String
                dataArt.description = i[1] as String
                dataArt.photo = i[2] as Int
            }
            return list
        }
}