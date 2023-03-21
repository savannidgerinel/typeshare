import Foundation

public struct EditItemViewModelSaveRequest: Codable {
	public let context: String
	public let values: [EditItemSaveValue]
	public let fill_action: AutoFillItemActionRequest?

	public init(context: String, values: [EditItemSaveValue], fill_action: AutoFillItemActionRequest?) {
		self.context = context
		self.values = values
		self.fill_action = fill_action
	}
}
