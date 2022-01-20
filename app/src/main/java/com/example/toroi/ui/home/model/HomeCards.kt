package com.example.toroi.ui.home.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

enum class HomeCards(
    var anim: String = "",
    @StringRes var title: Int,
    @DrawableRes var icon: Int,
) {
    /*  REGISTER_PATIENT("", R.string.txt_register_patient, R.drawable.add),
      GENERALIST_CONSULT("", R.string.txt_generalist_consult, R.drawable.generalist),
      SPECIALIST_CONSULT("", R.string.txt_specialist_consult, R.drawable.specialist),
      ANTENATAL_CARE("", R.string.txt_antenatal_care, R.drawable.antenatal_care),
      PREVENTIVE_CARE("", R.string.txt_preventive_care, R.drawable.preventive_cure),
      EMR("", R.string.txt_emr, R.drawable.emr),
      WALLET("", R.string.txt_wallet, R.drawable.wallet_home)
  */
}