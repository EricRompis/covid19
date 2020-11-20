package com.project.COVID19.network

import com.project.COVID19.ui.CoronaGlobal.data.WorldData
import com.project.COVID19.ui.CoronaGlobaldanIndo.data.GlobalMeninggal
import com.project.COVID19.ui.CoronaGlobaldanIndo.data.GlobalPositif
import com.project.COVID19.ui.CoronaGlobaldanIndo.data.GlobalSembuh
import com.project.COVID19.ui.CoronaGlobaldanIndo.data.Indonesia
import com.project.COVID19.ui.CoronaIndoprov.data.Provinsi
import retrofit2.http.GET
import io.reactivex.Single


interface ApiService {

    @GET(" ")
    fun getWorldData(): Single<List<WorldData>>

    @GET("indonesia")
    fun getIDNData(): Single<List<Indonesia>>

    @GET("indonesia/provinsi")
    fun getProvinsiData(): Single<List<Provinsi>>

    @GET("meninggal")
    fun getMeninggalData(): Single<GlobalMeninggal>

    @GET("positif")
    fun getPositifData(): Single<GlobalPositif>

    @GET("sembuh")
    fun getSembuhData(): Single<GlobalSembuh>

}