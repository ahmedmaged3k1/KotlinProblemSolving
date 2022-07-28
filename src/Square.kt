class Square(var length: Double) : Shape() {
    override var shapeName: String = "Square"
    override var shapeArea: Double = getArea()
    private fun getArea(): Double {
        return length * length
    }
}