import Foundation

/// This is a comment.
public struct Things: Codable {
	public let bla: String
	public let label: String?
	public let label_left: String?

	enum CodingKeys: String, CodingKey, Codable {
		case bla,
			label,
			label_left = "label-left"
	}

	public init(bla: String, label: String?, label_left: String?) {
		self.bla = bla
		self.label = label
		self.label_left = label_left
	}
}
