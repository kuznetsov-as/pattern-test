import java.util.ArrayList

class Adam6024 : Thread(), IObservable {
    override val observers: ArrayList<IObserver> = ArrayList()

    private fun dataReady(data: Adam6024) {
        observers.forEach { it.newData(data) }
    }

    var temperature  = 0
        set(value) {
            field = value
            dataReady(this)
        }

    var voltage  = 0
        set(value) {
            field = value
            if (value > 2000000) {
                dataReady(this)
            }
        }

    override fun run() {
        while (true) {
            sleep(5000)
            temperature = (0..200).random()
            voltage = (0..2300000).random()
            //println("Adam6024 изменил показатели температуры и напряжения")
        }
    }
}