class Elv : Thread(), IObserver{
    override fun newData(data: Adam6024) {
        if (data.voltage > 2000000) {
            println("ELV обнаружил слишком высокое напряжение: ${data.voltage}")
        }
    }

    override fun run() {
        while (true) {
            //println("ELV усердно работает")
            //sleep(7000)
        }
    }
}