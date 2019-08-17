package br.com.tiagokamegasawa.calculadoraflex.extensions

fun Double.format(digits: Int) = String.format("%.${digits}f", this)