package creational.dependency_injection

fun main() {
    val engine = Engine()
    val driver = Driver()

    val car = Car(Container.provideEngine(), Container.provideDriver())
}