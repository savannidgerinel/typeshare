export interface ItemDetailsFieldValue {
	hello: string;
}

export type AdvancedColors = 
	| { t: "String", c: string }
	| { t: "Number", c: number }
	| { t: "NumberArray", c: number[] }
	| { t: "ReallyCoolType", c: ItemDetailsFieldValue }
	| { t: "ArrayReallyCoolType", c: ItemDetailsFieldValue[] }
	| { t: "DictionaryReallyCoolType", c: Record<string, ItemDetailsFieldValue> };

