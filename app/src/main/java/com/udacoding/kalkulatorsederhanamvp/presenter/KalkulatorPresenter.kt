package com.udacoding.kalkulatorsederhanamvp.presenter

import com.udacoding.kalkulatorsederhanamvp.model.Kalkulator

//todo 7 masukin interface ke construct prsenter
class KalkulatorPresenter(val kkView : KalkulatorView) {


    //todo 3 bikin function kali di presenter
    fun hitungKali(nilai1 : String ,nilai2 : String){

        //todo 13 check validasi input user
        if(nilai1.isNotEmpty() && nilai2.isNotEmpty()) {

            //todo 4 convert string ke interger
            val nilaia = nilai1.toInt()
            val nilaib = nilai2.toInt()

            val total = nilaia.times(nilaib)

            //todo 5 panggil model masukkin nilai login prsenter ke model
            val kalkulator = Kalkulator()
            kalkulator.total = total

            //todo 8 masukin model ke interface
            kkView.bindView(kalkulator)

        }
        else{
            kkView.isEmpty()
        }


    }
    fun hitungBagi(nilai1 : String ,nilai2 : String){

        //todo 4 convert string ke interger
        val nilaia = nilai1.toInt()
        val nilaib = nilai2.toInt()

        val total = nilaia.div(nilaib)

        //todo 5 panggil model masukkin nilai login prsenter ke model
        val kalkulator = Kalkulator()
        kalkulator.total = total

        //todo 8 masukin model ke interface
        kkView.bindView(kalkulator)


    }
}