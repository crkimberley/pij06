/**
 * @author crkimberley on 05/09/2016.
 */
Scanner input = new Scanner(System.in)
final int SIZE = 5
Target target = new Target(SIZE)
target.init()
println "Size of space is " + SIZE + "x" + SIZE + "x" + SIZE
println "(Enter coordinates 0 to " + (SIZE - 1) + ", or -1 for x coordinate to QUIT)"
while (true) {
    println "Try to hit the target"
    print "Enter x coordinate: "
    int x = input.nextInt()
    if (x == -1) {
        break
    }
    print "Enter y coordinate: "
    int y = input.nextInt()
    print "Enter z coordinate: "
    int z = input.nextInt()
    Result result = target.fire(x, y, z)
    if (result == Result.HIT) {
        println "You hit the target!"
        break
    }
    if (result == Result.OUT_OF_RANGE) {
        println "Missed - out of range"
    }
    if (result == Result.FAIL_LEFT) {
        println "Missed - target is to the right"
    }
    if (result == Result.FAIL_RIGHT) {
        println "Missed - target is to the left"
    }
    if (result == Result.FAIL_LOW) {
        println "Missed - too low"
    }
    if (result == Result.FAIL_HIGH) {
        println "Missed - too high"
    }
    if (result == Result.FAIL_SHORT) {
        println "Missed - target is further away"
    }
    if (result == Result.FAIL_LONG) {
        println "Missed - target is nearer"
    }
}
