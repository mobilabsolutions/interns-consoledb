/**
 * This class is a console db application that allows to 'add' and 'list' people.
 */
class ConsoleDb() {
    // properties: which are the state of the class
    var command: String = ""
    val people: MutableList<Person> = mutableListOf()

    fun start() {
        println("Welcome to MobiLab DB")

        while (command != "exit") {

            when(command) {
                "list" -> {
                    println("Listing people..")
                    println(people)
                }
                "add" -> {
                    println("Adding person..")
                    val newPerson = createPersonFromUserInput()
                    people.add(newPerson)
                }
                "" -> {
                    // to nothing
                }
                else -> {
                    println("Command $command is not supported")
                }
            }
            println("------------------------")
            println("Supported commands: 'list', 'exit', 'add'")
            println("Enter 'exit' to stop the program")
            command = readln()
        }

        println("Thank you for using MobiLab DB")
    }

    private fun createPersonFromUserInput(): Person {
        print("Person id: ")
        val id = readln()

        print("Person name: ")
        val name = readln()

        print("Person age: ")
        val age = readln()

        return Person(
            id = id,
            name = name,
            age = age.toInt()
        )
    }
}