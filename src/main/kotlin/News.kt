import java.util.ArrayList

class News : IObservable {
    override val observers: ArrayList<IObserver> = ArrayList()

    var newestArticle = ""
        set(value) {
            field = value
            sendUpdateEvent(value)
        }
}