class Human {

    var name: String? = null

    init {
        name = "Alex"
    }

    class Student {
        var studentId: Int? = null;

        fun sayId() {
            println("my id is $studentId")
        }
    }

    inner class Teacher {

        val homeWorkId: Int? = null

        fun sayHello() {
            println("my name is $name")
        }

        fun giveHomeWork(): String {
            return homeWorkId?.toString() ?: "14"
        }
    }
}