package com.example.portfolio_maxhendess

import java.io.Serializable

class Project(
    var title: String,
    var presentation: String,
    var imageSrc: Int, // bild internt == int
    var secondImgSrc: Int,
    var details: String?
) : Serializable {
}