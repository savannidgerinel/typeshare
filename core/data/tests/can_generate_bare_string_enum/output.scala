package com.agilebits

package onepassword {

// This is a comment.
sealed trait Colors {
	def serialName: String
}
object Colors {
	case object Red extends Colors {
		val serialName: String = "Red"
	}
	case object Blue extends Colors {
		val serialName: String = "Blue"
	}
	case object Green extends Colors {
		val serialName: String = "Green"
	}
}

}
