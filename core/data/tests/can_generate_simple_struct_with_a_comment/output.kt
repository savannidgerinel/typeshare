@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

@Serializable
object Location

/// This is a comment.
@Serializable
data class Person (
	/// This is another comment
	val name: String,
	val age: UByte,
	val info: String? = null,
	val emails: List<String>,
	val location: Location
)

