// Step 7 - Parameterize arrays with types
//----------------------------------------
val big = new java.math.BigInteger("123456") // value parameterization

val greetStrings = new Array[String](3)      // type & value parameterization
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world !\n"
for (i <- 0 to 2) print( greetStrings(i) )

// Everything is object, with methods...
val greetStrings2: Array[String] = new Array[String](3)
greetStrings2.update(0, "Hello")
greetStrings2.update(1, ", ")
greetStrings2.update(2, "world!\n")
for (i <- 0.to(2)) print( greetStrings2.apply(i) )

// Step 8 - Use lists
//-------------------
val oneTwoThree = List(1, 2, 3)
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
1 :: 2 :: threeFour
1 :: (2 :: (3 :: Nil)) == 1 :: 2 :: 3 :: Nil // right associtivity
oneTwoThreeFour(1)
oneTwoThreeFour.count(_ > 1)
oneTwoThreeFour.dropRight(2)
oneTwoThreeFour.exists(x => x == 5)
oneTwoThreeFour.filter(x => x % 2 == 0)
oneTwoThreeFour.forall(_ < 5)
oneTwoThreeFour.foreach(x => print(x.toString + " "))
oneTwoThreeFour.length
oneTwoThreeFour.map(_ * 3)
oneTwoThreeFour.mkString(" / ")
oneTwoThree.filterNot(_ % 2 == 0)
oneTwoThreeFour.reverse
oneTwoThreeFour.sortBy(_ % 3)
