fun main() {
    val news = News()
    val reader1 = Reader()
    val reader2 = Reader()
    val reader3 = Reader()

    news.add(reader1)
    news.add(reader2)
    news.add(reader3)

    reader1.start()
    reader2.start()
    reader3.start()

    Thread.sleep(2000)
    println("Начали выходить новости")
    news.newestArticle = "В город заявились разбойники!"
    news.newestArticle = "Казна пуста!"
    news.newestArticle = "Наследник царя помер!"
}