import java.io._
class Animal(val animalName: String = "Cat", val count: Int = 1) 
{
var amount: String = "no"
var verb: String = "are"
var pluralAdjuster: String = "s"
def printStatistics(animalName: String, count: Int): Unit = {
    
    createPluralDependantMessageParts(count)
    println("There " + verb + " " + amount + " " + animalName +  pluralAdjuster)
  }
def createPluralDependantMessageParts(count: Int): Unit = {
if (count == 0) {
      thereAreNoLetters()
    } else if (count == 1) {
      thereIsOneLetter()
    } else {
      thereAreManyLetters(count)
    }
  }
def thereAreNoLetters(): Unit = {
    
    amount = "no"
    verb = "are"
    pluralAdjuster= "s"
  }
def thereIsOneLetter(): Unit = {
    
    amount = "1"
    verb = "is"
    pluralAdjuster= ""
  }
def thereAreManyLetters(count: Int): Unit = {
  
    amount = count.toString
    verb = "are"
    pluralAdjuster= "s"
  }
}
val animal = new Animal();
animal.printStatistics("Cat", 1);