package com.elections.models

object Runner extends App {

  def getFemaleCandidateCount(nominations: List[Nomination]): Int = {
    val femaleNominations = nominations.filter {
      // For each nomination check if the filed candidate gender is equal to female
      nomination =>  {
        if(nomination.gender == Female) true
         else false
      }
    }
    femaleNominations.length
  }

  def groupNominationsByReligion(nominations: List[Nomination]) = {
    val nominationsGroupedByReligion = nominations.groupBy(nomination => nomination.religion)
    nominationsGroupedByReligion.map(nom => (nom._1 ,nom._2.length))
  }

/*  def filterBy(religion: Religion, nominations: List[Nomination]): List[Nomination] = {
    nominations.filter(nomination => nomination.religion == religion)
  }*/

  val femaleCount = getFemaleCandidateCount(SampleData.getNominations())
  println(s"Female nomination count is $femaleCount")

  println(groupNominationsByReligion(SampleData.getNominations()))

}
