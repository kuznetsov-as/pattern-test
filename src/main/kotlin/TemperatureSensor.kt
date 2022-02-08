class TemperatureSensor : Thread(), IObserver {
    override fun newData(data: Adam6024) {
        println("TemperatureSensor получил показатель температуры: ${data.temperature}")
    }

    override fun run() {
        while (true) {
            //println("TemperatureSensor усердно работает")
            //sleep(7000)
        }
    }
}