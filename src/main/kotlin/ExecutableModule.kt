interface ExecutableModule {
    fun initialize()
    fun run()
    fun prepareToUnload()
    fun stop()
}