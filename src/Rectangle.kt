class Rectangle(var length: Double, var width: Double) : Shape() {
    override var shapeName: String = "Rectangle"
    override var shapeArea: Double = getArea()
    private fun getArea(): Double {
        return length * width
    }
}