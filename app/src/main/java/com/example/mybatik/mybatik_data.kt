package com.example.mybatik

object mybatik_data {
    private val mybatik_title = arrayOf(
        "sidomukti","sekar jagad","mega mendung","simbut","kawung","tujuh rupa","gentongan","pring sedapur","priangan","merak"
    )
    private val mybatik_description = arrayOf(
        "Pada acara pernikahan adat Jawa, pengantin biasanya mengenakan batik corak sidomukti sebagai refleksi pernikahan yang ‘mukti’ alias mulia dan sejahtera",
        "Kota Yogyakarta juga terkenal dengan corak batiknya. Salah satu yang terkenal adalah corak sekar jagad yang wujudnya mirip dengan peta dunia",
        "Salah satu corak batik yang terkenal adalah batik mega mendung dari Cirebon. Ternyata corak ini menunjukkan perpaduan budaya Tionghoa di tanah Jawa lho",
        "Suku Badui di pedalaman Sunda membuat batik simbut yang coraknya mirip daun talas. Kemudian, batik ini dikenal dengan batik dari Banten",
        "Salah satu motif batik tertua di Indonesia adalah batik kawung yang bentuknya terinspirasi dari buah kawung alias buah aren",
        "Kalau suka dengan batik dengan corak alam, batik asal Pekalongan adalah jawabannya. Salah satu motif yang terkenal adalah batik tujuh rupa",
        " Orang madura nggak hanya bikin sate aja lho. Mereka juga membuat batik yang cantik dan warna-warni seperti batik gentongan ini",
        "Batik motif pring sedapur punya banyak makna bagi orang Jawa. ‘Pring’ artinya bambu yang menunjukkan bahwa kita harus punya manfaat dari hidup sampai mati",
        "Kebanyakan batik memang terinspirasi dari alam sekitar, seperti tumbuhan. Salah satunya adalah batik priangan asal Tasik, Jawa Barat ini",
        "Nggak hanya kesenian reognya saja yang unik dari Ponorogo. Motif batik merak yang cantik ini jadi salah satu corak batik khas Ponorogo"
    )

    private val mybatik_image = arrayOf(
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-2-4-640x394.jpg",
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-3-1-640x394.jpg",
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-4-2-640x394.jpg",
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-5-640x394.jpg",
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-6-640x394.jpg",
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-7-640x394.jpg",
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-8-1-640x394.jpg",
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-9-1-640x394.jpg",
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-10-640x394.jpg",
        "https://cdn-image.hipwee.com/wp-content/uploads/2018/10/hipwee-11-640x394.jpg"
    )

    val listData: ArrayList<mybatik>
        get() {
            val list = arrayListOf<mybatik>()
            for (position in mybatik_title.indices) {
                val mybatik = mybatik()
                mybatik.title = mybatik_title[position]
                mybatik.description = mybatik_description[position]
                mybatik.photo = mybatik_image[position]
                list.add(mybatik)
            }
            return list
        }
}

//membuat object data title,descriptio and gambar URl (https://www.hipwee.com/feature/10-corak-batik-nusantara-yang-perlu-kamu-tahu-biar-nggak-salah-mengenali-dan-memakai-kain-batik/)
//looping
