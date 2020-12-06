package trident.api.event

object ServerTickEvent : Event {
    override val time: Long
        get() = throw NotImplementedError("This property is not implemented due to performance reasons.")

    override fun finish() {}
}