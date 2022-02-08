import java.util.ArrayList

interface IObservable {
    val observers: ArrayList<IObserver>

    fun addNewListener(observer: IObserver) {
        observers.add(observer)
    }

    fun remove(observer: IObserver) {
        observers.remove(observer)
    }
}