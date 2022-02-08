fun main() {
    val adam6024 = Adam6024()
    val elv = Elv()
    val temperatureSensor = TemperatureSensor()

    adam6024.addNewListener(elv)
    adam6024.addNewListener(temperatureSensor)

    elv.start()
    temperatureSensor.start()
    adam6024.start()
}
