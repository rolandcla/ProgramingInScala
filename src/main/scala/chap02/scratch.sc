// Step 2 - Variables
val msg0 = "Hello, world!"
val msg1: java.lang.String = "Hello again..."
val msg2: String = "and again..."

var greeting = "Hello, world!"
greeting = "Leave me alone, world..."

// Step 3 - Functions
def max(x: Int, y: Int): Int = {
  if (x > y) x else y
}
max(2,3)

def greet() = println("Hello, world!")
greet
greet()

// Step 6 - foreach and for
val args = Array("Scala", "is", "even", "more", "fun")

args.foreach((arg: String) => println(arg))
args.foreach(arg => println(arg))
args.foreach(println(_))
args.foreach(println)
for (arg <- args) println(arg)








