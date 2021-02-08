package com.elections.models

object SampleData {


  def getVillages(): List[Village] = {
   List (
     Village("Razole", 10001, Hindu),
     Village("Vadapalli", 1000, Christianity),
     Village("Kothapet", 100001, Hindu),
     Village("Pallipalem", 10001, Islam),
     Village("Ravulapalem", 20001, Hindu),
     Village("Ganti", 500, Buddhism),
     Village("Ganti", 500, Pagan),
     Village("Eethakota", 500, Hindu),
     Village("Gopalapatnam", 600, Hindu)
   )
  }

  def getNominations() :  List[Nomination] = {
List(
      Nomination("ravi", Male, "Razole", "razole", Hindu ),
      Nomination("sekhar", Male, "Razole", "razole", Christianity ),
      Nomination("ganesh", Female, "Razole", "razole", Hindu ),
      Nomination("phani", Female, "Razole", "razole", Hindu ),
      Nomination("akbar", Male, "Razole", "razole", Islam ),
        Nomination("jen", Male, "Razole", "razole", Pagan )
      )
  }

}
