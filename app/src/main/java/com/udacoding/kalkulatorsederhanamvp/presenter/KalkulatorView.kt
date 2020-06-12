package com.udacoding.kalkulatorsederhanamvp.presenter

import com.udacoding.kalkulatorsederhanamvp.model.Kalkulator

//todo 6
interface KalkulatorView {

    fun bindView(kal : Kalkulator)
    fun isEmpty()
}