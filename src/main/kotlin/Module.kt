annotation class Module(val author: String, val name: String, val version: String, val type: ModuleType,val dependencies: Array<String>)

enum class ModuleType {
    EXECUTABLE, LIBRARY
}