package com.agilebits

package onepassword {

case class QualifiedTypes (
	unqualified: String,
	qualified: String,
	qualified_vec: Vector[String],
	qualified_hashmap: Map[String, String],
	qualified_optional: Option[String] = None,
	qualfied_optional_hashmap_vec: Option[Map[String, Vector[String]]] = None
)

}
