package trident.api.entity.player

/**
 * This enum corresponds to data sent by packets.
 */
enum class PlayerAction {
    StartDigging,
    CancelDigging,
    FinishDigging,
    DropItemStack,
    DropItem,
    ReleaseUseItem,
    SwapHands,
}