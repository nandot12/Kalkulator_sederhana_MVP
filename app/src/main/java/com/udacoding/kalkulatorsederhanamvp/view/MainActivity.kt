package com.udacoding.kalkulatorsederhanamvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.udacoding.kalkulatorsederhanamvp.R
import com.udacoding.kalkulatorsederhanamvp.model.Kalkulator
import com.udacoding.kalkulatorsederhanamvp.presenter.KalkulatorPresenter
import com.udacoding.kalkulatorsederhanamvp.presenter.KalkulatorView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), KalkulatorView {

    //todo 9
    private var presenter : KalkulatorPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo 10 init presenter
        presenter = KalkulatorPresenter(this)


        //todo 1 event listener
        btnKali.setOnClickListener {

            //todo 2 get inputan user
            val nilai1 = eInput1.text.toString()
            val nilai2 = eInput2.text.toString()
            //todo 11
            presenter?.hitungKali(nilai1,nilai2)

        }
        btnBagi.setOnClickListener {
            val nilai1 = eInput1.text.toString()
            val nilai2 = eInput2.text.toString()
            //todo 11
            presenter?.hitungBagi(nilai1,nilai2)

        }
        btnTambah.setOnClickListener {

        }
        btnkurang.setOnClickListener {  }
    }

    override fun bindView(kal: Kalkulator) {
        //todo 12
        Toast.makeText(this,"${kal.total}",Toast.LENGTH_LONG).show()

    }

    override fun isEmpty() {
        Toast.makeText(this,"tidak boleh ada yg kosong",Toast.LENGTH_LONG).show()
    }
}