import java.util.ArrayList

interface IObservable {
    val observers: ArrayList<IObserver>
    fun add(observer: IObserver) {
        observers.add(observer)
    }

    fun remove(observer: IObserver) {
        observers.remove(observer)
    }

    fun sendUpdateEvent(s: String) {
        observers.forEach { it.update(s) }
    }
}