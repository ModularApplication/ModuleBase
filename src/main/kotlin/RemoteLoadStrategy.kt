annotation class RemoteLoadStrategy(val strategy: Strategy)

enum class Strategy {
    LOAD_REMOTE_BEFORE_UNLOAD, LOAD_REMOTE_AFTER_UNLOAD
}