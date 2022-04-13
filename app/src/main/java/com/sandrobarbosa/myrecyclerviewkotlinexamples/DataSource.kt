package com.sandrobarbosa.myrecyclerviewkotlinexamples

import com.sandrobarbosa.myrecyclerviewkotlinexamples.models.Live

class DataSource {

    companion object {

        //funcao estatica
        fun createDataSet() : ArrayList<Live> {

            val list = ArrayList<Live>()

            //Dados mocados
            list.add(
                Live(
                    "LIVE #OO1 - Como ter um perfil de desenvolvedor campeão no Linkedin",
                    "Sandro Barbosa",
                "https://i.pinimg.com/originals/f3/3b/08/f33b0857986c0588e6d1c856e5240670.jpg",
                "https://www.youtube.com/watch?v=rvYQHjMm0h8"
                )
            )

            list.add(
                Live(
                    "LIVE #OO1 - Como ter um perfil de desenvolvedor campeão no Linkedin",
                    "Sandro Barbosa",
                    "https://i.pinimg.com/originals/10/3e/cf/103ecf94b6b760a9615115525bf104d1.jpg",
                    "https://www.youtube.com/watch?v=rvYQHjMm0h8"
                )
            )

            list.add(
                Live(
                    "LIVE #OO1 - Como ter um perfil de desenvolvedor campeão no Linkedin",
                    "Sandro Barbosa",
                    "https://i.pinimg.com/originals/57/b8/55/57b85514c91f8eafe96ad3f5154018f2.jpg",
                    "https://www.youtube.com/watch?v=rvYQHjMm0h8"
                )
            )

            list.add(
                Live(
                    "LIVE #OO1 - Como ter um perfil de desenvolvedor campeão no Linkedin",
                    "Sandro Barbosa",
                    "https://i.pinimg.com/originals/6b/06/36/6b06368dc4426fb471f8b8f91d9a137c.jpg",
                    "https://www.youtube.com/watch?v=rvYQHjMm0h8"
                )
            )

            list.add(
                Live(
                    "LIVE #OO1 - Como ter um perfil de desenvolvedor campeão no Linkedin",
                    "Sandro Barbosa",
                    "https://i.pinimg.com/originals/c2/0b/e0/c20be0f37296f055627ef122aea67efd.jpg",
                    "https://www.youtube.com/watch?v=rvYQHjMm0h8"
                )
            )

            return list
        }
    }
}