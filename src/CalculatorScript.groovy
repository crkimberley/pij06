/**
 * @author crkimberley on 25/08/2016.
 */
Scanner input = new Scanner(System.in)
Calculator calc = new Calculator()
while (true) {
    println "0 to quit"
    print "Enter 1st number: "
    int a = input.nextInt()
    if (a == 0) {
        break
    }
    print "Enter 2nd number: "
    int b = input.nextInt()
    println()
    print a + " + " + b + " = "
    calc.add(a,b)
    print a + " - " + b + " = "
    calc.subtract(a,b)
    print a + " * " + b + " = "
    calc.multiply(a,b)
    print a + " / " + b + " = "
    calc.divide(a,b)
    print a + " % " + b + " = "
    calc.modulus(a,b)
    println()
}