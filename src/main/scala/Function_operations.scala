object Function_operations {

  def add(x:Int,y:Int):Int={
    var z = x+y
    return z
  }

  def addA(x:Int,y:Int)= x+y  // NOT MANDATORY TO SPECIFY RETURN TYPE.IT IS AUTO INTERPRETED.

  def addB(x:Int,y:Int):Int={//IF YOU SPECIFY THE RETURN TYPE IT IS NOT NECESSARY TO USE THE RETURN KEYWORD
    var z = x+y
    z                           // Not mandatory to use the keyword return for returning a value
  }

  def addc(x:Int,y:Int): Int={  // IF YOU SPECIFY RETURN KEYWORD IT IS MANDATORY TO SPECIFY RETURN TYPE
    var z = x+y
    return z
  }


}
