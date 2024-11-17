package com.example.appicecream.data

import com.example.appicecream.R
import com.example.appicecream.model.About
import com.example.appicecream.model.Gallery
import com.example.appicecream.model.Popular
import com.example.appicecream.model.Recommend

object DummyData {
    val popularsItems = listOf(
        Popular(
            id = 1,
            name = "Frozen Rose",
            product = "Es krim seperti mawar yang manis dan menyegarkan dengan sensasi dinginnya",
            flavour = "Vanilla Berry",
            photo = R.drawable.frozen_rose
        ),
        Popular(
            id = 2,
            name = "Dairy Dreams",
            product = "Eskrim berbasis susu dengan caramel yang memanjakan",
            flavour = "Creamy Caramel",
            photo = R.drawable.dairydreams
        ),
        Popular(
            id = 3,
            name = "Zeen Scoop",
            product = "Menghadirkan ketenangan dan kelezatan dari cookies",
            flavour = "Cookies",
            photo = R.drawable.zeenscoop
        ),
        Popular(
            id = 4,
            name = "Golden Drizzle",
            product = "Menggambarkan kehangatan dan kelezatan dari kombinasi biskuit dan vanilla",
            flavour = "Biskuit Vanilla",
            photo = R.drawable.goldendrizzle
        ),
        Popular(
            id = 5,
            name = "Blissicle",
            product = "Esk Krim yang memberi rasa kelezatan dari rasa ubi asli",
            flavour = "Ubi",
            photo = R.drawable.blissicle
        ),
        Popular(
            id = 6,
            name = "Emerald Freeze",
            product = "Es Krim vanilla dan matcha dengan warna hijau yang indah ",
            flavour = "Matcha Vanilla",
            photo = R.drawable.emeraldfreeze
        ),
        Popular(
            id = 7,
            name = "Chillcoa",
            product = "Eskrim dengan topping cream durian yang manis",
            flavour = "Cream Durian",
            photo = R.drawable.chillcoa
        ),
        Popular(
            id = 8,
            name = "Fusiover",
            product = "Coklat yang meleleh dengan topping coklat kacang yang mewah",
            flavour = "Coklat Kacang",
            photo = R.drawable.fusiover
        ),
        Popular(
            id = 9,
            name = "Sunnyce",
            product = "Es krim dengan brownies yang lembut dan manis",
            flavour = "Coklat Brownies",
            photo = R.drawable.sunnyce
        ),
        Popular(
            id = 10,
            name = "Royale",
            product = "Esk Krim dengan warna-warni dengan cerry di atasnya",
            flavour = "Strawberry",
            photo = R.drawable.royale
        )
    )

