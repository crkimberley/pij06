/**
 * @author crkimberley on 25/08/2016.
 */
ArrayCopier copier = new ArrayCopier()
int[] arrayDst = new int[10];
arraySrcSmaller = [1, 2 ,3, 4, 5] as int[]
arraySrcEqual = [11, 12, 13, 14, 15, 16, 17, 18, 19, 20] as int[]
arraySrcBigger = [21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33] as int[]
println "Destination array size = 10"
println "Copy a smaller array"
copier.copy(arraySrcSmaller, arrayDst)
println arrayDst
println "Copy an array of equal size"
copier.copy(arraySrcEqual, arrayDst)
println arrayDst
println "Copy a larger array"
copier.copy(arraySrcBigger, arrayDst)
println arrayDst