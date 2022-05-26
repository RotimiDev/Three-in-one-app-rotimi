package com.example.punchandroidtest.util

import com.example.punchandroidtest.data.model.RealEstate
import com.example.punchandroidtest.util.ApiFetchUtil.localApiFetchList

object ApiFetchUtil {
    var localApiFetchList: Array<RealEstate> = arrayOf()
}

fun getApiFetchList(): Array<RealEstate> {
    return localApiFetchList
}