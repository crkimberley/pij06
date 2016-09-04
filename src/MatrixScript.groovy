/**
 * @author crkimberley on 25/08/2016.
 */
Matrix testMatrix = new Matrix(3, 2)
println "new Matrix (of 1's) - prettyPrint"
testMatrix.prettyPrint()
testMatrix = new Matrix(3, 4)
testMatrix.setRow(0, "0,1,2,3")
testMatrix.setRow(1, "10,11,12,13")
testMatrix.setRow(2, "20,21,22,23")
println "new Matrix - setRow 3 times"
println(testMatrix)
testMatrix.prettyPrint()
testMatrix.setColumn(2, "90,91,92")
println "setColumn"
println(testMatrix)
testMatrix.prettyPrint()
testMatrix.setElement(2, 3, 777)
println "setElement"
println(testMatrix)
testMatrix.prettyPrint()
testMatrix.setMatrix("11,22,33,44;21,32,43,54;31,42,53,64")
println "setMatrix"
testMatrix.prettyPrint()

MatrixChecker matrixChecker = new MatrixChecker();
println "MatrixChecker methods - testing on arrays"
int[] testArray
testArray = [1,2,3,4,5,4,3,2,1] as int[]
println(testArray)
println "isSymmetrical?"
println(matrixChecker.isSymmetrical(testArray))
testArray = [1,2,3,4,5,4,3,2,7] as int[]
println(testArray)
println "isSymmetrical?"
println(matrixChecker.isSymmetrical(testArray))
testArray = [1] as int[]
println(testArray)
println "isSymmetrical?"
println(matrixChecker.isSymmetrical(testArray))
int[][] test2DArray
test2DArray = [[1,2],[3,4],[5,6]] as int[][]
println(test2DArray)
println "isSymmetrical?"
println(matrixChecker.isSymmetrical(test2DArray))
test2DArray = [[1,3,5],[3,7,9],[5,9,11]]
println(test2DArray)
println "isSymmetrical?"
println(matrixChecker.isSymmetrical(test2DArray))
test2DArray = [[1,2,3,4],[2,5,6,7],[3,6,8,9],[4,7,9,10]] as int [][]
println(test2DArray)
println "isSymmetrical?"
println(matrixChecker.isSymmetrical(test2DArray))
test2DArray = [[1,2,3,4],[2,5,6,7],[3,6,8,9],[4,7,99,10]] as int [][]
println(test2DArray)
println "isSymmetrical?"
println(matrixChecker.isSymmetrical(test2DArray))
println "isTriangular?"
println(matrixChecker.isTriangular(test2DArray))
test2DArray = [[1,2,3,4],[0,5,6,7],[0,0,8,9],[0,0,0,10]] as int [][]
println(test2DArray)
println "isSymmetrical?"
println(matrixChecker.isSymmetrical(test2DArray))
println "isTriangular?"
println(matrixChecker.isTriangular(test2DArray))

testMatrix = new Matrix(3, 3)
testMatrix.setRow(0, "0,1,2,3")
testMatrix.setRow(1, "10,11,12,13")
testMatrix.setRow(2, "20,21,22,23")
testMatrix.prettyPrint()
println "isSymmetrical?"
println(testMatrix.isSymmetrical())
println "isTriangular?"
println(testMatrix.isTriangular())
testMatrix = new Matrix(4,4)
testMatrix.setMatrix("1,2,3,4;0,5,6,7;0,0,8,9;0,0,0,10")
testMatrix.prettyPrint()
println "isSymmetrical?"
println(testMatrix.isSymmetrical())
println "isTriangular?"
println(testMatrix.isTriangular())