package br.com.mystudies.scala.currencies

import Currency._


case class Money(amount: Int, currency: Currency) {
  override def toString = s"The Money --> $amount $currency"
}