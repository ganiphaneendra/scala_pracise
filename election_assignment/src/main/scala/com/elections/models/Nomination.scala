package com.elections.models

case class Nomination (name: String, gender: Gender, villageName: String, constituency: String, religion: Religion)

sealed trait Religion
case object Hindu extends Religion
case object Christianity extends Religion
case object Islam extends Religion
case object Buddhism extends Religion
case object Atheism extends Religion
case object Pagan extends Religion

sealed trait Gender
case object Male extends Gender
case object Female extends Gender
case object LGBT extends Gender

case class Village(name: String, voterCount: Int, reservedFor: Religion)
