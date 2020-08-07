val myName = "Laura" //string is implicit
println(myName)
myName.length
myName(0)
myName(1)
5 > 2*2
res2 > res3
"L" > "a"
"L" > "A"
"A".getClass
'A'.getClass
'A'.toInt
'V'.toInt
'a'.toInt
'ā'.toInt
'č'.toInt
'?'.toInt
val c = 'ā'
println(c)
val first3 = myName.take(3)
println(first3)
val last3 = myName.drop(3)
last3
val myFood = "potatoes"
myFood.slice(3,7) //notice that index 7 is not included
myFood(7)
//first real chaining example
myFood.toUpperCase
myFood.toUpperCase.take(6)
myFood.toUpperCase.take(6).slice(1,4)

//equality
4 == 2*2
2*2 == 4
val a = 4
a == 4
a == 20

myFood == "pasta"
myFood == "potatoes"
val myOtherFood = "potatoes"
myFood == myOtherFood

//building a string from other strings
//string interpolation makes it easy to build strings from other strings
println(s"My name is $myName and I really like $myFood")
val myNumber = 77
val myPI = 3.14159
println(s"My name is $myName and I really like $myFood since $myNumber")

println(s"My pie is very tasty and round $myPI")

myFood.foreach(println)
myFood.toUpperCase.foreach(println)
val otherFood = "potata"

myFood diff otherFood
myFood.distinct //all unique

res36+res37
 //below makes it easier not to miss any whitespace
s"$res36 ***** $res37"

myFood.count(_ == 'o')
val myMagic = "abrakadabra"

myMagic.count(_ == 'a')
myMagic.replace("abra", "oxxo")
//first match
myMagic.indexOf('r')
myMagic.indexOf("r")

myMagic.indexOf("aka")

