    val recommendsItems = listOf(
        Recommend(
            id = 1,
            name = "Cookie Butter",
            photo = R.drawable.cookiebutter,
            newproduct = "New Product",
            product = "Nikmati es krim terbaru dengan kelembutan butter berpadu manisnya biskuit yang creamy! Aroma khas dan teksturnya yang halus menjadikan Cookie Butter pilihan sempurna untuk pecinta rasa manis yang unik. Segera coba dan jadikan favoritmu!",
            flavour = "Butter",
        ),
        Recommend(
            id = 2,
            name = "Midnight Cocoa",
            photo = R.drawable.midnightcocoa,
            newproduct = "New Product",
            product = "Es krim cokelat pekat berbentuk bantal dengan isian vanilla lembut yang memanjakan! Rasakan perpaduan cokelat intens dan creamy vanilla dalam bentuk unik yang siap menemani malam-malammu. Midnight Cocoa, kelezatan baru untuk pencinta cokelat sejati!",
            flavour = "Coklat Vanilla",
        ),
        Recommend(
            id = 3,
            name = "Duo Swirl",
            photo = R.drawable.duoswirl,
            newproduct = "New Product",
            product = "Es krim lembut dengan kombinasi vanilla creamy dan caramel manis dalam swirl yang memikat, dilengkapi topping ceri segar dan kacang renyah. Nikmati harmoni rasa klasik dengan sentuhan spesial dalam setiap gigitan. Duo Swirl, sensasi es krim yang wajib kamu coba!",
            flavour = "Caramele",
        ),
        Recommend(
            id = 4,
            name = "Golden Bean",
            photo = R.drawable.goldenbean,
            newproduct = "New Product",
            product = "Es krim vanilla lembut berpadu aroma biji kopi premium yang khas, menciptakan keseimbangan sempurna antara manis dan pahit yang elegan. Dengan sentuhan creamy yang memanjakan, Golden Bean siap menjadi favorit baru untuk momen spesialmu. Coba sekarang dan rasakan kehangatan dalam setiap scoop!",
            flavour = "Kacang",
        ),
        Recommend(
            id = 5,
            name = "Pink Frost",
            photo = R.drawable.frozenrose,
            newproduct = "New Product",
            product = "Hadirkan kesegaran dengan Pink Frost, es krim lembut dengan rasa buah segar yang manis dan sedikit asam. Dipadukan dengan warna cerah yang menggoda, Pink Frost menawarkan pengalaman es krim yang menyegarkan dan penuh energi. Cicipi sensasi segar dalam setiap gigitan!",
            flavour = "Strawberry",
        ),
        Recommend(
            id = 6,
            name = "Classico",
            photo = R.drawable.classico,
            newproduct = "New Product",
            product = "Es krim vanilla lembut berpadu dengan cokelat kaya rasa, menciptakan harmoni sempurna dalam setiap gigitan. Dengan tekstur creamy dan rasa yang timeless, Classico adalah pilihan tepat bagi pecinta es krim yang menginginkan kesederhanaan dalam kemewahan. Nikmati kelezatan yang tak lekang oleh waktu!",
            flavour = "Matcha Creamy",
        ),
        Recommend(
            id = 7,
            name = "Blush Pop",
            photo = R.drawable.blushpop,
            newproduct = "New Product",
            product = "Es krim rasa buah persik yang lembut, dipadukan dengan sentuhan buah berry yang segar dan memikat. Dengan tekstur creamy dan warna cerah, Blush Pop menawarkan pengalaman es krim yang menyegarkan dan penuh energi. Cicipi kesegaran yang menghidupkan harimu!",
            flavour = "Mix",
        ),
        Recommend(
            id = 8,
            name = "Mochi Craze",
            photo = R.drawable.mochicraze,
            newproduct = "New Product",
            product = "Es krim lembut berpadu dengan mochi kenyal yang chewy, menciptakan pengalaman unik dan menyenangkan dalam setiap gigitan. Dengan berbagai rasa menggoda, Mochi Craze siap memanjakan lidah Anda. Coba sekarang dan rasakan sensasi seru dalam setiap scoop!",
            flavour = "Mix",
        ),
        Recommend(
            id = 9,
            name = "Sweet Symphony",
            photo = R.drawable.sweetsymphony,
            newproduct = "New Product",
            product = "Es krim dengan kombinasi rasa buah segar yang lezat, sentuhan creamy, dan kerenyahan yang memanjakan. Sweet Symphony menghadirkan harmoni rasa manis yang saling melengkapi, memberikan sensasi menyegarkan dalam setiap suapan. Nikmati keindahan rasa yang berpadu sempurna dalam setiap detik kenikmatan!",
            flavour = "Vanilla Coklat",
        ),
        Recommend(
            id = 10,
            name = "Mocha Magic",
            photo = R.drawable.mochamagic,
            newproduct = "New Product",
            product = "Perpaduan sempurna antara kopi mocha kaya rasa dan es krim creamy. Setiap gigitan menghadirkan rasa kopi intens dan cokelat manis, menciptakan pengalaman menggoda yang penuh keajaiban. Mocha Magic, pilihan sempurna untuk pecinta kopi dan cokelat!",
            flavour = "Vanilla Latte",
        )
    )

    val aboutMe = listOf(
        About(
            id = 1,
            name = "Nazlah Addini Haq Fajriani",
            email = "nazlahfajriani@gmail.com",
            university = "Universitas Bani Saleh",
            major = "Teknik Informatika",
            photo = R.drawable.nazlah // Add your drawable resource
        )
    )

    val offlinestroreGalleries = listOf(
        Gallery(
            id = 1,
            name = "toko 1",
            product = "",
            photo = R.drawable.toko1
        ),
        Gallery(
            id = 2,
            name = "toko 2",
            product = "",
            photo = R.drawable.toko2
        ),
        Gallery(
            id = 3,
            name = "toko 3",
            product = "",
            photo = R.drawable.toko3
        ),
        Gallery(
            id = 4,
            name = "toko 4",
            product = "",
            photo = R.drawable.toko4
        ),
        Gallery(
            id = 5,
            name = "toko 5",
            product = "",
            photo = R.drawable.toko5
        ),
        Gallery(
            id = 6,
            name = "toko 6",
            product = "",
            photo = R.drawable.toko6
        ),
        Gallery(
            id = 7,
            name = "toko 7",
            product = "",
            photo = R.drawable.toko7
        ),
        Gallery(
            id = 8,
            name = "toko 8",
            product = "",
            photo = R.drawable.toko8
        ),
        Gallery(
            id = 9,
            name = "toko 9",
            product = "",
            photo = R.drawable.toko9
        ),
        Gallery(
            id = 10,
            name = "toko 10",
            product = "",
            photo = R.drawable.toko10
        ),
        Gallery(
            id = 11,
            name = "toko 11",
            product = "",
            photo = R.drawable.toko11
        ),
        Gallery(
            id = 11,
            name = "toko 12",
            product = "",
            photo = R.drawable.toko12
        )
    )
}