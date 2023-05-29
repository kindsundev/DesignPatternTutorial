package creational.dependency_injection

object Container {

    fun provideDriver() = Driver()

    fun provideEngine() = Engine()
}