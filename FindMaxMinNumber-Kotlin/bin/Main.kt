/**
 * A simple program that finds the maximum and minimum numbers within an array
 * This is a Kotlin version of the Java program: https://github.com/iasjem/max-and-min-numbers-java
 */

fun main(args: Array<String>) {

	val arr: IntArray = intArrayOf(10, 3, 5, 8, 1)
	var i: Int = 0
	var max: Int = 0
	var min: Int = 0

	for (i in 0..arr.size - 1) {
		print(arr[i])
		print("\t")
		if (arr[i] > max) {
			max = arr[i]
			min = max
		}
		if (arr[i] < min) {
			min = arr[i]
		}
	}
	println("\n\nMaximum number is $max")
	println("Minimum number is $min")
}
