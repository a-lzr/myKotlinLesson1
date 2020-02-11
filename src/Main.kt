class Main

fun main() {
    val student = Human.Student()
    val teacher = Human().Teacher()

    student.sayId()
    teacher.sayHello()
    println(teacher.giveHomeWork())
}