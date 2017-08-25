var capitals = Map("US" -> "Washington", "France" -> "Paris")
capitals += "Belgium" -> "Brussels"
capitals("France")
//------------------------------------------------------------

def factorial(x: BigInt): BigInt =
  if (x <= 1) 1
  else x * factorial(x - 1)

factorial(42)
//------------------------------------------------------------

import java.math.BigInteger

import scala.collection.immutable.HashMap
import scala.collection.mutable

def factorialj(x: BigInteger): BigInteger =
  if (x.compareTo(BigInteger.ONE) == -1) BigInteger.ONE
  else x.multiply(factorialj(x.subtract(BigInteger.ONE)))

factorialj(BigInteger.valueOf(42))
//------------------------------------------------------------

class MyClass(val index: Int, name: String)

val o = new MyClass(42, "Brol")
o.index
//------------------------------------------------------------

val s = "ProgrammingInScala"
s.exists(_.isUpper)
s.exists(_ isDigit)
s.forall(_ isLetter)
//------------------------------------------------------------

val hm1: HashMap[String, Int] = new HashMap[String, Int]()
val hm2 = new HashMap[String, Int]()
val hm3: Map[String, Int] = new HashMap()
//------------------------------------------------------------
