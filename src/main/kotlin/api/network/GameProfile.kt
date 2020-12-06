package trident.api.network

import java.util.*

interface GameProfile {
    val uuid: UUID
    val name: String
    val properties: Set<Property>
    val textures: Map<TextureType, Texture>

    interface Property {
        val name: String
        val value: String
        val signature: String
    }

    interface MinecraftTexturesPayload {
        val timestamp: Long
        val profileId: UUID
        val profileName: String
        val isPublic: Boolean
        val textures: Map<TextureType, Texture>
    }

    interface Texture {
        val url: String
        val metadata: Map<String, String>
        val model: TextureModel
        val hash: String
    }

    enum class TextureModel {
        Normal, Slim
    }

    enum class TextureType {
        Skin, Cape, Elytra
    }
}