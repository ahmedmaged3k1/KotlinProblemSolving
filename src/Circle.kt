class Circle(var circumference: Double) : Shape() {
    override var shapeName: String = "Circle"
    override var shapeArea: Double = getArea()


    private fun getArea(): Double {
        return circumference * 3.14
    }


}