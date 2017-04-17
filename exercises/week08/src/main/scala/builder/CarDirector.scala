package builder

// TODO

case class CarDirector(carBuilder: CarBuilder) {
  def build: Unit= {
    carBuilder.buildBodyStyle
    carBuilder.buildBreaks
    carBuilder.buildEngine
    carBuilder.buildFuelType
    carBuilder.buildPower
    carBuilder.buildSeats
    carBuilder.buildWindows
  }

}
