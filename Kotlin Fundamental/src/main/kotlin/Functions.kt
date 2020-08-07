fun main() {
    val user = setUser("Namira", "Listening music and watching movie/kdrama", age = "16" )
    println(user)

    printUser("Namira")
  }
fun setUser(name: String, hobby: String, age: String) = "My name is $name, I like $hobby and I'm $age years old"
fun printUser(name: String) {
  }