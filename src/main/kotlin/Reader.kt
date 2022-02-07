
class Reader() : Thread(), IObserver{
    override fun update(string: String) {
        println("Новые новости: $string в потоке ${currentThread().name}")
    }

    override fun run() {
        while (true) {
            println("Поток ${currentThread().name} усердно работает")
            sleep(5000)
        }
    }
}