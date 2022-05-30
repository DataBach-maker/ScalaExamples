def printAnimalStatistics(animalName: String, count: Int): Unit = 
{
var amount: String = "no"
var verb: String = "are"
var pluralAdjuster: String = "s"
if (count == 0) {
    amount = "no"
    verb = "are"
    pluralAdjuster= "s"
  } else if (count == 1) {
    amount = "1"
    verb = "is"
    pluralAdjuster= ""
  } else {
    amount = count.toString
    verb = "are"
    pluralAdjuster= "s"
  }
  println("There " + verb + " " + amount + " " + animalName + pluralAdjuster)
}
printAnimalStatistics("Elephant", 5)