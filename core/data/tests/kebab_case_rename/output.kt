@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

/// This is a comment.
@Serializable
data class Things (
	@SerialName("bla")
	val bla: String,
	@SerialName("label")
	val label: String? = null,
	@SerialName("label-left")
	val label_left: String? = null
)

