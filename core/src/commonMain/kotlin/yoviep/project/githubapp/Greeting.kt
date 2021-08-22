package yoviep.project.githubapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}