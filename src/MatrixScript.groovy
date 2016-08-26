/**
 * @author crkimberley on 25/08/2016.
 */
Matrix testMatrix = new Matrix(3, 4)
testMatrix.setRow(0, "0,1,2,3")
testMatrix.setRow(1, "10,11,12,13")
testMatrix.setRow(2, "20,21,22,23")
println (testMatrix)
testMatrix.prettyPrint()
testMatrix.setColumn(2, "90,91,92")
println (testMatrix)
testMatrix.prettyPrint()
testMatrix.setElement(2, 3, 777)
println (testMatrix)
testMatrix.prettyPrint()
Matrix matrixOfOnes = new Matrix(15, 17)
matrixOfOnes.prettyPrint()
testMatrix.setMatrix("11,22,33,44;21,32,43,54;31,42,53,64")
testMatrix.prettyPrint()