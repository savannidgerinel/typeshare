@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

@Serializable
sealed class SomeEnum {
	/// The associated String contains some opaque context
	@Serializable
	@SerialName("Context")
	data class Context(val content: String): SomeEnum()
	@Serializable
	@SerialName("Other")
	data class Other(val content: Int): SomeEnum()
}

