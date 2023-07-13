# Serialization

Typeshare types are serialized via JSON for communication across FFI boundaries. This page shows examples of that JSON format given some of the variations that can be put in the source data structures.

```rust
#[typeshare]
struct MyStruct {
	my_name: String,
	my_age: u32
}

#[typeshare]
enum MyEnum {
	MyVariant,
	MyOtherVariant,
}
```

Given only the `#[typeshare]` annotation, serialization will follow the Serde defaults. The above types would generate these definitions for typescript.

```typescript
type MyStruct = { my_name: string, my_age: number }
enum MyEnum = { MyVariant = "MyVariant", MyOtherVariant = "MyOtherVariant" }
```

Similarly, this would be valid JSON for `MyStruct`:

```json
{ my_name: "1Password Developer", my_age: 40 }
```

And valid JSON for for a `MyVariant` value of  `MyEnum`: 
```json
"MyVariant"
```

An enumeration which carries a value in some or more of the elements requires an extra `#[serde]` tag:

```rust
#[typeshare]
#[serde(tag = "type", content = "content")]
enum MyEnum {
	MyVariant,
	MyOtherVariant,
	MyNumber(u32),
}
```

The resulting Typescript and JSON definition is of several different structures that can all be used a `MyEnum` value:

```typescript
type MyEnum =
  | { type = "MyVariant" }
  | { type = "MyOtherVariant" }
  | { type = "MyNumber", content = number }
```

Each of the following three JSON values are acceptable for a `MyEnum` parameter in this case:

```json
{ type = "MyVariant" }
{ type = "MyOtherVariant" }
{ type = "MyNumber", content = 40 }
```

