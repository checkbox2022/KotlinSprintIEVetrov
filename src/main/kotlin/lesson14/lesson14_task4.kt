package lesson14

fun main() {
    val mars = Planet(
        "Mars", false, true, listOf(
            Satellite("Phobos", false, false),
            Satellite("Deimos", false, false),
        )
    )

    mars.name.also { println(it) }
    mars.listOfSatellites.forEach { println(it.name) }
}

abstract class CelestialBody(val name: String, val isAtmosphere: Boolean, val isLandingPossible: Boolean)

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isLandingPossible: Boolean,
) : CelestialBody(name, isAtmosphere, isLandingPossible)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isLandingPossible: Boolean,
    val listOfSatellites: List<Satellite>,
) : CelestialBody(name, isAtmosphere, isLandingPossible)