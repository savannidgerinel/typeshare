package com.agilebits

package object onepassword {

type UByte = Byte
type UShort = Short
type UInt = Int
type ULong = Int

}
package onepassword {

case class StructUsingGenericEnum (
	enum_field: GenericEnum[String, Short]
)

sealed trait GenericEnum[A, B] {
	def serialName: String
}
object GenericEnum {
	case class VariantA[A, B](content: A) extends GenericEnum[A, B] {
		val serialName: String = "VariantA"
	}
	case class VariantB[A, B](content: B) extends GenericEnum[A, B] {
		val serialName: String = "VariantB"
	}
}

sealed trait GenericEnumUsingGenericEnum[T] {
	def serialName: String
}
object GenericEnumUsingGenericEnum {
	case class VariantC[T](content: GenericEnum[T, T]) extends GenericEnumUsingGenericEnum[T] {
		val serialName: String = "VariantC"
	}
	case class VariantD[T](content: GenericEnum[String, Map[String, T]]) extends GenericEnumUsingGenericEnum[T] {
		val serialName: String = "VariantD"
	}
	case class VariantE[T](content: GenericEnum[String, UInt]) extends GenericEnumUsingGenericEnum[T] {
		val serialName: String = "VariantE"
	}
}

// Generated type representing the anonymous struct variant `VariantF` of the `GenericEnumsUsingStructVariants` Rust enum
case class GenericEnumsUsingStructVariantsVariantFInner[T] (
	action: T
)

// Generated type representing the anonymous struct variant `VariantG` of the `GenericEnumsUsingStructVariants` Rust enum
case class GenericEnumsUsingStructVariantsVariantGInner[T, U] (
	action: T,
	response: U
)

// Generated type representing the anonymous struct variant `VariantH` of the `GenericEnumsUsingStructVariants` Rust enum
case class GenericEnumsUsingStructVariantsVariantHInner (
	non_generic: Int
)

// Generated type representing the anonymous struct variant `VariantI` of the `GenericEnumsUsingStructVariants` Rust enum
case class GenericEnumsUsingStructVariantsVariantIInner[T, U] (
	vec: Vector[T],
	action: MyType[T, U]
)

sealed trait GenericEnumsUsingStructVariants[T, U] {
	def serialName: String
}
object GenericEnumsUsingStructVariants {
	case class VariantF[T, U](content: GenericEnumsUsingStructVariantsVariantFInner[T]) extends GenericEnumsUsingStructVariants[T, U] {
		val serialName: String = "VariantF"
	}
	case class VariantG[T, U](content: GenericEnumsUsingStructVariantsVariantGInner[T, U]) extends GenericEnumsUsingStructVariants[T, U] {
		val serialName: String = "VariantG"
	}
	case class VariantH[T, U](content: GenericEnumsUsingStructVariantsVariantHInner) extends GenericEnumsUsingStructVariants[T, U] {
		val serialName: String = "VariantH"
	}
	case class VariantI[T, U](content: GenericEnumsUsingStructVariantsVariantIInner[T, U]) extends GenericEnumsUsingStructVariants[T, U] {
		val serialName: String = "VariantI"
	}
}

}
