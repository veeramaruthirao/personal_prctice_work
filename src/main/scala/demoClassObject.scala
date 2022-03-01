class car {
  var name = ""
  var cost = 0
  private var roadtax = 0.1


  def caluclate_cost(cost:Int) ={
      cost * roadtax + cost
  }

  def low_grade_car(): Unit ={
     roadtax = 0.05
  }

}

object demoClassObject {

  def main(args: Array[String]):Unit = {

    var bmw = new car
    println(bmw.caluclate_cost(50000))

    var santro = new car
    santro.low_grade_car()
    println(santro.caluclate_cost(50000))
  }
}
