/**
 * @author crkimberley on 05/09/2016.
 */
Scanner input = new Scanner(System.in)
Staff staff = new Staff()
println "Enter all staff names & IDs (name = Q or ID = 0 to finish)"
println "Initial length of arrays = " + staff.getIds().length
while (true) {
    print "Enter name: "
    String name = input.next()
    if (name.equals("Q")) {
        break
    }
    print "Enter ID: "
    int id = input.nextInt()
    if (id == 0) {
        break
    }
    staff.addStaff(name, id)
}
println "Names and IDs of those employees whose ID is even or their names start with S"
String[] names = staff.getNames()
int[] ids = staff.getIds()
for (i=0; i<staff.getSize(); i++) {
    if (names[i].charAt(0) == 'S' as char || ids[i] % 2 == 0) {
        println names[i] + ", " + ids[i]
    }
}
println "Final length of arrays = " + staff.getIds().length