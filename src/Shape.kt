abstract class Shape {
    abstract var shapeName: String
    abstract var shapeArea: Double
    fun printAreaOf(shape: Shape) {
        println("Area of $shapeName is $shapeArea")

    }
}